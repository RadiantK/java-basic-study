package ex_10_calendar_set;

import java.util.Calendar;

public class CalendarTest2 {

	public static void main(String[] args) {

		final String[] DAY_OF_WEEK =  {"", "일", "월", "화", "수", "목", "금", "토"};
		
		Calendar date1 = Calendar.getInstance();
		Calendar date2 = Calendar.getInstance();
		
		date1.set(2019, 3, 29); // 2019년 4월 29일 지정
		System.out.println("data1은 "+ toString(date1)+ "월"+"요일이고,");
		System.out.println("오늘(data2)은 "+ toString(date2)
			+ DAY_OF_WEEK[date2.get(Calendar.DAY_OF_WEEK)]+"요일입니다.");
		
		// 두 날짜간의 차이를 얻으려면, getTimeMillis() 천분의 일초 단위로 반환해야 한다.
		long difference = (date2.getTimeInMillis() - date1.getTimeInMillis())/1000;
		System.out.println("그 날(date1)부터 지금(date2)까지 " + difference + "초가 지났습니다.");
		System.out.println("일(day)로 계산하면 " + difference/(24*60*60) + "일입니다.");
//		1일 = 24*60*60
	}

	private static String toString(Calendar date) {
		return date.get(Calendar.YEAR)+"년"+(date.get(Calendar.MONTH)+1)
				+ "월" + date.get(Calendar.DATE)+ "일";
	}

}
