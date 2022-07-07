package com.rays5;

public  class Student implements Richman {

	@Override
	public void donation() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void party() {
		System.out.println("lets party man");
		// TODO Auto-generated method stub
		
	}
	public static void main(String[] args) {
		Richman r = new Student();
		r.party();
	}

	

}
