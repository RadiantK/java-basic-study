package ch15;

public class TakeTexi {

	public static void main(String[] args) {
		
		Guest guest = new Guest("Edward", 20000);
		
		Texi texi = new Texi("잘 간다 운수");
		
		guest.takeTexi(texi);
		
		guest.showInfo();
		
		texi.texiInfo();

	}

}
