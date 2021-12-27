package question5_3;

public class Ques5_3 {

	public static void main(String[] args) {

		int[][] arr= {
				{5,5,5,5},
				{10,10,10,10},
				{20,20,20,20},
				{30,30,30,30}
		};
		
		int total=0;
		float avg=0;
		for(int i=0; i<arr.length; i++) {
			for(int j=0; j<arr[i].length; j++) {
				
				total += arr[i][j];
				
			}
			avg= total/(float)(arr[i].length);
		}
		
		System.out.println(total);
		System.out.println(avg);
	}

}
