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
		ss.selectOne("kr.co.sist.selectMapper3.insertProc", piVO); //piVO�� MyBatis�� ���޵Ǿ�
		//Procedure�� ȣ���Ͽ� ������ ����� �����ϰԵȴ�.
		
		/* cnt = piVO.getRow_cnt(); */
		
		if(ss != null) { ss.close(); }
		
	}
	
	public static void main(String[] args) {
		SelectDAO4 s = new SelectDAO4();
		ProcedureInsertVO pi = new ProcedureInsertVO();
		pi.setDeptno(1213);
		pi.setEname("�����");
		pi.setDeptno(10);
		pi.setJob("���");
		
		/* System.out.println(s.insertProc(pi)); */
		
	}
	
}
