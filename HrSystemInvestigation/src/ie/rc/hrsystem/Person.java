package ie.rc.hrsystem;

public class Person {
	
	// member variables
	protected String firstName;
	protected String lastName;
	
	// constructor(s)
	public Person() {
		
	}
	public Person(String firstName, String lastName) {
		this.firstName = firstName;
		this.lastName = lastName;
	}
	// other functions / methods
	public void display() {
		System.out.println("Person:");
		System.out.println(firstName + " " + lastName);
	}
	public static void main(String[] args) {
		Person p = new Person("Aidan", "Killeen");
		p.display();

	}

}
