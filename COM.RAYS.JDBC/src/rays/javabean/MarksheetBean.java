package rays.javabean;

public class MarksheetBean {
	private int id;
	private int roll_no;
	private String fname;
	private String lname;
	private int physics;
	private int chemistry;
	private int maths;
	private int Total;
	private double percentage;
	
	public int getTotal() {
		return Total;
	}

	public void setTotal(int total) {
		Total = total;
	}

	public double getPercentage() {
		return percentage;
	}

	public void setPercentage(double percentage) {
		this.percentage = percentage;
	}

	public MarksheetBean()  {
		
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getRoll_no() {
		return roll_no;
	}

	public void setRoll_no(int i) {
		this.roll_no = i;
	}

	public String getFname() {
		return fname;
	}

	public void setFname(String fname) {
		this.fname = fname;
	}

	public String getLname() {
		return lname;
	}

	public void setLname(String lname) {
		this.lname = lname;
	}

	public int getPhysics() {
		return physics;
	}

	public void setPhysics(int physics) {
		this.physics = physics;
	}

	public int getChemistry() {
		return chemistry;
	}

	public void setChemistry(int chemistry) {
		this.chemistry = chemistry;
	}

	public int getMaths() {
		return maths;
	}

	public void setMaths(int maths) {
		this.maths = maths;
	}
	

}
