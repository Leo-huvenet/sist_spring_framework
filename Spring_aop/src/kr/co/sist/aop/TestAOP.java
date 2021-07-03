package kr.co.sist.aop;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;



@Component
@Aspect
public class TestAOP {
		
	/*
	 * @Before("execution( * insert(String) )") 
	 * public void beforeAdvice() {
	 * 	System.out.println("AOP : ���������� �и��� �������"); 
	 * }
	 */
		
		@Before("execution( * insert(String) )")
		public void beforeAdvice() {
			System.out.println("AOP : ���������� �и��� �������");
		}
		
		@Before("execution( void before1() )")
		public void before1Advice() {
			System.out.println("AOP : before1 Advice");
		}
		
		@Before("execution( void before2(int) )")
		public void before2Advice(JoinPoint jp) {
			System.out.println("AOP : before2 Advice");
			//JoinPoint�� ����ϸ� parameter�� ó���� �� �ִ�.
			Object[] obj = jp.getArgs();
			System.out.println("�Ű����� ���� : "+obj.length);
			Integer paramAge = (Integer) obj[0];
			System.out.println("�Ű����� �Է� �� : "+paramAge);
			org.aspectj.lang.Signature sig = jp.getSignature();
			System.out.println(sig.getName()+" / "+sig.getModifiers());
		}
		
		
}
