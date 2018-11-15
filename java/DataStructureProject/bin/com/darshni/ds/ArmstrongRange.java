package com.darshni.ds;

public class ArmstrongRange {

	public static void main(String[] args) {

	for(int num=100;num<999;num++){
		
		int temp=num;
	 int rem=0;
	 int count=0;
		
		while(num>0){
			rem=num%10;
			num=num/10;
			count=count+(rem*rem*rem);
			
		}
		
		if(count==num){
			System.out.println(num+"Number is Armstrong");
		}
		else{
			System.out.println(num+"Number is not Armstrong");
		}

	}

	}
}


