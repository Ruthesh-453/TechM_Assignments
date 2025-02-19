package sql_package;

import java.sql.*;
import java.util.Scanner;

public class DynamicDeletion {
	public static void main(String arg[]) throws SQLException, Exception{
		Scanner sc=new Scanner(System.in);
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/testdb?autoReconnect=true&useSSL=false","root","Ruth@077");
		
		PreparedStatement ps=con.prepareStatement("delete from employee where empid=?");
		System.out.println("Enter Employee ID");
		int empid=sc.nextInt();
		ps.setInt(1,empid);
		
		int res=ps.executeUpdate();
		System.out.println(res+" Rows deleted");
		
		ps.close();
		con.close();
	}
}