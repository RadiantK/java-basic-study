package ex_9_StringClass;

public class StringClassTest {

	public static void main(String[] args) {

		int iValue = 100;
		String strVal = String.valueOf(iValue); // int�� String���� ��ȯ
//		String strVal = iValue + "";
		
		double dVal = 200.0;
		String strVal2 = dVal + "";
		
		double sum = Integer.parseInt("+"+strVal); // ���ڿ��� ���ڷ� �ٱ��� ���
		
		double sum2 = Integer.valueOf(strVal) + Double.valueOf(strVal2);
		
		System.out.println(String.join("",strVal2,"+",strVal2,"=")+sum);
		System.out.println(strVal+"+"+strVal2+"="+sum2);
	}

}
