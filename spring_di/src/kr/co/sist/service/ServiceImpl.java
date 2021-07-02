package kr.co.sist.service;

import java.util.List;

import kr.co.sist.dao.DAO;
import kr.co.sist.domain.UserDomain;

public class ServiceImpl implements Service{
	//기능을 유연하게 사용하기 위해 자식이 아닌 부모를 선언
	private DAO dao;
	
	
	/**
	 *	의존성 주입받는 생성자
	 *	부모를 정의하므로 모든 자식을 다 받을 수 있다(유연성) 
	 */
	public ServiceImpl(DAO dao) {
		this.dao = dao;
		System.out.println("의존성 주입받는 ServiceImpl 생성자 ");
	}
	
	@Override
	public List<UserDomain> searchUser() {
		//부모를 통해 전달된 자식이 구현한 업무가 실행.
		List<UserDomain> list = dao.selectUser();
		return list;
	}	
}
