package ch02_Lambda;

public class AddTest {

	public static void main(String[] args) {

		Add add = (x, y) -> x+y;
		
		System.out.println(add.add(2, 3));
	}

}
