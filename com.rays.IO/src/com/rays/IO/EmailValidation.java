package com.rays.IO;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class EmailValidation {
	public static void main(String[] args) throws Exception {
		final FileWriter f= new FileWriter("C:\\workspace\\Email.txt");
		final PrintWriter p = new PrintWriter(f);
		final FileReader r = new FileReader("C:\\workspace\\mail.txt");
		final Scanner s = new Scanner(r);
		final String regex ="^[a-zA-Z0-9.!#$%&’*+/=?^_`{|}~-]+@[a-zA-Z0-9-]+(?:\\.[a-zA-Z0-9-]+)*$";
		while (s.hasNextLine()) {
            final String email = s.nextLine();
            if (email.matches(regex)) {
                p.println(email);
                System.out.println(email);
            }
        }
        s.close();
        p.close();
        System.out.println("the emails has been sorted");
		
	}

}
