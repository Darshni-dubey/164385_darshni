package com.darshni.ds;

import java.util.Scanner;

public class SimpleInterest {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		int principle,rate,time;
		principle=sc.nextInt();
		rate=sc.nextInt();
		time=sc.nextInt();
		
		
		
       int si=(principle*rate*time)/100;
       System.out.println(si);
		
       int ci=principle*(1+(rate/time))^time;
       System.out.println(ci);
	}

}

