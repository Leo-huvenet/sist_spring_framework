package kr.co.sist.di;


/**
 *	기본형 데이터형과 String을 매개변수로 선언한 Injection
 * @author user
 */
public class TestInjection2 {
	
	
	private int i;
	private String s;
	
	public TestInjection2(int i) {
		this.i = i;
		System.out.println("기본형 데이터형을 의존성주입받는 생성자");
	}
	
	public TestInjection2(String s) {
		this.s = s;
		System.out.println("java.lang.String을 의존성주입받는 생성자");
	}
	
	public void printI() {
		System.out.println("의존성 주입받은 값 : "+ i);
	}
	
	public void printS() {
		System.out.println("의존성 주입받은 값 : "+ s);
	}
	
}
