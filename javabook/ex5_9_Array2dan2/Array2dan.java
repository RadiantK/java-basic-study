package ex5_9_Array2dan2;

public class Array2dan {
	public static void main(String[] args) {
	
		int[][] score = {
				{100, 100, 100},
				{20, 20, 20},
				{30, 30, 30},
				{40, 40, 40},
				{50, 50, 50}
		};
		int koreaTotal =0;
		int engTotal = 0;
		int mathTotal = 0;
		
		System.out.println("¹øÈ£ ±¹¾î ¿µ¾î ¼öÇÐ ÃÑÁ¡ Æò±Õ");
		System.out.println("======================");
		
		for(int i=0; i<score.length; i++) {
			
			int sum =0;
			int avg = 0;
			
			koreaTotal += score[i][0];
			engTotal += score[i][1];
			mathTotal += score[i][2];
			System.out.print(i+1 + " ");
			
			for(int j=0; j<score[i].length; j++) {
				sum += score[i][j];
				System.out.print(score[i][j]+ " ");
			}
			avg = sum / 3 ;
			System.out.print(sum+ " ");
			System.out.println(avg);
			
		}
		System.out.println("ÃÑÁ¡:" +koreaTotal + " " + engTotal + " " + mathTotal);
		
	}
}
