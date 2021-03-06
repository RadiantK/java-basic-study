package ex11_TreeSet;

import java.util.TreeSet;

public class TreeSetTest2 {

	@SuppressWarnings({ "rawtypes", "unchecked" })
	public static void main(String[] args) {

		TreeSet set = new TreeSet(); // 범위 검색에 유리 from to
		
		String from = "b";
		String to = "d";
		
		set.add("abc");
		set.add("alien");
		set.add("bat");
		set.add("car");
		set.add("Car");
		set.add("disk");
		set.add("dance");
		set.add("dzzzz");
		set.add("dZZZZ");
		set.add("elephant");
		set.add("elevator");
		set.add("fan");
		set.add("flower");
		
		System.out.println(set);
		System.out.println("range search : from " + from + " to " + to);
		System.out.println("result1 : " + set.subSet(from, to));
		System.out.println("result2 : " + set.subSet(from, to+ "zzz"));
		System.out.println("result2 : " + set.subSet(from, "dzzz"));
		
		
	}

}
