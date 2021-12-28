package ch03;

public class StringTest {

	public static void main(String[] args) {

		String java = new String("java");
		String android = new String("android");
		
		System.out.println(System.identityHashCode(java));
		
		// 皋葛府 货肺 积己
		java= java.concat(android);		
		System.out.println(java);
		System.out.println(System.identityHashCode(java));
	}

}
