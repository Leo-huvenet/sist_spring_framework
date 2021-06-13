package kr.co.sist.action;

import java.io.IOException;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import kr.co.sist.dao.UserDAO;
import kr.co.sist.service.UserService;

public class idDupAction implements Action {
	private String url;
	private boolean forwardFlag;

	@Override
	public void execute(HttpServletRequest request, HttpServletResponse respone) throws ServletException, IOException {
		String id = request.getParameter("id"); //파라미터를 받고
		
			UserService us = new UserService(); //업무로직을 처리하는 클래스를 생성
			boolean flag = us.idDupCheck(id); //업무로직을 사용한 후 결과를 받는다.
			request.setAttribute("idFlag", flag); //View에서 사용할 값
			forwardFlag = true; //이동방식설정
			url = "member/id_dup.jsp"; //이동할 페이지를 설정		
	}

	@Override
	public boolean isForward() {
		return forwardFlag;
	}

	@Override
	public String moveURL() {
		return url;
	}

}
