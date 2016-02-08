package com.training;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.training.utils.SqlConnection;

public class ValidateUser {
	
	private Connection con = null;
	
	
	
	public ValidateUser() {
		con = SqlConnection.getOracleConnection();
	}



	public boolean validate(User t)
	{
		String sql = "Select * from sapientuser where username=? and passWord=?";
		
		boolean b=false;
		try {
			PreparedStatement stmt = con.prepareStatement(sql);
			stmt.setString(1, t.getUserName() );
			stmt.setString(2, t.getPassWord());
			ResultSet rs = stmt.executeQuery();
			b=rs.next();
			
			
		} catch (SQLException e) {
			
			e.printStackTrace();
		}
		
		
		return b;
	}

}
