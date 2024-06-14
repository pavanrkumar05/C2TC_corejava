package edu.atria.b94java.statickeyword;

public class MyClass {
	private  int section;
	private static int srNo;
	
	static {
		System.out.println("within the static block");
		srNo=111;
	}
	MyClass(){
		System.out.println("within default constructor");
		srNo++;
	}
	public static void display() {
		System.out.println(srNo);
		//System.out.println(section); //cannot accessnnon static member inside static method
	}
	@Override
	public String toString() {
		return "MyClass [section=" + section + ",srNo="+srNo+"]";
	}

}
