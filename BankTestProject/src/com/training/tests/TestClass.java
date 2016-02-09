package com.training.tests;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import com.training.samples.BankAccount;

public class TestClass {

	BankAccount b = null;
	@Before
	public void setUp() throws Exception {
		System.out.println("Before test called==");
		b = new BankAccount();
	}

	@After
	public void tearDown() throws Exception {
		System.out.println("After test called==");
	}

	@Test
	public void test1() {
		try{
		BankAccount b1 = new BankAccount(101,null,10000.00);
		//fail("Not yet implemented");
		}catch(RuntimeException e)
		{
			e.printStackTrace();
		}
		
	}

}
