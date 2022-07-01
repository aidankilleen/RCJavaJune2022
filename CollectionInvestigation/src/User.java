
public class User {

	protected int id;
	protected String name;
	protected String email;
	protected boolean active;
	
	public User() {
	}

	public User(int id, String name, String email, boolean active) {
		this.id = id;
		this.name = name;
		this.email = email;
		this.active = active;
	}
	
	@Override
	public String toString() {
		return "User [id=" + id + ", name=" + name + ", email=" + email + ", active=" + active + "]";
	}
	
	
}
