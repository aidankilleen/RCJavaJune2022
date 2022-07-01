package ie.rc.mvntest.HelloWorldMaven;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Maven Test" );
		String connectionString = "jdbc:sqlite:C:/data/rc4/userdb.db";
		
		// option 1 - use the fully qualified class name
		// java.sql.Connection conn; 
		// option 2 - import the class (line 3 above)
		try {

			// load the JDBC driver into memory
			Class.forName("org.sqlite.JDBC");
			
			Connection conn = DriverManager.getConnection(connectionString);
			
			String sql = "SELECT * FROM users";
			Statement stmt = conn.createStatement();
			ResultSet rs = stmt.executeQuery(sql);
			
			while(rs.next()) {
				int id = rs.getInt(1);
				String name = rs.getString(2);
				String email = rs.getString(3);
				boolean active = rs.getBoolean(4);
				
				System.out.println("" + id + " " + name + " " + email + " " + active);
			}
			// important to close all database resources ourselves
			// rather than leaving it to garbage collection 
			rs.close();
			stmt.close();
			conn.close();
			
		} catch(Exception ex) {
			System.out.println(ex);
		}
        
    }
}
