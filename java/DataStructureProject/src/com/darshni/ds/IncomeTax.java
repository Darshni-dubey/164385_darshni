package com.darshni.ds;

import java.util.Scanner;

public class IncomeTax {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		float amount,tax,percent;
		
		System.out.println("Enter the amount:");
		amount=sc.nextFloat();
		
		
		if(amount>0&&amount<180000){
			
			System.out.println("Slab A");
			percent=0;
			tax=(amount*percent)/100;
			System.out.println("tax is:"+tax);
			
		}
		else if(amount>180001&&amount<300000){
			System.out.println("Slab B");
			percent=10;
			tax=(amount*percent)/100;
			System.out.println("tax is:"+tax);
			
		}
		else if(amount>300001&&amount<500000){
			System.out.println("Slab C");
			percent=20;
			tax=(amount*percent)/100;
			System.out.println("tax is:"+tax);
			
		}
		else if(amount>500001&&amount<1000000){
			System.out.println("Slab D");
			percent=30;
			tax=(amount*percent)/100;
			System.out.println("tax is:"+tax);
			
		}

	}
}


