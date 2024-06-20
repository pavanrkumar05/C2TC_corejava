package edu.atria.b94java.interfacedemo;

public class SimMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Sim s=new Sim();
		Sim sOne  =new Jio();
		sOne.makeCall();
		sOne.sendMsg();
		
		Sim sTwo  =new Airtel();
		sTwo.makeCall();
		sTwo.sendMsg();

	}

}
