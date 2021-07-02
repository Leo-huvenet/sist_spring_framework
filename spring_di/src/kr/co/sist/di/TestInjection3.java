package kr.co.sist.di;

import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 *	JCF(Java Collection Framework)을 의존성 주입 받을 때.
 * @author user
 */
public class TestInjection3 {
	private List<String> nameList;
	private Map<String, String> dataMap;
	
	public TestInjection3(List<String> list) {
		this.nameList = list;
		System.out.println("List를 의존성 주입받는 생성자");
	}
	
	public TestInjection3(Map<String, String> dataMap) {
		this.dataMap = dataMap;
		System.out.println("Map을 의존성 주입받는 생성자");
	}
	
	public void useList() {
		for(String name : nameList ) {
			System.out.println( name );
		}
	}
	
	public void useMap() {
			Set<String> set = dataMap.keySet(); //모든 키를 받는다.
			//중복값을 저장하지 않고, 검색의 기능이 없다 => Iterator사용하여 검색을 수행
			Iterator<String> ita = set.iterator();
			
			String key="";
			
			while(ita.hasNext()) {
				key = ita.next();
				System.out.println("key : "+key+" / value : "+dataMap.get(key));
			}
		}
	}//class
	

