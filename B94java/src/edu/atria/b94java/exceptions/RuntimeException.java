package edu.atria.b94java.exceptions;
import java.util.Scanner;

public class RuntimeException {
	public static void divide(int x,int y) {
		int z;
		try {
		z=x/y;
		System.out.println("The value of z: "+z);
		}catch(ArithmeticException a) {
			System.out.println("Arithmetic exception occured"+a.getMessage());
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int x,y;
		Scanner sc=new Scanner(System.in);
		try {
			System.out.println("inside the try block..");
			System.out.println("enter two numbers..");
			x=Integer.parseInt(sc.nextLine());
			y=Integer.parseInt(sc.nextLine());
			divide(x,y);
			
		}catch(Exception ex) {
			System.out.println("invalid input! please enter a valid integer input");

	}
	}
}
