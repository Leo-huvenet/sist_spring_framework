package kr.co.sist.dao;

import org.springframework.stereotype.Component;

@Component
public class TestDAO {
	public void insert(String name) {
		System.out.println("DAO DB작업처리 : "+name+"님이 추가되었습니다.");
	}
	
	public void before1() {
		System.out.println("DAO : 매개변수 없고 반환형 없는 target");
	}

	public void before2(int age){
		System.out.println("DAO : 매개변수 있고 반환형 없는 target, 나이는 : "+age);		
	}
	
	public String afterReturning(String name) {
		name+= "님 안녕하세요?";
		System.out.println("DAO : 리턴 값"+name);
		return name;
	}
}
