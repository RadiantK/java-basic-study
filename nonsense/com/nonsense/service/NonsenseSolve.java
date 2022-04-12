package com.nonsense.service;

import java.io.BufferedReader;
import java.io.IOException;
import java.time.LocalDateTime;

import com.nonsense.dao.NonsenseDao;
import com.nonsense.dao.UserDao;
import com.nonsense.entity.NonsenseUser;
import com.nonsense.entity.User;
import com.nonsense.exception.UserNotFoundException;
import com.nonsense.exception.WrongPasswordException;

public class NonsenseSolve {

	private UserDao userDao;
	private NonsenseDao nonsenseDao;
	
	public NonsenseSolve(UserDao userDao, NonsenseDao nonsenseDao) {
		this.userDao = userDao;
		this.nonsenseDao = nonsenseDao;
	}
	
	public void nonsense(String id, String pwd, BufferedReader br) throws IOException, InterruptedException {
		User user = userDao.selectUser(id);
		if(user == null) {
			throw new UserNotFoundException();
		}
		if(!user.getPassword().equals(pwd)) { // 비밀번호 일치여부 확인
			throw new WrongPasswordException();
		}
		int cnt = 0;
		int choice = (int)(Math.random()*3)+1;;
		
		if(choice == 1) cnt = Nonsensefirst(br);
		else if(choice == 2) cnt = NonsenseSecond(br);
		else cnt = NonsenseThird(br);
		
		System.out.println("점수 채점 중입니다...");
		Thread.sleep(2000);
		System.out.println("문제 풀이가 종료되었습니다. 내가 맞춘 개수는 " + cnt + "개!!");
		
		nonsenseDao.insertUser(new NonsenseUser(
				user.getId(), user.getName(), cnt, LocalDateTime.now()));
	}
	
	public int Nonsensefirst(BufferedReader br) throws IOException {
		int cnt = 0;
		
		System.out.println("1. 타이타닉의 구명 보트에는 몇 명이 탈수 있을까? 9명");
		String answer = "9명";
		String result = br.readLine();
		if(answer.equals(result)) cnt++;
		
		System.out.println("2. 세상에서 가장 뜨거운 과일은? 천도복숭아");
		answer = "천도복숭아";
		result = br.readLine();
		if(answer.equals(result)) cnt++;
		
		System.out.println("3. 왕이 넘어지면 뭐가될까?  킹콩");
		answer = "킹콩";
		result = br.readLine();
		if(answer.equals(result)) cnt++;
		
		System.out.println("4. 왕이 헤어질 때 하는 인사는? 바이킹");
		answer = "따끈따끈";
		result = br.readLine();
		if(answer.equals(result)) cnt++;
		
		System.out.println("5. 세 사람만 탈 수 있는 차는? 인삼차");
		answer = "인삼차";
		result = br.readLine();
		if(answer.equals(result)) cnt++;
		
		br = null;
		return cnt;
	}
	
	public int NonsenseSecond(BufferedReader br) throws IOException {
		int cnt = 0;
		
		System.out.println("1. 눈이 녹으면 뭐가 될까? 눈물");
		String answer = "눈물";
		String result = br.readLine();
		if(answer.equals(result)) cnt++;
		
		System.out.println("2. 말은 말인데 타지 못하는 말은? 거짓말");
		answer = "거짓말";
		result = br.readLine();
		if(answer.equals(result)) cnt++;
		
		System.out.println("3. 병아리가 제일 잘 먹는 약은? 삐약");
		answer = "삐약";
		result = br.readLine();
		if(answer.equals(result)) cnt++;
		
		System.out.println("4. 걱정이 많은 사람이 오르는 산은? 태산");
		answer = "태산";
		result = br.readLine();
		if(answer.equals(result)) cnt++;
		
		System.out.println("5. 도둑이 가장 싫어하는 아이스크림은? 누가바");
		answer = "누가바";
		result = br.readLine();
		if(answer.equals(result)) cnt++;
		
		br = null;
		return cnt;
	}
	
	public int NonsenseThird(BufferedReader br) throws IOException {
		int cnt = 0;
		
		System.out.println("1. 물고기의 반댓말은? 불고기");
		String answer = "불고기";
		String result = br.readLine();
		if(answer.equals(result)) cnt++;
		
		System.out.println("2. 푹 파인 사과를 4글자로 하면? 파인애플");
		answer = "파인애플";
		result = br.readLine();
		if(answer.equals(result)) cnt++;
		
		System.out.println("3. 세상에서 가장 추운 바다는? 썰렁해");
		answer = "썰렁해";
		result = br.readLine();
		if(answer.equals(result)) cnt++;
		
		System.out.println("4. 공이 웃으면? 풋볼");
		answer = "풋볼";
		result = br.readLine();
		if(answer.equals(result)) cnt++;
		
		System.out.println("5. 광부가 가장 많은 나라는? 케냐");
		answer = "케냐";
		result = br.readLine();
		if(answer.equals(result)) cnt++;
		
		br = null;
		return cnt;
	}
}
