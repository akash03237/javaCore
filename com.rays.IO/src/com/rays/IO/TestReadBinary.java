package com.rays.IO;

import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.IOException;

public class TestReadBinary {
	public static void main(String[] args) throws IOException {
		DataInputStream in = new DataInputStream(new FileInputStream("C:\\workspace\\Testprimitive.txt"));
		System.out.println(in.readInt());
		System.out.println(in.readChar());
		
		System.out.println(in.readBoolean());
		System.out.println(in.readDouble());
		in.close();
		
		
	}

}
