package kr.co.sist.service;

import java.util.ArrayList;
import java.util.List;

import kr.co.sist.domain.IncludeDomain;

public class IncludeService {
	public List<IncludeDomain> searchNick(){
		List<IncludeDomain> list = new ArrayList<IncludeDomain>();
		list.add(new IncludeDomain("������", 25));
		list.add(new IncludeDomain("���μ�", 24));
		list.add(new IncludeDomain("�����", 23));
		list.add(new IncludeDomain("������", 22));
		
		return list;
	}
}
