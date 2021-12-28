package ex5_5_Looto;

//import java.util.Arrays;

public class Lotto {

	public static void main(String[] args) {

		int[] arr = new int[45];
		
		for(int i=0; i<arr.length; i++) {
			arr[i] = i+1;
//			System.out.println(Arrays.toString(arr));
		}
		
		int j =0;
		int temp;
		for(int i=0; i<45; i++) {
			j= (int)(Math.random()*45);
//			System.out.println(j);
			temp = arr[i];
			arr[i] = arr[j];
			arr[j] = temp;
		}
//		System.out.println(Arrays.toString(arr));
		for(int i = 0; i<6; i++) {
			System.out.println(arr[i]);
		}
	}

}
