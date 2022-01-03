package ex14_lamda;

@FunctionalInterface
interface MyFunction222 {
	public abstract int max(int a, int b);
}

public class LamdaTest {

	public static void main(String[] args) {

		// ���ٽ��� �͸� ��ü�̱� ������ �ٷ������ �������� Ÿ���� �Լ��� �������̽��� �Ѵ�.
		MyFunction222 mf = (a, b) ->  a > b ? a : b;
		
		int value = mf.max(5, 3);
		System.out.println(value);
		
	}

}
