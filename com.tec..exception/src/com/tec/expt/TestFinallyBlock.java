package com.tec.expt;

import java.io.FileInputStream;
import java.io.IOException;

public class TestFinallyBlock {
	public static void main(String[] args) throws IOException {
		FileInputStream input = null;
		try {
			input = new FileInputStream("file.txt");
			int data = input.read();
			while (data != -1) {
				System.out.println((char) data);
				data = input.read();
			}
		} finally {
			if (input != null) {
				input.close();

			}

		}

	}

}
