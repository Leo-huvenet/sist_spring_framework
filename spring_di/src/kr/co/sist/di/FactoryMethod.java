package kr.co.sist.di;


/**
 *	Singleton pattern이 적용된 클래스
 * @author user
 */
public class FactoryMethod {
	private static FactoryMethod fm;
	
	private FactoryMethod() { //생성자 private
	}
	
	public static FactoryMethod getInstance() {
		if(fm == null) {
			fm = new FactoryMethod();
		}//end if
		System.out.println("getInstance method가 factory-method로 호출되었습니다.");
		return fm;
	}
}
