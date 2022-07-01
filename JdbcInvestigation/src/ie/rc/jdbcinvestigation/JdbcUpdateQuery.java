package ie.rc.jdbcinvestigation;

import java.sql.*;

public class JdbcUpdateQuery {

	public static void main(String[] args) {
		
		System.out.println("Update Query");
		
		String connectionString = "jdbc:sqlite:C:/data/rc4/userdb.db";
		
		try {
			// load the JDBC driver into memory
			Class.forName("org.sqlite.JDBC");
			
			Connection conn = DriverManager.getConnection(connectionString);
			
			String sql = "INSERT INTO users (name, email, active) values('NU', 'nu@gmail.com', 0)";
			
			Statement stmt = conn.createStatement();
			
			int c = stmt.executeUpdate(sql);
			
			if (c == 1) {
				System.out.println("record added");
			} else {
				System.out.println("record was not added");
			}
			
			stmt.close();
			conn.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
