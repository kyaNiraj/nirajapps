package nirajapps;

public class Emplyee {
	
	private int empid;
	private double sal;
	public double getSal() {
		return sal;
	}
	public void setSal(double sal) {
		this.sal = sal;
	}
	private String empName;
	@Override
	public String toString() {
		return "Emplyee [sal=" + sal + "]";
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
