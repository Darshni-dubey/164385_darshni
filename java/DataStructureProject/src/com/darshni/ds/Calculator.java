package com.darshni.ds;

public class Calculator {
int num1,num2;

public Calculator(int num1,int num2){
	
this.num1=num1;
this.num2=num2;
}
void sum(){
	
	System.out.println(num1+num2);
}
void sub(){
	
	System.out.println(num1-num2);
}
void mult(){

	System.out.println(num1*num2);
}
void div(){
	
	System.out.println(num1/num2);
}

}
