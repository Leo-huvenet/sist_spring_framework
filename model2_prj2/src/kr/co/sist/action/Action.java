package kr.co.sist.action;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * 모든 Action클래스들이 해야 할 일들의 목록을 정의
 * 파라메터처리, 뷰페이지로 데이터전송, 뷰페이지명 설정, 관계유지, 페이지이동방식설정
 * @author user
 *
 */
public interface Action {
	
	/**
	 * 파라메터의 처리, 유효성검증, 관계유지객체의 사용
	 * @param request
	 * @param respone
	 * @throws ServletException
	 * @throws IOException
	 */
	public void execute(HttpServletRequest request, HttpServletResponse respone)
		throws ServletException,IOException;
	
	/**
	 * 이동방식의 설정
	 * @return true - forward, false - redirect
	 */
	public boolean isForward();
	
	/**
	 * 이동할페이지 URL
	 * @return
	 */
	public String moveURL();
}
