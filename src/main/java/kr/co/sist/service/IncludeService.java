package kr.co.sist.service;

import java.util.ArrayList;
import java.util.List;

import kr.co.sist.domain.IncludeDomain;

public class IncludeService {
	public List<IncludeDomain> searchNick(){
		List<IncludeDomain> list = new ArrayList<IncludeDomain>();
		list.add(new IncludeDomain("°û¹ü¼ö", 25));
		list.add(new IncludeDomain("°­ÀÎ¼·", 24));
		list.add(new IncludeDomain("±è´ö¿µ", 23));
		list.add(new IncludeDomain("ÁøÀçÇõ", 22));
		
		return list;
	}
}
