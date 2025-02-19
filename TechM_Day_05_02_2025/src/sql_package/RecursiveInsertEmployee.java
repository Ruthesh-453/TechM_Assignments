package sql_package;

import java.sql.*;
import java.util.*;

public class RecursiveInsertEmployee {
	public static void main(String arg[]) throws SQLException,ClassNotFoundException,Exception{
		Scanner sc=new Scanner(System.in);
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/testdb?autoReconnect=true&useSSL=false","root","Ruth@077");
	
		PreparedStatement ps=con.prepareStatement("insert into employee values(?,?,?)");
		System.out.print("Enter no of insertionms to be done:");
		int x=sc.nextInt();
		
		int c=0;
		for(int i=0;i<x;i++) {
			System.out.print("Enter Employee ID:");
			int empid=sc.nextInt();
			ps.setInt(1,empid);
			
			System.out.print("Enter Employee Name: ");
			String empname=sc.next();
			ps.setString(2, empname);
			
			System.out.println("Enter Department Salary: ");
			int empsal=sc.nextInt();
			ps.setInt(3,empsal);
			
			c+=ps.executeUpdate();
		}
		System.out.println(c+" rows executed");
		ps.close();
		con.close();
}
}