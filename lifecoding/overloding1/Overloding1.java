package overloding1;

class Calculator {
	
	int a;
	int b;
	int c = 0;
	
	public Calculator() {}
	
	public void setOperand(int a, int b) {
		this.a = a;
		this.b = b;
	}
	
	public void setOperand(int a, int b, int c) {
		this.a = a;
		this.b = b;
		this.c = c;
	}
	
	void sum() {
		System.out.println(this.a+this.b+this.c);
	}
	
	void avg() {
		System.out.println((this.a+this.b+this.c)/2);
	}
}


public class Overloding1 {

	public static void main(String[] args) {

		Calculator c1 = new Calculator();
        c1.setOperand(10, 20);
        c1.sum();       
        c1.avg();
        c1.setOperand(10, 20, 30);
        c1.sum();       
        c1.avg();
	}

}
