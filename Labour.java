package com.darshni;

public class Labour extends Employee {

	public static final double overTime = 2;

	public Labour(String EmpName, double Salary) {
		super(EmpName, Salary, overTime);

	}

	public static double getOvertime() {
		return overTime;
	}

}
