package ch07T_extends;

public class GenericPrinterTest {

	public static void main(String[] args) {

		Powder powder = new Powder();	
		GenericPrinter<Powder> powderPrinter = new GenericPrinter<>();
		powderPrinter.setMaterial(powder);
		
		Powder p = powderPrinter.getMaterial();
		System.out.println(powderPrinter.toString());
		
		System.out.println(p.toString());
		
//		GenericPrinter<Powder> powderPrinter = new GenericPrinter<Powder>();
//		powderPrinter.setMaterial(new Powder());
//		System.out.println(powderPrinter);
//		
//		GenericPrinter<Plastic> plasticPrinter = new GenericPrinter<Plastic>();
//		plasticPrinter.setMaterial(new Plastic());
//		System.out.println(plasticPrinter);
		
		/*	GenericPrinter powderPrinter2 = new GenericPrinter();
		powderPrinter2.setMaterial(new Powder());
		Powder powder = (Powder)powderPrinter.getMaterial();
		System.out.println(powderPrinter);
		*/


	}

}
