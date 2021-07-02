package kr.co.sist.assembly;

import kr.co.sist.dao.DAO;
import kr.co.sist.dao.MySqlDAOImpl;
import kr.co.sist.dao.OracleDAOImpl;
import kr.co.sist.service.Service;
import kr.co.sist.service.ServiceImpl;

/**
 *	Ŭ�������� ���踦 �����ϴ� Ŭ����
 *  (������ ������ �ܺο��� ����)
 * @author user
 */
public class Assembly {
	
	public Service getBean() {
		//1. ������ ������ ��ü ����
		//DAO dao = new OracleDAOImpl(); //Oracle����
		DAO dao = new MySqlDAOImpl(); //MySql����
		
		
		//2. ������ ���Թ��� ��ü�� �����ϰ� ������ ����
		Service service = new ServiceImpl(dao);
		
		//3. ������ ���Թ��� ��ü�� ��ȯ�Ѵ�.
		return service;
	}
}
