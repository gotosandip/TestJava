package Package1;

public class Employee {
	
	private int empAge = 40;
	
	private int empSalary;
	
	public int getEmpSalary() {
		return empSalary;
	}

	public void setEmpSalary(int empSalary) {
		this.empSalary = empSalary;
	}

	public void setEmployeeAge(int age) {
		empAge = age;		
	}
	
	public int getEmployeeAge() {
		return empAge;
		
	}
	
	public void sam() {
		
		System.out.println("sam in super class");
		
	}
	

}
