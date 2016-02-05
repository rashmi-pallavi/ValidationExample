package com.training.apps;

import com.training.ifaces.Greeting1;

public class Application2 {

	public static void main(String[] args) {
		
		Greeting1 grt = (String msg)->{System.out.println(msg);};
		
		grt.show("Welcome to Java World!");

	}

}
