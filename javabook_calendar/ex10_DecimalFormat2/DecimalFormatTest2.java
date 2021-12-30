package ex10_DecimalFormat2;

import java.text.DecimalFormat;

public class DecimalFormatTest2 {

	public static void main(String[] args) {

		DecimalFormat df = new DecimalFormat("#,###.##");
		DecimalFormat df2 = new DecimalFormat("E.###E0");
		
		try {
			// parseint,double ���� ,�� ��ȯ ����
			System.out.println(Double.parseDouble("1234567.89"));
			System.out.println();
			
			Number num = df.parse("1,234,567.89"); // ���ڸ� ���ڷ� ��ȯ
			System.out.print("1,234,567.89"+ " -> ");
			
			double d = num.doubleValue(); 
			System.out.print(d +" -> ");
			
			System.out.println(df2.format(num)); // ���� �������� ��ȯ(����)
		} catch(Exception e) {
			e.printStackTrace();
		}
	}

}
