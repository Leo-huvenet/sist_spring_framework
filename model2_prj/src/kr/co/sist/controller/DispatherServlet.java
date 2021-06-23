package kr.co.sist.controller;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import kr.co.sist.action.Action;
import kr.co.sist.action.MemberFormAction;
import kr.co.sist.action.MemberProcessAction;
import kr.co.sist.action.idDupAction;

@SuppressWarnings("serial")
public class DispatherServlet extends HttpServlet {
	
	private static Map<String, Action> map = new HashMap<String, Action>();
	
	
	/**
	 * init : 최초접속자에 의해 딱 한 번만 호출 되는 method
	 * 두번 째 접속자는 호출되지 않는다.
	 */
	@Override
	public void init() { 
		//Map을 설정
		map.put("M001", new MemberFormAction()); //회원가입 양식
		map.put("D001", new idDupAction()); //중복확인
		map.put("M002", new MemberProcessAction()); //회원가입 처리		
	}
       
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//GET방식으로 요청하면 post방식에서 처리
		doPost(request, response);
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//진입점에서 한글처리를 하면 모든 Action에서 한글 처리를 하지 않아도 된다.
		request.setCharacterEncoding("UTF-8");//POST방식의 Encoding(GET방식의 요청일 때에는 동작하지 않는다.)
		
		String cmd = request.getParameter("cmd");
		
		if(cmd == null) { //실행되는 Action을 선택하도록 만드는 외부 입력값 
			cmd = "M001"; //cmd가 없다면(최초호출, 외부에서 cmd를 훼손)회원가입 폼을 보여주는 cmd로 설정한다.
		}
		
		Action action = map.get(cmd); //입력된 cmd값에 해당하는 action의 자식클래스를 map에서 찾아 꺼내온다.
		
		if(action == null) { //cmd값을 외부에서 훼손하여 다른 값으로 입력했을 때
			action = map.get("M001"); // 메인화면으로 제공한다.
		}
		
		//꺼내온 action의 method호출(Override된 자식클래스의 method가 호출)
		action.execute(request, response);//파라미터처리, 유효성검증, 관계유지객체사용, service객체의 사용
		String url = action.moveURL();
		boolean isForward = action.isForward();
		
		move(request, response, url, isForward);
	}
	
	public void move(HttpServletRequest request, HttpServletResponse response, String url, boolean forwardFlag)
	throws ServletException, IOException {
		if(forwardFlag) { //forwardFlag로 이동
			RequestDispatcher rd = request.getRequestDispatcher(url);
			rd.forward(request, response);
		}else { //redirect로 이동
			response.sendRedirect(url);
		}
	}//move

}//class
