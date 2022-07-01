package ie.rc.userdao;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

// used for reading and writing User objects to / from the database
public class UserDao {

	// member variables
	private String connectionString = "jdbc:sqlite:C:/data/rc4/userdb.db";
	private String databaseDriver = "org.sqlite.JDBC";
	private Connection conn;
	
	public UserDao(String connectionString, String databaseDriver) {
		this.connectionString = connectionString;
		this.databaseDriver = databaseDriver;
		open();

	}
	// constructor(s)
	public UserDao() {
		open();
	}
	private void open() {
		try {
			Class.forName(databaseDriver);
			conn = DriverManager.getConnection(connectionString);
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}		
	}
	
	public void close() {
		try {
			conn.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	// methods for reading and writing to / from the database
	
	public void deleteUser(int id) {
		
		String sql = "DELETE FROM users WHERE id = ?";
		
		try {
			PreparedStatement stmt = conn.prepareStatement(sql);
			stmt.setInt(1, id);
			stmt.executeUpdate();
			stmt.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	
	
	public void updateUser(User userToUpdate) {
		
		String sql = "UPDATE users " +
						"SET name = ?, email = ?, active = ? where id = ?";
		
		try {
			PreparedStatement stmt = conn.prepareStatement(sql);
			
			stmt.setString(1,  userToUpdate.getName());
			stmt.setString(2,  userToUpdate.getEmail());
			stmt.setInt(3,  userToUpdate.isActive() ? 1 : 0);
			stmt.setInt(4,  userToUpdate.getId());
			
			stmt.executeUpdate();
			stmt.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	
	
	public User addUser(User userToAdd) {
		
		//String sql = "INSERT INTO users " +
		//			 "(name, email, active) " +
		//			 "VALUES('" + userToAdd.getName() + "', " + 
		//			 		"'" + userToAdd.getEmail() + "', " + 
		//			 			 (userToAdd.isActive() ? 1 : 0) + ")";
		
		String sql = "INSERT INTO users (name, email, active) VALUES(?, ?, ?)";
		
		System.out.println(sql);
		try {
			// Statement stmt = conn.createStatement();
			PreparedStatement stmt = conn.prepareStatement(sql);
			
			stmt.setString(1, userToAdd.getName());
			stmt.setString(2,  userToAdd.getEmail());
			stmt.setInt(3,  userToAdd.isActive() ? 1 : 0);
			
			stmt.executeUpdate();
			stmt.close();
			// figure out the newly assigned id
			sql = "SELECT last_insert_rowid()";
			stmt = conn.prepareStatement(sql);
			ResultSet rs = stmt.executeQuery();
			if (rs.next() ) {
				int generatedId = rs.getInt(1);
				userToAdd.setId(generatedId);
			}
			rs.close();
			stmt.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return userToAdd;
	}
	
	public List<User> getUsers() {
		
		List<User> users = new ArrayList<User>(); 
		//User[] users = new User[50];
		String sql = "SELECT * FROM users";
		
		try {
			Statement stmt = conn.createStatement();
			ResultSet rs = stmt.executeQuery(sql);
			//int count = 0;
			while(rs.next() ) {
			
				int id = rs.getInt(1);
				String name = rs.getString(2);
				String email = rs.getString(3);
				boolean active = rs.getBoolean(4);
				
				User u = new User(id, name, email, active);
				//users[count++] = u;
				users.add(u);
			}
			rs.close();
			stmt.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return users;
	}
	
	public User getUser(int id) throws UserDaoException {
		// return user with id from the database...
		User user = new User();
		
		try {
			String sql = "SELECT * FROM users WHERE id = ?";
			PreparedStatement stmt = conn.prepareStatement(sql);
			stmt.setInt(1,  id);
			
			ResultSet rs = stmt.executeQuery();
			
			if (rs.next() ) {
				user.setId(rs.getInt(1));
				user.setName(rs.getString(2));
				user.setEmail(rs.getString(3));
				user.setActive(rs.getBoolean(4));
			} else {
				// user not found
				throw new UserDaoException("User " + id + " not found");
			}
			rs.close();
			stmt.close();

		} catch (SQLException ex) {
			System.out.println(ex);
		} 
		
		return user;
	}
}
