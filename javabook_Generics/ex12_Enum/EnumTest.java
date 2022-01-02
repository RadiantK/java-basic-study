package ex12_Enum;

//				  0		 1		2	  3
enum Direction { EAST, SOUTH, WEST, NORTH }

public class EnumTest {

	public static void main(String[] args) {

		Direction d1 = Direction.EAST; // ���� ���̾�
		Direction d2 = Direction.valueOf("WEST");
		Direction d3 = Enum.valueOf(Direction.class, "EAST");
		
		System.out.println("d1 = " + d1);
		System.out.println("d1 = " + d2);
		System.out.println("d1 = " + d3);
		System.out.println();
		
		System.out.println("d1==d2 ? " + (d1==d2));
		System.out.println("d1==d3 ? " + (d1==d3));
		System.out.println("d1.equals(d3) = " + d1.equals(d3));
//		�񱳿����ڴ� ���Ұ� d1 > d3 x 
		System.out.println("d1.compareTo(d3 = " + d1.compareTo(d3));
		System.out.println("d1.compareTo(d2) = " + d1.compareTo(d2));
		System.out.println();
		
		switch(d1) {
			case EAST: // Direction.EAST ��� �� �� ���� / ��Ģ
				System.out.println("The direction is EAST");
				break;
			case SOUTH: 
				System.out.println("The direction is EAST");
				break;
			case WEST: 
				System.out.println("The direction is EAST");
				break;
			case NORTH: 
				System.out.println("The direction is EAST");
				break;
			default : 
				System.out.println("Invalid direction.");
				break;
		}
		System.out.println();
		
		Direction[] dArr = Direction.values(); // �������� ��� ����� �迭�� ��ȯ
		for(Direction d : dArr) {
			System.out.printf("%s = %d%n",d.name(), d.ordinal()); //ordinal:����
		}
	}

}
