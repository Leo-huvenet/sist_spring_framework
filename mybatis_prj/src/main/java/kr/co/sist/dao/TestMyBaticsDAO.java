package kr.co.sist.dao;

import java.io.IOException;
import java.io.Reader;
import java.util.List;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import kr.co.sist.domain.EmpDomain;
//import kr.co.sist.vo.CpEmp1VO;

public class TestMyBaticsDAO {

	public static void main(String[] args) {
		
		try {
			//1. 설정 XML을 연결			
			Reader reader = Resources.getResourceAsReader("kr/co/sist/dao/mybatis-config.xml");
			//2. MyBatis Framework생성
			SqlSessionFactory ssf = new SqlSessionFactoryBuilder().build(reader);
			//3. MyBatis Handler 얻기
			SqlSession ss = ssf.openSession();
			//4. MyBatis Handler를 사용한 쿼리문 수행
			/*
			 * CpEmp1VO ce = new CpEmp1VO(11, 10, 3000, "진재혁", "사원"); 
			 * int cnt = ss.insert("insertCpEmp1", ce); if(cnt == 1) { ss.commit();}//transaction을 완료
			 * System.out.println(cnt+"건 추가");
			 */
			List<EmpDomain> list = ss.selectList("kr.co.sist.examMapper.selectEmp" ,30);
			if(list.isEmpty()) {
				System.out.println("부서가 존재하지 않거나, 부서의 사원이 없습니다.");
			}
			
			for(EmpDomain ed : list) {
				System.out.println(ed.getEmpno()+" / "+ed.getEname()+" / "+
						ed.getJob()+" / "+ed.getSal()+" / "+ed.getHiredate());
			}
			
			//MyBatis Handler 사용이 종료되었다면 끊어 준다.
			if(ss != null) {
				ss.close();
			}
		} catch (IOException e) {
			e.printStackTrace();
		}	
	}
}
