package ie.rc.hrsystem;

public class Employee extends Person {

	protected String employeeId;
	
	public Employee() {
	}
	
	public Employee(String firstName, String lastName, String employeeId) {
		super(firstName, lastName);
		this.employeeId = employeeId;
	}
	
	public void display() {
		System.out.println("Employee:");
		super.display();
		System.out.println("Employee Id:" + employeeId);
	}
	
	public static void main(String[] args) {
		
		Employee e = new Employee("Alice", "Adams", "E12345");
		e.display();
	}




}
