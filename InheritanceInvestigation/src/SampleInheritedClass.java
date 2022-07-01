
public class SampleInheritedClass extends SampleBaseClass {
	
	// 1. Access all original features
	// 2. Add new features
	
	private String address;
	
	public SampleInheritedClass(String name, int age, String address) {
		// call the super class constructor
		super(name, age);
		//this.setName(name);
		//this.setAge(age);
		this.address = address;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}
	
	// 3. replace (override) functions in the base
	public void display() {

		System.out.println(name);
		
		// 4. access the original display() method
		super.display();
		// System.out.println(getName() + " " + getAge());
		System.out.println(address);
	}
	

}
