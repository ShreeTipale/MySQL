package MySQL_Demo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class MySQL_Select {

	public static void main(String[] args) throws SQLException {
		

	       //SELECT--data Retrieval/Data Query language
	
	         //1. create a connection
			//2.Create statement/Query
			//3.Execute statement/Query
	         //4.store the result in result set
			//5.close connection
		

		//1.CREATE A CONNECTION
		Connection con= DriverManager.getConnection("jdbc:mysql://localhost:3306/mydb","root","root");
		
		
		//2.Create a statement & frame a Query 
		Statement stmt= con.createStatement();
		
		String s= "SELECT eid, eName FROM employee";
		
		
		//3.Execute the statement/Query & 4.store the result in result set
				ResultSet rs= stmt.executeQuery(s);
				
				while(rs.next()) {
					int eid=rs.getInt("eid");
					String eName = rs.getString("eName");
					
					System.out.println(eid+" "+eName);
				}
	 
				
				
				//5.close connection
				con.close();
				
				System.out.println("Query executed");

	}

}
