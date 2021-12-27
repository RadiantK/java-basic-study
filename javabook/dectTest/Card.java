package dectTest;

public class Card {
	static final int KIND_MAX = 4;
	static final int NUM_MAX = 13;
	
	static final int SPADE = 4;
	static final int HEART = 3;
	static final int DIAMOND = 2;
	static final int CLOVER = 1;
	
	int kind;
	int number;
	
	Card() {
		this(4 , 1);
	}
	
	Card(int kind, int number) {
		this.kind = kind;
		this.number = number;
	}
	
	public String toString() {
		String kind ="";
		String number ="";
		
		switch(this.kind) {
		
			case 4:
				kind = "SPADE";
				break;
			case 3:
				kind = "HEART";
				break;
			case 2:
				kind = "DIAMOND";
				break;
			case 1:
				kind = "CLOVER";
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
				number = this.number+"";
				break;
		}
		return "kind : " + kind + ", number : " + number;
	}
}
