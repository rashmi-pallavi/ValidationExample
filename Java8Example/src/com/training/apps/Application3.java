package com.training.apps;

import com.training.ifaces.Greeting3;

public class Application3 {

	public static void main(String[] args) {
	
		Greeting3 grt = (String msg)->{return msg;};
		System.out.println(grt.show("Hi! Hello World!"));

	}

}
