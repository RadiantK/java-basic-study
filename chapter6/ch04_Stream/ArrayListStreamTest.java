package ch04_Stream;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class ArrayListStreamTest {

	public static void main(String[] args) {

		List<String> list = new ArrayList<>();
		
		list.add("KingKong");
		list.add("TheWar");
		list.add("Avengers");
		
		Stream<String> stream = list.stream();
		
		stream.forEach(key -> System.out.println(key));
		list.stream().sorted().forEach(key -> System.out.print(key + "\t"));
		System.out.println("");
		list.stream().map(key -> key.length()).forEach(n->System.out.print(n+"\t"));
		System.out.println("");
		list.stream().filter(key -> key.length()>6).forEach(n -> System.out.print(n+"\t"));
		
	}

}