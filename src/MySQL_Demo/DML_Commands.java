package MySQL_Demo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class DML_Commands {

	public static void main(String[] args) throws SQLException {
		
		// insert,update,delete--DML Language
		
		//1. create a connection
		//2.Create statement/Query
		//3.Execute statement/Query
		//4.close connection
		
		
		
		//1.CREATE A CONNECTION
		Connection con= DriverManager.getConnection("jdbc:mysql://localhost:3306/mydb","root","root");
		
		
		//2.Create a statement & frame a Query 
		Statement stmt= con.createStatement();
		
		//String s="INSERT INTO student VALUES(2,'Pravin',80)";
		//String s="UPDATE student SET SName='Akash' WHERE Sid=2";
		String s="DELETE FROM student WHERE Sid=2";
		
		//3.Execute the statement/Query
		stmt.execute(s);
		
		//5.close connection
		con.close();
		
		System.out.println("Query executed");
		

	}

}
