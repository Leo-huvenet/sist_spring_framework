package kr.co.sist.run;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import kr.co.sist.service.TestService;

public class TestRun {

	public static void main(String[] args) {
		//1. Spring Container ����
		ApplicationContext ac = new ClassPathXmlApplicationContext("kr/co/sist/run/appContext.xml");
		//2. been���
		TestService ts = ac.getBean(TestService.class);
		//3. ����ó�� method ȣ��
		//ts.add("������");
		ts.collBefore1();; //�Ű����� ���� ��ȯ�� ���� method ���� �� Adviceȣ��
		ts.collBefore2(28);
		System.out.println("----------------------------------");
		ts.callAfterRetrun("������");
		
		if(ac != null) {
			((ClassPathXmlApplicationContext)ac).close();
		}
	}

}
