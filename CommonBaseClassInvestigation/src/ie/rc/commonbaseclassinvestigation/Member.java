package ie.rc.commonbaseclassinvestigation;

import java.util.Objects;

public class Member {
	
	// member variables
	protected int id;
	protected String name;
	protected String email;
	protected boolean active;
	
	// constructor(s)
	public Member() {
	}

	public Member(int id, String name, String email, boolean active) {
		this.id = id;
		this.name = name;
		this.email = email;
		this.active = active;
	}
	// get & set methods
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
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

	// hashCode and equals()
	@Override
	public int hashCode() {
		return Objects.hash(active, email, id, name);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Member other = (Member) obj;
		return active == other.active && Objects.equals(email, other.email) && id == other.id
				&& Objects.equals(name, other.name);
	}

	// toString()
	@Override
	public String toString() {
		return "Member [id=" + id + ", name=" + name + ", email=" + email + ", active=" + active + "]";
	}
}
