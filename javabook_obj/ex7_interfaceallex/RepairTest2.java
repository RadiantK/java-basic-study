package ex7_interfaceallex;

interface Repair {
	
}

class Unit {
	int hitPoint;
	final int MAX_HP;
	
	public Unit(int hp) {
		this.MAX_HP = hp;
	}
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

class Dropship extends AirUnit implements Repair {

	public Dropship(int hp) {
		super(hp);
	}
	
	public String toString() {
		return "Dropship ";
	}
}

class Tank extends GroundUnit implements Repair {
	
	public Tank(int hp) {
		super(hp);
	}
	public String toString() {
		return "Tank ";
	}
}

class Goliat extends GroundUnit implements Repair {
	
	public Goliat(int hp) {
		super(hp);
	}
	public String toString() {
		return "Goliat ";
	}
}

class Firebat extends GroundUnit {
	
	public Firebat(int hp) {
		super(hp);
	}
	public String toString() {
		return "marine ";
	}
}

class Scv extends GroundUnit implements Repair {

	int hitPoint;
	
	public Scv() {
		super(50);
	}
	void repair(Repair re) {
		if (re instanceof Unit) {
			Unit u = (Unit)re;
			while(u.hitPoint != u.MAX_HP) {
				u.hitPoint++;
			}
			System.out.println(u + "유닛의 수리가 완료되었습니다.");
		}
	}
	
}
public class RepairTest2 {

	public static void main(String[] args) {
		
		Scv scv = new Scv();
		Tank t = new Tank(150);
		Dropship ds = new Dropship(100);
		Goliat g = new Goliat(130);
//		Firebat f = new Firebat(50);
		
		scv.repair(t);
		scv.repair(ds);
		scv.repair(g);
//		scv.repair(f); // 파이어벳은 리페어 인터페이스를 구현하지 않음
	}
}
