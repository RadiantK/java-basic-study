package ch9_ex11question;

public class CommendgugudanTest {

	public static void main(String[] args) {

		int prev=0;
		int next=0;
		
		try {
			if(args.length !=2 ) {
				throw new Exception("���� �ܰ� �� ��, �� ���� ������ �Է��ϼ���.");
			}
			
			prev = Integer.parseInt(args[0]);
			next = Integer.parseInt(args[1]);
			
			if((prev<2 && prev>9) && (next<2 && next>9)) {
				throw new Exception("���� ������ 2�� 9������ ���̾�� �մϴ�.");
			}
		} catch(Exception e) {
			System.out.println("USAGE : GugudanTest 3 5");
			System.exit(0);
		}
		
		if (prev > next) {
			System.exit(0);
		}
		for(int i=prev; i<=next; i++) {
			for(int j=1; j<=9; j++) {
				System.out.println(i+" * "+j+" = "+i*j);
			}
			System.out.println();
		}
	}

}

