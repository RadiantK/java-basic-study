package ex7_interface2;

class A {
//	public void method(C c)
//	public void method(B b)
	public void method(I i) {
		i.method();
	}
}

// BŬ������ ����� ������ �и�
interface I {
	void method();
}

class B implements I {
	
	@Override
	public void method() {
		System.out.println("BŬ������ �޼���");
	}
}

class C implements I {
	
	@Override
	public void method() {
		System.out.println("CŬ������ �޼���");
	}
}

public class InterfaceTest2 {

	public static void main(String[] args) {

		A a = new A();
		
//		C c = new C();
//		a.method(c);
		a.method(new B());
	}

}
