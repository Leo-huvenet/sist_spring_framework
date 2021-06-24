package kr.co.sist.service;

import java.util.Arrays;
import java.util.List;

import kr.co.sist.dao.SelectDAO3;
import kr.co.sist.domain.EmpDomain;
import kr.co.sist.vo.DeptVO;
import kr.co.sist.vo.MgrVO;



public class SelectService3 {
		
	public List<EmpDomain> searchDynamicIf(MgrVO mVO){
		SelectDAO3 sDAO = new SelectDAO3();
		List<EmpDomain> list = sDAO.selectDynamicIf(mVO);
		
		return list;
	}
	
	public List<EmpDomain> searchDynamicChoose(DeptVO dVO){
		SelectDAO3 sDAO = new SelectDAO3();
		List<EmpDomain> list = sDAO.selectDynamicChoose(dVO);
		
		return list;
	}
	
	public List<String> searchDynamicTrim(int flag){
		SelectDAO3 sDAO = new SelectDAO3();
		List<String> list = sDAO.selectDynamicTrim(flag);
		
		return list;
	}
	
	public List<EmpDomain> searchDynamicForeach(String[] deptno){
		SelectDAO3 sDAO = new SelectDAO3();
		
		int[] arr = new int[ deptno.length ];
		
		for(int i = 0; i < deptno.length; i++) {
			arr[i] = Integer.parseInt(deptno[i]);
		}
		
		List<EmpDomain> list = sDAO.selectDynamicForeach(arr);
		
		return list;
	}
	
}
