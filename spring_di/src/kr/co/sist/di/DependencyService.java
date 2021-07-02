package kr.co.sist.di;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class DependencyService {
	@Autowired(required = false)
	private DependencyDAO pDAO; //의존성 주입받을 class
	
	//@Autowired가 들어가면 의존성 주입받기위한 생성자가 필요없다.
	
	public List<String> searchList(){
		//의존성 주입받은 객체 사용
		return pDAO.selectList();
	}//searchList
}
