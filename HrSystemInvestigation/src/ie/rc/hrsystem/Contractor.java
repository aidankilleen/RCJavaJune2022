package ie.rc.hrsystem;

public class Contractor extends Person {

	protected String agency;
	
	public Contractor() {
		
	}
	public Contractor(String firstName, String lastName, String agency) {
		super(firstName, lastName);
		this.agency = agency;
	}
	public void display() {
		System.out.println("Contractor:");
		super.display();
		System.out.println("Agency:" + agency);
	}
	public static void main(String[] args) {
		Contractor c = new Contractor("Bob", "Brennan", "CPL");
		c.display();
	}
}
