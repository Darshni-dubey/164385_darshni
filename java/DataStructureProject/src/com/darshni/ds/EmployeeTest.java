package com.darshni.ds;

public class EmployeeTest {

	public static void main(String[] args) {
		Employee e1=new Employee();
		e1.PrintEmployeeDetail();
		Employee e2=new Employee(12345,"xyz",23);
		e2.PrintEmployeeDetail();
	}

}
