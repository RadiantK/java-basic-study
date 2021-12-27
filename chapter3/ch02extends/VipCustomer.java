package ch02extends;

public class VipCustomer extends Customer {

//	private int customerId;
//	private String customerName;
//	private String customerGrade;
//	int bonusPoint;
//	double bonusRatio;
	double salesRatio;
	String agentId;
	
	public VipCustomer() {
		customerGrade = "VIP";
		bonusRatio = 0.05;
		salesRatio = 0.1;
	}
	
	public String getAgentId() {
		return agentId;
	}
}
