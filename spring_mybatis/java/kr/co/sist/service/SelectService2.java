package kr.co.sist.service;

import java.util.List;

import kr.co.sist.dao.SelectDAO2;
import kr.co.sist.domain.BoardDomain;
import kr.co.sist.domain.EmpDomain;
import kr.co.sist.domain.JoinDomain;
import kr.co.sist.vo.BoardVO;
import kr.co.sist.vo.TableVO;


public class SelectService2 {
	
	/**
	 * �� �Խñ� ��
	 * @return
	 */
	public int totalCount() {
		SelectDAO2 sd2 = new SelectDAO2();
		return sd2.selectTotalCount();
	}
	
	/**
	 * �� ȸ�鿡 ������ �Խù��� �� 
	 * @return
	 */
	public int pageScale() {
		int pageScale = 10;
		return pageScale;
	}
	
	/**
	 * ��ü �Խù��� �����ֱ� ���� �ʿ��� �� ���
	 * @return
	 */
	public int totalPage(int totalCount, int pageScale) {
		/*
		 * int totalPage = totalCount() / pageScale(); 
		 * if(totalCount() % pageScale() !=0) 
		 * { totalPage++; }
		 */
		int totalPage = 0;
		totalPage = (int)Math.ceil( totalCount / (double)pageScale);
		
		return totalPage;
	}
	
	/**
	 * ���۹�ȣ(1~10)
	 * @return
	 */
	public int startNum(int currentPage, int pageScale) {
		int startNum = 0;
		startNum = currentPage*pageScale-pageScale+1;
		
		return startNum;
	}
	
	/**
	 * ����ȣ
	 * @return
	 */
	public int endNum(int startNum, int pageScale) {
		int endNum = 0;
		endNum = startNum + pageScale-1;
		
		return endNum;
	}
	
	public List<BoardDomain> searchList(BoardVO bVO) {
		SelectDAO2 sDAO = new SelectDAO2();
		List<BoardDomain> list = sDAO.selectSubquery(bVO);
		
		return list;
	}//BoardDomain
	
	public List<JoinDomain> searchJoin(){
		SelectDAO2 sDAO = new SelectDAO2();
		List<JoinDomain> list = sDAO.selectJoin();
		
		return list;
	}
	
	public List<JoinDomain> searchSubqueryJoin(){
		SelectDAO2 sDAO = new SelectDAO2();
		List<JoinDomain> list = sDAO.selectSubqueryJoin();
		
		return list;
	}
	
	public List<EmpDomain> searchDynamicTab(TableVO tVO){
		SelectDAO2 sDAO = new SelectDAO2();
		List<EmpDomain> list = sDAO.selectDynamicTable(tVO);
		
		return list;
	}
	
}
