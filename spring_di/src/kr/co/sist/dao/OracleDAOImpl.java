package kr.co.sist.dao;

import java.util.ArrayList;
import java.util.List;

import kr.co.sist.domain.UserDomain;

public class OracleDAOImpl implements DAO{
	
	public OracleDAOImpl() {
		System.out.println("OracleDAOImpl 생성자");
	}
	
	@Override
	public List<UserDomain> selectUser() {
		List<UserDomain> list = new ArrayList<UserDomain>();
		list.add(new UserDomain("강인섭", "서울시 강남구 역삼동"));
		list.add(new UserDomain("김덕영", "서울시 동대문구 동대문동"));
		list.add(new UserDomain("현병호", "서울시 구로구 구로동"));
		
		return list;
	}
	
	
}
