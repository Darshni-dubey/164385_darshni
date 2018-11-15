package com.darshni.ds;

public class Employee {

	int eid;
	String ename;
	int eage;

	Employee() {
		eid = 123;
		ename = "Darshni";
		eage = 20;
	}

	Employee(int eid, String ename, int eage) {
		this.eid = eid;
		this.ename = ename;
		this.eage = eage;
	}

	void PrintEmployeeDetail() {
		System.out.println(eid);
		System.out.println(ename);
		System.out.println(eage);
	}

}
