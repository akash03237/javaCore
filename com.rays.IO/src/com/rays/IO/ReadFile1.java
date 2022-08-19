package com.rays.IO;

import java.io.FileReader;
import java.io.IOException;

public class ReadFile1 {
	public static void main(String[] args) throws IOException {
		try (FileReader in = new FileReader("C:\\test.txt.txt")) {
			int ch = in.read();

			char chr;
			while (ch != -1) {
				chr = (char) ch;
				System.out.println(chr);
				ch = in.read();

			}
		}

	}

}
