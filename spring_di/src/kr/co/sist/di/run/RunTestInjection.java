package kr.co.sist.di.run;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import kr.co.sist.di.FactoryMethod;
import kr.co.sist.di.TestInjection;
import kr.co.sist.di.TestInjection2;
import kr.co.sist.di.TestInjection3;

public class RunTestInjection {
	
	public static void main(String[] arg) {
		//1. Spring Container 생성
		ApplicationContext ac = new ClassPathXmlApplicationContext("kr/co/sist/di/run/appContext.xml");
		//2. 객체 얻기
		//TestInjection.class로 ti와 ti1의 bean이 대상이되며 어떤 객체를 찾아야 할지 모르게된다.
		// getBean("아이디", reflect );
		System.out.println("------------------- 생성자 의존성 주입 -------------------");
		TestInjection ti = ac.getBean("ti", TestInjection.class);
		//3. method 호출
		ti.useD();
		System.out.println("------------------- method 의존성 주입 -------------------");
		TestInjection ti1 = ac.getBean("ti1", TestInjection.class);
		ti1.useD();
		
		System.out.println("------------------- 기본형 데이터형 의존성 주입 -------------------");
		TestInjection2 ti2 = ac.getBean("ti2", TestInjection2.class);
		ti2.printI();
		
		System.out.println("------------------- java.lang.String 의존성 주입 -------------------");
		TestInjection2 ti2_1 = ac.getBean("ti2_1", TestInjection2.class);
		ti2_1.printS();
		
		System.out.println("------------------- List 의존성 주입 -------------------");
		TestInjection3 ti3List = ac.getBean("ti3List", TestInjection3.class);
		ti3List.useList();
		
		System.out.println("------------------- Map 의존성 주입 -------------------");
		TestInjection3 ti3Map = ac.getBean("ti3Map", TestInjection3.class);
		ti3Map.useMap();
		
		System.out.println("------------------- Singleton method 의존성 주입 -------------------");
		FactoryMethod fm = ac.getBean("fm",FactoryMethod.class);
		
		if(ac != null) {
			((ClassPathXmlApplicationContext)ac).close();
		}
	}
}
