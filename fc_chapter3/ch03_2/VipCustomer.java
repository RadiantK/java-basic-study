package ch03_2;

public class VipCustomer extends Customer {

	double bonusRatio;
	double priceSales;
	private int AgentID;
	
	public VipCustomer() {
		customerGrade = "VIP";
		bonusRatio = 0.05;
		priceSales = 0.1;
	}
	
	
	
	@Override
	public int calcPrice(int price) {
		bonusPoint += price * bonusRatio;
		price -= price * priceSales;
		return price;
	}



	public int getAgentID() {
		return AgentID;
	}
	
}
