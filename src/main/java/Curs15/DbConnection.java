package Curs15;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DbConnection {

	public static Connection openDbConnection(String host, String user, String pass) {
		
		Connection conn= null;
		
		try {
			
			conn = DriverManager.getConnection(host, user, pass);
			System.out.println("Conexiune cu succes!");
			
		}catch(SQLException e) {
			
			System.out.println("Nu am putut face conexiunea");
			e.printStackTrace();
		}
		
		return conn;
				
	}
	
	public static void closeDbConnection(Connection conn) {
		try {
			System.out.println("Incerc sa inchid conexiunea");
			conn.close();
			System.out.println("Conexiunea a fost inchisa!");
		} catch (SQLException e) {
			System.out.println("Nu am putut inchide conexiunea");
			e.printStackTrace();
		}
		
	}
	
}
