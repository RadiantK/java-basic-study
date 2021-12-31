package ch6_question_20;

import java.util.Arrays;

public class QuestionTest20 {

	public static void main(String[] args) {

		int[] original = {1, 2, 3, 4, 5, 6, 7, 8, 9};
		System.out.println(Arrays.toString(original));
		
		int[] result = suffle(original);
		System.out.println(Arrays.toString(result));
	}
	
	public static int[] suffle(int[] arr) {
		if(arr==null || arr.length==0) {
			return arr;
		}
		
		int temp;
		for (int i = 0; i<arr.length*2;i++) {
			int j = (int)(Math.random()*arr.length);
//			int k = (int)(Math.random()*arr.length);
			temp = arr[0];
			arr[0] = arr[j];
			arr[j] = temp;
		}
		return arr;
	}

}
