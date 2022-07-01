package ie.rc.hrsystem;

public class Manager extends Employee {

	protected int headCount;
	
	public Manager() {
		
	}
	
	public Manager(String firstName, String lastName, 
				   String employeeId, int headCount) {
		super(firstName, lastName, employeeId);
		this.headCount = headCount;
	}
	@Override
	public void display() {
		System.out.println("Manager:");
		super.display();
		System.out.println("Headcount:" + headCount);
	}
	public static void main(String[] args) {
		
		Manager m = new Manager("Carol", "Coakley", "E11111", 50);
		m.display();
	}

}
