package kr.co.sist.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import kr.co.sist.service.IncludeService;

@Controller
public class IncludeController {
	
	@RequestMapping("/day0615/include.do") //value�� method�� ������ �� �ִ�.
	public String request(Model model) {
		
		IncludeService is = new IncludeService();
		model.addAttribute("list", is.searchNick());
		
		return "day0615/views_include";
	}
	
	@RequestMapping("/day0615/use_include.do") //value�� method�� ������ �� �ִ�.
	public String include() {
		
		return "day0615/use_include";
	}
}
