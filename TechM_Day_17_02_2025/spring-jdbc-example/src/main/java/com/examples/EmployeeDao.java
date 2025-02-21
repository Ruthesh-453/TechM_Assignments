package com.examples;

import org.springframework.jdbc.core.JdbcTemplate;

//Dao class contains all the Curd operations to be performed.

public class EmployeeDao {
   private JdbcTemplate jdbcTemplate;
   
   public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
	   this.jdbcTemplate=jdbcTemplate;
   }
   //insert the row/s into the table.
   public int saveEmployee(Employee e) {
	   String query = "insert into employee (empid, empname, empsal) VALUES (?, ?, ?)";
	   return jdbcTemplate.update(query, e.getId(), e.getName(), e.getSalary());
   }
   //update the row/s into the table
   public int updateEmployee(Employee e) {
	   String query="update employee set empname=?, empsal=? where empid=?";
	   return jdbcTemplate.update(query,e.getName(),e.getSalary(),e.getId());
   }
  //deletion of row/s into the table.
   public int deleteEmployee(Employee e) {
	   String query = "delete from employee where empid=?";
	   return jdbcTemplate.update(query,e.getId());
   }
  
}