package JDBC;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.Statement;

public class TestGetByID {
	public static void main(String[] args) throws Exception {
		TestGetByID(5);
		{

		}
	}

	private static void TestGetByID(int i) throws Exception {
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/amazon", "root", "Yuvraj@321");
		Statement stmt = con.createStatement();
		ResultSet rs = stmt.executeQuery("select * from marksheets where id>17");
		// ResultSetMetaData rsmd = rs.getMetaData();
		// int columnCount = rsmd.getColumnCount();
		// for (int i1 = 1; i1 <= columnCount; i1++) {
		// String name = rsmd.getColumnName(i1);
		// System.out.print(" " + rsmd.getColumnName(i1));
		while (rs.next()) {

			System.out.println();
			System.out.println();
			System.out.print("\t" + rs.getString(1));
			System.out.print("\t" + rs.getString(2));
			System.out.print("\t" + rs.getString(3));
			System.out.print("\t" + rs.getString(4));
			System.out.print("\t" + rs.getString(5));
			System.out.print("\t" + rs.getString(6));
			System.out.print("\t" + rs.getString(7));

		}

		rs.close();
		stmt.close();
		con.close();
	}
}
