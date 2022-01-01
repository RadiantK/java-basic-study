package ch9_4question;

public class QuesTest4 {

	public static void main(String[] args) {
		
		int[] arr = {3, 7, 1, 4};
		printGraph(arr, '*');
		
	}

	static void printGraph(int[] arr, char ch) {
		for(int i=0; i<arr.length; i++ ) {
			for (int j=0; j<arr[i]; j++) {
				System.out.print(ch);
			}
			System.out.println(arr[i]);
		}
	}
}
