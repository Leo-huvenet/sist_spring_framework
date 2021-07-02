package kr.co.sist.di.run;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import kr.co.sist.di.DependencyService;

public class RunAutowired {

	public static void main(String[] args) {
		
		//1. Spring Container 생성
		ApplicationContext ac = new ClassPathXmlApplicationContext("kr/co/sist/di/run/appContext2.xml");
		//2. bean 얻기( 의존성 주입받은 객체 얻기 )
		DependencyService ds = ac.getBean(DependencyService.class);
		//3. bean 사용
		System.out.println(ds.searchList());
		//4. Spring Container 닫기
		if( ac != null) {
			((ClassPathXmlApplicationContext)ac).close();
		}
	}

}
