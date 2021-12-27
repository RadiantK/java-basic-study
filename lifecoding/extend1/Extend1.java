package extend1;

class Calculator {
	
	int a;
	int b;
	
	public Calculator(int a, int b) {
		this.a = a;
		this.b = b;
	}
	
	void sum() {
		System.out.println(this.a+this.b);
	}
	
	void avg() {
		System.out.println((this.a+this.b)/2);
	}
}

class SubCalculator extends Calculator {

	public SubCalculator(int a, int b) {
		super(a, b);
		
	}
	
	void sub() {
		System.out.println(this.a - this.b);
	}
	
}

class MulCalculator extends Calculator {

	public MulCalculator(int a, int b) {
		super(a, b);
	}
	
	void mul( ) {
		System.out.println(this.a * this.b);
	}
	
}

class DivCalculator extends MulCalculator {

	public DivCalculator(int a, int b) {
		super(a, b);
	}
	
	void div() {
		System.out.println(this.a / this.b);
	}
}


public class Extend1 {

	public static void main(String[] args) {
		
		SubCalculator c1 = new SubCalculator(10, 20);
		c1.sum();
		c1.avg();
		c1.sub();
		System.out.println("");
		
				
		DivCalculator c3 = new DivCalculator(10, 2);
		c3.mul();
		c3.div();
		c3.avg();
	}

}
