package ex14_StreamOperator;

import java.util.stream.IntStream;

public class MiddleOperatorStreamTest {

	public static void main(String[] args) {

		IntStream intStream = IntStream.range(1, 10);
		intStream.skip(2).limit(7).forEach((i)->System.out.print(i+" "));
		System.out.println();
		
		IntStream intStream2 = IntStream.rangeClosed(1, 20);
		intStream2.filter((i) -> i%2 == 0).forEach((i) -> System.out.print(i+" "));
		System.out.println();
		
		IntStream intStream3 = IntStream.of(1,2,2,3,4,4,5,5,6,7);
		intStream3.distinct().forEach(i->System.out.print(i +" "));
		System.out.println();
		
		IntStream intStream4 = IntStream.range(1, 20);
		intStream4.filter(i -> i % 2 == 0 && i % 3 == 0)
				.forEach(i->System.out.print(i+" "));
		
	}
}