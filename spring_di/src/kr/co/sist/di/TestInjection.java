package kr.co.sist.di;

import kr.co.sist.dao.DAO;
import kr.co.sist.domain.UserDomain;

/**
 *	다양한 의존성 주입 연습
 *	생성자 의존성 주입, method의존성 주입.
 * @author user
 */
public class TestInjection {
	
	//생성자 의존성 주입
	private DAO d;
	
	public TestInjection() {
		System.out.println("method 의존성 주입에 반드시 사용되는 기본 생성자");
	}

	public TestInjection(DAO d) {
		this.d = d;
		System.out.println("생성자 의존성 주입");
	}//TestInjection
	
	public void setD(DAO d) {
		this.d = d;
		System.out.println("method 의존성 주입");
	}//setter
	
	public void useD() {
		for(UserDomain ud : d.selectUser()){
			System.out.println(ud.getName());
		}
	}
	
}
