package rays.javabean;

import java.beans.PropertyVetoException;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ResourceBundle;

import com.mchange.v2.c3p0.ComboPooledDataSource;

public final class JdbcDataSource {
	private static JdbcDataSource jds = null;
	private ComboPooledDataSource ds = null;

	private JdbcDataSource() {
		try {
			ds = new ComboPooledDataSource();

			ds.setDriverClass("");
			ds.setJdbcUrl("jdbc:mysql://localhost:3306/amazon");
			ds.setUser("root");
			ds.setPassword("Yuvraj@321");
			ds.setInitialPoolSize(5);
			ds.setAcquireIncrement(5);
			ds.setMaxPoolSize(50);

		} catch (PropertyVetoException e) {
			e.printStackTrace();
		}

	}

	public static JdbcDataSource getInstance() {
		if (jds == null) {
			jds = new JdbcDataSource();

		}

		return jds;

	}

	public static Connection getConnection() {
		try {
			return getInstance().ds.getConnection();

		} catch (SQLException e) {
			return null;
		}
	}

	public static void closeConnection(Connection conn, Statement stmt, ResultSet rs) {
		try {
			if (rs != null)
				rs.close();
			if (stmt != null)
				stmt.close();
			if (conn != null)
				conn.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	public static void closeConnection(Connection conn, Statement stmt) {
		closeConnection(conn, stmt, null);
	}

	public static void closeConnection(Connection conn) {
		closeConnection(conn, null, null);
	}

	public static void main(String[] args) throws SQLException {
		String sql = "select * from marksheets";
		// String sql = " select * from marksheets where id = 5";
		Connection conn = JdbcDataSource.getConnection();
		Statement stmt = conn.createStatement();
		ResultSet rs = stmt.executeQuery(sql);
		System.out.println("DB pool Connection");
		System.out.println(
				"----------------------------------------------------------------------------------------------------------");
		System.out.println("id\t|\troll_no\t|\tfname \t \t|  \tlname\t \t|  \tphysics\t| chemistry\t| \tmaths\t|");
		

		while (rs.next()) {
			System.out.print(rs.getInt(1));
			System.out.print("\t|\t" + rs.getInt(2));
			System.out.print("  \t|\t" + rs.getString(3));
			System.out.print("   \t|\t" + rs.getString(4));
			System.out.print("   \t|\t" + rs.getInt(5));
			System.out.print("\t|\t" + rs.getInt(6));
			System.out.println("\t|\t" + rs.getInt(7));
			System.out.println(
					"------------------------------------------------------------------------------------------------------------");

		}
		JdbcDataSource.closeConnection(conn, stmt, rs);

	}

}
