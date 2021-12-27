package ch23_Thread_wait_notify2;

import java.util.ArrayList;

class KLibrary {
	
	ArrayList<String> shelf = new ArrayList<>();
	
	public KLibrary() {
		shelf.add("해리포터와 마법사의돌");
		shelf.add("해리포터와 비밀의방");
		shelf.add("해리포터와 아즈카반의 죄수");
		shelf.add("해리포터와 불의 잔");
	}
	
	public synchronized String lendBook() throws InterruptedException {
		
		Thread t = Thread.currentThread();
		if(shelf.size()==0) {
			System.out.println(t.getName() + " : " + " waiting start");
			wait();
			System.out.println(t.getName() + " : " + " waiting end");
		}	
		
		if(shelf.size()>0) {
			
			String book = shelf.remove(0);
			System.out.println(t.getName() + " : " + " lend Book");
			return book;
		} else {
			return null;
		}
	}
	
	public synchronized void returnBook(String book) {
		
		Thread t = Thread.currentThread();
		
		shelf.add(book);
		notifyAll();
		System.out.println(t.getName() + " : " + " Return Book");
	}
	
}

class Student extends Thread {
	
	public Student(String name) {
		super(name);
	}
	
	public void run() {
				
		try {
			String title = LibraryMain.library.lendBook();
			
			if(title == null) {
				System.out.println(" 책을 빌리지 못함.");
				return;
			}			
			sleep(4000);
			LibraryMain.library.returnBook(title);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}


public class LibraryMain {
	
	public static KLibrary library = new KLibrary();

	public static void main(String[] args) {

		Student std1 = new Student("std1");
		Student std2 = new Student("std2");
		Student std3 = new Student("std3");
		Student std4 = new Student("std4");
		Student std5 = new Student("std5");
		Student std6 = new Student("std6");
		Student std7 = new Student("std7");
		
		std1.start();
		std2.start();
		std3.start();
		std4.start();
		std5.start();
		std6.start();
		std7.start();
		
		
		
	}

}
