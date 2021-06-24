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
	 * 총 게시글 수
	 * @return
	 */
	public int totalCount() {
		SelectDAO2 sd2 = new SelectDAO2();
		return sd2.selectTotalCount();
	}
	
	/**
	 * 한 회면에 보여줄 게시물의 수 
	 * @return
	 */
	public int pageScale() {
		int pageScale = 10;
		return pageScale;
	}
	
	/**
	 * 전체 게시물을 보여주기 위해 필요한 총 장수
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
	 * 시작번호(1~10)
	 * @return
	 */
	public int startNum(int currentPage, int pageScale) {
		int startNum = 0;
		startNum = currentPage*pageScale-pageScale+1;
		
		return startNum;
	}
	
	/**
	 * 끝번호
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
