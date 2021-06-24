package kr.co.sist.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import kr.co.sist.service.ExamService;
import kr.co.sist.vo.CpEmp1VO;
@Controller
public class DmlController {
	
	@RequestMapping(value = "/insert/one_value.do", method = RequestMethod.GET)
	public String insertOneValue(@RequestParam(defaultValue = "0")int data, Model model) {

		ExamService es = new ExamService();
		model.addAttribute("cnt", es.addCpEmp1(data));
		
		return "insert/insert_one_value";
	}
	
	@RequestMapping(value = "/insert/cp_emp_add.do", method = RequestMethod.POST)
	public String addCpEmp1(CpEmp1VO ceVO, Model model) {
		
		ExamService es = new ExamService();
		model.addAttribute("cnt", es.addCpEmp1AllColumn(ceVO));
		
		return "insert/cp_emp_result";
	}
	
	@RequestMapping(value = "/update/cp_emp_modify.do", method = RequestMethod.POST)
	public String modifyCpEmp1(CpEmp1VO ceVO, Model model) {
		
		ExamService es = new ExamService();
		model.addAttribute("cnt", es.modifyCpEmp1(ceVO));
		
		return "update/cp_emp_result";
	}
	
	@RequestMapping(value = "/remove/remove_cp_emp.do", method = RequestMethod.GET)
	public String removeCpEmp2(int empno, Model model) {
		
		ExamService es = new ExamService();
		model.addAttribute("cnt", es.removeCpEmp2(empno));
		
		return "remove/cp_emp_result";
	}
}
