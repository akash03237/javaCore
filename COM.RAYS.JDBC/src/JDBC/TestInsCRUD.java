package JDBC;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class TestInsCRUD {
	public static void main(String[] args) throws Exception {
		testadd();
		{

		}
	}

	private static void testadd() throws Exception {
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/amazon", "root", "Yuvraj@321");

		Statement stmt = con.createStatement();
		int id = 18;
		int roll_no = 180;
		String fname = "arsh";
		String lname = "vansi";
		int physics = 46;
		int chemistry = 95;
		int maths = 16;
		
		int id1 = 16;
		int roll_no1 = 150;
		String fname1 = "harsh";
		String lname1 = "yaduvansi";
		int physics1 = 62;
		int chemistry1 = 55;
		int maths1 = 26;

		int i = stmt.executeUpdate("insert into marksheets values(" + id + ",'" + roll_no + "','" + fname + "','"
				+ lname + "'," + physics + ", " + chemistry + " ," + maths + ")");
		System.out.println(i + "-_- record insserted");
		
		
		int i1 = stmt.executeUpdate("insert into marksheets values(" + id1 + ",'" + roll_no1 + "','" + fname1 + "','"
				+ lname1 + "'," + physics1 + ", " + chemistry1 + " ," + maths1 + ")");
		System.out.println(i1 + "-_- record insserted");
		
		// Statement stmt = con.createStatement();
		// int i = stmt.executeUpdate("INSERT into marksheets values
		// (15,150,'nia','rAza',66,68,26)");
		// int i = stmt.executeUpdate("UPDATE marksheets SET fname='hena',lname='sinu'
		// WHERE id =12");
		// int i = stmt.executeUpdate("delete from marksheets where id=15");

		// System.out.println(i + "-__- record inserted");
		// System.out.println(i+"-_-record deleted");
		stmt.close();
		// stmt.close();
		con.close();
	}

}
