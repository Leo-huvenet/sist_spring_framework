package kr.co.sist.service;

import java.util.List;

import kr.co.sist.dao.ExamDAO;
import kr.co.sist.domain.CpEmp1Domain;
import kr.co.sist.vo.CpEmp1VO;

public class ExamService {
	public int addCpEmp1(int data) {
		int rowCnt = 0;
		
		ExamDAO ed = new ExamDAO();
		rowCnt = ed.insertOne(data);
		
		return rowCnt;
	}

	public int addCpEmp1AllColumn(CpEmp1VO ceVO) {
		int rowCnt = 0;
		
		ExamDAO ed = new ExamDAO();
		rowCnt = ed.insertCpEmp1(ceVO);
		
		return rowCnt; 
	}
	
	public int modifyCpEmp1(CpEmp1VO ceVO) {
		int rowCnt = 0;
		
		ExamDAO ed = new ExamDAO();
		rowCnt = ed.updateCpEmp1(ceVO);
		
		return rowCnt; 
	}
	
	public int removeCpEmp2(int empno) {
		int rowCnt = 0;
		
		ExamDAO ed = new ExamDAO();
		rowCnt = ed.deleteCpEmp2(empno);
		
		return rowCnt; 
	}
	
	public CpEmp1Domain searchCpEmp1() {
		ExamDAO ed = new ExamDAO();
		CpEmp1Domain ce = ed.selectCpEmp1();
		return ce;
	}
	
	public List<Integer> searchCpEmp2() {
		ExamDAO ed = new ExamDAO();
		List<Integer> list = ed.selectCpEmp2();
		return list;
	}
	
}
