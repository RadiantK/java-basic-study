package ex7_override;

// ��� �����ڴ� ù�ٿ� ���� �����ڸ� ȣ�� �ؾ� ��

class Point {
	int x;
	int y;
	
	Point() {}
	
	Point(int x, int y) {
		this.x = x;
		this.y = y;
	}
	
	String getLocation() {
		return "x: " + x + ", y: " + y;
	}
}

class Point3D extends Point {
	int z;	
	
	Point3D(int x, int y, int z) {
//		super(x, y);
		this.x = x;
		this.y =y;
		this.z = z;
	}
	
	// �������̵�
	String getLocation() {
		return "x: " + x + ", y: " + y + ", z: " + z;
	}
}

public class Override {

	public static void main(String[] args) {

		Point3D p = new Point3D(3, 5, 8);
		
		System.out.println(p.getLocation());
	}

}
