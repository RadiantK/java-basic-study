package ex14_StreamLamda;

import java.util.Random;
import java.util.stream.IntStream;
import java.util.stream.Stream;

// 난수 만들기
public class StreamRandomTest {

	public static void main(String[] args) {
		
//		IntStream intStream = new Random().ints(); // 무한 스트림
		IntStream intStream = new Random().ints(5, 10); // 난수 수트림(무한스트림)
		intStream.limit(5).forEach(i -> System.out.print(i+ " ")); // limit로 제한
		System.out.println();
		System.out.println();
		
		// iterater(T seed, UnaryOperator f) (초기값, 단항연산자)
		Stream<Integer> intStream2 = Stream.iterate(0, n-> n+2);
		intStream2.limit(10).forEach(i -> System.out.print(i+ " "));
		System.out.println();
		System.out.println();
		
		// generate(Supplier s) : 입력x 출력만있음
		Stream<Integer> oneStream = Stream.generate(()-> 1);
		oneStream.limit(10).forEach(i -> System.out.print(i+ " "));
	}

}
