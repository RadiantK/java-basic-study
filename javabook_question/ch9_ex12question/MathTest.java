package ch9_ex12question;

public class MathTest {

	public static void main(String[] args) {

		for(int i = 0; i<20; i++) {
			System.out.print(getRand(1, -3)+", ");
		}
	}
	static int getRand(int from, int next) {
		return (int)(Math.random()*(Math.abs(next-from)+1))+Math.min(from, next);
	}

}
