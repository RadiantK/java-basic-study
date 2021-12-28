package ex7_abstract2;

abstract class Unit {
	int x;
	int y;
	abstract void move(int x, int y);
	void stop() {
		
	}
}

class Marine extends Unit {

	@Override
	void move(int x, int y) {
		System.out.println("Marine" +x +","+ y );		
	}
	
}

class Tank extends Unit {

	@Override
	void move(int x, int y) {
		System.out.println("Tank" +x +","+ y );		
	}
	
}

class Dropship extends Unit {

	@Override
	void move(int x, int y) {
		System.out.println("Dropship" +x +","+ y );		
	}
	
}

public class AbstractTest2 {

	public static void main(String[] args) {

		// 객체배열 = 참조변수를 묶은것
//		Unit[] u = {new Marine(), new Tank(), new Dropship()};
		
		Unit[] u = new Unit[3];
		
		u[0] = new Marine();
		u[1] = new Tank();
		u[2] = new Dropship();
		
		for(int i=0; i<u.length; i++) {
			u[i].move(100, 300);
		}
	}

}
