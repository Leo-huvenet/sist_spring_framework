package kr.co.sist.service;

import java.util.List;

import kr.co.sist.domain.UserDomain;

/**
 *	자식들이 구현해야 할 업무 목록 정의
 * @author user
 */
public interface Service {

	public List<UserDomain> searchUser();
}
