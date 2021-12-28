package ex7_timetest;

class Time {
	private int hour;
	private int minute;
	private int second;
	
	public Time() {
	}
	
	public int getHour() {
		return hour;
	}
	public void setHour(int hour) {
		if(0>hour || hour>23) {
			return;
		}
		this.hour = hour;
	}
	public int getMinute() {
		return minute;
	}
	public void setMinute(int minute) {
		if(0>minute || minute>59) {
			return;
		}
		this.minute = minute;
	}
	public int getSecond() {
		return second;
	}
	public void setSecond(int second) {
		if(0>second || second>59) {
			return;
		}
		this.second = second;
	}
	
	public String toString() {
		return "시간: "+hour+", 분: "+minute+", 초: "+second;
	}
	
	
}

public class TimeTest {

	public static void main(String[] args) {

		Time t = new Time();
		
		t.setHour(11);
		t.setMinute(40);
		t.setSecond(40);
		
		System.out.println(t);
		
		t.setHour(t.getHour()+2);
		System.out.println(t);
	}

}
