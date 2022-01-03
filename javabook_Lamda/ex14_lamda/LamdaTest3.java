package ex14_lamda;

import java.util.function.*;

public class LamdaTest3 {

	public static void main(String[] args) {

		Function<String, Integer> f = (s) -> Integer.parseInt(s, 16); //���� 16���� ��ȯ
		Function<Integer, String> g = (i) -> Integer.toBinaryString(i); // 2���κ�ȯ
		
		// ù��° �Լ��� ��°� �ι�° �Լ��� �Է��� ���ƾ���
		Function<String, String> h = f.andThen(g); // �ΰ��� �̾���
		Function<Integer, Integer> h2 = f.compose(g); // �� �ݴ�
		
		System.out.println(h.apply("FF")); // "FF"->255->"11111111"
		System.out.println(h2.apply(2)); // 2->"10"->16
		
		Function<String, String> f2 = x -> x; // �׵��Լ�
		System.out.println(f2.apply("AAA"));
		
		Predicate<Integer> p = i -> i < 100;
		Predicate<Integer> q = i -> i < 200;
		Predicate<Integer> r = i -> i % 2 == 0;
		Predicate<Integer> notP = p.negate(); // not i>=100
		
		Predicate<Integer> all = notP.and(q.or(r)); // i>=100 && (i<200 ||i%2 ==0)
		System.out.println(all.test(150));
		
		String str1 = "abc";
		String str2 = "abc";
		
		Predicate<String> p2 = Predicate.isEqual(str1);
		boolean result = p2.test(str2);
		System.out.println(result);
	}

}
