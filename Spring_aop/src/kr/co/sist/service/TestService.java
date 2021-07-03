package kr.co.sist.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import kr.co.sist.dao.TestDAO;

@Component
public class TestService {
	
	@Autowired(required = false)
	private TestDAO tDAO;
	
	public void add(String name) {
		System.out.println("Service : �������� ó��");
		tDAO.insert(name);
	}
	
	public void collBefore1() {
		System.out.println("Service : �������� ó��");
		tDAO.before1();//DAO ����ó��
	}
	
	public void collBefore2(int age) {
		System.out.println("Service : �������� ó��");
		tDAO.before2(age);//DAO ����ó��
	}
	
	public String callAfterRetrun(String name) {
		System.out.println("Service : �������� ó��");
		tDAO.afterReturning(name);//DAO ����ó��
		return name;
	}
	
	
}
