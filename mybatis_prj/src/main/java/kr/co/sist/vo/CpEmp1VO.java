package kr.co.sist.vo;

public class CpEmp1VO {
	private int empno, deptno, sal;
	private String  ename,  job;
	
	public CpEmp1VO(int empno, int deptno, int sal, String ename, String job) {
		super();
		this.empno = empno;
		this.deptno = deptno;
		this.sal = sal;
		this.ename = ename;
		this.job = job;
	}
	
	public int getEmpno() {
		return empno;
	}
	public void setEmpno(int empno) {
		this.empno = empno;
	}
	public int getDeptno() {
		return deptno;
	}
	public void setDeptno(int deptno) {
		this.deptno = deptno;
	}
	public int getSal() {
		return sal;
	}
	public void setSal(int sal) {
		this.sal = sal;
	}
	public String getEname() {
		return ename;
	}
	public void setEname(String ename) {
		this.ename = ename;
	}
	public String getJob() {
		return job;
	}
	public void setJob(String job) {
		this.job = job;
	}
	
	
}
