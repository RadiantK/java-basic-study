package ex11_Stact2;

import java.util.Stack;

@SuppressWarnings("rawtypes")
public class StackTest2 {

	public static Stack back = new Stack();
	public static Stack forward = new Stack();
	
	public static void main(String[] args) {
		StackTest2 s = new StackTest2();
		
		s.goURL("네이버");
		s.goURL("다음");
		s.goURL("티스토리");
		s.goURL("오라클");
		
		s.printStatus();
		
		s.goBack();
		s.printStatus();
		
		s.goBack();
		s.goBack();
		s.printStatus();
		
		s.goForward();
		s.goForward();
		s.printStatus();
		
		System.out.println("새로운 주소로 이동");
		s.goURL("유튜브");
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
		System.out.println("현재 화면은 : "+back.peek());
		System.out.println();
	}

}
