package JDBC;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class TestPrprdStatement {
	public static void main(String[] args) throws Exception {
		testadd();
		
	}

	private static void testadd() throws Exception {
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/amazon", "root", "Yuvraj@321");
		int id = 18;
		int rn = 180;
		String fn = "tanu";
		String ln = "seni";
		int ph = 89;
		int ch = 39;
		int ms = 62;
		PreparedStatement ps = con.prepareStatement("insert into marksheets values(?,?,?,?,?,?,?)");
		ps.setInt(1, id);
		ps.setInt(2, rn);
		ps.setString(3,fn);
		ps.setString(4,ln);
		ps.setInt(5,ph);
		ps.setInt(6,ch);
		ps.setInt(7,ms);
		 
		ps.executeUpdate();
		System.out.println("you have suscesfully inserted the record");
		ps.close();
		con.close();
		

 
	}

}
