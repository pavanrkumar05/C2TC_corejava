package edu.atria.b94java.exceptions;

public class ExceptionDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//try,catch,finally,throw,throws
		try {
			int x[];
			x=new int[] {1,2,3,4,5};
			System.out.println(x[5]);
		}catch(ArrayIndexOutOfBoundsException ex) {
			System.err.println("Index is Out Of The Bound.."+ex.getMessage());
		}
		System.out.println("Hello");
	}

}
