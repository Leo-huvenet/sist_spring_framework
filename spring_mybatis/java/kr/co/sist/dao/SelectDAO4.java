package kr.co.sist.dao;



import org.apache.ibatis.session.SqlSession;
import kr.co.sist.vo.ProcedureInsertVO;





public class SelectDAO4 {
	
	public SelectDAO4() {
		org.apache.ibatis.logging.LogFactory.useLog4JLogging();
	}
	
	public void insertProc(ProcedureInsertVO piVO) {
		/* int cnt = 0; */
		
		SqlSession ss = MyBatisHandler.getInstance().getHandler();
		ss.selectOne("kr.co.sist.selectMapper3.insertProc", piVO); //piVO가 MyBatis로 전달되어
		//Procedure를 호출하여 실행한 결과를 저장하게된다.
		
		/* cnt = piVO.getRow_cnt(); */
		
		if(ss != null) { ss.close(); }
		
	}
	
	public static void main(String[] args) {
		SelectDAO4 s = new SelectDAO4();
		ProcedureInsertVO pi = new ProcedureInsertVO();
		pi.setDeptno(1213);
		pi.setEname("유경우");
		pi.setDeptno(10);
		pi.setJob("사원");
		
		/* System.out.println(s.insertProc(pi)); */
		
	}
	
}
