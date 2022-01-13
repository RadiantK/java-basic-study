package ex14_StreamLamda;

import java.util.Arrays;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class StreamList {

	public static void main(String[] args) {
		
//		List<Integer> list = Arrays.asList(1,2,3,4,5); // �б����� �迭 ����
//		// list�����͸� �ҽ����ϴ� ���ο� ��Ʈ�� ����
//		Stream<Integer> intStream = list.stream();
//		intStream.forEach((i) -> System.out.print(i+" "));
//		
//		// stream�� 1ȸ��, stream�� ���� ���������� �����ϸ� stream�� ������.
//		intStream = list.stream(); // list�κ��� stream�� ����
//		intStream.forEach((i) -> System.out.print(i+" "));
		
		String[] strArr = {"a", "b", "c", "d"};
		Stream<String> strStream = Stream.of(strArr);
		strStream.forEach((i)->System.out.print(i+" "));
		
		Stream<String> strStream2 = Arrays.stream(strArr);
		strStream2.forEach((i)->System.out.print(i+" "));
		
		int[] intArr = {1,2,3,4,5};
		IntStream intStream = Arrays.stream(intArr);
		intStream.forEach(System.out::print);
		
		intStream = Arrays.stream(intArr);
		System.out.println("count:" + intStream.count());
		
		intStream = Arrays.stream(intArr);
		System.out.println("sum: "+intStream.sum());
		
		Integer[] intArr2 = {1,2,3,4,5};
		Stream<Integer> intStream2 = Arrays.stream(intArr2);
		System.out.print("count: "+intStream2.count());
		
		
	}

}
