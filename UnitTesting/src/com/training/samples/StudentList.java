package com.training.samples;
import java.util.*;

public class StudentList {

	Set<String> names;
	Set<Student> nameList;
	
	public StudentList()
	{
	
		names=new HashSet<String>();
		nameList = new HashSet<Student>();
		names.add("Ramesh");
		names.add("Suresh");
		names.add("Ramesh");
		
	}
	
	public Set<String> getNames()
	{
		return names;
	}
	
	public Set<Student> getNameList()
	{
		return nameList;
	}
	
	
	public void setNameList(Set<Student> list)
	{
		this.nameList = list;
	}
}
