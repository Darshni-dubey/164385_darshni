package com.darshni.ds;

import java.util.Scanner;

public class ArmstrongNumber {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		int count=0,num,rem,temp;
		
		num=sc.nextInt();
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
