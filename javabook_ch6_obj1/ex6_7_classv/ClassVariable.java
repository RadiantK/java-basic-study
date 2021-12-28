package ex6_7_classv;

class Data {
	int x;

}

public class ClassVariable {

	public static void main(String[] args) {

		ClassVariable cv = new ClassVariable();
		Data d = new Data();
		Data d2 = new Data();
		d.x = 10;
		d2.x = 11;
		System.out.println("d = " + d.x);
		System.out.println("d2 = " + d2.x);
		
		cv.change(d2);
		System.out.println("d = " + d.x);
		System.out.println("d2 = " + d2.x);
		
		
		
	}
	void change(Data d2) {
		d2.x = 1000;
		System.out.println("d2 = " + d2.x);
	}

}
