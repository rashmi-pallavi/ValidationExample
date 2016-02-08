package com.training.daos;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

import com.training.entity.Customer;
import com.training.ifaces.DAO;
import com.training.utils.SqlConnection;

public class CustomerDAO implements DAO<Customer> {
	
	
	private  Connection con;
	

	public CustomerDAO() {
		super();
		
		con = SqlConnection.getOracleConnection();
	}


	@Override
	public int add(Customer t) {
		
		String sql = "Insert into CUSTOMER values(?,?,?,?,?,?)";
		int n=0;
		try {
			PreparedStatement pstmt = con.prepareStatement(sql);
			pstmt.setInt(1, t.getCustId());
			pstmt.setString(2, t.getCustName());
			pstmt.setInt(3, t.getMobile());
			pstmt.setString(4, t.getEmail());
			pstmt.setString(5, t.getDob());
			pstmt.setString(6, t.getPlace());
			
			n = pstmt.executeUpdate();
			
		} catch (SQLException e) {
			
			e.printStackTrace();
		}
		
		return 0;
	}

	
	@Override
	public Customer find(int key) {
		
		String sql ="select * from Customer where cusid=?";
		Customer cust=null;
		
		try {
			PreparedStatement pstmt =con.prepareStatement(sql);
			
			pstmt.setInt(1, key);
			
			ResultSet rs= pstmt.executeQuery();
			
			while(rs.next()){
			
			cust = getCustomer(rs);
			}
			
		} catch (SQLException e) {
			
			e.printStackTrace();
		}
		
		
		return cust;
	}

	
	
	private Customer getCustomer(ResultSet rs)
	{
		Customer cust=null;
		
		try {
			int customerId=rs.getInt("cusid");
			String name = rs.getString("cusName");
			int mobile =rs.getInt("mobile");
			String email = rs.getString("email");
			String dob =rs.getString("dob");
			String place=rs.getString("place");
			
			cust = new Customer(customerId,name,mobile,email,dob,place);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return cust;
	}
	
	
	@Override
	public List<Customer> findAll() {
		
		
		ArrayList<Customer> custList =new ArrayList<Customer>();
		
		String sql ="Select * from customer";
		
		
		try {
			PreparedStatement pstmt = con.prepareStatement(sql);
			ResultSet rs = pstmt.executeQuery();
			
			while(rs.next())    //Iterating through each single row
			{
				Customer cust = getCustomer(rs);
				custList.add(cust);
			}
			
			
		} catch (SQLException e) {
		
			e.printStackTrace();
		}
		
		return custList;
	}
	
	

	@Override
	public int update(int key) {
		
		String sql = "update customer set cusname='Ram' where cusid=?";
		int rowUpdated=0;
		try {
			PreparedStatement pstmt = con.prepareStatement(sql);
			pstmt.setInt(1, key);
			rowUpdated=pstmt.executeUpdate();
			System.out.println("Updated!");
		} catch (SQLException e) {
			
			e.printStackTrace();
		}
		
		return rowUpdated;
	}

	@Override
	public int delete(int key) {
		
		String sql = "Delete from customer where cusid=?";
	
		try {
			PreparedStatement pstmt = con.prepareStatement(sql);
			pstmt.setInt(1, key);
			pstmt.executeUpdate();
		} catch (SQLException e) {
		
			e.printStackTrace();
		}
		
		return 0;
	}
	

}
