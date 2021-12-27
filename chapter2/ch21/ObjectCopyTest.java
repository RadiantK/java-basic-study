 package ch21;

public class ObjectCopyTest {

	public static void main(String[] args) {

		Book[] library = new Book[5];
		Book[] copyLibrary = new Book[5];
				
		library[0] = new Book("태백산맥1", "조정래");
		library[1] = new Book("태백산맥2", "조정래");
		library[2] = new Book("태백산맥3", "조정래");
		library[3] = new Book("태백산맥4", "조정래");
		library[4] = new Book("태백산맥5", "조정래");
		
//		System.arraycopy(복사할소스, 어느위치부터읽어올지, 복사할 대상, 어느부분부터 쓸지, 길이)
		System.arraycopy(library, 0, copyLibrary, 0, 5);
		
//		System.out.println("== library ==");
//		for(Book book : library) {
//			System.out.println(book);
//			book.showInfo();
//		}
//		
//		System.out.println("== copylibrary ==");
//		for(Book book : copyLibrary) {
//			System.out.println(book);
//			book.showInfo();
//		}
		
		library[0].setAuthor("박완서");
		library[0].setTitle("나목");
		
		System.out.println("== library ==");
		for(Book book : library) {
			System.out.println(book);
			book.showInfo();
		}
		
		System.out.println("== copylibrary ==");
		for(Book book : copyLibrary) {
			System.out.println(book);
			book.showInfo();
		}
		
		
	}

}
