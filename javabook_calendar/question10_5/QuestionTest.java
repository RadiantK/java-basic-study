package question10_5;

import java.util.Calendar;

public class QuestionTest {

	static int getDayDiff(String yyyymmdd1, String yyyymmdd2) {
		int diff = 0;
		try {
			int year1 = Integer.parseInt(yyyymmdd1.substring(0, 4));
			int month1 = Integer.parseInt(yyyymmdd1.substring(4, 6)) -1; 
			int day1 = Integer.parseInt(yyyymmdd1.substring(6, 8));
			// 월은 0~11이기때문에 -1을 해줌
			int year2 = Integer.parseInt(yyyymmdd2.substring(0, 4));
			int month2 = Integer.parseInt(yyyymmdd2.substring(4, 6)) -1;
			int day2 = Integer.parseInt(yyyymmdd2.substring(6, 8));
			
			
			Calendar date1 = Calendar.getInstance();
			Calendar date2 = Calendar.getInstance();
			
//			System.out.println(date1);
//			System.out.println(date2);
			
			date1.clear(); // 계산 오차를 없에기 위해서
			date2.clear();
			
			date1.set(year1, month1, day1);
			date2.set(year2, month2, day2);
			System.out.println(toString(date1));
			System.out.println(toString(date2));
			
//			System.out.println();
			diff = (int)((date1.getTimeInMillis() - date2.getTimeInMillis()) / (24 * 60 * 60 *1000));
			
		} catch (Exception e) {
			diff = 0;
		}
		return diff;
	}
	
	public static String toString(Calendar date) {
		return date.get(Calendar.YEAR)+"년 "+ (date.get(Calendar.MONTH)+1) +"월 " + date.get(Calendar.DATE) + "일";
	}
	
	public static void main(String[] args) {
		
		System.out.println(getDayDiff("20020103", "20020101"));		
		System.out.println(getDayDiff("20020103", "20020103"));
		System.out.println(getDayDiff("20020103", "200203")); // 예외
	}

}
