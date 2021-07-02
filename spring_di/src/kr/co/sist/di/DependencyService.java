package kr.co.sist.di;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class DependencyService {
	@Autowired(required = false)
	private DependencyDAO pDAO; //������ ���Թ��� class
	
	//@Autowired�� ���� ������ ���Թޱ����� �����ڰ� �ʿ����.
	
	public List<String> searchList(){
		//������ ���Թ��� ��ü ���
		return pDAO.selectList();
	}//searchList
}
