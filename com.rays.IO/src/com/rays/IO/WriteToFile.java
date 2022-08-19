package com.rays.IO;

import java.io.FileWriter;
import java.io.IOException;

public class WriteToFile {
	public static void main(String[] args) throws IOException {
		FileWriter out = new FileWriter("C:\\test.txt.txt",true);
		out.write('a');
		out.write('\n');
		out.write("this is line one");
		out.write('\n');
		out.write("this is line two");
		out.write("akash");
		out.close();
		
		System.out.println("Check C:\\test.txt.txt");

	}

}
