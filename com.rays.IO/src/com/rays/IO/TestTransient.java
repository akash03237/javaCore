package com.rays.IO;

import java.io.Serializable;

public class TestTransient implements Serializable{
	
	String name = null;
	int maths = 50;
	int phsics =52;
	int chemistry= 60;
	transient int total = 0;
	transient double percentage = 0;
	transient int temp = 0;
	
}

