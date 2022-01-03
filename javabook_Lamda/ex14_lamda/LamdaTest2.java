package ex14_lamda;

import java.util.*;
import java.util.function.*;

public class LamdaTest2 {

	public static void main(String[] args) {

		Supplier<Integer> s = () -> (int)(Math.random()*100)+1;
		Consumer<Integer> c = i -> System.out.print(i + ", ");
		Predicate<Integer> p = i -> i % 2 == 0; // 짝수만 출력
		Function<Integer, Integer> f = i -> i/10*10; // i의 십의자리만 출력
		
		List<Integer> list = new ArrayList<>();
		makeRandomList(s, list);
		System.out.println(list);
		printEvenNum(p, c, list);
		List<Integer> newList = doSomething(f, list);
		System.out.println(newList);
	}
	static <T> void makeRandomList(Supplier<T> s, List<T> list) {
		for(int i=0; i< 10; i++) { // 1~100의 난수를 list에 추가
			list.add(s.get());
		}
	}
	static <T> void printEvenNum(Predicate<T> p, Consumer<T> c, List<T> list) {
		System.out.print("[");
		for(T i : list) { // 리스트의 값이 짝수이면 true 아니면 false
			if(p.test(i)) { // predicate는 true / false 값 반환
				c.accept(i); // i -> System.out.println(i + ", "); 실행
			}
		}
		System.out.print("]");
		System.out.println();
	}
	@SuppressWarnings("rawtypes")
	static <T> List<T> doSomething(Function<T, T> f, java.util.List<T> list) {
		@SuppressWarnings("unchecked")
		List<T> newList = new ArrayList(list.size());
		
		for(T i : list) {
			newList.add(f.apply(i)); // 1의 자리를 없에서 새로운 list에 저장 10자리만 출력
		}
		return newList;
	}

}
