package ch7timetest;

public class TimeTest {

	public static void main(String[] args) {
		
		Time t = new Time();
		
		t.setHour(11);
		t.setMinuts(40);
		t.setSecond(23);
		
		System.out.println(t);
			
		t.setHour(t.getHour()+2);
		System.out.println(t);
	}
}
