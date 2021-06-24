package kr.co.sist.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import kr.co.sist.service.SelectService;

@Controller
public class SearchController {
	
	@RequestMapping(value = "/select/select_menu.do", method = { RequestMethod.GET, RequestMethod.POST })
	public String selectMenu() {
		
		return "select/select_menu";
	}
	
	@RequestMapping(value = "/select/singleColumn.do", method =  RequestMethod.GET )
	public String singleColumn(Model model) {
		SelectService ss= new SelectService();
		model.addAttribute("dname", ss.singleColumn());
		
		return "select/single_column";
	}
	
	@RequestMapping(value = "/select/multiColumn.do", method =  RequestMethod.GET )
	public String multiColumn(Model model) {
		SelectService ss= new SelectService();
		model.addAttribute("deptInfo", ss.multiColumn());
		
		return "select/multi_column";
	}
	
	@RequestMapping(value = "/select/scmr.do", method =  RequestMethod.GET )
	public String singleColumnMultiRow(Model model) {
		SelectService ss= new SelectService();
		model.addAttribute("enameList", ss.singleColumnMultiRow());
		
		return "select/scmr";
	}
	
	@RequestMapping(value = "/select/mcmr.do", method =  RequestMethod.GET )
	public String multiColumnMultiRow(Model model) {
		SelectService ss= new SelectService();
		model.addAttribute("empList", ss.multiColumnMultiRow());
		
		return "select/mcmr";
	}
	
	@RequestMapping(value = "/select/salFrm.do", method =  RequestMethod.GET )
	public String salFrm(Model model) {
		
		return "select/sal_form";
	}
	
	@RequestMapping(value = "/select/greater_than.do", method =  RequestMethod.GET )
	public String greaterThan(@RequestParam(defaultValue = "0") int sal, Model model) {
		SelectService ss= new SelectService();
		model.addAttribute("empList", ss.greaterThan(sal));
		
		return "select/mcmr";
	}
	
	@RequestMapping(value = "/select/less_than.do", method =  RequestMethod.GET )
	public String lessThan(@RequestParam(defaultValue = "0") int sal, Model model) {
		SelectService ss= new SelectService();
		model.addAttribute("empList", ss.lessThan(sal));
		
		return "select/mcmr";
	}
} 
