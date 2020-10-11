package Package1;

public class Employee2  extends Employee{
	
	@Override
	public void sam() {
		System.out.println("sam in base class");
		
	}
	public void sam1() {
		System.out.println("sam1 in base class");
		sam();
		super.sam();
		
	}
	

}
