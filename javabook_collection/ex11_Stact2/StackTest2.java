package ex11_Stact2;

import java.util.Stack;

@SuppressWarnings("rawtypes")
public class StackTest2 {

	public static Stack back = new Stack();
	public static Stack forward = new Stack();
	
	public static void main(String[] args) {
		StackTest2 s = new StackTest2();
		
		s.goURL("���̹�");
		s.goURL("����");
		s.goURL("Ƽ���丮");
		s.goURL("����Ŭ");
		
		s.printStatus();
		
		s.goBack();
		s.printStatus();
		
		s.goBack();
		s.goBack();
		s.printStatus();
		
		s.goForward();
		s.goForward();
		s.printStatus();
		
		System.out.println("���ο� �ּҷ� �̵�");
		s.goURL("��Ʃ��");
		s.printStatus();

	}
	
	@SuppressWarnings("unchecked")
	void goURL(String url) {
		back.push(url);
		if(!forward.empty()) {
			forward.clear();
		}
	}
	@SuppressWarnings("unchecked")
	void goBack() {
		if(!back.empty()) {
			forward.push(back.pop());
		}
	}
	@SuppressWarnings("unchecked")
	void goForward() {
		if(!forward.empty()) {
			back.push(forward.pop());
		}
	}
	void printStatus() {
		System.out.println("back : "+back);
		System.out.println("forward : "+forward);
		System.out.println("���� ȭ���� : "+back.peek());
		System.out.println();
	}

}
