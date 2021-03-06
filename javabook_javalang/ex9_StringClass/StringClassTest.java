package ex9_StringClass;

import java.util.Arrays;

public class StringClassTest {

	public static void main(String[] args) {

		int iValue = 100;
		String strVal = String.valueOf(iValue); // int를 String으로 변환
//		String strVal = iValue + "";
		
		double dVal = 200.0;
		String strVal2 = dVal + "";
		
		double sum = Integer.parseInt("+"+strVal); // 문자열을 숫자로 바구는 방법
		
		double sum2 = Integer.valueOf(strVal) + Double.valueOf(strVal2);
		
		System.out.println(String.join("",strVal2,"+",strVal2,"=")+sum);
		System.out.println(strVal+"+"+strVal2+"="+sum2);
		System.out.println();
		
		
		String animals = "dog, cat, bear";
		String[] arr = animals.split(", ");
		System.out.println(Arrays.toString(arr));
		String str = String.join("-", arr); 
		System.out.println(str); // dog-cat-bear
	}

}
