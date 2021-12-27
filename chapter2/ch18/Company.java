package ch18;

public class Company {

	private static Company instance = new Company();
	private Company() {
		
	}
	
	public static Company getTnstance () {
		if( instance == null) {
			instance = new Company();
		}
		return instance;
	}
}
