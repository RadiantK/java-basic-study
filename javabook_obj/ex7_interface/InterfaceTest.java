package ex7_interface;

abstract class Unit {
	int x, y;
	abstract void move(int x, int y);
	void stop() {
		System.out.println("����ϴ�.");
	}
}

interface Fightable {
	void move(int x, int y); // public abstract ����
	void attack(Fightable f);
}

class Fighter extends Unit implements Fightable {

	@Override
	public void move(int x, int y) {
		System.out.println("["+x+","+y+"]�� �̵�");
	}
	
	@Override
	public void attack(Fightable f) {
		System.out.println(f + "�� ����");
	}
	
	Fightable getFightable() {
		Fighter f = new Fighter();
		return f; // Fightable f ����
	}
	
}

public class InterfaceTest {

	public static void main(String[] args) {

		Fighter f = new Fighter();
		Fightable f3 = f.getFightable();
		
		f3.move(200, 400);
		f3.attack(f3);
		System.out.println();
		
		Unit u = new Fighter();
		u.move(100, 300);
		u.stop();
		System.out.println();
			
		Fighter f2 = new Fighter();
		f2.move(100, 200);
		f2.attack(f2);
		f.attack(new Fighter());
	}

}
