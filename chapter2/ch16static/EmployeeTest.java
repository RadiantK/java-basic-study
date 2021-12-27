package ch16static;

public class EmployeeTest {

	public static void main(String[] args) {

		Employee employeeKang = new Employee();
		employeeKang.setEmployeeName("강감찬");
		
		System.out.println(Employee.getSerialNum());
		
		Employee employeeKim = new Employee();
		employeeKim.setEmployeeName("김유신");
		
		System.out.println(employeeKang.getEmployeeName() + "님의 사번은" + employeeKang.getEmployeeId());
		System.out.println(employeeKim.getEmployeeName() + "님의 사번은" + employeeKim.getEmployeeId());
	}

}
