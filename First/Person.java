package com.darshni;

import java.util.TreeSet;

public class Person implements Comparable<Person> {

	private String name;
	private float weight, height;

	public Person(float height, float weight, String name) {
		// TODO Auto-generated constructor stub
		this.height = height;
		this.weight = weight;
		this.name = name;

	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public float getWeight() {
		return weight;
	}

	public void setWeight(float weight) {
		this.weight = weight;
	}

	public float getHeight() {
		return height;
	}

	public void setHeight(float height) {
		this.height = height;
	}

	public void display() {
		System.out.println("Height is:" + getHeight() + " " + "Weight is:"
				+ getWeight() + " " + "Name is:" + getName());
	}

	public static void main(String[] args) {

		TreeSet<Person> perset = new TreeSet<Person>();
		Person p1 = new Person(5.4f, 45, "Darshni");
		Person p2 = new Person(5.4f, 50, "Aaiswariya");
		Person p3 = new Person(5.8f, 58, "Mihir");
		Person p4 = new Person(5.6f, 40, "Mayuri");

		perset.add(p1);
		perset.add(p2);
		perset.add(p3);
		perset.add(p4);

		for (Person per : perset)
			per.display();
	}

	@Override
	public int compareTo(Person per) {
		if (this.weight == per.getWeight()) {
			if (this.height == per.getHeight())
				return 0;
			else if (this.height > per.getHeight())
				return 1;
			else
				return -1;

		} else if (this.weight > per.getWeight())
			return 1;

		else
			return -1;
	}

}
