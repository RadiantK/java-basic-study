package ch7_ex18question;

class Robot {}

class DanceRobot extends Robot {
	void dance() {
		System.out.println("춤을 춥니다.");
	}
}

class SingRobot extends Robot {
	void sing() {
		System.out.println("노래를 부릅니다.");
	}
}

class DrawRobot extends Robot {
	void draw() {
		System.out.println("그림을 그립니다.");
	}
}

public class QuestionTest18 {

	public static void main(String[] args) {
		
		Robot[] arr = new Robot[3];
		
		arr[0] = new DanceRobot();
		arr[1] = new SingRobot();
		arr[2] = new DrawRobot();
		
		for (int i=0; i<arr.length; i++)
			action(arr[i]);
	}
	
	public static void action(Robot r) {
		if(r instanceof DanceRobot) {
			DanceRobot dr = (DanceRobot)r;
			dr.dance();
		}
		if(r instanceof SingRobot) {
			SingRobot sr = (SingRobot)r;
			sr.sing();
		}
		if(r instanceof DrawRobot) {
			DrawRobot dr2 = (DrawRobot)r;
			dr2.draw();
		}
	}

}
