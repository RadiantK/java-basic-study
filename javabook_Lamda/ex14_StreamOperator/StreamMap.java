package ex14_StreamOperator;

import java.io.File;
import java.util.stream.Stream;

public class StreamMap {

	public static void main(String[] args) {

		File[] fileArr = { new File("Ex1.java"), new File("Ex1.bak"),
				new File("Ex2.java"), new File("Ex1"), new File("Ex1.txt")
		};
		
		Stream<File> fileStream = Stream.of(fileArr);
		
		// map()으로 Stream<File>을 Stream<String>으로 변환
		Stream<String> fileNameString = fileStream.map(File::getName);
		// (File f) -> f.getName()
		fileNameString.forEach(i->System.out.print(i+"  "));
		
		fileStream = Stream.of(fileArr);
		
		fileStream.map((File f) -> f.getName()) // Stream<File>->Stream<String>
			.filter(s -> s.indexOf('.')!=-1) // . 확장자가 없는 것은 제외
//			.peek(s->System.out.print(s+" "))
			.map(String::toUpperCase) // 모두 대문자로 변환 s-> s.toUpperCase()
//			.peek(e->System.out.println(e +" "))
			.distinct() // 중복 제거
			.forEach(i-> System.out.println(i));	
		
	}

}
