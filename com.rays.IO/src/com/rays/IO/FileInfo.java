package com.rays.IO;

import java.io.File;
import java.util.Date;

public class FileInfo {
	public static void main(String[] args) {
		File f = new File("C:\\test.txt.txt");
		if (f.exists())
			
		{
			System.out.println("Name:" + f.getName());
			System.out.println("Path:" + f.getAbsolutePath());
			System.out.println("access persmission");

			System.out.println("Writable:" + f.canWrite());
			System.out.println("readable:" + f.canRead());
			System.out.println("is file:" + f.isFile());
			System.out.println("iss dir" + f.isDirectory());
			Date d = new Date(f.lastModified());
			System.out.println("date modifed" + d);
			long length = f.length();
			System.out.println("length:" + length + "bytes");

		}else
		{
			System.out.println("file does not exist");

		}
	}
}