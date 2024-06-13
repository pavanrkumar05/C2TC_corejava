package edu.atria.b94java.first;

public class ExecutorOne {

	public static void main(String[] args) {
	Base bOne=new Base();
	//private members are not visible outside the class
	//System.out.println(bOne.varPrivate);
	System.out.println(bOne.variableDefault);
	System.out.println(bOne.variableProctected);
	System.out.println(bOne.variablePublic);

	}

}
