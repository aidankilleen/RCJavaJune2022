
public class User {

	// member variables
	private int id;
	private String name;
	private String email;
	private boolean active;
	
	// member functions
	// constructor(s)
	public User(int id, String name, String email, boolean active) {
		this.id = id;
		this.name = name;
		this.email = email;
		this.active = active;
	}
	
	public int getId() {
		return id;
	}
	
	public void setId(int id) {
		if (id > 0) {
			this.id = id;
		} else {
			System.out.println("invalid value " + id);
		}
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public boolean isActive() {
		return active;
	}
	public void setActive(boolean active) {
		this.active = active;
	}




	// other methods...
	public void display() {
		System.out.println("Id:" + id );
		System.out.println("User:" + name );
		System.out.println("Email:" + email );
		System.out.println("Active:" + active );
		
	}
	
}
