package ex_9_WrapperTest;

public class WrapperTest {

	public static void main(String[] args) {

		@SuppressWarnings("removal")
		Integer i = new Integer(100);
		@SuppressWarnings("removal")
		Integer i2 = new Integer(100);
		
		System.out.println("i==i2 ? "+(i==i2));
		System.out.println("i.equals(i2) ? "+i.equals(i2));
		System.out.println("i.compareTo(i2) ? "+i.compareTo(i2));
		System.out.println("i.toString ? "+i.toString());
		System.out.println();
		
		System.out.println("MAX_VALUE = "+Integer.MAX_VALUE);
		System.out.println("MIN_VALUE = "+Integer.MIN_VALUE);
		System.out.println("SIZE = "+Integer.SIZE);
		System.out.println("BYTES = "+Integer.BYTES);
		System.out.println("TYPE = "+Integer.TYPE);
	}

}
