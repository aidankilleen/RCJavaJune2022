import java.util.List;

import ie.rc.userdao.User;
import ie.rc.userdao.UserDao;

public class UserDaoTest {

	public static void main(String[] args) {

		System.out.println("User Dao Tester");
		
		UserDao dao = new UserDao("jdbc:sqlite:C:/data/rc5/userdb.db", "org.sqlite.JDBC");
		List<User> users = dao.getUsers();
		
		for (User u : users) {
			
			System.out.println(u);
		}
		dao.close();
	}
}
