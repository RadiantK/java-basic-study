package ch05_Obj_Rambda;

public class StringConcatTest {

	public static void main(String[] args) {

		String a = "Hello";
		String b = "World";
		
		StringConcatImpl strImpl = new StringConcatImpl();
		strImpl.makeString(a, b);
		
		StringConcat concat = (k, t) -> System.out.println(k +","+ t);
		concat.makeString(a, b);
		
		
		// 람다식에 생략된 익명클래스
		StringConcat concat2 = new StringConcat() {
			
			@Override
			public void makeString(String a, String b) {
				
				System.out.println(a + "...." + b);
			}
		};
		
		concat2.makeString(a, b);
		
	}

}
