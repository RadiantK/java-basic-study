package ch06Generic;

public class ThreeDPrinterTest {

	public static void main(String[] args) {

		Powder powder = new Powder();
		ThreeDPrinter3 printer = new ThreeDPrinter3();
		
		printer.setMaterial(powder);
		
		Powder p = (Powder)printer.getMaterial(); // 형변환해줘야함
		System.out.println(p.toString());
	}

}
