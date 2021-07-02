package kr.co.sist.di;

import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 *	JCF(Java Collection Framework)�� ������ ���� ���� ��.
 * @author user
 */
public class TestInjection3 {
	private List<String> nameList;
	private Map<String, String> dataMap;
	
	public TestInjection3(List<String> list) {
		this.nameList = list;
		System.out.println("List�� ������ ���Թ޴� ������");
	}
	
	public TestInjection3(Map<String, String> dataMap) {
		this.dataMap = dataMap;
		System.out.println("Map�� ������ ���Թ޴� ������");
	}
	
	public void useList() {
		for(String name : nameList ) {
			System.out.println( name );
		}
	}
	
	public void useMap() {
			Set<String> set = dataMap.keySet(); //��� Ű�� �޴´�.
			//�ߺ����� �������� �ʰ�, �˻��� ����� ���� => Iterator����Ͽ� �˻��� ����
			Iterator<String> ita = set.iterator();
			
			String key="";
			
			while(ita.hasNext()) {
				key = ita.next();
				System.out.println("key : "+key+" / value : "+dataMap.get(key));
			}
		}
	}//class
	

