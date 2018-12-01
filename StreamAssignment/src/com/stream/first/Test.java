package com.stream.first;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Test {

	public static void main(String[] args) {
		// -------------------------------------FRUITS----------------------------------------------------------------
		List<Fruit> fruit = new ArrayList<Fruit>();
		Fruit fruit1 = new Fruit("Apple", "Red", 150, 120);
		Fruit fruit2 = new Fruit("Banana", "Yellow", 80, 40);
		Fruit fruit3 = new Fruit("Cherry", "Red", 90, 60);
		Fruit fruit4 = new Fruit("Grapes", "green", 0, 60);
		Fruit fruit5 = new Fruit("Mango", "Yellow", 9, 60);
		fruit.add(fruit1);
		fruit.add(fruit2);
		fruit.add(fruit3);
		fruit.add(fruit4);
		fruit.add(fruit5);
		System.out
				.println("1st-----------------------------------------------------------------");
		List<Integer> l1 = fruit.stream().filter(t -> t.getCalories() < 100)
				.mapToInt(x -> x.getCalories()).sorted().boxed()
				.collect(Collectors.toList());
		Collections.reverse(l1);
		l1.forEach(System.out::println);
		System.out
				.println("2nd-----------------------------------------------------------------");

		fruit.stream()
				.collect(Collectors.groupingBy(Fruit::getColor))
				.entrySet()
				.forEach(
						x -> System.out.println(x.getKey() + "\t"
								+ x.getValue()));

		System.out
				.println("3rd-----------------------------------------------------------------");
		fruit.stream()
				.filter(x -> x.getColor().equals("Red"))
				.sorted((f1, f2) -> Integer.compare(f1.getPrice(),
						f2.getPrice())).forEach(System.out::println);

		// ----------------------------------------NEWS----------------------------------------------------------------

		List<News> news = new ArrayList<News>();
		News news1 = new News(101, "ABC", "abc", "Good Article");
		News news2 = new News(102, "DEF", "def", "Good Budget Article");
		News news3 = new News(103, "GHI", "ghi", "Good Article");
		News news4 = new News(104, "JKL", "jkl", "Good Budget Article");
		News news5 = new News(105, "MNO", "mno", "Good Article Budget");
		news.add(news1);
		news.add(news2);
		news.add(news3);
		news.add(news4);
		news.add(news5);

		System.out
				.println("5th-----------------------------------------------------------------");
		System.out.println(news.stream()
				.filter(x -> x.comment.contains("Budget")).count());

		System.out
				.println("6th-----------------------------------------------------------------");

		// Display commentByUser wise number of comments.
		Map<Object, Long> display = news.stream().collect(
				Collectors.groupingBy(s -> s.getCommentByUser(),
						Collectors.counting()));
		System.out.println("comment by user " + display);
		// List<Integer> list6= list1.stream().collect(Collectors.groupingBy(s
		// -> ((t) s).getcommentByUser()).Collectores.counting());

		// Find out which user has posted maximum comments.
		// List<Integer> max=list1.stream().max(FirstNews::getcomment).get();
		// Integer var = list.stream().max(Integer::compare).get();
		/*
		 * final Comparator<Person> comp = (p1, p2) -> Integer.compare(
		 * p1.getAge(), p2.getAge()); Person oldest =
		 * personList.stream().max(comp).get();
		 */

		List<Trader> list2 = new ArrayList<Trader>();
		Trader firstTrader = new Trader("A", "Nagpur");
		Trader firstTrader1 = new Trader("E", "Pune");
		Trader firstTrader2 = new Trader("C", "Delhi");
		Trader firstTrader3 = new Trader("D", "Nagpur");

		list2.add(firstTrader);
		list2.add(firstTrader1);
		list2.add(firstTrader2);
		list2.add(firstTrader3);

		list2.forEach(System.out::println);
		System.out
				.println("***************************************TRANSACTION***************************************");
		List<Transaction> list3 = new ArrayList<Transaction>();
		Transaction firstTransaction = new Transaction(firstTrader, 2018, 34);
		Transaction firstTransaction1 = new Transaction(firstTrader1, 2011, 33);
		Transaction firstTransaction2 = new Transaction(firstTrader2, 2013, 55);
		Transaction firstTransaction3 = new Transaction(firstTrader3, 2011, 37);

		list3.add(firstTransaction);
		list3.add(firstTransaction1);
		list3.add(firstTransaction2);
		list3.add(firstTransaction3);

		list3.forEach(System.out::println);
		System.out
				.println("8th-----------------------------------------------------------------");
		// Find all transactions in the year 2011 and sort them by value (small
		// to high).
		list3.stream()
				.filter(s -> s.getYear() == 2011)
				.map(s -> s.getYear() + " " + s.getValue() + " "
						+ s.getTrader()).sorted().forEach(System.out::println);
		System.out
				.println("9th-----------------------------------------------------------------");

		// What are all the unique cities where the traders work?
		list2.stream().map(s -> s.getCity()).distinct()
				.forEach(System.out::println);

		System.out
				.println("10th-----------------------------------------------------------------");
		// Find all traders from Pune and sort them by name.

		list2.stream().filter(s -> s.getCity() == "Pune").map(s -> s.getName())
				.forEach(System.out::println);
		System.out
				.println("11th-----------------------------------------------------------------");

		// Return a string of all traders’ names sorted alphabetically.
		List<Trader> sort = list2.stream()
				.sorted(Comparator.comparing(Trader::getName))
				.collect(Collectors.toList());
		sort.forEach(System.out::println);
		System.out
				.println("12th-----------------------------------------------------------------");
		// Are any traders based in Indore?
		List<Trader> Ind = list2.stream().filter(s -> s.city == "Indore")
				.collect(Collectors.toList());
		Ind.forEach(System.out::println);
		System.out
				.println("13th-----------------------------------------------------------------");

		// Print all transactions’ values from the traders living in Delhi.
		list2.stream().filter(s -> s.getCity() == "Delhi")
				.forEach(System.out::println);

		/*
		 * List<FirstTransaction> list3=new ArrayList<FirstTransaction>();
		 * FirstTransaction firstTransaction=new
		 * FirstTransaction(firstTrader,2018,34); FirstTransaction
		 * firstTransaction1=new FirstTransaction(firstTrader1,2017,33);
		 * FirstTransaction firstTransaction2=new
		 * FirstTransaction(firstTrader2,2013,55); FirstTransaction
		 * firstTransaction3=new FirstTransaction(firstTrader3,2014,37);
		 * 
		 * list3.add(firstTransaction); list3.add(firstTransaction1);
		 * list3.add(firstTransaction2); list3.add(firstTransaction3);
		 * 
		 * list3.forEach(System.out::println);
		 */System.out
				.println("14th-----------------------------------------------------------------");
		// What’s the highest value of all the transactions?
		System.out.println(list3.stream().max(
				Comparator.comparing(s -> s.getValue())));

		// Find the transaction with the smallest value.
		System.out.println(list3.stream().min(
				Comparator.comparing(s -> s.getValue())));

	}

}
