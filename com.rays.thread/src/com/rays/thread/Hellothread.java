package com.rays.thread;

import java.util.Set;

public class Hellothread extends Thread{
	private String name = null;
	public Hellothread(String n) {
		this.name=n;
	}
	public void run () {
		for (int i=0;i<50;i++) {
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			System.out.println(i+"#"+name);
		}
	}
	public static void main(String[] args) {
		Hellothread t1 = new Hellothread("akash");
		Hellothread t2 = new Hellothread("hello");
		t1.start();
	
		t2.start();
		for (int i =0;i<50;i++) {
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			System.out.println(i+"i am main");
		}
	}

}
