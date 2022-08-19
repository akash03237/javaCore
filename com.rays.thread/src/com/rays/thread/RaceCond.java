package com.rays.thread;

public class RaceCond extends Thread {
	public static Account data = new Account();
	public RaceCond (String name) {
		super(name);
		
	}
	public void run() {
		for (int i=0;i<5;i++) {
			data.deposit(getName(), 1000);
		}
	}public static void main(String[] args) {
		RaceCond u1 = new RaceCond("akash ");
		RaceCond u2 = new RaceCond("ajay ");
		u1.start();
		u2.start();
	}

}                   // synchronization ke sath static use hoga 
