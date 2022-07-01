package ie.rc.commonbaseclassinvestigation;

public class CommonBaseClassInvestigation {

	
	
	
	public static void main(String[] args) {

		System.out.println("Common Base Class Investigation");
		
		
		String s1 = new String("this is a string");
		String s2 = new String("this is a string");
		
		if (s1.equals(s2)) {
			System.out.println("same");
		} else {
			System.out.println("different");
		}
		
		Person p1 = new Person("Alice", "Adams");
		Person p2 = new Person("Alice", "Adams");
		
		if (p1.equals(p2)) {
			System.out.println("same");
		} else {
			System.out.println("different");
		}
		
		System.out.println(p1.hashCode());
		System.out.println(p2.hashCode());
		
		
		System.out.println(p1.getClass());

	}

}
