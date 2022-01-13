package ex14_StreamOperator;

import java.util.Optional;
import java.util.OptionalInt;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class LastOperatorStreamTest {

	public static void main(String[] args) {

		String[] strArr = {
				"Inheritance", "Java", "Lamda", "stream",
				"Optional", "Instrance", "Count", "isPresent"
		};
		
		Stream.of(strArr).forEach(s-> System.out.println(s));
		
		boolean noEmptyStr = Stream.of(strArr).noneMatch(s->s.length() == 0);
		Optional<String> sWord = Stream.of(strArr)
				.filter(s-> s.charAt(0)=='s').findFirst();
		
		System.out.println();
		System.out.println("noEmptyStr: "+noEmptyStr);
		System.out.println("sWord: "+ sWord.get());
		System.out.println();
		// Stream<String>을 Stream<Integer>으로 변환
//		IntStream intStream1 = Stream.of(strArr).map(s -> s.length());
		
		// Stream<String[]>을 IntStream으로 변환. IntStream 기본형스트림
		IntStream intStream1 = Stream.of(strArr).mapToInt(s -> s.length());
		IntStream intStream2 = Stream.of(strArr).mapToInt(s -> s.length());
		IntStream intStream3 = Stream.of(strArr).mapToInt(String::length);
		IntStream intStream4 = Stream.of(strArr).mapToInt(String::length);
		
//		intStream1.forEach(System.out::println);
		
		int count = intStream1.reduce(0, (a,b) -> a + 1);
		int sum = intStream2.reduce(0, (a,b) -> a + b);
		
		OptionalInt max = intStream3.reduce((a,b) -> Integer.max(a, b));
		OptionalInt min = intStream4.reduce(Integer::min);
		System.out.println("count: "+count); // 단어갯수
		System.out.println("sum: "+sum); // 단어의 길이를 모두 셈
		System.out.println("max: "+max.getAsInt()); 
		System.out.println("min: "+min.getAsInt());
	}

}
