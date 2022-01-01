package ch7_2question;

class SutdaDeck {
	
	final int CARD_NUM = 20;
	SutdaCard[] card = new SutdaCard[CARD_NUM]; 
	
	SutdaDeck() {
		for(int i = 0; i<card.length; i++) {
			int num = i%10+1;
			boolean isKwang = (i<10)&& (num==1||num==3||num==8);
			
			card[i] = new SutdaCard(num, isKwang);
		}
	}
	void suffle() {
		
		for(int i = 0; i<card.length*2; i++) {
			int j = (int)(Math.random()*card.length);
			int k = (int)(Math.random()*card.length);
			
			SutdaCard temp = card[j];
			card[j] = card[k];
			card[k] = temp;
		}
	}
	SutdaCard pick() {
		int i = (int)(Math.random()*card.length);
		return pick(i);
	}
	SutdaCard pick(int i) {
		if(i < 0 || i > CARD_NUM) {
			return null;
		}
		return card[i];
	}
	
}

class SutdaCard {
	int num;
	boolean isKwang;
	
	SutdaCard() {
		this(1, true);
	}
	SutdaCard(int num, boolean isKwang) {
		this.num = num;
		this.isKwang = isKwang;
	}
	public String toString() {
		return num +(isKwang ? "±¤!" : "");
	}
}

public class QuestionTest2 {

	public static void main(String[] args) {

		SutdaDeck deck = new SutdaDeck();
		
		System.out.println(deck.pick(0));
		System.out.println(deck.pick());
		
		for(int i=0; i<deck.card.length; i++) {
			System.out.print(deck.card[i]+", ");
		}
		
		System.out.println();
		
		deck.suffle();
		for(int i=0; i<deck.card.length; i++) {
			System.out.print(deck.card[i]+", ");
		}
		
	}

}
