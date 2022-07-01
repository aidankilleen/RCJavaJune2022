
public class InheritanceInvestigation {

	public static void main(String[] args) {

		System.out.println("Inheritance Investigation");
		
		// Inheritance allows us to create a new object 
		// based on an existing object
		
		// 1. get all of the features (properties and functions) of the original obj
		// 2. add in new features (properties and functions)
		// 3. replace (override) original features (functions) with new versions
		// 4. get at the old versions if I need
		
		SampleBaseClass sbc = new SampleBaseClass("Aidan", 21);
		
		// sbc.name = "changed";
		
		sbc.display();
		
		SampleInheritedClass sic = new SampleInheritedClass("Alice", 21, "Cork");
		
		sic.getName(); // feature from the original 
		sic.display();
		
		
	}

}
