package edu.atria.b94java.second;
import edu.atria.b94java.first.Base;
public class ExecutorTwo extends Base{

	public static void main(String[] args) {
		Base bTwo = new Base();
		//private members are not accessible outside the first package
		//System.out.println(bTwo.variablePriavte);
		
		//default members are not accessible outside the first package
		//System.out.println(bTwo.variableDeafult);
		
		ExecutorTwo ex = new ExecutorTwo();
		System.out.println(ex.variableProtected);
		
		System.out.println(bTwo.variablePublic);

	}

}
