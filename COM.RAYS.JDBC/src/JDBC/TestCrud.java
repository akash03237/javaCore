package JDBC;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.sql.ResultSetMetaData;

import com.mysql.cj.protocol.Resultset;

public class TestCrud {
	public static void main(String[] args) throws Exception {
		testselect();

	}

	private static void testselect() throws Exception {
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/amazon", "root", "Yuvraj@321");
		
		Statement stmt = con.createStatement();
		ResultSet rs = stmt.executeQuery("Select * from marksheets ");
		//System.out.println(ID/ROLL_NO/FNAME/LNAME/PHYSICS/CHEMISTRY/MATHS);
		ResultSetMetaData rsmd = rs.getMetaData();
		int columnCount = rsmd.getColumnCount();
		for (int i = 1; i <= columnCount; i++) {
			String name = rsmd.getColumnName(i);
			System.out.print("   " + rsmd.getColumnName(i));
		}
		while (rs.next()) {

			System.out.println();
			System.out.print("\t" + rs.getString(1));
			System.out.print("\t" + rs.getString(2));
			System.out.print("\t" + rs.getString(3));
			System.out.print("\t" + rs.getString(4));
			System.out.print("\t" + rs.getString(5));
			System.out.print("\t" + rs.getString(6));
			System.out.print("\t" + rs.getString(7));
		//ystem.out.println("\t" + rs.getInt);

		}
		rs.close();
		stmt.close();
		con.close();

	}

}
