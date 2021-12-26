package week1.day2;

public class EmployeeInfo {

	public static void main(String[] args) {
		EmployeeInfo employeeInfo = new EmployeeInfo();
		String location = employeeInfo.getCompanyAddress();
		System.out.println(location);
		employeeInfo.getEmployeeInfo("Sangee",100);
	}

	public void getEmployeeInfo(String empName, int empID) {
		// TODO Auto-generated method stub
		
	}

	public void printCompanyAddress() {
		System.out.println("Chennai");
	}
	public String getCompanyAddress() {
		System.out.println("getCompanyAddress");
		return "Chennai";
	}
}
