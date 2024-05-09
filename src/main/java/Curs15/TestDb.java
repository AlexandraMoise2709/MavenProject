package Curs15;

import java.sql.Connection;

public class TestDb {
	
	static String URL = PropertiesFileProcessor.readPropertiesFile("hostname", "db.properties");
	static String PASS = PropertiesFileProcessor.readPropertiesFile("user", "db.properties");
	static String USER = PropertiesFileProcessor.readPropertiesFile("pass", "db.properties");

	public static void main(String[] args) {
		
		String selectQuery = "select * from products;" ;
		String updateQuery = "update products set ProductName = 'Mars2' where ProductName= 'Mars';";
		
		Connection conn = DbConnection.openDbConnection(URL, USER, PASS);
		
		System.out.println(DbQuerys.dbSelectQuery(conn, selectQuery));
		DbQuerys.dbUpdateQuery(conn, updateQuery);
		System.out.println(DbQuerys.dbSelectQuery(conn, selectQuery));

		
		
		DbConnection.closeDbConnection(conn);
	}

}
