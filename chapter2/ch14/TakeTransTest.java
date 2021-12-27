package ch14;

public class TakeTransTest {

	public static void main(String[] args) {

		Student studentJ = new Student("james", 5000);
		Student studentT = new Student("tomas", 10000);
		
		Bus bus100 = new Bus(100);
		studentJ.takeBus(bus100);
		
		
		Subway greenSubway = new Subway(2);
		studentT.takeSubway(greenSubway);
		
		studentJ.showInfo();
		studentT.showInfo();
		
		bus100.showBusInfo();
		greenSubway.showSubwayInfo();
	}

}

