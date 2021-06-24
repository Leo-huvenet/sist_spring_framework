package kr.co.sist.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import kr.co.sist.service.ExamService;

import static org.springframework.web.bind.annotation.RequestMethod.GET;
import static org.springframework.web.bind.annotation.RequestMethod.POST;

@Controller
public class MainController {
	
	@RequestMapping(value = "/index.do", method = { GET,POST })
	public String mainPage(Model model) {
		
		ExamService es = new ExamService();
		model.addAttribute("empData", es.searchCpEmp1());
		model.addAttribute("empData1", es.searchCpEmp2());
		
		
		return "index";
	}
	
	
}
