package ex14_LamdaMethod;

import java.util.function.*;

class MyClass {
	int iv;
	
	MyClass(int iv) {
		this.iv = iv;
	}
}

public class LamdaClassTest {

	public static void main(String[] args) {

//		Supplier<MyClass> s = () ->  new MyClass();
//		Supplier<MyClass> s2 = MyClass::new; // �������� �޼��� ���� (�ż��� ���� ������)
//		
//		MyClass mc = s.get();
//		System.out.println(mc);
//		System.out.println(s.get());
		
		
		Function<Integer, MyClass> f = i -> new MyClass(i); 
//		Function<Integer, MyClass> f2 =  MyClass::new;
		
		MyClass mc = f.apply(100);
		System.out.println(mc.iv);
		System.out.println((f.apply(100)).iv);

		// �迭�� int �Է°��� �ʿ� (�迭�� ����)
		
		Function<Integer, int[]> f3 = i -> new int[i];
//		Function<Integer, int[]> f4 = int[]::new;
		
//		System.out.println(f3.apply(10));
		int[] arr = f3.apply(10);
		System.out.println("arr.length = "+arr.length);
		
	}

}
