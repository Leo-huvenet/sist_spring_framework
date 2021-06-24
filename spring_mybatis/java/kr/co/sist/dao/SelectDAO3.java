package kr.co.sist.dao;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import kr.co.sist.domain.EmpDomain;
import kr.co.sist.vo.DeptVO;
import kr.co.sist.vo.MgrVO;
import kr.co.sist.vo.UpdateVO;




public class SelectDAO3 {
	
	public SelectDAO3() {
		org.apache.ibatis.logging.LogFactory.useLog4JLogging();
	}
	
	/**
	 * if
	 * @param mVO
	 * @return
	 */
	public List<EmpDomain> selectDynamicIf(MgrVO mVO){
		List<EmpDomain> list = null;
		
		//1. MyBatis Handler 얻기 
		SqlSession ss = MyBatisHandler.getInstance().getHandler();
		//2. 쿼리문 수행 값 받기
		list = ss.selectList("kr.co.sist.selectMapper2.dynamic_if", mVO);
		//3. Handler 종료
		if( ss != null ) { 
			ss.close();
		}
		return list;
	}
	
	/**
	 * choose
	 * @param mVO
	 * @return
	 */
	public List<EmpDomain> selectDynamicChoose(DeptVO dVO){
		List<EmpDomain> list = null;
		
		//1. MyBatis Handler 얻기 
		SqlSession ss = MyBatisHandler.getInstance().getHandler();
		//2. 쿼리문 수행 값 받기
		list = ss.selectList("kr.co.sist.selectMapper2.dynamic_choose", dVO);
		//3. Handler 종료
		if( ss != null ) { 
			ss.close();
		}
		return list;
	}
	
	/**
	 * trim
	 * @param dVO
	 * @return
	 */
	public List<String> selectDynamicTrim(int flag){//MySql Parameter 값이 하나라면
		//getter method가 없는 단일형(기본형,String)또는 VO 모두사용가능하다.
		List<String> list = null;
		
		//1. MyBatis Handler 얻기 
		SqlSession ss = MyBatisHandler.getInstance().getHandler();
		//2. 쿼리문 수행 값 받기
		list = ss.selectList("kr.co.sist.selectMapper2.dynamic_trim",  flag);
		//3. Handler 종료
		if( ss != null ) { 
			ss.close();
		}
		return list;
	}
	
	public int updateDynamic(UpdateVO uVO) {
		int cnt = 0;
		//1. MyBatis Handler 얻기 
		SqlSession ss = MyBatisHandler.getInstance().getHandler();
		//2. 쿼리문 수행 값 받기
		cnt = ss.update("kr.co.sist.selectMapper2.dynamic_trim2",  uVO);
		
		ss.commit();
		
		//3. Handler 종료
		if( ss != null ) { 
			ss.close();
		}
		return cnt;
	}
	
	public List<EmpDomain> selectDynamicForeach(int[] deptArr){
		List<EmpDomain> list = null;
		
		SqlSession ss = MyBatisHandler.getInstance().getHandler();
		list = ss.selectList("kr.co.sist.selectMapper2.dynamic_foreach_arrary", deptArr);
		
		if(ss != null) {
			ss.close();
		}
		
		return list;
	}
	
	public List<EmpDomain> selectDynamicForeach(List<Integer> listparam){
		List<EmpDomain> list = null;
		
		SqlSession ss = MyBatisHandler.getInstance().getHandler();
		list = ss.selectList("kr.co.sist.selectMapper2.dynamic_foreach_list", listparam);
		
		if(ss != null) {
			ss.close();
		}
		
		return list;
	}
}
