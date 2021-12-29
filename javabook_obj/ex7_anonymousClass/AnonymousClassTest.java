package ex7_anonymousClass;

import java.awt.Button;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class AnonymousClassTest {

	public static void main(String[] args) { // 클래스의 정의와 객체생성을 동시에(일회용)

		Button b = new Button("Start");
		
		b.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.out.println("ActionEvent occurred!!!");
			}
		});
	}
}
 
//class EventHandler implements ActionListener {
//	public void actionPerformed(ActionEvent e) {
//		System.out.println("ActionEvent occurred!!!");
//	}
//}