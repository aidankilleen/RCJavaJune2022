package ie.rc.staticinvestigation;

public class Person {
	
	// instance member variables
	public String firstName;
	public String lastName;
	
	public String[] data = new String[10000];
	
	// class member variable (static)
	public static int count = 0;
	
	public static int getCount() {
		return count;
	}

	public Person(String firstName, String lastName) {
		this.firstName = firstName;
		this.lastName = lastName;
		
		count++;
		System.out.println("created:" + count);
	}

	@Override
	protected void finalize() throws Throwable {
		System.out.println("finalize() called:" + count);
		count--;
	}
	
	
	
}
