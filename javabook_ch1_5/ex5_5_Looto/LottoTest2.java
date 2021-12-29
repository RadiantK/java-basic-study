package ex5_5_Looto;

public class LottoTest2 {

	public static void main(String[] args) {

		int[] arr = new int[45];
		
		for(int i=0; i<arr.length; i++) {
			arr[i] = i+1;
		}
		
		int temp=0;
		for(int i=0; i<10; i++) {
			int j=(int)(Math.random()*45);
			temp = arr[j];
			arr[j] = arr[i];
			arr[i] = temp;
		}
		
		for(int i=0; i<6; i++) {
			System.out.println(arr[i]);
		}
		
	}

}
