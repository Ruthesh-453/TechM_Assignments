package sql_package;

import java.sql.*;
import java.util.Scanner;

public class DynamicRowUpdation {
	public static void main(String arg[]) throws SQLException, Exception{
		Scanner sc=new Scanner(System.in);
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/testdb?autoReconnect=true&useSSL=false","root","Ruth@077");
		
		PreparedStatement ps=con.prepareStatement("Update employee set empname=? where empid=?");
		System.out.println("Enter Employee ID");
		int empid=sc.nextInt();
		ps.setInt(2,empid);
		
		System.out.println("Enter Employee Name to Update");
		String empname=sc.next();
		ps.setString(1, empname);
		
		int res=ps.executeUpdate();
		System.out.println(res+" Rows updated");
		
		ps.close();
		con.close();
	}
}
