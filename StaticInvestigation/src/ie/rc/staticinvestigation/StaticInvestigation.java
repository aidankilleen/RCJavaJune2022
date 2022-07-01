package ie.rc.staticinvestigation;

public class StaticInvestigation {

	public static void main(String[] args) {

		Person p1 = new Person("Alice", "Adams");
		System.out.println(p1.firstName);
		System.out.println(Person.count);
		
		// don't use an instance to get a static variable
		//System.out.println(p1.count);
		
		Person p2 = new Person("Bob", "Brennan");
		
		System.out.println(Person.count);
		
		Person p3 = new Person("Carol", "Crowley");
		
		System.out.println(Person.count);
		
		
		//System.out. // is a static member of class System

		//Math m = new Math();
		
		Math.random(); // is a static member function of class Math
		
		
		
		// why use static?
		
		// for constants
		
		System.out.println(Math.PI);
		
		
		// for functions that don't need an object
		// we don't need an instance of Math to call
		// the math functions
		Math.random(); // for example
		
		
		// sharing info between instances
		// i.e. count in Person.count
		
		
		
		for (int i=0; i<1000; i++) {

			Person person = new Person("Danielle" + i, "Dunne");

		}
		System.out.println(Person.getCount());
		
		
		
		// c++
		//delete p4;
		
		System.out.println(p1);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
