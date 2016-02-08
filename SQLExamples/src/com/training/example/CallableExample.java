package com.training.example;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;

public class CallableExample {

	public static void main(String[] args) {
		
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			
			String url= "jdbc:oracle:thin:system/hello@localhost:1521:XE";
			
			Connection con = DriverManager.getConnection(url);
			
			CallableStatement stmt = con.prepareCall("call updatePhoneNumber(?,?,?)");
			stmt.setInt(1, 101);
			stmt.setLong(2, 848472343L);
			
			stmt.execute();
			int count =stmt.getUpdateCount();
			
			System.out.println("Updated!");
			System.out.println(count + "rows updated!");
			
			
			
			/*System.out.println("CustomerId" + stmt.getInt(1));
			System.out.println("Mobile" + stmt.getLong(2));*/
		} catch (Exception e) {
			
			e.printStackTrace();
		}
		

	}

}
