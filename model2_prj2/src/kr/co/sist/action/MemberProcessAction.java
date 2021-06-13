package kr.co.sist.action;

import java.io.IOException;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import kr.co.sist.service.UserService;
import kr.co.sist.vo.WebMemberVO;

public class MemberProcessAction implements Action {
	private String url;
	private boolean forwardFlag;

	@Override
    public void execute(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
            //파라메터 값받기
            //VO에 파라메터 값 추가
            WebMemberVO wmVO=new WebMemberVO(request.getParameter("member_id"),request.getParameter("member_pass"),request.getParameter("member_name"),
             request.getParameter("email")+"@"+request.getParameter("domain"),request.getParameter("birth"),request.getParameter("tel"));
		
		//업무로직의 사용
		UserService us = new UserService();
		try {
			us.addMember(wmVO);
			//이동할 페이지와 방식 설정
			url = "member/member_join_result.jsp";
			forwardFlag = true;
			request.setAttribute("addMemberFlag", true);// 정상적인 경우 성공
		} catch (SQLException e) {
			request.setAttribute("addMemberFlag", false);//비 정상적인 경우 실패
			e.printStackTrace();
		}catch (NullPointerException npe) {
			url = "http://localhost/model2_prj2/member/member_fail.html";		
			forwardFlag = false;
			npe.printStackTrace();
		}
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
