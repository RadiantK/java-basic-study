package ex9_toString;

import java.util.Objects;

class Card {
	String kind;
	int number;
	
	Card() {
		this("SPADE", 1);
	}
	
	Card(String kind, int number) {
		this.kind = kind;
		this.number = number;
	}
	
	@Override
	public boolean equals(Object obj) {
		if(obj instanceof Card) {
			Card c = (Card)obj;
			return this.number == c.number && this.kind.equals(c.kind);
		}
		return false;
	}
	
	@Override
	public int hashCode() {
		return Objects.hash(kind, number);
	}
	
	@Override
	public String toString() {
		return "kind : " + kind + ", number: " + number;
	}
	
}

public class ToStringTest {

	public static void main(String[] args) {

		Card c1 = new Card();
		Card c2 = new Card();
		
		System.out.println(c1.equals(c2));
		System.out.println(c1.hashCode());
		System.out.println(c2.hashCode());
		
		
		System.out.println(c1);
		System.out.println(c2);
	}

}
