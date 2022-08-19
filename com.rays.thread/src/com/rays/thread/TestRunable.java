package com.rays.thread;

import java.util.PriorityQueue;

import javax.swing.plaf.basic.BasicInternalFrameTitlePane.MaximizeAction;

public class TestRunable implements Runnable {
	private String name = null;

	public TestRunable(String n) {
		this.name = n;

	}

	public void run() {

		for (int i = 0; i < 10; i++) {

			System.out.println(i + "" + name);

		}
	}

	public static void main(String[] args) {
		Thread t1 = new Thread(new TestRunable("ram"));
		t1.setPriority(5);

		Thread t2 = new Thread(new TestRunable("shyam"));
		t2.setPriority(10);
		t1.start();
		// t1.setDaemon(true);`it is background threads
		t2.start();
		System.out.println("state"+t1.getState());
		System.out.println("name: "+t2.getName());
		System.out.println("is daemon  :"+t1.isDaemon()+"\n");
		

	}

}
