package ch16static;

public class EmployeeTest {

	public static void main(String[] args) {

		Employee employeeKang = new Employee();
		employeeKang.setEmployeeName("������");
		
		System.out.println(Employee.getSerialNum());
		
		Employee employeeKim = new Employee();
		employeeKim.setEmployeeName("������");
		
		System.out.println(employeeKang.getEmployeeName() + "���� �����" + employeeKang.getEmployeeId());
		System.out.println(employeeKim.getEmployeeName() + "���� �����" + employeeKim.getEmployeeId());
	}

}
