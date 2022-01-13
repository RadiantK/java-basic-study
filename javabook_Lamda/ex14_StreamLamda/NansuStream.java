package ex14_StreamLamda;


import java.util.stream.Stream;

public class NansuStream {

	public static void main(String[] args) {

//		IntStream intStream = new Random().ints();
//		intStream.limit(5).forEach((i) -> System.out.println(i)); // 5개만 잘라서 출력
//		
//		IntStream intStream2 = new Random().ints(5,10);
//		intStream2.limit(5).forEach(System.out::println);
		
		// iterate(T seed, UnaryOperator f) 단항연산자
		Stream<Integer> intStream3 = Stream.iterate(0, i -> i+2);
		intStream3.limit(5).forEach((i) -> System.out.print(i+" "));
		
		// generate(Supplier s) : 입력x 출력o
		Stream<Integer> oneStream = Stream.generate(() -> 2);
		oneStream.limit(5).forEach(System.out::print);
	}

}
