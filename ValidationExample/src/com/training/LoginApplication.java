package com.training;

import java.util.Scanner;

public class LoginApplication {

	public static void main(String[] args) {
	
		ValidateUser vu = new ValidateUser();
		User u = null;
		String userName,passWord,role;
		Scanner s = new Scanner(System.in);
		
		while(true)
		{
			System.out.println("User Name:");
			userName=s.next();
			
			System.out.println("Password:");
			passWord = s.next();
			
			System.out.println("Role:");
			role = s.next();
			
			u= new User(userName,passWord,role);
			
			if(vu.validate(u))
			{
				switch(role)
				{
				case "manager":
					System.out.println("Logged in as a manager!");
					System.exit(0);
					break;
					
				case "trainee":
					System.out.println("Logged in as a trainee!");
					System.exit(0);
					break;
					
				case "HR":
					System.out.println("Logged in as HR!");
					System.exit(0);
					break;
				default:
					System.out.println("Thanks!");
				}
				
			}
			else
				System.out.println("Invalid credentials!");
		}

	}

}
