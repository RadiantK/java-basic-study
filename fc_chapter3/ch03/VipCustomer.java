package ch03;

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
		
		System.out.println("VipCustomer(int, String) call");
	}
	
	
	
	public String getAgentId() {
		return agentId;
	}
}
