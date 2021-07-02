package kr.co.sist.service;

import java.util.List;

import kr.co.sist.dao.DAO;
import kr.co.sist.domain.UserDomain;

public class ServiceImpl implements Service{
	//����� �����ϰ� ����ϱ� ���� �ڽ��� �ƴ� �θ� ����
	private DAO dao;
	
	
	/**
	 *	������ ���Թ޴� ������
	 *	�θ� �����ϹǷ� ��� �ڽ��� �� ���� �� �ִ�(������) 
	 */
	public ServiceImpl(DAO dao) {
		this.dao = dao;
		System.out.println("������ ���Թ޴� ServiceImpl ������ ");
	}
	
	@Override
	public List<UserDomain> searchUser() {
		//�θ� ���� ���޵� �ڽ��� ������ ������ ����.
		List<UserDomain> list = dao.selectUser();
		return list;
	}	
}
