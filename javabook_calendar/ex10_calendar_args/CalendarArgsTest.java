package ex10_calendar_args;

import java.util.Calendar;

public class CalendarArgsTest {

	public static void main(String[] args) {
		if(args.length != 2) {
			System.out.println("Usage : java CalendarArgsTest 2020 7");
			return;
		}
		
		int year = Integer.parseInt("2020");
		int month = Integer.valueOf("7");
		int START_DAY_OF_WEEK = 0; // 1일의 요일
		int END_DAY = 0; // 마지막 날
		
		Calendar sDay = Calendar.getInstance(); // 시작일
		Calendar eDay = Calendar.getInstance(); // 끝나는 일
		
		sDay.set(year, month-1, 1); // 월 0~11 이므로 1빼줌
		eDay.set(year, month, 1);
		
		// 다음달의 첫날에서 하루를 빼면 현재 달의 마지막 날이됨 (달마다 마지막 요일이 다르기 때문에)
		// 31일 28일 30일로 달마다의 마지막 날짜가 다르기 때문에 다음달 1일에서 -1을 해줌
		eDay.add(Calendar.DATE,  -1);
		
		// 첫 번째 요일이 무슨 요일인지 알아낸다. => 달력에 공백을 찍어야함
		START_DAY_OF_WEEK = sDay.get(Calendar.DAY_OF_WEEK);
		
		// eDay에 지정된 날짜를 얻어옴
		END_DAY = eDay.get(Calendar.DATE);
		
		System.out.println("      "+ year + "년 " + month + "월");
//		System.out.println("      "+ args[0] + "년 " + args[1] + "월");
		System.out.println(" SU MO TU WE TR FR SA ");
		
		// 해당 월의 1일이 어느 요일인지에 따라서 공백을 출력. 
        // 만일 1일이 수요일이라면 공백을 세 번 찍는다.(일요일부터 시작) 
        for(int i=1; i < START_DAY_OF_WEEK; i++) { 
              System.out.print("   "); 
        } 
        
        // i는 1일부터 31일까지 출력
        // n은 토요일을 파악해서 줄바꿈
        for(int i=1, n=START_DAY_OF_WEEK ; i <= END_DAY; i++, n++) { 
        	// i가 10보다 작으면 십의자리 공백까지 표시
              System.out.print((i < 10)? "  "+i : " "+i ); 
              if(n%7==0) { 
            	  System.out.println(); 
              }
        } 
		
	}

}
