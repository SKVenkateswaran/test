package com.example.demo;

import java.util.*;

public class CollectionDemo {

	public static void main(String[] args) {

		/*
		 * Collection<Object> values = new ArrayList<>(); values.add(3); values.add(4);
		 * values.add("Aki");
		 */
		
		/*
		 * Iterator i = values.iterator();
		 * 
		 * while(i.hasNext()) System.out.println(i.next());
		 */
		 
//Enhanced Loop
		
		/*
		 * for(Object i : values) { System.out.println(i); }
		 */
		List<Integer> values = new ArrayList<>();
		values.add(1);
		values.add(2);
		values.add(3);
		values.add(4);
		values.add(5);
		values.add(6);
		values.add(7);
		values.add(8);
		values.add(9);
		values.add(10);
		values.add(11);
		values.add(12);
		values.add(1);
		values.add(2);
		values.add(3);
		values.add(4);
		values.add(5);
		values.add(6);
		values.add(7);
		values.add(20);
		values.add(21);
		values.add(1);
		values.add(2);
		values.add(3);
		values.add(4);
		values.add(5);
		values.add(6);
		values.add(7);
		values.add(8);
		values.add(9);
		values.add(10);
		values.add(11);
		values.add(12);
		values.add(1);
		values.add(2);
		values.add(3);
		values.add(4);
		values.add(5);
		values.add(6);
		values.add(7);
		values.add(20);
		
		System.out.println(values.getClass().getName());
		
	//	values.forEach(System.out::println);

	}

}
