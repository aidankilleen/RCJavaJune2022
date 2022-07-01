package ie.rc.hrsystem;

import java.util.ArrayList;
import java.util.List;

public class PolymorphismInvestigation {

	public static void main(String[] args) {
		
		Person[] team = new Person[4];
		
		team[0] = new Person("Alice", "Adams");
		team[1] = new Employee("Bob", "Brennan", "E12345");
		team[2] = new Contractor("Carol", "Crowley", "CPL");
		team[3] = new Manager("Danielle", "Dunne", "E12121", 10);
		// for each loop 
		for (Person p : team) {
			
			p.display();
		}
		
		System.out.println("==============================");
		
		List<Teacher> teachers = new ArrayList<Teacher>(); 
		
		teachers.add(new Trainer("Sam", "Smith", "E22222"));
		teachers.add(new Tutor("Tina", "Thompson", "CPL"));
		teachers.add(new Trainer("Ursula", "Unger", "E33333"));
		
		for (Teacher t : teachers) {
			t.teach();
			//Person p = (Person)t;
			//p.display();
			
			((Person)t).display();
		}
		
		
		
		
		
		
	}
}
