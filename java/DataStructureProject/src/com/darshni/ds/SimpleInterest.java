package com.darshni.ds;

public class SimpleInterest {

	public static void main(String[] args) {
		
		int principle =1000,rate=10,time=3,n=1;
		
       int si=(principle*rate*time)/100;
       System.out.println(si);
		
       int ci=principle*(1+(rate/n))^n;
       System.out.println(ci);
	}

}

