package edu.atria.b94java.collections;

import java.util.LinkedList;

public class LinkedListDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedList<Integer> li=new LinkedList();
		li.add(10);
		li.add(20);
		li.add(30);
		System.out.println("number in the list are: "+li);
		li.add(1,15);
		System.out.println("number in the list are: "+li);
		//indexOutOfTheBoundexception if index is negative or index is > than size
		//li.add(7,15);
		//System.out.println("number in the list are: "+li);
		li.addFirst(0);
		li.addLast(40);
		System.out.println("number in the list are: "+li);
		System.out.println("first element : "+li.getFirst());
		System.out.println("lasts element : "+li.getLast());
		
		li.removeFirst();
		li.removeLast();
		System.out.println("number in the list are: "+li);
		li.remove(2);
		System.out.println("number in the list are: "+li);
	}

}
