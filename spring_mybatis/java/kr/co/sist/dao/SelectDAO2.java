package kr.co.sist.dao;

import java.util.List;

import org.apache.ibatis.session.SqlSession;

import kr.co.sist.domain.BoardDomain;
import kr.co.sist.domain.EmpDomain;
import kr.co.sist.domain.JoinDomain;
import kr.co.sist.vo.BoardVO;
import kr.co.sist.vo.TableVO;



public class SelectDAO2 {
	
	public SelectDAO2() {
		org.apache.ibatis.logging.LogFactory.useLog4JLogging();
	}
	
	public int selectTotalCount() {
		int cnt =0;
		//1. MyBatis Handler 얻기
		SqlSession ss = MyBatisHandler.getInstance().getHandler();
		//2. id에 해당하는 쿼리를 찾아서 실행한 후 결과 얻기
		cnt = ss.selectOne("kr.co.sist.selectMapper2.selectTotalCount");
		if(ss != null) {
			ss.close();
		}
		return cnt;
	}
	
	/**
	 * subquery
	 * @param bVO
	 * @return
	 */
	public List<BoardDomain> selectSubquery(BoardVO bVO) {
		List<BoardDomain> list = null;
		//1. MyBatis Handler 얻기
		SqlSession ss = MyBatisHandler.getInstance().getHandler();
		//2. id에 해당하는 쿼리를 찾아서 실행한 후 결과 얻기
		list = ss.selectList("kr.co.sist.selectMapper2.subquery", bVO);
		if(ss != null) {
			ss.close();
		}
		
		return list;
	}
	
	/**
	 * Join
	 * @return
	 */
	public List<JoinDomain> selectJoin(){
		List<JoinDomain> list = null;
		
		//MyBatis Handler
		SqlSession ss = MyBatisHandler.getInstance().getHandler();
		//쿼리문을 수행
		list = ss.selectList("kr.co.sist.selectMapper2.join");
		//Handlder 연결 끊기
		if(ss != null) {
			ss.close();
		}
		
		return list;
	}
	
	public List<JoinDomain> selectSubqueryJoin(){
		List<JoinDomain> list = null;
		
		//MyBatis Handler
		SqlSession ss = MyBatisHandler.getInstance().getHandler();
		//쿼리문을 수행
		list = ss.selectList("kr.co.sist.selectMapper2.subquery_join");
		//Handlder 연결 끊기
		if(ss != null) {
			ss.close();
		}
		
		return list;
	}
	
	public List<EmpDomain> selectDynamicTable(TableVO tVO){
		List<EmpDomain> list = null;
		
		//MyBatis Handler
		SqlSession ss = MyBatisHandler.getInstance().getHandler();
		//쿼리문을 수행
		list = ss.selectList("kr.co.sist.selectMapper2.dynamicTab", tVO);
		//Handlder 연결 끊기
		if(ss != null) {
			ss.close();
		}
		
		return list;
	}
	
}
