package com.example.demo;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class ComparatorCustom {

	public static void main(String[] args) {

		List<Student> stud = new ArrayList<>();
		stud.add(new Student(1,55));
		stud.add(new Student(2,85));
		stud.add(new Student(3,35));
		stud.add(new Student(4,95));
		stud.add(new Student(5,65));
		
		Collections.sort(stud, (o1,o2) -> {
			return o1.mark>o2.mark ? 1:-1;
		});
		
		/*
		 * for (Student i : stud) { System.out.println(i); }
		 */
		
		Map<String, String> mapVal = new HashMap<>();
		mapVal.put("perusu", "AJI");
		mapVal.put("sirusu", "AKI");
		mapVal.put("myName", "SKV");
		mapVal.put("1", "SKV3");
		mapVal.put("mynamE", "SKV3");
		
		
		Set<String> keys = mapVal.keySet();
		
		for (String key: keys) {
		System.out.println(key +" : "+ mapVal.get(key));
		}
		
	}

}


class Student {
	int rollNo;
	int mark;
	
	
	public Student(int rollNo, int mark) {
		super();
		this.rollNo = rollNo;
		this.mark = mark;
	}
	public int getRollNo() {
		return rollNo;
	}
	public void setRollNo(int rollNo) {
		this.rollNo = rollNo;
	}
	public int getMark() {
		return mark;
	}
	public void setMark(int mark) {
		this.mark = mark;
	}
	@Override
	public String toString() {
		return "Student [rollNo=" + rollNo + ", mark=" + mark + "]";
	}
	
	
	
}