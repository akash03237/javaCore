package rays.javabean;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.ResourceBundle;

public class MarksheetModel {
	ResourceBundle rb  = ResourceBundle.getBundle("com.raystech.rb.app");
	public Integer nextpk() throws Exception {
		int pk = 0;
		Class.forName(rb.getString("Driver"));
		Connection con = DriverManager.getConnection(rb.getString("Url"),rb.getString("Username"),rb.getString("Password"));

		PreparedStatement ps = con.prepareStatement("select max(id) from marksheets");
		ResultSet rs = ps.executeQuery();
		while (rs.next()) {
			pk = rs.getInt(1);

		}
		ps.close();
		con.close();
		return pk + 1;

	}

	public void add(MarksheetBean bean) throws Exception {
		Class.forName(rb.getString("Driver"));
		Connection con = DriverManager.getConnection(rb.getString("Url"),rb.getString("Username"),rb.getString("Password"));
		con.setAutoCommit(false);
		//Class.forName("com.mysql.cj.jdbc.Driver");
		//Connection con = JdbcDataSource.getConnection();//DriverManager.getConnection("jdbc:mysql://localhost:3306/amazon", "root", "Yuvraj@321");
		Statement stmt = con.createStatement();
		
		//con.setAutoCommit(false);
		PreparedStatement ps = con.prepareStatement("insert into marksheets values(?,?,?,?,?,?,?)");

		ps.setInt(1, nextpk());
		ps.setInt(2, bean.getRoll_no());
		ps.setString(3, bean.getFname());
		ps.setString(4, bean.getLname());
		ps.setInt(5, bean.getPhysics());
		ps.setInt(6, bean.getChemistry());
		ps.setInt(7, bean.getMaths());

		ps.executeUpdate();

		
		System.out.println("you have suscesfully inserted the record");
		con.commit();
		//ps.close();
		//con.close();
		JdbcDataSource.closeConnection(con,stmt);;

	}

	public void update(MarksheetBean bean) throws Exception {
		Class.forName(rb.getString("Driver"));
		Connection con = DriverManager.getConnection(rb.getString("Url"),rb.getString("Username"),rb.getString("Password"));
		//Class.forName("com.mysql.cj.jdbc.Driver");
	//	Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/amazon", "root", "Yuvraj@321");
		con.setAutoCommit(false);
		PreparedStatement ps = con.prepareStatement("update marksheets set fname=(?),lname=(?) where id=18");

		ps.setString(1, bean.getFname());
		ps.setString(2, bean.getLname());

		ps.executeUpdate();

		con.commit();
		System.out.println("you have suscesfully updated the record");
		ps.close();
		con.close();

	}

	public void Delete(MarksheetBean bean) throws Exception {
		Class.forName(rb.getString("Driver"));
		Connection con = DriverManager.getConnection(rb.getString("Url"),rb.getString("Username"),rb.getString("Password"));
		//Class.forName("com.mysql.cj.jdbc.Driver");
	//	Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/amazon", "root", "Yuvraj@321");
		con.setAutoCommit(false);

		PreparedStatement ps = con.prepareStatement("delete from marksheets where ROLL_NO = ?");

		ps.setInt(1, bean.getRoll_no());

		ps.executeUpdate();

		con.commit();
		con.rollback();

		System.out.println("you have suscesfully deleted the record");
		ps.close();
		con.close();

	}

	public List<MarksheetBean> search() throws Exception {
		Class.forName(rb.getString("Driver"));
		Connection con = DriverManager.getConnection(rb.getString("Url"),rb.getString("Username"),rb.getString("Password"));
	//	Class.forName("com.mysql.cj.jdbc.Driver");
	//	Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/amazon", "root", "Yuvraj@321");
		PreparedStatement ps = con.prepareStatement("select * from marksheets ");
		ResultSet rs = ps.executeQuery();
		MarksheetBean bean = null;
		ArrayList<MarksheetBean> list = new ArrayList<MarksheetBean>();
		while (rs.next()) {
			bean = new MarksheetBean();
			bean.setId(rs.getInt(1));
			bean.setRoll_no(rs.getInt(2));
			bean.setFname(rs.getString(3));
			bean.setLname(rs.getString(4));
			bean.setPhysics(rs.getInt(5));
			bean.setChemistry(rs.getInt(6));
			bean.setMaths(rs.getInt(7));
			list.add(bean);

		}
		ps.close();
		rs.close();
		con.close();
		return list;

	}

	public MarksheetBean GetId(MarksheetBean bean) throws Exception {
		Class.forName(rb.getString("Driver"));
		Connection con = DriverManager.getConnection(rb.getString("Url"),rb.getString("Username"),rb.getString("Password"));
	//	Class.forName("com.mysql.cj.jdbc.Driver");
	//	Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/amazon", "root", "Yuvraj@321");
		con.setAutoCommit(false);

		PreparedStatement ps = con.prepareStatement("select * from marksheets where id = ? ");

		ps.setInt(1, bean.getId());

		ResultSet rs = ps.executeQuery();
		while (rs.next()) {
			System.out.print("\t" + rs.getInt(1));
			System.out.print("\t" + rs.getInt(2));
			System.out.print("\t" + rs.getString(3));
			System.out.print("\t" + rs.getString(4));
			System.out.print("\t" + rs.getInt(5));
			System.out.print("\t" + rs.getInt(6));
			System.out.println("\t" + rs.getInt(7));
		}
		ps.executeUpdate();

		con.commit();
		con.rollback();

		ps.close();
		con.close();
		System.out.println("you have suscesfully geted by id the record");
		return bean;

	}

	public List Merit(MarksheetBean bean) throws Exception {
		Class.forName(rb.getString("Driver"));
		Connection con = DriverManager.getConnection(rb.getString("Url"),rb.getString("Username"),rb.getString("Password"));
		//Class.forName("com.mysql.cj.jdbc.Driver");
	//	Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/amazon", "root", "Yuvraj@321");
		con.setAutoCommit(false);
		PreparedStatement ps = con
				.prepareStatement("select *,(physics+chemistry+maths) as total ,((physics+chemistry+maths)/3) "
						+ "as percentage from marksheets where (physics+chemistry+maths) between 240 and 300  ");
		ResultSet rs = ps.executeQuery();
		MarksheetBean bean1 = null;
		ArrayList<MarksheetBean> list = new ArrayList<MarksheetBean>();
		while (rs.next()) {
			bean1 = new MarksheetBean();
			// bean1.setId(nextpk());
			bean1.setId(rs.getInt(1));
			bean1.setRoll_no(rs.getInt(2));
			bean1.setFname(rs.getString(3));
			bean1.setLname(rs.getString(4));
			bean1.setPhysics(rs.getInt(5));
			bean1.setChemistry(rs.getInt(6));
			bean1.setMaths(rs.getInt(7));
			bean1.setTotal(rs.getInt(8));
			bean1.setPercentage(rs.getDouble(9));
			list.add(bean1);

		}
		con.commit();
		con.close();
		ps.close();
		System.out.println("here's the record...");

		return list;

	}
}
