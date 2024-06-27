package edu.atria.b94java.exceptionhandling;
import java.util.Scanner;

public class AgeTestDemo {
	public static void main(String[]args) {
		int age;
		Scanner sc= new Scanner(System.in);
		AgeTest at=new AgeTest();
		System.out.println("enter your age:");
		age=sc.nextInt();
		
		try {
			at.validate(age);//function which rise the exception
		}catch(InvalidAgeException ex) {
			System.err.println("caught an exception:\n"+ex.getMessage());
		}
	}

}
