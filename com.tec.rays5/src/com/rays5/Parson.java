package com.rays5;

public class Parson {
	String firstname;
	String lastname;
	Parson(String fn ,String ln){
		this.firstname=fn;
		this.lastname=ln;
		
		
	}
	public String toString() {
		return firstname+" "+lastname;
	}
	public static void main(String[] args) {
		Parson s= new Parson ("raju","riya");
		System.out.println(s);
	}
	

}
