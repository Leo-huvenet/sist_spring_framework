package kr.co.sist.domain;

/**
 * Web Parameter가 입력될 때 Spring Framework에서 VO의 기본생성자를 사용하여
 * 객체화하고 setter method호출하여 값을 넣어주고, 값을 가진 객체를 
 * Controller method에 넣어준다.
 * @author user
 *
 */
public class CpEmp1Domain {
	private int empno, deptno, sal;
	private String  ename,  job;
	
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
