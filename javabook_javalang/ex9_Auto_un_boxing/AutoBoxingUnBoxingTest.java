package ex9_Auto_un_boxing;

import java.util.ArrayList;

public class AutoBoxingUnBoxingTest {

	@SuppressWarnings("removal")
	public static void main(String[] args) {

		ArrayList<Integer> list = new ArrayList<>();
		
		list.add(new Integer(100));
		list.add(100); // JDK 1.5이전에는 에러
		
//		Integer i = list.get(0); // list에 저장된 첫 번째 객체를 꺼냄
//		Integer i = list.get(0).intValue(); // intValue()로 Integer를 int로 변환
		@SuppressWarnings("unused")
		int i = list.get(0); // intValue()로 Integer를 int로 변환
		
	}

}
