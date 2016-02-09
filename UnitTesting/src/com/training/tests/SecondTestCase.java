package com.training.tests;

import static org.junit.Assert.*;

import java.util.HashSet;


import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import com.training.samples.Student;
import com.training.samples.StudentList;

public class SecondTestCase {

	StudentList sl =null;
	
	
	@Before
	public void setUp() throws Exception {
		
		System.out.println("Before called=====");
		sl = new StudentList();
	}

	@After
	public void tearDown() throws Exception {
		
		System.out.println("After called====");
	}

	@Test
	public void test1() {
		//fail("Not yet implemented");
		int actual = sl.getNames().size();
		
		assertEquals(3, actual);
		
		System.out.println("Test1 called");
	}
	
	@Test
	public void test2() {
		//fail("Not yet implemented");
	Object obj = sl.getNameList();
	
	assertNotNull(obj);
	
	System.out.println("Test2 called");
	}
	
	@Test
	public void testSetAcceptDuplicate()
	{
		Student s1 = new Student(101,"Mahesh");
		Student s2 = new Student(101,"Mahesh");
		
		HashSet<Student> s = new HashSet<Student>();
		s.add(s1);
		s.add(s2);
		
		sl.setNameList(s);
		
		int actual = sl.getNameList().size();
		
		assertEquals(1, actual);

		System.out.println(s);
		
	}
	
	@Test
	public void testStudentNotNull()
	{
		
	}

}
