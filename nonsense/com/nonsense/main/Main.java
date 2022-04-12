package com.nonsense.main;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;
import java.time.LocalDateTime;

import com.nonsense.config.Config;
import com.nonsense.entity.User;
import com.nonsense.exception.UserDuplicationException;
import com.nonsense.exception.UserNotFoundException;
import com.nonsense.exception.WrongPasswordException;
import com.nonsense.print.UserAllPrinter;
import com.nonsense.print.NonsenseAllPrinter;
import com.nonsense.print.UserSelectPrinter;
import com.nonsense.service.NonsenseSolve;
import com.nonsense.service.RankingInfoSaveFile;
import com.nonsense.service.UserChangePassword;
import com.nonsense.service.UserRegist;
import com.nonsense.service.UserWithdraw;

public class Main {
	static BufferedReader br = null;
	static Config config = new Config();
	
	public static void main(String[] args) {
		
		while(true) {
			switch(menu()) {
				case 1:
					joinUser();
					break;
				case 2:
					changePwd();
					break;
				case 3:
					selectInfo();
					break;
				case 4:
					allInfo();
					break;
				case 5:
					withdrawUser();
					break;
				case 6:
					solveNunsense();
					break;
				case 7:
					nonsenseAllInfo();
					break;
				case 8:
					saveFile();
					break;
				case 9:
					try {
						if(br != null) br.close();
					} catch (IOException e) {}
					System.out.println("프로그램을 종료합니다.");
					System.exit(0);
					
			}
		}
	}
	
	public static int menu() {
		System.out.println("===============================");
		System.out.println("원하시는 메뉴를 선택하세요.");
		System.out.println("1. 회원가입\t 2. 비밀번호 변경");
		System.out.println("3. 정보조회\t 4. 전체정보 조회");
		System.out.println("5. 회원탈퇴\t 6. 넌센스 풀기");
		System.out.println("7. 넌센스랭킹 조회\t 8. 파일 저장");
		System.out.println("9. 프로그램 종료");
		System.out.println("===============================");
		
		int menu = 0;
//		BufferedReader br = null;
		try {
			br = new BufferedReader(new InputStreamReader(System.in));
			while(true) {
				menu = Integer.parseInt(br.readLine().trim());
				
				if(menu >=1 && menu <= 9) break;
				else System.out.println("잘못된 입력입니다. 다시 입력하세요.");
			}
		}catch(Exception e) {
			System.out.println("잘못된 입력입니다.");
		}finally {
			try {
				if(br != null) br=null;  // EOF처리 더이상 읽을 값이 없게 해줌
			} catch(Exception e) {}
		}
		return menu;
	}
	
	// 회원 가입
	public static void joinUser() {
//		BufferedReader br = null;
		UserRegist userRegist = config.getUserRegist();
		System.out.println("회원정보를 공백을 구분으로 입력해주세요");
		System.out.println("예) 아이디 비밀번호 이름 이메일");
		
		try{
			br = new BufferedReader(new InputStreamReader(System.in));
//			StringTokenizer st = new StringTokenizer(br.readLine(), " ");
			
			String s = br.readLine().trim(); // 양옆 공백을 제거해서 입력을 받음
			String[] userInfo = s.split(" "); // 공백을 구분으로 배열에 저장
			if(userInfo.length != 4) {
				System.out.println("입력 양식이 맞지 않습니다.");
				return;
			}
			User user = new User(
					userInfo[0], userInfo[1], userInfo[2], userInfo[3],
					LocalDateTime.now()); 
			
			userRegist.regist(user); // 사용자 정보를 객체에 담아서 등록
			
		}catch(UserDuplicationException e) {
			System.out.println("중복되는 아이디가 존재합니다.");
		}catch(IOException e) {
			System.out.println(e.getMessage());
		}finally {
			try {
				if(br != null) br=null;
			} catch(Exception e) {}
		}
	}
	
	// 비밀번호 변경
	public static void changePwd() {
//		BufferedReader br = null;
		UserChangePassword userChangePassword = config.getUserChangePassword();
		
		System.out.println("아이디 현재비밀번호 변경할비밀번호를 공백을 구분으로 입력해주세요.");
		System.out.println("예) userid 1234 4321");
		
		try {
			br = new BufferedReader(new InputStreamReader(System.in));
			String s = br.readLine().trim();
			String[] change = s.split(" ");
			if(change.length != 3) {
				System.out.println("입력 양식이 잘못되었습닙다.");
				return;
			}
			
			userChangePassword.changePassword(change[0], change[1], change[2]);
			System.out.println("암호를 변경했습니다.");
		}catch(UserNotFoundException e) {
			System.out.println("아이디가 존재하지 않습니다.");
		}catch(WrongPasswordException e) {
			System.out.println("비밀번호가 일치하지 않습니다.");
		}catch(IOException e) {
			System.out.println(e.getMessage());
		}finally {
			try {
				if(br != null) br=null;
			} catch(Exception e) {}
		}
	}
	
	// 회원정보
	public static void selectInfo() {
//		BufferedReader br = null;
		System.out.println("조회할 아이디와 비밀번호를 공백을 구분으로 입력하세요");
		System.out.println("예) userid 1234");
		
		try {
			br = new BufferedReader(new InputStreamReader(System.in));
			
			String s = br.readLine().trim();
			String[] info = s.split(" ");
			if(info.length != 2) {
				System.out.println("잘못된 양식으로 입력했습니다.");
				return;
			}
			
			UserSelectPrinter printer = config.getSelectPrinter();
			printer.selectPrint(info[0], info[1]);
			
		}catch(UserNotFoundException e) {
			System.out.println("아이디가 일치하지 않습니다.");
		}catch(WrongPasswordException e) {
			System.out.println("비밀번호가 일치하지 않습니다.");
		}catch(IOException e) {
			System.out.println(e.getMessage());
		}finally {
			try {
				if(br != null) br=null;
			} catch(Exception e) {}
		}
	}
	
	// 전체회원정보
	public static void allInfo() {
		UserAllPrinter printer = config.getAllPrinter();
		printer.printAll();
	}
	
	// 회원 탈퇴
	public static void withdrawUser() {
		System.out.println("제거할 아이디와 비밀번호를 공백을 구분으로 입력하세요");
		System.out.println("예) userid 1234");
		
		try {
			br = new BufferedReader(new InputStreamReader(System.in));
			
			String s = br.readLine().trim();
			String[] info = s.split(" ");
			if(info.length != 2) {
				System.out.println("잘못된 양식으로 입력했습니다.");
				return;
			}
			
			UserWithdraw deleteUser = config.getUserWithdraw();
			deleteUser.withdraw(info[0], info[1]);
			System.out.println("회원탈퇴 되었습니다.");
			
		}catch(UserNotFoundException e) {
			System.out.println("아이디가 일치하지 않습니다.");
		}catch(WrongPasswordException e) {
			System.out.println("비밀번호가 일치하지 않습니다.");
		}catch(IOException e) {
			System.out.println(e.getMessage());
		}finally {
			try {
				if(br != null) br=null;
			} catch(Exception e) {}
		}
	}
	
	// 넌센스 문제 풀기
	public static void solveNunsense() {
		System.out.println("아이디와 비밀번호를 공백을 구분으로 입력하세요.");
		System.out.println("예) userid 1234");
		
		try {
			br = new BufferedReader(new InputStreamReader(System.in));
			String s = br.readLine().trim();
			String[] info = s.split(" ");
			if(info.length != 2) {
				System.out.println("잘못된 양식으로 입력했습니다.");
				return;
			}
			NonsenseSolve ns = config.getNonsenseSolve();
			ns.nonsense(info[0], info[1], br);
			
		}catch(UserNotFoundException e) {
			System.out.println("아이디가 일치하지 않습니다.");
		}catch(WrongPasswordException e) {
			System.out.println("비밀번호가 일치하지 않습니다.");
		}catch(Exception e) {
			System.out.println(e.getMessage());
		}finally {
			try {
				if(br != null) br=null;
			} catch(Exception e) {}
		}
	}
	
	// 넌센스 랭킹 정보
	public static void nonsenseAllInfo() {
		NonsenseAllPrinter printer = config.getNonsenseAllPrinter();
		printer.print();
	}
	
	public static void saveFile() {
		System.out.println("저장할 파일의 경로를 입력해주세요");
		System.out.println("ex) D:\\테스트\\넌센스 => 역슬래시 두개씩 입력");
		try {
			br = new BufferedReader(new InputStreamReader(System.in));
			String filePath = br.readLine().trim();
			
			RankingInfoSaveFile save = config.getRankingInfoSaveFile();
			save.saveFile(filePath);
			System.out.println("파일이 저장됐습니다.");
		}catch(FileNotFoundException e) {
			System.out.println("파일을 찾을 수 없습니다.");
		}catch(IOException e) {
			System.out.println(e.getMessage());
		}finally {
			try {
				if(br != null) br = null;
			} catch(Exception e) {}
		}
	}
}
