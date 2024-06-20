package edu.atria.b94java.abstraction;
//an abstarct class can have both abstract and non abstarct methods
public abstract class Shape {
	//static float area;
	float area;
	//abstarct method
	public abstract float calculateArea();
	//non abstract method
	public void display() {
		System.out.println("Area of the Shape: "+area +" units");
	}
	

}