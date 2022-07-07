package com.tec.expt;

public class ma {
	
	public static void main(String[] args) throws LoginException {
		authenticate("ram","jay");
	}
	public static void authenticate(String login ,  String pwd )throws LoginException{

		UserDAO u= UserDAO.get(login,pwd);
		if (u==null) {
			throw new LoginException("you are authenticated");
		}
		
	}
}
