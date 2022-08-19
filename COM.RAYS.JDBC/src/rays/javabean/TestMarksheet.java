package rays.javabean;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class TestMarksheet {
	public static void main(String[] args) throws Exception {
		testadd();
	//	 testupdate();
	//	 testDelete();
	//	 testGetId();
		//testMerit();
		// testsearch();

	}

	private static void testsearch() throws Exception {
		MarksheetModel md = new MarksheetModel();
		List<MarksheetBean> list =md.search();
		Iterator<MarksheetBean> it = list.iterator();
		while (it.hasNext()) {
			MarksheetBean marksheetBean = (MarksheetBean) it.next();
			System.out.print(marksheetBean.getId());
			System.out.print("\t" + marksheetBean.getRoll_no());
			System.out.print("\t" +  marksheetBean.getFname());
			System.out.print("\t" + marksheetBean.getLname());
			System.out.print("\t" + marksheetBean.getPhysics());
			System.out.print("\t" + marksheetBean.getChemistry());
			System.out.println("\t" + marksheetBean.getMaths());
			
		}
	}

	private static void testadd() throws Exception {
		MarksheetBean bean = new MarksheetBean();
		// bean.setId();
		bean.setRoll_no(20);
		bean.setFname("wdena");
		bean.setLname("qwkndl");
		bean.setPhysics(46);
		bean.setChemistry(96);
		bean.setMaths(75);

		MarksheetModel md = new MarksheetModel();
		md.add(bean);

	}

	private static void testupdate() throws Exception {
		MarksheetBean bean = new MarksheetBean();
		bean.setFname("seenu");
		bean.setLname("varnis");
		MarksheetModel mr = new MarksheetModel();
		mr.update(bean);

	}

	private static void testDelete() throws Exception {
		MarksheetBean bean = new MarksheetBean();

		bean.setRoll_no(210);
		MarksheetModel mb = new MarksheetModel();
		mb.Delete(bean);
	}

	private static void testGetId() throws Exception {
		MarksheetBean bean = new MarksheetBean();
		bean.setId(6);
		MarksheetModel md = new MarksheetModel();
		MarksheetBean bean1 = md.GetId(bean);
		System.out.print(bean1.getId());
		System.out.print(bean1.getRoll_no());
		System.out.print(bean1.getFname());
		System.out.print(bean1.getLname());
		System.out.print(bean1.getPhysics());
		System.out.print(bean1.getChemistry());
		System.out.println(bean1.getMaths());
	}

	private static void testMerit() throws Exception {
		MarksheetBean bean = new MarksheetBean();
		MarksheetModel md = new MarksheetModel();
		ArrayList l = new ArrayList();
		l = (ArrayList) md.Merit(bean);
		Iterator it = l.iterator();
		while (it.hasNext()) {
			MarksheetBean bean1 = (MarksheetBean) it.next();
			System.out.print("\t" + bean1.getId());
			System.out.print("\t" + bean1.getRoll_no());
			System.out.print("\t" + bean1.getFname());
			System.out.print("\t" + bean1.getLname());
			System.out.print("\t" + bean1.getPhysics());
			System.out.print("\t" + bean1.getChemistry());
			System.out.print("\t" + bean1.getMaths());
			System.out.print("\t" + bean1.getTotal());
			System.out.println("\t" + bean1.getPercentage());
		}

	}

}
