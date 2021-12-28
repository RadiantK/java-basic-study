package question5_5;

public class Ques5_5 {

	public static void main(String[] args) {

		int[] count = {500, 100, 50, 10};
		
		int money = 2680;
		System.out.println("money = " + money);
		
		for (int i=0; i<count.length; i++) {
			
			System.out.println(money/count[i]);
			money = money % count[i];
		}
	}

}
