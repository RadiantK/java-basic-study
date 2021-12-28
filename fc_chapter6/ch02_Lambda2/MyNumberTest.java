package ch02_Lambda2;

public class MyNumberTest {

	public static void main(String[] args) {

		MyNumber myNumber = (x, y) -> x > y ? x : y;
		
		System.out.println(myNumber.getMax(5, 7));
	}

}
