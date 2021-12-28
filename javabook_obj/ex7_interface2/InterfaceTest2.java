package ex7_interface2;

class A {
//	public void method(C c)
//	public void method(B b)
	public void method(I i) {
		i.method();
	}
}

// B클래스의 선언과 구현을 분리
interface I {
	void method();
}

class B implements I {
	
	@Override
	public void method() {
		System.out.println("B클래스의 메서드");
	}
}

class C implements I {
	
	@Override
	public void method() {
		System.out.println("C클래스의 메서드");
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
