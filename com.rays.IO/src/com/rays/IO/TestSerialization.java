package com.rays.IO;

import java.io.Serializable;

public class TestSerialization implements Serializable{
	String name = null;
	//private transient int age=0;
	int maths = 0;
	int phsics =0;
	int chemistry= 0;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name= name;
		
	}
	
	
	
}
