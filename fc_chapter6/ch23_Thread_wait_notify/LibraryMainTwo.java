package ch23_Thread_wait_notify;

import java.util.ArrayList;

// wait(), notify() 사용, notifyAll()이 더 공정하기때문에 권장
class FastLibrary2 {
	
	public ArrayList<String> shelf = new ArrayList<>();
	
	public FastLibrary2() {
		shelf.add("해리포터1");
		shelf.add("해리포터2");
		shelf.add("해리포터3");
		shelf.add("해리포터4");
	}
	
	public synchronized String lendBook()  {
		
		Thread t = Thread.currentThread();	
		
		while (shelf.size() == 0) {
			System.out.println(t.getName() + " : " + " waiting start");
			try {
				wait();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			System.out.println(t.getName() + " : " + " waiting end");
		}
		
		if (shelf.size() > 0) {
			
			String book = shelf.remove(0);
			System.out.println(t.getName() + " : " + book + " lend");
			return book;
		} else {
		return null;
		}
	}
	
	public synchronized void returnBook(String book) {
		
		Thread t = Thread.currentThread();
		
		shelf.add(book);
		notifyAll();
		
		System.out.println(t.getName() + " : " + book + " return");
		
	}
	
}

class Student2 extends Thread {
	
	public Student2(String name) {
		super(name);
	}
	
	public void run() {
		
		try {
		String title = LibraryMainTwo.library.lendBook();
		
		if (title == null) {
			System.out.println(getName() + " 빌리지 못함");
			return;
		}
		sleep(3000);		
		LibraryMainTwo.library.returnBook(title);
		
		} catch(InterruptedException e) {
			System.out.println(e);
		}
	}
}


public class LibraryMainTwo {
	
	public static FastLibrary2 library = new FastLibrary2();

	public static void main(String[] args) {

		Student2 std1 = new Student2("std1");
		Student2 std2 = new Student2("std2");
		Student2 std3 = new Student2("std3");
		Student2 std4 = new Student2("std4");
		Student2 std5 = new Student2("std5");
		Student2 std6 = new Student2("std6");
		
		std1.start();
		std2.start();
		std3.start();
		std4.start();
		std5.start();
		std6.start();
		
	}

}
