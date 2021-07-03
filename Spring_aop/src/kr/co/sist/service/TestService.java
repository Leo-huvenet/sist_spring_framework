package kr.co.sist.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import kr.co.sist.dao.TestDAO;

@Component
public class TestService {
	
	@Autowired(required = false)
	private TestDAO tDAO;
	
	public void add(String name) {
		System.out.println("Service : 诀公肺流 贸府");
		tDAO.insert(name);
	}
	
	public void collBefore1() {
		System.out.println("Service : 诀公肺流 贸府");
		tDAO.before1();//DAO 诀公贸府
	}
	
	public void collBefore2(int age) {
		System.out.println("Service : 诀公肺流 贸府");
		tDAO.before2(age);//DAO 诀公贸府
	}
	
	public String callAfterRetrun(String name) {
		System.out.println("Service : 诀公肺流 贸府");
		tDAO.afterReturning(name);//DAO 诀公贸府
		return name;
	}
	
	
}
