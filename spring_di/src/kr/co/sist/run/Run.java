package kr.co.sist.run;

import kr.co.sist.assembly.Assembly;
import kr.co.sist.domain.UserDomain;
import kr.co.sist.service.Service;

public class Run {

	public static void main(String[] args) {
		
		//Assembly객체를 사용하여 업무처리 객체를 얻는다.
		Assembly assembly = new Assembly();
		Service service = assembly.getBean();
		//업무처리 클래스가 제공하는 기능을 사용
		for(UserDomain ud: service.searchUser()) {
			System.out.println(ud.getName()+" / "+ud.getAddr());
		}
	}

}
