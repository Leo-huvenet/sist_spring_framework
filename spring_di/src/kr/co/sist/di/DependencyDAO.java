package kr.co.sist.di;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Component;

/**
 *	의존성 주입할 클래스
 * @author user
 */
@Component
public class DependencyDAO {
	
	public List<String> selectList(){
		List<String> list = new ArrayList<String>();
			list.add("오늘은");
			list.add("금요일");
			list.add("입니다.");
			list.add("다음 주는 수료의 주");
		return list;
	}
 }
