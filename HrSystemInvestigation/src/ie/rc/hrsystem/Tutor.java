package ie.rc.hrsystem;

public class Tutor extends Contractor implements Teacher {

	
	public Tutor() {
		super();
	}
	public Tutor(String firstName, String lastName, String agency) {
		super(firstName, lastName, agency);
	}
	@Override
	public void teach() {
		System.out.println("Listen up, tutoring session is starting");
	}
}
