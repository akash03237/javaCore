package com.rays.IO;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class TestDesrlz {
	public static void main(String[] args) throws IOException, ClassNotFoundException {
		FileInputStream file = new FileInputStream("C:\\workspace\\mark.txt");
		ObjectInputStream in = new ObjectInputStream(file);
		TestSerialization m = (TestSerialization) in.readObject();
		System.out.println("name: " + m.getName());
		
	}
}
