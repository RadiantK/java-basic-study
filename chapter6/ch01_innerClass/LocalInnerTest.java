package ch01_innerClass;

class Outer {
	
	int outNum = 100;
	static int sNum = 200;
	
	Runnable getRunnable(int i) { 
		// �Ű������� �ż��� ���� ���������� ���ø޸𸮿� �����Ǿ�������,
		// �޼��� ����� ����������Ƿ� run()���� �ٽ� ����� �� �ֵ��� ��������� �ٲ�����
		int num = 10;
		
		class MyRunnable implements Runnable { 

			
			int localNum = 1000;
			
			@Override
			public void run() {
				
				// getRunnale �޼���� ȣ��ǰ� ����ɶ� �޸𸮿��� ���������
				// run �޼���� ���߿� �ٽ� ȣ��� �� �ֱ⶧���� ���� ���� �Ұ�
				// i = 100; num = 20;
				
				System.out.println("i =" + i); 
				System.out.println("num = " +num);  
				System.out.println("localNum = " +localNum);
					
				System.out.println("outNum = " + outNum + "(�ܺ� Ŭ���� �ν��Ͻ� ����)");
				System.out.println("Outter.sNum = " + Outer.sNum + "(�ܺ� Ŭ���� ���� ����)");

				}
			
		}
		return new MyRunnable();
	}	
}



public class LocalInnerTest {

	public static void main(String[] args) {
		
		Outer out = new Outer();
		Runnable runner = out.getRunnable(10);
		runner.run();

	}

}
