package ex14_StreamOperator;

import java.io.File;
import java.util.stream.Stream;

public class StreamMap {

	public static void main(String[] args) {

		File[] fileArr = { new File("Ex1.java"), new File("Ex1.bak"),
				new File("Ex2.java"), new File("Ex1"), new File("Ex1.txt")
		};
		
		Stream<File> fileStream = Stream.of(fileArr);
		
		// map()���� Stream<File>�� Stream<String>���� ��ȯ
		Stream<String> fileNameString = fileStream.map(File::getName);
		// (File f) -> f.getName()
		fileNameString.forEach(i->System.out.print(i+"  "));
		
		fileStream = Stream.of(fileArr);
		
		fileStream.map((File f) -> f.getName()) // Stream<File>->Stream<String>
			.filter(s -> s.indexOf('.')!=-1) // . Ȯ���ڰ� ���� ���� ����
//			.peek(s->System.out.print(s+" "))
			.map(String::toUpperCase) // ��� �빮�ڷ� ��ȯ s-> s.toUpperCase()
//			.peek(e->System.out.println(e +" "))
			.distinct() // �ߺ� ����
			.forEach(i-> System.out.println(i));	
		
	}

}
