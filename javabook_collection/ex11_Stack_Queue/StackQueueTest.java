package ex11_Stack_Queue;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class StackQueueTest {

	@SuppressWarnings({ "rawtypes", "unchecked" })
	public static void main(String[] args) {

		Stack st = new Stack();
		Queue q = new LinkedList();
		
		st.push("0");
		st.push("1");
		st.push("2");
		
		q.offer("0");
		q.offer("1");
		q.offer("2");
		
		System.out.println("-- Stack --");
		// 스태겡서 요소를 하나씩 꺼냄 (후입선출)
		while(!st.empty()) {
			System.out.println(st.pop());
		}
			
		System.out.println("-- Queue --");
		// 큐에서 요소를 하나씩 꺼냄 (선입선출)
		while(!q.isEmpty()) {
			System.out.println(q.poll()) ;
		}
	}

}
