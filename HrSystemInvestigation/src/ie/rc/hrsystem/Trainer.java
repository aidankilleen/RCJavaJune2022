package ie.rc.hrsystem;

public class Trainer extends Employee implements Teacher {

	public Trainer() {
		super();
	}
	public Trainer(String firstName, String lastName, String employeeId) {
		super(firstName, lastName, employeeId);
	}
	@Override
	public void teach() {
		System.out.println("Starting to teach, please sit down and listen");
	}
}
