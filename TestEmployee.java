package com.darshni;

public class TestEmployee {
	public static void main(String[] args) {

		Manager m1 = new Manager("anupam", 35000);
		Labour l1 = new Labour("prathyusha", 15000);

		System.out.println("Name of Manager:" + " " + m1.getEmpName() + "\n"
				+ "Incentives:" + m1.getIncentives() + "\n" + "Salary:" + " "
				+ (m1.getSalary() + m1.getIncentives()));
		System.out.println("Name of Labour:"
				+ " "
				+ l1.getEmpName()
				+ "\n"
				+ "Overtime:"
				+ " "
				+ l1.getOvertime()
				+ "\n"
				+ "Salary:"
				+ (l1.getSalary() + ((l1.getSalary() / (30 * 9.5)) * l1
						.getOvertime())));

	}
}
