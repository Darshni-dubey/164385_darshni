package com.darshni;


	import java.util.Hashtable;

	public class ServiceProvider5 {

		public static void main(String[] args) {
			// TODO Auto-generated method stub

			Hashtable<Employee5, Integer> hashtable=new Hashtable<Employee5, Integer>();
			System.out.println(hashtable.put(new Employee5("Birappa", 50000), 1));
			System.out.println(hashtable.put(new Employee5("Roshan", 60000), 2));
			System.out.println(hashtable.get(new Employee5("Birappa", 50000)));
		}

	}

