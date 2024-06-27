package edu.atria.b94java.multithreding;

public class UsingRunnable implements Runnable{
	Thread t;
	int h,l;
	String msg;
	public UsingRunnable(int h,int l,String msg) {
		this.h=h;
		this.l=l;
		this.msg=msg;
		t= new Thread(this,msg);
		t.start();
	}
	 @Override
	    public void run() {
	    	for(int i=h;i<=l;i++) {
	    		try {
	    			Thread.sleep(3000);
	    		}catch(InterruptedException e) {
	    			System.err.println(e.getMessage());
	    		}
	    		System.out.println(msg +i);
	    	}
	    }
	}
