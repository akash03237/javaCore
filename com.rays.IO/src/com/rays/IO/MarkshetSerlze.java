package com.rays.IO;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.io.IOException;

public class MarkshetSerlze {
	public static void main(String[] args) throws IOException {
		FileOutputStream file = new FileOutputStream("C:\\workspace\\mark.txt");
		ObjectOutputStream out = new ObjectOutputStream(file);
		TestSerialization m = new TestSerialization();
		m.setName("akash");
		
		
		out.writeObject(m);
		
		
		out.close();
		file.close();
	}
	
	

}
