package ex14_StreamOperator;

import java.util.Arrays;
import java.util.stream.Stream;

public class StreamFlatMap {

	public static void main(String[] args) {

		Stream<String[]> strArrStream = Stream.of(
				new String[] {"abc", "def", "qwe"},
				new String[] {"ABC", "GHI", "QWE"}
				);
		Stream<String> strStream = strArrStream.
				flatMap((arr) -> Arrays.stream(arr));	
		
				
		strStream.map((i) -> i.toLowerCase())
			.distinct()
			.sorted()
			.forEach(System.out::println);;
		System.out.println();
		
		String[] lineArr = {
				"Belive or not It is true",
				"Do or do Dot there is no try",
		};
		
		Stream<String> lineStream = Arrays.stream(lineArr);
			lineStream.flatMap(i -> Stream.of(i.split(" +"))) // 정규식 하나이상의 공백
			.map(String::toLowerCase) // i -> i.toLowerCase
			.distinct()
			.sorted()
			.forEach(System.out::println);		

	}
}
