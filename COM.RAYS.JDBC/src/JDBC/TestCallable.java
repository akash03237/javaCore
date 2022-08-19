package JDBC;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Types;

public class TestCallable {
	public static void main(String[] args) throws Exception {
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/amazon", "root", "Yuvraj@321");
		
CallableStatement callstmt = con.prepareCall("{CALL employeecount(?)}");
callstmt.registerOutParameter(1,Types.INTEGER );
//callstmt.registerOutParameter(2, Types.VARCHAR);
callstmt.execute();
System.out.println("count int is "+callstmt.getInt(1));//+"anothrre"+callstmt.getString(2));
		

con.close();
callstmt.close();
		
	}	

}
	