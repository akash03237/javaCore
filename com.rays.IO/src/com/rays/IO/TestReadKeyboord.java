package com.rays.IO;

import java.io.BufferedReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;

public class TestReadKeyboord {
	public static void main(String[] args) throws IOException {
		PrintWriter out = new PrintWriter(new FileWriter("C:\\workspace\\Testprimitive.txt",true));
		InputStreamReader kb = new InputStreamReader(System.in);
		BufferedReader in = new BufferedReader(kb);
		String line = in.readLine();
		while (!line.equals("quit")) {
			out.print(line);
			line = in.readLine();

		}

		in.close();
		out.close();
		kb.close();

	}
}
