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
	 * 	System.out.println("AOP : 업무로직과 분리된 공통로직"); 
	 * }
	 */
		
		@Before("execution( * insert(String) )")
		public void beforeAdvice() {
			System.out.println("AOP : 업무로직과 분리된 공통로직");
		}
		
		@Before("execution( void before1() )")
		public void before1Advice() {
			System.out.println("AOP : before1 Advice");
		}
		
		@Before("execution( void before2(int) )")
		public void before2Advice(JoinPoint jp) {
			System.out.println("AOP : before2 Advice");
			//JoinPoint를 사용하면 parameter를 처리할 수 있다.
			Object[] obj = jp.getArgs();
			System.out.println("매개변수 갯수 : "+obj.length);
			Integer paramAge = (Integer) obj[0];
			System.out.println("매개변수 입력 값 : "+paramAge);
			org.aspectj.lang.Signature sig = jp.getSignature();
			System.out.println(sig.getName()+" / "+sig.getModifiers());
		}
		
		
}
