package com.training.maps;

import java.util.ArrayList;
import java.util.Hashtable;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class Books {
	
	private String bname;
	
	private Hashtable<String, List<Books>> htable;
	
	

	public Books(String bname) {
		super();
		this.bname = bname;
	}

	public Books()
	{
		htable = new Hashtable<String, List<Books>>();
		init();
	}
	
	public void init()
	{
		Books b1 = new Books("ABC");
		Books b2 = new Books("CDE");
		ArrayList<Books> al1=new ArrayList<>();
		al1.add(b1);
		al1.add(b2);
		
		Books b3= new Books("EFG");
		Books b4 = new Books("FGH");
		ArrayList<Books> al2=new ArrayList<>();
		al2.add(b3);
		al2.add(b4);
		
		
		htable.put("one", al1);
		htable.put("two", al2);
	}
	
	public List<Books> findDetails(String number)
	{
		return htable.get(number);
	}
	
	public void printDetails()
	{
		Set<Map.Entry<String,List<Books>>> list = htable.entrySet();
		
		for(Map.Entry<String, List<Books>> book : list)
		{
			System.out.println(book.getKey() + " := " + book.getValue());
		}
	}

	@Override
	public String toString() {
		return "bname=" + bname ;
	}

	
	
	

}
