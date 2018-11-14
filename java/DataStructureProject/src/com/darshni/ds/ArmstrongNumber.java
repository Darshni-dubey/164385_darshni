package com.darshni.ds;

public class ArmstrongNumber {

	public static void main(String[] args) {
		int count=0,num=153,rem,temp;
		
		temp=num;
		while(num>0){
			rem=num%10;
			num=num/10;
			count=count+(rem*rem*rem);
			
		}
		
		if(temp==count){
			System.out.println("Number is Armstrong");
		}
		else{
			System.out.println("Number is not Armstrong");
		}

	}

}
