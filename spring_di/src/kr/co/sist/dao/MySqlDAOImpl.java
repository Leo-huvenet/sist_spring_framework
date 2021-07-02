package kr.co.sist.dao;

import java.util.ArrayList;
import java.util.List;

import kr.co.sist.domain.UserDomain;

public class MySqlDAOImpl implements DAO{
	
	public MySqlDAOImpl() {
		System.out.println("MySqlDAOImpl 생성자");
	}
	
	@Override
	public List<UserDomain> selectUser() {
		List<UserDomain> list = new ArrayList<UserDomain>();
		list.add(new UserDomain("권예원", "서울시 강남구 역삼동"));
		list.add(new UserDomain("송준희", "서울시 송파구 문정동"));
		list.add(new UserDomain("김다은", "서울시 광진구"));
		
		return list;
	}
	
	
}
