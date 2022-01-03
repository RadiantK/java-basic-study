package ex14_LamdaMethod;

import java.util.function.*;

public class LamdaMethodTest {

	public static void main(String[] args) {

		Function<String, Integer> f = (String s) -> Integer.parseInt(s);
		Function<String, Integer> f2 = Integer::parseInt; // �޼ҵ�����=Ŭ�����̸�::�޼ҵ��̸�
		
		System.out.println(f.apply("100")+100);
		System.out.println(f2.apply("200")+200);
	}

}
