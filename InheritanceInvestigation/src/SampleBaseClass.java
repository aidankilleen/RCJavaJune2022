
public class SampleBaseClass {

	protected String name;
	private int age;
	
	public SampleBaseClass() {
		
	}
	public SampleBaseClass(String name, int age) {
		this.name = name;
		this.age = age;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	
	public void display() {
		System.out.println(name + " " + age);
	}
	

}
