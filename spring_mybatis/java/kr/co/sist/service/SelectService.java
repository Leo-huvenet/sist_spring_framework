package kr.co.sist.service;

import java.util.List;

import kr.co.sist.dao.SelectDAO;
import kr.co.sist.domain.DeptDomain;
import kr.co.sist.domain.EmpDomain;

public class SelectService {
	
	public String singleColumn() {
		SelectDAO sd = new SelectDAO();
		return sd.selectSingleColumn();
	}
	
	public DeptDomain multiColumn() {
		SelectDAO sd = new SelectDAO();
		return sd.selectMultiColumn();
	}
	
	public List<String> singleColumnMultiRow() {
		SelectDAO sd = new SelectDAO();
		return sd.selectSingleColumnMultiRow();
	}
	
	public List<EmpDomain> multiColumnMultiRow() {
		SelectDAO sd = new SelectDAO();
		return sd.selectMultiColumnMultiRow();
	}
	
	public List<EmpDomain> greaterThan(int sal) {
		SelectDAO sd = new SelectDAO();
		return sd.selectGreaterThan( sal );
	}
	
	public List<EmpDomain> lessThan(int sal) {
		SelectDAO sd = new SelectDAO();
		return sd.selectLessThan( sal );
	}
}
