package nirajapps;

public class Emplyee {
	
	private int empid;
	private String empName;
	@Override
	public String toString() {
		return "Emplyee [empid=" + empid + ", empName=" + empName + "]";
	}
	public int getEmpid() {
		return empid;
	}
	public void setEmpid(int empid) {
		this.empid = empid;
	}
	public String getEmpName() {
		return empName;
	}
	public void setEmpName(String empName) {
		this.empName = empName;
	}
	public Emplyee() {
		super();
	}

}
