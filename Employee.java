package classAndObjects;
class EmployeeDetails{
	private String employeeName;
	private int employeeId;
	private String department;
	private int age;
	private static String companyName="ZOHO";
	
//	EmployeeDetails(String name,int id,String dep,int ageee){
//		employeeName=name;
//		employeeId=id;
//		department=dep;
//		age=ageee;
//	}
	
	public String getEmployeeName() {
		return employeeName;
	}

	public void setEmployeeName(String employeeName) {
		this.employeeName = employeeName;
	}

	public int getEmployeeId() {
		return employeeId;
	}

	public void setEmployeeId(int employeeId) {
		this.employeeId = employeeId;
	}

	public String getDepartment() {
		return department;
	}

	public void setDepartment(String department) {
		this.department = department;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}
	public String getCompanyName() {
		return companyName;
	}
	void printDetails() {
		System.out.println(employeeName);
		System.out.println(employeeId);
		System.out.println(age);
		System.out.println(department);
		System.out.println(companyName);
	}

	
}
public class Employee {

	public static void main(String[] args) {
		
		EmployeeDetails e1=new EmployeeDetails();
		e1.setEmployeeName("Mugesh");
		e1.setEmployeeId(546);
		e1.setAge(25);
		e1.setDepartment("Developer");
		e1.printDetails();
	}

}
