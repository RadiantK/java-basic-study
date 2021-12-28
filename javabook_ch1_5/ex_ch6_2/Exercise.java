package ex_ch6_2;

class StudentCard {
	int exerciseCount;
	boolean exercise;
	
	StudentCard() {
		this(1, true);
	}
	StudentCard(int exerciseCount, boolean exercise) {
		this.exerciseCount = exerciseCount;
		this.exercise = exercise;
	}
	
	String info() {
		return exerciseCount +(exercise ? "k" : "");
	}
}

public class Exercise {

	public static void main(String[] args) {

		StudentCard card1 = new StudentCard(3, false);
		StudentCard card2 = new StudentCard();
		
		System.out.println(card1.info());
		System.out.println(card2.info());
		
		
	}

}
