package ch20;

public class ArrayTest {

	public static void main(String[] args) {

		int[] arr = new int[] {1,2,3,4,5};
		System.out.println(arr);
		int total = 0;
		int total2= 0;
		
		for(int i = 0, num = 1; i < arr.length; i++) {
			
			arr[i] = num++;
			System.out.println(arr[i]);
		}
		
		for (int num : arr) {
			total += num;
			
		}
		System.out.println(total);
		
		
		for (int j = 0; j < arr.length; j++) {
			total2 += arr[j];
					
		}
		System.out.println(total2);
	}

}
