package kr.co.sist.action;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class MemberFormAction implements Action {
	private String url;
	private boolean forwardFlag;

	@Override
	public void execute(HttpServletRequest request, HttpServletResponse respone) throws ServletException, IOException {
		url = "member/member_info.jsp";
		forwardFlag = true;
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
