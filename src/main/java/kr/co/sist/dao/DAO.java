package kr.co.sist.dao;

import java.util.ArrayList;
import java.util.List;

public class DAO {
	
	public List<String> selectimg(){
		List<String> imgList = new ArrayList<String>();
		
		imgList.add("img1.png");
		imgList.add("img2.png");
		imgList.add("img3.png");
		imgList.add("img4.png");
		
		return imgList;
	}//selectImg
	
	public List<String> selectNotice(){
	      List<String> noticeList=new ArrayList<String>();
	      
	      noticeList.add("�Ͽ��� 08~���⳪��");
	      noticeList.add("����ϱ����� �۾�����");
	      noticeList.add("���� �۵θ�° �ٲ��ְڴ�");
	      noticeList.add("���ؽ�");
	      
	      return noticeList;
	 }//selectNotice
	
	
	
}
