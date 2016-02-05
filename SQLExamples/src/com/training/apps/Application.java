package com.training.apps;

import java.util.*;

import com.training.daos.CustomerDAO;
import com.training.entity.Customer;
//import com.training.utils.SqlConnection;

public class Application {

	public static void main(String[] args) {
		
		//To establish connection
		//System.out.println(SqlConnection.getOracleConnection());
		
		//To insert values into table
		//Customer c = new Customer(201,"Sam",908676122,"sam@xyz.com","01-Jan-16","Delhi");
		
		CustomerDAO dao = new CustomerDAO();
		//int rowAdded = dao.add(c);
		
		//To find a single row
		/*Customer c=dao.find(201);
		System.out.println(c); */
		//System.out.println(rowAdded +"Rows Added");
		
		//To find all the rows in the table
		/*List<Customer> custList = dao.findAll();
		System.out.println(custList);*/
		
		//To update a particular row
		/*System.out.println("Updation");
		int updated = dao.update(101);
		System.out.println(updated);*/
		
		//To delete a row from table
		System.out.println("Deletion");
		int deleted =dao.delete(105);
		System.out.println("Deleted!");
		
		
	
	}
		
	}


