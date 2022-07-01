package ie.rc.userdao;

import java.util.List;

public class UserDaoInvestigation {

	public static void main(String[] args) {
		
		System.out.println("User Dao Investigation");
		
		//UserDao dao = new UserDao("jdbc:sqlite:C:/data/rc4/userdb.db","org.sqlite.JDBC");
		UserDao dao = new UserDao();

		List<User> users = dao.getUsers();
		
		for (User u : users) {
			System.out.println(u);
		}
		
		dao.close();
		
		
		
		
		/*
		List<User> users = dao.getUsers();
		
		for(User u : users) {
			System.out.println(u);
		}
		*/
		/*
		User newUser = new User(-1, "NEW USER", "new.user@gmail.com", true);
		
		User addedUser = dao.addUser(newUser);
		
		System.out.println(addedUser); // expecting the id to not be -1
		*/
		
		/*
		User u = dao.getUser(4);
		System.out.println(u);
		
		u.setName("CHANGED");
		u.setEmail("changed@gmail.com");
		u.setActive(!u.isActive());
		
		dao.updateUser(u);
		
		User updatedUser = dao.getUser(4);
		
		System.out.println(updatedUser);
		*/
		dao.close();
	}
}
