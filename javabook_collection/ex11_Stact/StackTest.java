package ex11_Stact;

import java.util.EmptyStackException;
import java.util.Stack;

public class StackTest {

	@SuppressWarnings({ "unchecked", "rawtypes" })
	public static void main(String[] args) {

//		if (args.length !=1) {
//			System.out.println("Usage:java Ex_StackQueueTest2 \"EXPRESSION\"");
//			System.out.println("Example:java Ex_StackQueueTest2 \"((2+3)*1)+3\"");
//			System.exit(0);
//		}
		
		Stack st = new Stack();
		String expression = "((3+5)*8-2)"; // args[0]
		
		System.out.println("expression: "+expression);
		
		try {
			for (int i = 0; i < expression.length(); i++) {
				// ������ ��ġ�� �ִ� ���ڸ� �˷���
				char ch = expression.charAt(i);
				
				if(ch=='(') {
					st.push(ch + "");
				} else if (ch == ')') {
					st.pop();
				}
			}
			
			if (st.isEmpty()) {
				System.out.println("��ȣ�� ��ġ�մϴ�.");
			} else {
				System.out.println("��ȣ�� ��ġ���� �ʽ��ϴ�.");
			}
		} catch(EmptyStackException e) {
			System.out.println(e);
		}
	}

}
