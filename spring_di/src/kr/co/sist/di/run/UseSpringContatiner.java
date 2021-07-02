package kr.co.sist.di.run;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import kr.co.sist.domain.UserDomain;
import kr.co.sist.service.Service;
import kr.co.sist.service.ServiceImpl;

public class UseSpringContatiner {

	public static void main(String[] args) {

		//1. ���������� �Է��Ͽ� Spring Container�� ����		
		//�������� �ȿ� ���ǵ� <bean>���� ��������� ������� ��� �����ȴ�.
		ApplicationContext ac = new ClassPathXmlApplicationContext("kr/co/sist/di/run/applicationContext.xml");
		//2. ���� ��ü�� ��´�.(<bean>�� ���ǵ� ��ü�� ��� ���� �� �ִ�)
		Service service = ac.getBean(ServiceImpl.class);
		//3. method ȣ��ƿ� ���� ó��
		List<UserDomain> list = service.searchUser();
		for(UserDomain ud : list) {
			System.out.println(ud.getName()+" / "+ud.getAddr());
		}
		
		//Spring Container�� ����� ���� �Ǿ��ٸ� �޸� ������ �̽��� �־ �ݵ�� �ݾ��ش�.
		if(ac != null) {
			//�ڽ����� �ٿ� ĳ���� �� close();
			((ClassPathXmlApplicationContext)ac).close();
		}
	}

}
