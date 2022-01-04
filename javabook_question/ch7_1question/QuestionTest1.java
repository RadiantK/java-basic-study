package ch7_1question;

class SutdaDeck {
	
	final int CARD_NUM = 20;
	SutdaCard[] sc = new SutdaCard[CARD_NUM]; 
	
	SutdaDeck() {
		for(int i = 0; i<sc.length; i++) {
			int num = i%10+1;
			boolean isKwang = (i<10)&& (num==1||num==3||num==8);
			
			sc[i] = new SutdaCard(num, isKwang);
		}	
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
		return num +(isKwang==true ? "±¤!" : "");
	}
}

public class QuestionTest1 {

	public static void main(String[] args) {

		SutdaDeck deck = new SutdaDeck();
		
		for(int i=0; i<deck.sc.length; i++) {
			System.out.print(deck.sc[i]+", ");
		}
		
	}

}
