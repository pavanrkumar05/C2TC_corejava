package edu.atria.b94java.oops;
import java.util.Scanner;
public class EmployeeMain {
	public static void main(String[] args) {
		//Scanner sc =new Scanner(System.in);
		//System.out.println("enter the employee details..");
		//int id=sc.nextInt();
		//String name=sc.next();
		//double salary =sc.nextDouble();
		//String designation=sc.next();
		//Employee eOne =new Employee();
		//eOne.setId(id);
		//eOne.setName(name);
		//eOne.setSalary(salary);
		//eOne.setDesignation(designation);
		//System.out.println("Employee Details:");
		//System.out.println("employee id: "+eOne.getId());
		//System.out.println("employee name: "+eOne.getName());
		//System.out.println("employee salary: "+eOne.getSalary());
		//System.out.println("employee designation: "+eOne.getDesignation());
		Employee eTwo=new Employee(100,'pavan',10000.00,'web developer');
		System.out.println(eTwo);
		
	}
}
