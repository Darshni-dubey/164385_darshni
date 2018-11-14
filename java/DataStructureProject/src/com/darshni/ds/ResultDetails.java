package com.darshni.ds;

public class ResultDetails {

	public static void main(String[] args) {
		
		int m1=48,m2=87,m3=95;
		if(m1>60&&m2>60&&m3>60){
			System.out.println("Passed");
		}
		else if(m1>60&&m2>60||m2>60&&m3>60||m1>60&&m3>60){
			System.out.println("Promoted");
		}
		else{
			System.out.println("Failed");
		}
        
	}

}
