package kr.co.sist.dao;

import org.springframework.stereotype.Component;

@Component
public class TestDAO {
	public void insert(String name) {
		System.out.println("DAO DB�۾�ó�� : "+name+"���� �߰��Ǿ����ϴ�.");
	}
	
	public void before1() {
		System.out.println("DAO : �Ű����� ���� ��ȯ�� ���� target");
	}

	public void before2(int age){
		System.out.println("DAO : �Ű����� �ְ� ��ȯ�� ���� target, ���̴� : "+age);		
	}
	
	public String afterReturning(String name) {
		name+= "�� �ȳ��ϼ���?";
		System.out.println("DAO : ���� ��"+name);
		return name;
	}
}
