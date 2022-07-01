import java.util.ArrayList;
import java.util.List;

public class CollectionInvestigation {

	public static void main(String[] args) {
		System.out.println("Collection Investigation");
		
		String[] names = {"Alice", "Bob", "Carol", "Dan"};
		
		// array object is very limited.
		
		ArrayList alNames = new ArrayList();
		
		alNames.add("Alice");
		alNames.add("Bob");
		alNames.add("Carol");
		alNames.add("Dan");
		alNames.add(new User(1, "Eve", "eve@gmail.com", false));
		
		// the problem with ArrayList is that it is not type safe
		for (int i=0; i< alNames.size(); i++) {
			
			System.out.println(alNames.get(i));
		}
		
		List<User> users = new ArrayList<User>();
		
		users.add(new User(1, "Alice", "alice@gmail.com", true));
		users.add(new User(2, "Bob", "bob@gmail.com", true));
		users.add(new User(3, "Carol", "carol@gmail.com", false));
		users.add(new User(4, "Dan", "dan@gmail.com", true));
		
		// users.add("not a user object");  // Generic ArrayList is type safe
		
		for (User u : users) {
			System.out.println(u);
		}

		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
