package ex7_interfaceallex;

interface Repair {
	
}

class Unit {
	int hitPoint;
	final int MAX_HP;
	
	Unit(int hp) {
		MAX_HP = hp;
	}
}

class GroundUnit extends Unit {

	GroundUnit(int hp) {
		super(hp);
	}	
}

class AirUnit extends Unit {

	AirUnit(int hp) {
		super(hp);
	}
}

class Tank extends GroundUnit implements Repair {

	Tank() {
		super(120);
	}
	
	public String toString() {
		return "Tank";
	}
}

class Dropship extends AirUnit implements Repair {

	Dropship() {
		super(100);
	}
	
	public String toString() {
		return "Dropship";
	}
}

class Scv extends GroundUnit implements Repair {
	int hitPoint;

	Scv() {
		super(60);	
	}
	
	void RepairTest(Repair re) {
		if(re instanceof Unit) {
			Unit u = (Unit)re;
			while(u.hitPoint != u.MAX_HP) {
				u.hitPoint++;
			}
			System.out.println(re + "가 수리되었습니다.");
		}
	}
}


public class RepairTest2 {

	public static void main(String[] args) {
		
		Tank t = new Tank();
		Dropship d = new Dropship();
		
		Scv s = new Scv();
		
		s.RepairTest(t);
		s.RepairTest(d);

	}

}
