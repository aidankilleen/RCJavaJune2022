
public class EncapsulationInvestigation {

	public static void main(String[] args) {
		
		System.out.println("Encapsulation Investigation");

		User u = new User(1, 
						  "Alice", 
						  "alice@gmail.com", 
						  true);
		u.display();
		
		//u.id = -999; private means data can't be modified 
		// from outside the class
		
		u.setId(10);
		u.setId(-999);
		
		u.display();
		
		System.out.println("id:" + u.getId());
	}

}
