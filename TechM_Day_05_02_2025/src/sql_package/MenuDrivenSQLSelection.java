package sql_package;

import java.util.Scanner;
import java.sql.*;

public class MenuDrivenSQLSelection {
	public static void main(String arg[]) throws SQLException,Exception{
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/testdb?autoReconnect=true&useSSL=false","root","Ruth@077");
		
		Scanner sc=new Scanner(System.in);
		do {
			System.out.println("Select a Operation from below to perform on employee table:");
			System.out.println("1.Insert a new row\n2.Update a row\n3.Delete a row\n4.Select the row\n5.Exit\n");
			
			int n=sc.nextInt();
			switch(n) {
			case 1:{
				PreparedStatement ps=con.prepareStatement("insert into employee values(?,?,?)");
				System.out.print("Enter Employee ID: ");
				ps.setInt(1, sc.nextInt());
				
				System.out.print("Enter Employee name: ");
				ps.setString(2, sc.next());
				
				System.out.print("Enter Salary of employee:");
				ps.setInt(3, sc.nextInt());
				
				System.out.println(ps.executeUpdate()+" rows are inserted");
				break;
			}
			
			case 2:{
				PreparedStatement ps1=con.prepareStatement("update into employee set empname=? where empid=?");
				System.out.println("Enter Employee ID");
				int empid=sc.nextInt();
				ps1.setInt(2,empid);
				
				System.out.println("Enter Employee Name to Update");
				String empname=sc.next();
				ps1.setString(1, empname);
				
				int res=ps1.executeUpdate();
				System.out.println(res+" Rows updated");
				break;
			}
			
			case 3:{
				PreparedStatement ps2=con.prepareStatement("delete from employee where empid=?");
				System.out.print("Enter Employee ID to delete: ");
				ps2.setInt(1, sc.nextInt());
				
				System.out.println(ps2.executeUpdate()+" rows are deleted");
				break;
			}
			
			case 4:{
				PreparedStatement ps3=con.prepareStatement("select * from employee");
				ResultSet rs=ps3.executeQuery();
				
				while(rs.next()) {
					System.out.println(rs.getInt(1)+" "+rs.getString(2)+" "+rs.getInt(3));
				}
				break;
			}
			
			case 5:{
				System.out.println("Thank You");
				return;
			}
			
			default:{
				System.out.println("It is Inalid Option.\nPlease choose a correct option from the given numbers.");
				break;
			}
			}
		}while(true);
	}
}
