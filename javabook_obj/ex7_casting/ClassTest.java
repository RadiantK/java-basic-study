 package ex7_casting;

class Car {
	String color;
	int door;
	
	void drive() {
		System.out.println("drive~ .brrrrr~~");
	}
	
	void stop() {
		System.out.println("stop!!");
	}
	
	
}

class FireEngine extends Car {
	
	void water() {
		System.out.println("Water!!");
	}
}

public class ClassTest {

	public static void main(String[] args) {
		
//		Car car = null;
//		FireEngine fe = new FireEngine();
//		FireEngine fe2 = null;
//		
//		fe.water();
//		car = (Car)fe;
////		car.water(); ¿¡·¯
//		
//		fe2 = (FireEngine)car;
//		fe2.water();
		
		Car car2 = new FireEngine();
		ClassTest ct = new ClassTest();
		
		ct.doWork(car2);
			

	}
	
	void doWork(Car car2) {
		if(car2 instanceof FireEngine) {
			FireEngine fe2 = (FireEngine)car2;
			fe2.water();
		} else {
			System.out.println("error");
		}
		
	}

}
