package com.tec.expt;

public class ProgramaticException {
	public static boolean isValidUser() {
		return false;
	}

	public static void main(String[] args) {
		boolean userFound = isValidUser();
		if (userFound) {
			System.out.println("valid user");
		} else {
			RuntimeException e = new RuntimeException("invallid user");
			throw e;
		}
	}
}
