package kr.co.sist.controller;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import kr.co.sist.domain.EmpDomain;
import kr.co.sist.service.SelectService3;
import kr.co.sist.vo.DeptVO;
import kr.co.sist.vo.MgrVO;


@Controller
public class SearchController3 {
	
	@RequestMapping(value = "/select/dynamic_if.do",method = { RequestMethod.GET, RequestMethod.POST })
	   public String useDynamicIf(@RequestParam(defaultValue = "1")int mgr, Model model) {
			MgrVO mVO = new MgrVO();
			mVO.setMgr(mgr);
			
			SelectService3 ss3 = new SelectService3();
			List<EmpDomain> list = ss3.searchDynamicIf(mVO);
			
			model.addAttribute("empList",list);
			
			return "select3/dynamic_if";
	   }
	
	@RequestMapping(value = "/select/dynamic_choose.do",method = { RequestMethod.GET, RequestMethod.POST })
	   public String useDynamicChoose(@RequestParam(defaultValue = "1")int deptno, Model model) {
			DeptVO dVO = new DeptVO();
			dVO.setDeptno(deptno);
			
			SelectService3 ss3 = new SelectService3();
			List<EmpDomain> list = ss3.searchDynamicChoose(dVO);
			
			model.addAttribute("empList",list);
			
			return "select3/dynamic_choose";
	   }
	
	@RequestMapping(value = "/select/dynamic_trim.do",method = { RequestMethod.GET, RequestMethod.POST })
	   public String useDynamicTrim(@RequestParam(defaultValue = "1")int flag, Model model) {
			
			SelectService3 ss3 = new SelectService3();
			List<String> list = ss3.searchDynamicTrim(flag);
			
			model.addAttribute("enameList",list);
			
			return "select3/dynamic_trim";
	   }
	
	@RequestMapping(value = "/select/dynamic_foreach.do",method = { RequestMethod.GET, RequestMethod.POST })
	   public String useDynamicForeach(String[] deptno, Model model) {
			
			SelectService3 ss3 = new SelectService3();
		
			if(deptno != null) {
				List<EmpDomain> list = ss3.searchDynamicForeach(deptno);
				
				model.addAttribute("empList",list);
			}
			
			
			return "select3/dynamic_foreach";
	   }
} 
