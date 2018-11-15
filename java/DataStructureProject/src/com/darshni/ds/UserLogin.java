package com.darshni.ds;

import java.util.Scanner;

public class UserLogin {

	public static void main(String[] args) {
		int count=0;
		String username="darshni";
		String password="dubey";
		
		while(count<3){
			Scanner sc=new Scanner(System.in);
			String username1=sc.next();
		   String password1=sc.next();
			
			if((username.equals(username1))&&(password.equals(password1))){
				System.out.println("Welcome");
				count=3;
			}
			else {
				count++;
			}
				
			if(count==3){
				System.out.println("contact admin");
				
			}
			
		}

	}

}
