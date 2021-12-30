package ex7_interfaceall;

interface Repairable {
	
}

class GroundUnit extends Unit {

	public GroundUnit(int hp) {
		super(hp);
	}
	
}

class AirUnit extends Unit {

	public AirUnit(int hp) {
		super(hp);
	}
	
}

class Unit {
	int hitPoint;
	final int MAX_HP;
	public Unit(int hp) {
		MAX_HP = hp;
	}
}

class Tank extends GroundUnit implements Repairable {

	public Tank() {
		super(130);
	}
	
	public String toString() {
		return "Tank";
	}
	
}

class Marine extends GroundUnit{
	
	public Marine() {
		super(50);
	}
}

class Dropship extends AirUnit implements Repairable {

	public Dropship() {
		super(100);
		
	}
	
	public String toString() {
		return "Dropship";
	}
	
}

class Scv extends GroundUnit implements Repairable {

	public Scv() {
		super(60);
//		hitPoint = MAX_HP;
	}
	
	void Repair(Repairable r) {
		if(r instanceof Unit) {
			Unit u = (Unit)r;
			while(u.hitPoint != u.MAX_HP) {
//				System.out.println(u.hitPoint);
				u.hitPoint++;
			}
			System.out.println(u.toString() + "유닛의 수리가 완료되었습니다.");
		}
	}
	
	
}

public class RepairTest {

	public static void main(String[] args) {

		Tank t = new Tank();
		Dropship d = new Dropship();
//		Marine m = new Marine();
		Scv s = new Scv();
		
		s.Repair(t);
		s.Repair(d);
//		s.Repair(m); 에러 인터페이스에 상속 안되있음
		
	}

}
