package ch9_ex12question_enum;

class Card {
	enum Kind { CLOVER, HEART, DIAMOND, SPADE }
	enum Number { ACE, TWO, THREE, FOUR, FIVE
			, SIX, SEVEN, EIGHT, NINE, TEN
			, JECK, QUEEN, KING }
	
	Kind kind;
	Number number;
	
	public Card() {
		this(Kind.SPADE, Number.ACE);
	}
	
	public Card(Kind kind, Number number) {
		this.kind = kind;
		this.number = number;
	}
	
	@Override
	public String toString() {
		return "kind : " + kind.name() +", number : "+ number.name();
	}
}

class Deck {
	final int CARD_NUM = 52;
	Card[] card = new Card[CARD_NUM];
	
	Deck() {	
	
		int i = 0;
		for (Card.Kind kind : Card.Kind.values()) {
			for(Card.Number number : Card.Number.values()) {
				card[i++] = new Card(kind, number);
			}
		}
	}
	
	Card pick(int index) {
		if(0 < index && index < CARD_NUM ) {
			return card[index];
		} else {
			return pick();
		}
	}
	Card pick() {
		int index = (int)(Math.random()*CARD_NUM);
		return pick(index);
	}
	
	void suffle() {
		for(int i = 0; i<50; i++) {
			int j = (int)(Math.random()*CARD_NUM);
			int k = (int)(Math.random()*CARD_NUM);
			Card temp = card[j];
			card[j] = card[k];
			card[k] = temp;
		}
	}
	
	
}

public class EnumDeckTest {

	public static void main(String[] args) {

		Deck d = new Deck();
		Card c = d.pick(0);
		System.out.println(c);
		System.out.println();
		
		d.suffle();
		c = d.pick(0);
		System.out.println(c);
	}

}
