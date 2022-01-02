package ch9_1EqualsTest;

import java.util.Objects;

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
	@Override
	public boolean equals(Object obj) {
		if(obj instanceof SutdaCard) {
			SutdaCard c = (SutdaCard)obj;
			return this.num==c.num && this.isKwang==c.isKwang;
		}
		return false;
	}
	@Override
	public int hashCode() {
		return Objects.hash(num, isKwang);
	}
}

public class EqaulsTest {

	public static void main(String[] args) {

		SutdaCard c1 = new SutdaCard(3,true);
		SutdaCard c2 = new SutdaCard(3,true);
		
		System.out.println("c1 = "+ c1);
		System.out.println("c2 = "+ c2);
		System.out.println("c1.equals(c2) = "+ c1.equals(c2));
	}

}

