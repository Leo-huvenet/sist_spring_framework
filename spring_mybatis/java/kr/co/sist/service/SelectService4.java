package kr.co.sist.service;

import java.util.Arrays;
import java.util.List;

import kr.co.sist.dao.SelectDAO3;
import kr.co.sist.dao.SelectDAO4;
import kr.co.sist.domain.EmpDomain;
import kr.co.sist.vo.DeptVO;
import kr.co.sist.vo.MgrVO;
import kr.co.sist.vo.ProcedureInsertVO;



public class SelectService4 {
		
	public void addProcedure(ProcedureInsertVO piVO) {
		
		SelectDAO4 sd4 = new SelectDAO4();
		sd4.insertProc(piVO);//piVO��ü�� �ϳ��̹Ƿ� �Էµ� ��ü�� ���� �����ȴ�.

	}
		
	
	
}
