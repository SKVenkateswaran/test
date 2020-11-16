package com.example.demo;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class FirstSpringBootApplication {

	public static void main(String[] args) {
		// Comments are added for git commit
		ConfigurableApplicationContext context = SpringApplication.run(FirstSpringBootApplication.class, args);
		Alien a = context.getBean(Alien.class);
		
		/*
		 * a.show();
		 * 
		 * FinalSamp ff = new A(); ff.testM();
		 */
		
		/*
		 * Abc abc = new Abc() { public void show() {
		 * System.out.println("Anonymous class"); }
		 * 
		 * }; abc.show();
		 */
//collection is concept
//Collection is interface
//Colections is a class
//Collection interface, List interface, ArrayList is a class.		
//		
		Runnable runs = ()->System.out.println("run called");
		runs.run();
		Set<Integer> sam = new HashSet<>();
		//sam.add(123);
		sam.add(123);
		sam.add(789);
		sam.add(456);
//		sam.set(0, 999);
//		sam.set(1, 888);
		
		//System.out.println(sam.get(1));
		
		//Enhanced for loop
		for (int o: sam) {
			System.out.println(o);
		}
	}

}


interface Abc {
	void show();
}
abstract class FinalSamp {
	
	public final void testM() {
		System.out.println("xxxx method called....");
	}
}

class A extends FinalSamp implements Runnable {

	@Override
	public void run() {
		// TODO Auto-generated method stub
		
	}
	
}