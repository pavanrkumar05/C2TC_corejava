package edu.atria.b94java.arrays;

public class StudentMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student arr[]=new Student[5];
		arr[0]=new Student(11,"pavan");
		arr[1]=new Student(12,"punith");
		arr[2]=new Student(13,"yashas");
		arr[3]=new Student(14,"samyam");
		arr[4]=new Student(15,"rohith");
		
		for(Student s:arr) {
			System.out.println("The age of the student is "+s.getAge()+" ");
			System.out.println("The name of the student is "+s.getName()+" ");
		}

	}

}
