package com.rays.IO;

import java.io.File;

public class filename {
	public static void main(String[] args) {
		File f = new File("C:\\Users\\INDIAN\\Documents\\exam");
		if (f.exists())
			;
		{
			System.out.println("name is:" + f.getName());
		}
	}

}
