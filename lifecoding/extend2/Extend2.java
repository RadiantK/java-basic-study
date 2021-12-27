package extend2;

class Calculator {
	
	int a;
	int b;
	
	public Calculator() {}

	public Calculator(int a, int b) {
		this.a = a;
		this.b = b;
	}
	
	public void setOperate(int a, int b) {
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
	
	@Override
	void sum() {
		System.out.println("실행 결과는 "+ (this.a+this.b)+ "입니다.");
	}
	
	void sub() {
		System.out.println(this.a - this.b);
	}
	
}

class MulCalculator extends Calculator {
	
	public MulCalculator(int a, int b) {
		super(a, b);
		// TODO Auto-generated constructor stub
	}

	void mul( ) {
		System.out.println(this.a * this.b);
	}
	
}

class DivCalculator extends MulCalculator {
	
	public DivCalculator(int a, int b) {
		super(a, b);
		// TODO Auto-generated constructor stub
	}

	void div() {
		System.out.println(this.a / this.b);
	}
}

public class Extend2 {

	public static void main(String[] args) {
		
		SubCalculator c1 = new SubCalculator(10, 20);
		
		c1.sum();
		c1.avg();
		c1.sub();

	}

}
