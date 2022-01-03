package ex14_StreamLamda;

import java.util.Random;
import java.util.stream.IntStream;
import java.util.stream.Stream;

// ���� �����
public class StreamRandomTest {

	public static void main(String[] args) {
		
//		IntStream intStream = new Random().ints(); // ���� ��Ʈ��
		IntStream intStream = new Random().ints(5, 10); // ���� ��Ʈ��(���ѽ�Ʈ��)
		intStream.limit(5).forEach(i -> System.out.print(i+ " ")); // limit�� ����
		System.out.println();
		System.out.println();
		
		// iterater(T seed, UnaryOperator f) (�ʱⰪ, ���׿�����)
		Stream<Integer> intStream2 = Stream.iterate(0, n-> n+2);
		intStream2.limit(10).forEach(i -> System.out.print(i+ " "));
		System.out.println();
		System.out.println();
		
		// generate(Supplier s) : �Է�x ��¸�����
		Stream<Integer> oneStream = Stream.generate(()-> 1);
		oneStream.limit(10).forEach(i -> System.out.print(i+ " "));
	}

}
