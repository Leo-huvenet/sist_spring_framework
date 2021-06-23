package kr.co.sist.service;

import java.security.NoSuchAlgorithmException;
import java.sql.SQLException;

import kr.co.sist.dao.UserDAO;
import kr.co.sist.util.cipher.DataEncrypt;
import kr.co.sist.vo.WebMemberVO;

/**
 * Business Logic 처리 (process)
 * @author user
 *	
 */
public class UserService {
	
	/**
	 * 입력된 아이디가 사용중인지 체크
	 * @param id
	 * @return
	 * @throws SQLException
	 */
	public boolean idDupCheck(String id){
		boolean flag = false;
		//업무로직을 구현 : 입력된 아이디를 사용하여 조회한 결과를 boolean으로 만드는 일
		UserDAO ud = new UserDAO();
		
		try {
			flag = "".equals(ud.selectId(id));
		} catch (SQLException e) {
			e.printStackTrace();
		}//end catch
		
		return flag;
	}
	
	/**
	 * 입력된 VO의 값에서 비밀번호를 SHA로 변환한 후 DBMS에 추가하는 일
	 * @param wmVO
	 */
	public void addMember(WebMemberVO wmVO) throws NullPointerException, SQLException{
		//업무로직 : 비밀번호를 알 수 없도록 변경한다.
		try {
			wmVO.setPass(DataEncrypt.messageDigest("SHA-1",wmVO.getPass()));
			UserDAO ud = new UserDAO();
			ud.insertMember(wmVO);
		} catch (NoSuchAlgorithmException e) {
			e.printStackTrace();
		
		}
	}
}//class
