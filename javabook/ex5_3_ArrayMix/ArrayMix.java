package ex5_3_ArrayMix;

import java.util.Arrays;

public class ArrayMix {

	public static void main(String[] args) {

		int[] num = {0,1,2,3,4,5,6,7,8,9};
		System.out.println(Arrays.toString(num));
		
		for (int i=0; i<50; i++) {
			int n=(int)(Math.random() * 10);
			int temp = num[0];
			num[0] = num[n];
			num[n] = temp;
		}
		System.out.println(Arrays.toString(num));
	}

}
