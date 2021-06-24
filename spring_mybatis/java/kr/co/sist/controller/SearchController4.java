package kr.co.sist.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import kr.co.sist.service.SelectService4;
import kr.co.sist.vo.ProcedureInsertVO;


@Controller
public class SearchController4 {
	
	@RequestMapping(value = "/select/procedure_insert.do",method = { RequestMethod.GET, RequestMethod.POST })
	   public String useProcInsert(ProcedureInsertVO piVO, Model model) {
			
			int cnt = 0;
			if(piVO.getEname() != null) {
				SelectService4 ss4 = new SelectService4();
				ss4.addProcedure(piVO);
				cnt = piVO.getRow_cnt();
			}
			model.addAttribute("cnt", cnt);
			
			return "select4/proc_insert";
	   }
	
} 
