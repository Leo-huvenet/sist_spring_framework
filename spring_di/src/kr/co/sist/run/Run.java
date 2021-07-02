package kr.co.sist.run;

import kr.co.sist.assembly.Assembly;
import kr.co.sist.domain.UserDomain;
import kr.co.sist.service.Service;

public class Run {

	public static void main(String[] args) {
		
		//Assembly��ü�� ����Ͽ� ����ó�� ��ü�� ��´�.
		Assembly assembly = new Assembly();
		Service service = assembly.getBean();
		//����ó�� Ŭ������ �����ϴ� ����� ���
		for(UserDomain ud: service.searchUser()) {
			System.out.println(ud.getName()+" / "+ud.getAddr());
		}
	}

}
