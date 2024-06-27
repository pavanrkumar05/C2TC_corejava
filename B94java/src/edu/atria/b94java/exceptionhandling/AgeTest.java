package edu.atria.b94java.exceptionhandling;

public class AgeTest {
	public void validate(int age) throws InvalidAgeException{
		if(age<18)
			throw new InvalidAgeException("Invalid age..you are not eligible to vote..");
		else
			System.out.println("Welcome to vote");
			
	}

}
