package ex12_Generics;

import java.util.ArrayList;

class Product {}
class Tv extends Product{}
class Audio extends Product{}

public class GenericsTest {

	public static void main(String[] args) {

		ArrayList<Product> pList = new ArrayList<Product>();
		ArrayList<Tv> tList = new ArrayList<Tv>();
//		List<Tv> tvList = new ArrayList<Tv>(); // 다형성
		
		pList.add(new Tv()); // public boolean add(Product e)
		pList.add(new Audio());
		
		tList.add(new Tv());
//		tList.add(new Audio()); // 에러
		
		printAll(pList);
//		printAll(tList); 에러 Product만 가능
		
	}
	public static void printAll(ArrayList<Product> list) {
		for (Product p : list) {
			System.out.println(p);
		}
	}

}
