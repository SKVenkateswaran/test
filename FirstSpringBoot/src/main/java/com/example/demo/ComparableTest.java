package com.example.demo;

import java.util.*;

public class ComparableTest {

	public static void main(String[] args) {
		
		List<Integer> values = new ArrayList<>();
		values.add(129);
		values.add(127);
		values.add(125);
		values.add(126);
		values.add(128);
		
		Comparator<Integer> com = (o1, o2) -> {
				if (o1%10 > o2%10)
					return 1;
				
				return -1;
			};
		
		
		Collections.sort(values, com);
		
		for(int i: values) {
			System.out.println(i);
		}
	}

}
