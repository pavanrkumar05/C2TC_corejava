package edu.atria.b94java.collections;

import java.util.ArrayList;
import java.util.List;

public class ListDemo {

	public static void main(String[] args) {
		//List list  = new List();
		
		List li = new ArrayList();
		System.out.println("elements in the list:"+li);
		li.add(1);
		li.add("Address");
		li.add(true);
		li.add(98.5);
		System.out.println("elements in the list:"+li);
		li.add(null);
		System.out.println("elements in the list:"+li);
		//duplicate elements 
		li.add(null);
		li.add("Address");
		System.out.println("elements in the list:"+li);
		
	}

}
