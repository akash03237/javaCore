package JDBC;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;

import com.mysql.cj.jdbc.CallableStatement;

public class TestCallFunc {
	public static void main(String[] args) throws Exception {
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/amazon", "root", "Yuvraj@321");
		 
		java.sql.CallableStatement csmt= con.prepareCall("{CALL getAllMarks()}");
		csmt.execute();
		ResultSet  rs= csmt.getResultSet();
		while(rs.next()) {
			System.out.print(rs.getString(1));
		}
	}

}
