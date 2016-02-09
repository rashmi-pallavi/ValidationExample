package com.training.tests;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import com.training.samples.CurrencyConverter;

public class FirstTestCase {

	CurrencyConverter cc = null;
			
	@Before
	public void setUp() throws Exception {
		System.out.println("Before called====");
		 cc = new CurrencyConverter();
	}
	
	

	@After
	public void tearDown() throws Exception
	{
		System.out.println("After called====");
	}

	
	
	@Test
	public void test1() {
		//fail("test 1 Not yet implemented");
		
		
		double actual = cc.dollarToRupees(10);
		
		assertEquals(1000.0,actual,0);
		
		System.out.println("Test1 called");
	}
	
	
	
	@Test
	public void test2() {
		//fail("test 2 Not yet implemented");
		
		Double actual = cc.dollarToRupees(10);
		assertNotNull(actual);
		
		System.out.println("Test2 called");
		
	}

	
	
}
