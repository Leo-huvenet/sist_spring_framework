package kr.co.sist.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import kr.co.sist.vo.ParamVO;

@Controller
public class PostController {
	
	@RequestMapping(value = "/day0615/post_form.do", method= RequestMethod.GET)
	public String form(){
		return "day0615/input_form";
	}
	
	@RequestMapping(value = "/day0615/post_req.do", method = RequestMethod.POST)
	public String frmProcess(ParamVO pVO){
		
		System.out.println(pVO);
		return "day0615/form_process";
	}
}
