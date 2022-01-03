package ex14_StreamLamda;

import java.util.*;
import java.util.stream.*;

public class StreamTest {

	public static void main(String[] args) {
		List<Integer> list = Arrays.asList(1,2,3,4,5);
		
		Stream<Integer> intStream = list.stream(); //list를 데이터 소스로하는 Stream생성
		
		intStream.forEach((i)-> System.out.print(i)); // forEach()는 최종연산
//		intStream.forEach((i)-> System.out.println(i)); // 에러 , 스트림은 1회용

		intStream = list.stream();
		intStream.forEach(System.out::print);
		System.out.println();
		
//		String[] arr = new String[] {"a","b","c","d"};
//		Stream<String> strStream = Stream.of(arr);
//		strStream.forEach((i) -> System.out.print(i));
//		System.out.println();
		
		String[] strArr = {"a", "b", "c", "d"};
//		Stream<String> strStream2 = Arrays.stream(strArr);
		Stream<String> strStream = Stream.of(strArr);
		strStream.forEach((i) -> System.out.print(i));
		System.out.println();
		
//		int[] intArr = {1,2,3,4,5}; // 기본형
//		IntStream intStream2 = Arrays.stream(intArr);
//		intStream2.forEach((i) -> System.out.print(i));
//		System.out.println("count:"+intStream2.count());
//		System.out.println("count:"+intStream2.sum());
//		System.out.println("count:"+intStream2.average());
		
		
//		Integer[] intArr = {1,2,3,4,5}; // 객체형
//		Stream<Integer> intStream2 = Arrays.stream(intArr);
////		intStream2.forEach((i) -> System.out.print(i)); // 최종연산
//		System.out.println("count:"+intStream2.count()); // 최종연산
	}

}
