package sql_package;

import java.sql.*;

public class UpdateDB {
public static void main(String args[])throws SQLException,Exception{

	Class.forName("com.mysql.cj.jdbc.Driver");

	Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/testdb?autoReconnect=true&useSSL=false","root","Ruth@077");
	
	PreparedStatement ps = con.prepareStatement("update employee set empName=? where empName=?");
	ps.setString(1, "Deepak");
	ps.setString(2, "Sam");
	
	int value = ps.executeUpdate();
	System.out.println("Row updated in the Table");	
   }
}