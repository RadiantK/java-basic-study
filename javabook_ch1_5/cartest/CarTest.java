package cartest;


class Car {
	
	String color;
	String gearType;
	int door;
	
	Car() {
		this("white", "auto", 4);
	}
	
	Car(String color) {
		this(color, "auto", 4);
	}
	
	Car(String color, String gearType, int door) {
		this.color = color;
		this.gearType = gearType;
		this.door = door;
	}
}

public class CarTest {

	public static void main(String[] args) {
		
		Car car1 = new Car();
		Car car2 = new Car("blue");
		
		System.out.println(car1.color + " " + car1.gearType + " " + car1.door);
		System.out.println(car2.color + " " + car2.gearType + " " + car2.door);

		
	}

}
