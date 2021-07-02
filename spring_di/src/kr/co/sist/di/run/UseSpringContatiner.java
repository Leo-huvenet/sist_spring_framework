package kr.co.sist.di.run;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import kr.co.sist.domain.UserDomain;
import kr.co.sist.service.Service;
import kr.co.sist.service.ServiceImpl;

public class UseSpringContatiner {

	public static void main(String[] args) {

		//1. 설정파일을 입력하여 Spring Container를 생성		
		//설정파일 안에 정의된 <bean>들은 사용유무에 상관없이 모두 생성된다.
		ApplicationContext ac = new ClassPathXmlApplicationContext("kr/co/sist/di/run/applicationContext.xml");
		//2. 서비스 객체를 얻는다.(<bean>에 정의된 객체는 모두 얻을 수 있다)
		Service service = ac.getBean(ServiceImpl.class);
		//3. method 호출아여 업무 처리
		List<UserDomain> list = service.searchUser();
		for(UserDomain ud : list) {
			System.out.println(ud.getName()+" / "+ud.getAddr());
		}
		
		//Spring Container의 사용이 종료 되었다면 메모리 누수의 이슈가 있어서 반드시 닫아준다.
		if(ac != null) {
			//자식으로 다운 캐스팅 후 close();
			((ClassPathXmlApplicationContext)ac).close();
		}
	}

}
