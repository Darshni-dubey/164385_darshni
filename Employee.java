package com.darshni;

public class Employee {

	String EmpName;
	double Salary;

	Employee(String EmpName, double Salary, double totalsalary) {
		super();
		this.EmpName = EmpName;
		this.Salary = Salary;

	}

	public String getEmpName() {
		return EmpName;
	}

	public void setEmpName(String empName) {
		EmpName = empName;
	}

	public double getSalary() {
		return Salary;
	}

	public void setSalary(double salary) {
		Salary = salary;

	}
}
