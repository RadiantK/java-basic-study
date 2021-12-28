package ex7_3_dectTest;

public class DeckTest {

	public static void main(String[] args) {

		Deck d = new Deck();
		Card c = d.pick(0);
		System.out.println(c);
		
		d.suffle();
		c = d.pick(0);
		System.out.println(c);
	}

}
