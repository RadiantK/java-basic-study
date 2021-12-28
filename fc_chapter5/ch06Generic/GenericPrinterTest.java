package ch06Generic;

public class GenericPrinterTest {

	public static void main(String[] args) {

//		Powder powder = new Powder();	
//		GenericPrinter<Powder> powderPrinter = new GenericPrinter<>();
//		powderPrinter.setMaterial(powder);
//		
//		Powder p = powderPrinter.getMaterial();
//		System.out.println(powderPrinter.toString());
		
		GenericPrinter<Powder> powderPrinter = new GenericPrinter<Powder>();
		powderPrinter.setMaterial(new Powder());
		System.out.println(powderPrinter);
		
		GenericPrinter<Plastic> plasticPrinter = new GenericPrinter<Plastic>();
		plasticPrinter.setMaterial(new Plastic());
		System.out.println(plasticPrinter);

	}

}
