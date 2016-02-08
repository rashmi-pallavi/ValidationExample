package com.training.maps;

import java.util.Hashtable;

public class Test {

	public static void main(String[] args) {
		
		//Hashtable<String, String> htable = new Hashtable<String,String>();

		TranslateService ts =new TranslateService();
		ts.init();
		System.out.println(ts.findEngWord("Ek"));
		//ts.printWords();
		
	}

}
