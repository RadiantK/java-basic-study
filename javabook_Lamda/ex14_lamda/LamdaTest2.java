package ex14_lamda;

import java.util.*;
import java.util.function.*;

public class LamdaTest2 {

	public static void main(String[] args) {

//		Supplier<Integer> s = () -> (int)(Math.random()*100)+1;
//		Consumer<Integer> c = i -> System.out.print(i + ", ");
//		Predicate<Integer> p = i -> i % 2 == 0; // ¦���� ���
//		Function<Integer, Integer> f = i -> i/10*10; // i�� �����ڸ��� ���
//		
//		List<Integer> list = new ArrayList<>();
//		makeRandomList(s, list);
//		System.out.println(list);
//		printEvenNum(p, c, list);
//		List<Integer> newList = doSomething(f, list);
//		System.out.println(newList);
//	}
//	static <T> void makeRandomList(Supplier<T> s, List<T> list) {
//		for(int i=0; i< 10; i++) { // 1~100�� ������ list�� �߰�
//			list.add(s.get());
//		}
//	}
//	static <T> void printEvenNum(Predicate<T> p, Consumer<T> c, List<T> list) {
//		System.out.print("[");
//		for(T i : list) { // ����Ʈ�� ���� ¦���̸� true �ƴϸ� false
//			if(p.test(i)) { // predicate�� true / false �� ��ȯ
//				c.accept(i); // i -> System.out.println(i + ", "); ����
//			}
//		}
//		System.out.print("]");
//		System.out.println();
//	}
//	@SuppressWarnings("rawtypes")
//	static <T> List<T> doSomething(Function<T, T> f, List<T> list) {
//		@SuppressWarnings("unchecked")
//		List<T> newList = new ArrayList(list.size());
//		
//		for(T i : list) {
//			newList.add(f.apply(i)); // 1�� �ڸ��� ������ ���ο� list�� ���� 10�ڸ��� ���
//		}
//		return newList;
		
		Supplier<Integer> s = () -> (int)(Math.random()*100)+1; // 1~100 ����
		Consumer<Integer> c = i -> System.out.print(i+", "); // i�� ���
		Predicate<Integer> p = i -> i % 2 == 0; // 2�� ����� ��
		Function<Integer, Integer> f = i -> i/10*10; // i�� ���� �ڸ��� ���
		
		List<Integer> list = new ArrayList<>();
		makeRandom(s, list);
		System.out.println(list);
		printEvenNum(p, c, list);
		System.out.println();
		List<Integer> newList = doSomething(f, list);
		System.out.println(newList);
		
	}
	static <T> void makeRandom(Supplier<T> s , List<T> list) {
		for(int i=0; i<10; i++) {
			list.add(s.get());
		}
	}
	
	static <T> void printEvenNum(Predicate<T> p, Consumer<T> c, List<T> list) {
		System.out.print("[");
		for(T i : list) {
			if(p.test(i)) {
				c.accept(i);
			}
		}
		System.out.print("]");
	}
	@SuppressWarnings("rawtypes")
	static <T> List<T> doSomething(Function<T, T> f, List<T> list) {
		@SuppressWarnings("unchecked")
		List<T> newList = new ArrayList(list.size());
		System.out.println(list.size());
		for(T i : list) {
			newList.add(f.apply(i)); // 1�� �ڸ��� ������ ���ο� list�� ���� 10�ڸ��� ���
		}
		return newList;
	}

}
