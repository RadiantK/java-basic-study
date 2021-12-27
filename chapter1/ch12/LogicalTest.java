package ch12;

public class LogicalTest {

	public static void main(String[] args) {

		int num1 = 10;
		int i = 2;
		
		boolean value = ((num1 += 10) < 10 || ((i += 2) < 10));
		
		System.out.println(value);
		System.out.println(num1);
		System.out.println(i); 
		// && 일 때 앞의항이 false 이기때문에 뒷쪽항은 평가안함
		
		value = ((num1 += 10) < 10 || ((i += 2) < 10));
		
		System.out.println(value);
		System.out.println(num1);
		System.out.println(i);
		// || 일 때 앞의항이 false이면 뒷쪽항을 평가하고
		// 앞의 항이 True 이면 뒤의 항은 평가하지 않음
	}

}
