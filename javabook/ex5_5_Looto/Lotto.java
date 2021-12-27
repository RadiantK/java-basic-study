package ex5_5_Looto;

public class Lotto {

	public static void main(String[] args) {

		int[] arr = new int[45];
		
		for(int i=0; i<arr.length; i++) {
			
			arr[i] = i+1;
		}	
		
		int temp;
		int j=0;
		for(int i=0; i<=10; i++) {
			j = (int)(Math.random()*45);
			temp = arr[i];
			arr[i] = arr[j];
			arr[j] = temp;	
		}
		for(int i=0; i<6; i++) {
			System.out.println(arr[i]);
		}
		
	}

}
