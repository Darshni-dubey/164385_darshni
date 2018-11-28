package com.darshni;

import java.util.ArrayList;
import java.util.Collections;

public class ArrayListExample {

	public static void main(String[] args) {

		ArrayList<String> arraylist = new ArrayList<String>();
		arraylist.add("Darshni");
		arraylist.add("Aaiswariya");
		arraylist.add("Mayuri");
		arraylist.add("Varsha");

		System.out.println("Before sorting" + " " + arraylist);

		Collections.sort(arraylist, Collections.reverseOrder());

		System.out.println("After Sorting" + " " + arraylist);
	}
}
