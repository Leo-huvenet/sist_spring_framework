package kr.co.sist.assembly;

import kr.co.sist.dao.DAO;
import kr.co.sist.dao.MySqlDAOImpl;
import kr.co.sist.dao.OracleDAOImpl;
import kr.co.sist.service.Service;
import kr.co.sist.service.ServiceImpl;

/**
 *	클래스간의 관계를 설정하는 클래스
 *  (의존성 주입을 외부에서 수행)
 * @author user
 */
public class Assembly {
	
	public Service getBean() {
		//1. 의존성 주입할 객체 생성
		//DAO dao = new OracleDAOImpl(); //Oracle연동
		DAO dao = new MySqlDAOImpl(); //MySql연동
		
		
		//2. 의존성 주입받을 객체를 생성하고 의존성 주입
		Service service = new ServiceImpl(dao);
		
		//3. 의존성 주입받은 객체를 반환한다.
		return service;
	}
}
