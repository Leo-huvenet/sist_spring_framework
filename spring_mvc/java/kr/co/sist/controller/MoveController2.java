package kr.co.sist.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import kr.co.sist.service.MainService;

@Controller
//@RequestMapping : 공통으로 요청처리 앞에 이름을 사용해야한다면
public class MoveController2 {
	
	//View 페이지명과 데이터를 한번에 관리하는 객체 ModelAndeView 반환
	@RequestMapping(value = "/day0614/use_mav.do", method = RequestMethod.GET)
	public ModelAndView useMav() {
		//ModelAndView 생성
		ModelAndView mav = new ModelAndView();
		//view페이지명을 설정
		mav.setViewName("day0614/use_mav");
		
		//Business Logic 구현하는 클래스를 객채화
		MainService ms = new MainService();
		
		//View페이지에서 사용할 데이터넣기
		mav.addObject("img", ms.mainImgList());
		mav.addObject("notice", ms.noticeList());
		
		return mav;
	}
	
	@RequestMapping(value = "/day0614/use_redirect.do", method = RequestMethod.GET)
	public String useRedirect() {
		
		
		//return "redirect:../day0611/call.jsp"; //상대경로
		return "redirect:http://localhost/sist/day0611/call.jsp"; //URL
	}
}
