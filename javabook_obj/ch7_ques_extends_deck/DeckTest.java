package ch7_ques_extends_deck;

class Card {
	final static int KIND_MAX = 4;
	final static int NUM_MAX = 13;
	
	final static int SPADE = 4;
	final static int CLOVER = 3;
	final static int HEART = 2;
	final static int DIAMOND = 1;
	
	int kind;
	int number;
	
	public Card() {
		this(SPADE, 1);
	}
	
	public Card(int kind, int number) {
		this.kind = kind;
		this.number = number;
	}
	public String toString() {
		String kind = "";
		String number = "";
		
		switch(this.kind) {
			case 4:
				kind = "SPADE";
				break;
			case 3:
				kind = "CLOVER";
				break;
			case 2:
				kind = "HEART";
				break;
			case 1:
				kind = "DIAMOND";
				break;
			default:
		}
		
		switch(this.number) {
			case 13:
				number = "K";
				break;
			case 12: 
				number = "Q";
				break;
			case 11:
				number = "J";
				break;
			default:
				number = this.number + "";
		}
		return "kind : " + kind +", number : "+ number;
	}
}

class Deck {
	final int CARD_NUM = 52;
	Card[] card = new Card[CARD_NUM];
	
	public Deck() {	
	
		int i = 0;
		for(int k = Card.KIND_MAX; k>0; k--) {
			for(int n=0; n<Card.NUM_MAX; n++) {
				card[i++] = new Card(k, n);
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
		for(int i = 0; i<200; i++) {
			int j = (int)(Math.random()*CARD_NUM);
			Card temp = card[0];
			card[0] = card[j];
			card[j] = temp;
		}
	}
}

public class DeckTest {

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
