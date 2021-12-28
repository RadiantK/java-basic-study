package ch06_2;

public class GoldCustomer extends Customer {
	
	double bonusRatio;
	double priceSales;

	public GoldCustomer(int customerID, String customerName) {
		super(customerID, customerName);
		
		bonusRatio = 0.02;
		priceSales = 0.05;
		customerGrade = "Gold";
	}

	@Override
	public int calcPrice(int price) {
		bonusPoint += price * bonusRatio;
		price -= price * priceSales;
		
		return price;
	}
	
	
	
}
