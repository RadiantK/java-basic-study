package ch19_Decorator;

public class Latte extends Decorator{

	public Latte(Coffee coffee) {
		super(coffee);
		// ���� Ŭ������ default �����ڰ� ������ �Ű������� �ִ� super�� ��������� ȣ���ؾ���
	}
	
	@Override
	public void brewing() {
		super.brewing();
		System.out.print(" Adding Milk");
	}

}
