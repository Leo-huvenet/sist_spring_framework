package kr.co.sist.dao;

import java.util.List;

import kr.co.sist.domain.UserDomain;

/**
 * 구현 클래스에서 반드시 구현해야할 업무의 목록 정의
 * @author user
 */
public interface DAO {
	
	public List<UserDomain> selectUser();
	
}
