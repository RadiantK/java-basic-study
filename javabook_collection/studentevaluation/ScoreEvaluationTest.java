package studentevaluation;

import java.util.*;

@SuppressWarnings("rawtypes")
class Student implements Comparable {
	
	final static int LEFT = 0;
	final static int CENTER = 1;
	final static int RIGHT = 2;
	
	String name = "";
	String studentNum = "";
	int koreanScore = 0;
	int mathScore = 0;
	int englishScore = 0;
	int total = 0;
	
	public Student(String name, String studentNum, int koreanScore, int englishScore, int mathScore) {
		this.name = name;
		this.studentNum = studentNum;
		this.koreanScore = koreanScore;	
		this.englishScore = englishScore;
		this.mathScore = mathScore;
		total = koreanScore + englishScore + mathScore;
	}
	
	@Override
	public String toString() {
		return format(name, 4, LEFT)
				+format(studentNum, 4, RIGHT)
				+format(""+koreanScore, 6, RIGHT)
				+format(""+mathScore, 6, RIGHT)
				+format(""+englishScore, 6, RIGHT)
				+format(""+total, 8, RIGHT);
	}
	static String format(String str, int length, int alignment) {
		int diff = length - str.length();
		if(diff < 0) {
			str.substring(0, length);
		}
		
		char[] source = str.toCharArray();
		char[] ch = new char[length];
		
		for(int i=0; i<ch.length; i++) {
			ch[i] = ' ';
		}
		
		switch(alignment) {
			case LEFT:
				default:
				System.arraycopy(source, 0, ch, 0, source.length);
				break;
			case CENTER:
				System.arraycopy(source, 0, ch, diff/2, source.length);
				break;
			case RIGHT:
				System.arraycopy(source, 0, ch, diff, source.length);
				break;
		}
		return new String(ch);
	}
	@Override
	public int compareTo(Object obj) {
		int result = -1;
		if(obj instanceof Student) {
			Student st = (Student)obj;
			return (this.name).compareTo(st.name);					
		}
		return result;
	}
}

@SuppressWarnings("rawtypes")
class NameAscending implements Comparator {

	@Override
	public int compare(Object o1, Object o2) {
		if( o1 instanceof Student && o2 instanceof Student) {
			Student st1 = (Student)o1;
			Student st2 = (Student)o2;
			return (st1.name).compareTo(st2.name);
		}
		return -1;
	}	
}

@SuppressWarnings("rawtypes")
class TotalDescending implements Comparator {

	@Override
	public int compare(Object o1, Object o2) {
		if( o1 instanceof Student && o2 instanceof Student) {
			Student st1 = (Student)o1;
			Student st2 = (Student)o2;
			return (st1.total < st2.total) ? 1 : (st1.total == st2.total ? 0 : -1);
		}
		return -1;
	}	
}

public class ScoreEvaluationTest {
	
	@SuppressWarnings("rawtypes")
	static ArrayList record = new ArrayList();
	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {

		while(true) {
			switch(displayMenu()) {
				case 1:
					inputRecord();
					break;
				case 2:
					delectRecord();
					break;
				case 3:
					sortRecord();
					break;
				case 4:
					System.out.println("==프로그램을 종료합니다==");
					System.exit(0);	
			}
		}
	}

	static int displayMenu() {
		System.out.println("*************************************************");
		System.out.println("*                 성적 관리 프로그램                 *");
		System.out.println("*************************************************");
		System.out.println();
		System.out.println();
		System.out.println("1. 학생성적 입력하기");
		System.out.println();
		System.out.println("2. 학생성적 삭제하기");
		System.out.println();
		System.out.println("3. 학생성적 정렬해서보기(이름순, 성적순)");
		System.out.println();
		System.out.println("4. 프로그램 종료");
		System.out.println();
		System.out.println();
		System.out.println("원하는 메뉴를 선택하세요. (1~4)");
		
		int menu = 0;
		
		do {
			try {
				menu = Integer.parseInt(sc.nextLine().trim());
				
				if(1 <= menu && menu <= 4) {
					break;
				} else {
					throw new Exception();
				}
			} catch (Exception e) {
				System.out.println("메뉴를 잘못 선택하셨습니다. 다시 입력해주세요.");
				System.out.println("원하는 메뉴를 선택하세요. (1~4)");
			}
		} while(true);
		
		return menu;
	}
	@SuppressWarnings({ "unchecked", "resource" })
	static void inputRecord() {
		System.out.println("1. 학생 성적 입력하기");
		System.out.println("이름, 학번, 국어성적, 수학성적, 영어성적의 순서로 공백없이 입력하세요");
		System.out.println("입력을 마치려면 q를 입력하세요. 메인화면으로 돌아갑니다.");
		
		while(true) {
			System.out.print(">>");
			
			try {
				String input = sc.nextLine();
				
				if(!input.equalsIgnoreCase("q")) {
					Scanner sc2 = new Scanner(input).useDelimiter(",");
					
					record.add(new Student(sc2.next(), sc2.next(), sc2.nextInt(), sc2.nextInt(), sc2.nextInt()));
				} else {
					return;
				}
			} catch (Exception e) {
				System.out.println(" 입력이 잘못됐습니다. 이름, 학번, 국어, 영어, 수학성적 순서로 입력하세요.");
			}
		}
	}
	static void delectRecord() {
		while(true) {
			displayRecord();
			System.out.println("삭제하려는 데이터의 학번을 입력하세요.(q:메인화면)");
			System.out.print(">>");
			
			try {
				String input = sc.nextLine().trim();
				
				if(!input.equalsIgnoreCase("q")) {
					int length = record.size();
					boolean found = false;
					
					for(int i=0; i<length; i++) {
						Student student = (Student)record.get(i);
						if(input.equals(student.studentNum)) {
							found = true;
							record.remove(i);
						}
					}
					if(found) {
						System.out.println("삭제되었습니다.");
					} else {
						System.out.println("일치하는 데이터가 없습니다.");
					}
				} else {
					return;
				}
			} catch (Exception e) {
				System.out.println("잘못된 입력입니다. 다시 입력하세요.");
			}
		}
	}
	
	@SuppressWarnings("unchecked")
	static void sortRecord() {
		while(true) {
			System.out.println("정렬기준을 선택하세요. (1.이름순 / 2.총점순 / 3.메인메뉴) :");
			
			int sort = 0;
			
			do {
				try {
					sort = Integer.parseInt(sc.nextLine());
					
					if (1 <= sort && sort<=3) {
						break;
					} else {
						throw new Exception();
					}
				} catch(Exception e) {
					System.out.println("유효하지 않은 입력입니다. 다시 입력하세요");
					System.out.println("정렬기준을 선택하세요.(1.이름순 / 2.총점순 / 3.메인메뉴) :");
				}
			} while(true);
			
			if(sort == 1) {
				Collections.sort(record, new NameAscending());
				displayRecord();
			} else if(sort == 2) {
				Collections.sort(record, new TotalDescending());
				displayRecord();
			} else {
				return;
			}
		}
	}
	
	static void displayRecord() {
		int koreanTotal = 0;
		int englishTotal = 0;
		int mathTotal = 0;
		int total = 0;
		
		System.out.println("");
		System.out.println("이름 번호 국어 영어 수학 총점");
		System.out.println("============================================");
		
		int length = record.size();
		
		if(length > 0) {
			for (int i=0; i< length; i++) {
				Student student = (Student)record.get(i);
				System.out.println(student);
				koreanTotal += student.koreanScore;
				englishTotal += student.englishScore;
				mathTotal += student.mathScore;
				total += student.total;
			}
		} else {
			System.out.println();
			System.out.println("데이터가 없습니다.");
			System.out.println();
		}
		
		System.out.println("============================================");
		System.out.println("총점 : "+Student.format(koreanTotal+"", 9, Student.RIGHT)
			+ Student.format(englishTotal+"", 6, Student.RIGHT)
			+ Student.format(mathTotal+"", 6, Student.RIGHT)
			+ Student.format(total+"", 8, Student.RIGHT));
		System.out.println();
	}
}
