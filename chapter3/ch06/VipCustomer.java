package ch06;

public class VipCustomer extends Customer {


	double salesRatio;
	String agentId;
	
//	public VipCustomer() {
//		super(0, "no-name");		
//			
//		customerGrade = "VIP";
//		bonusRatio = 0.05;
//		salesRatio = 0.1;
//		
//		System.out.println("VipCustomer() call");
//	}
	
	public VipCustomer(int customerId, String customerName) {
		super(customerId, customerName);
		
		customerGrade = "VIP";
		bonusRatio = 0.05;
		salesRatio = 0.1;
		
	}
	
//	부모클래스 원본
//	public int calcPrice(int price) {
//		bonusPoint += price * bonusRatio;
//		return price;
//	}
	@Override
	public int calcPrice(int price) {
		bonusPoint += price * bonusRatio;
		price -= (int)(price * salesRatio);
		
		return price;
	}



	public String getAgentId() {
		return agentId;
	}
}
