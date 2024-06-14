package edu.atria.b94java.finalkeyword;

public class FinalVariable {
	//final int x; // not initialized
	final int x=99;
	
	final static int y;
	final static int z=10;
	
	void change() {
		//x=30;//final static cant be reinitialized
		//y=200;//final static cant be reinitialized
	}

//	@Override
//	public String toString() {
//		return "FinalVariable [x=" + x + ",y="+y+"]";
//	}
	static {
		y=20;
		//z=100;//already assigned
		System.out.println("value of y:"+y);
	}

}