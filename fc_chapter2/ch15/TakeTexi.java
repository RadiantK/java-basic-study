package ch15;

public class TakeTexi {

	public static void main(String[] args) {
		
		Guest guest = new Guest("Edward", 20000);
		
		Texi texi = new Texi("�� ���� ���");
		
		guest.takeTexi(texi);
		
		guest.showInfo();
		
		texi.texiInfo();

	}

}
