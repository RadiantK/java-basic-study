package ch9_8question;

public class RoundTest {

	public static void main(String[] args) {

		System.out.println(round(3.1415,1));
		System.out.println(round(3.1415,2));
		System.out.println(round(3.1415,3));
		System.out.println(round(3.1415,4));
		System.out.println(round(3.1415,5));
	}
	
	static double round(double d, int n) {
		return Math.round(d*Math.pow(10, n))/Math.pow(10, n);
	}

}
