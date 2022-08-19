package com.raystech.collections;

public class Marksheet implements Comparable<Marksheet>{
	
	public String rollno;
	public String name;
	public int marks;
	public String getRollno() {
		return rollno;
	}
	public void setRollno(String rollno) {
		this.rollno = rollno;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getMarks() {
		return marks;
	}
	public void setMarks(int marks) {
		this.marks = marks;
	}
	
	public int compareTo(Marksheet m) {
		
		return this.rollno.compareTo(rollno);
	}
	
	

}
