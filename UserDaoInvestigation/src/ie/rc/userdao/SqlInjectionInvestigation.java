package ie.rc.userdao;

public class SqlInjectionInvestigation {

	public static void main(String[] args) throws UserDaoException {
		System.out.println("Sql Injection Investigation");
		
		UserDao dao = new UserDao();
		User user = new User("Sarah", "O'Sullivan", false);
		//User user = new User("','',0); delete from users where id = 1;  --", "", false);
		//User user = new User("','',0); delete from users;  --", "", false);
		//User user = new User("','',0); drop table users;  --", "", false);
		
		//User user = dao.getUser(2);
		//user.setName("','',0); drop table users;  --");
		
		//dao.updateUser(user);
		
		
		
		User addedUser = dao.addUser(user);
		
		System.out.println(addedUser);
		
		
		
		

	}

}
