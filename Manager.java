package com.darshni;

public class Manager extends Employee {

	public static final double incentives = 2000;

	public Manager(String EmpName, double Salary) {
		super(EmpName, Salary, incentives);

	}

	public static double getIncentives() {
		return incentives;
	}
}
