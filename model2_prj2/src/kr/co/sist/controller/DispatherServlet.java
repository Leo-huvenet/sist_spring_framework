package kr.co.sist.controller;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import kr.co.sist.action.Action;
import kr.co.sist.action.MemberFormAction;
import kr.co.sist.action.MemberProcessAction;
import kr.co.sist.action.idDupAction;

@SuppressWarnings("serial")
public class DispatherServlet extends HttpServlet {
	
	private static Map<String, Action> map = new HashMap<String, Action>();
	
	
	/**
	 * init : ���������ڿ� ���� �� �� ���� ȣ�� �Ǵ� method
	 * �ι� ° �����ڴ� ȣ����� �ʴ´�.
	 */
	@Override
	public void init() { 
		//Map�� ����
		map.put("M001", new MemberFormAction()); //ȸ������ ���
		map.put("D001", new idDupAction()); //�ߺ�Ȯ��
		map.put("M002", new MemberProcessAction()); //ȸ������ ó��		
	}
       
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//GET������� ��û�ϸ� post��Ŀ��� ó��
		doPost(request, response);
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//���������� �ѱ�ó���� �ϸ� ��� Action���� �ѱ� ó���� ���� �ʾƵ� �ȴ�.
		request.setCharacterEncoding("UTF-8");//POST����� Encoding(GET����� ��û�� ������ �������� �ʴ´�.)
		
		String cmd = request.getParameter("cmd");
		
		if(cmd == null) { //����Ǵ� Action�� �����ϵ��� ����� �ܺ� �Է°� 
			cmd = "M001"; //cmd�� ���ٸ�(����ȣ��, �ܺο��� cmd�� �Ѽ�)ȸ������ ���� �����ִ� cmd�� �����Ѵ�.
		}
		
		Action action = map.get(cmd); //�Էµ� cmd���� �ش��ϴ� action�� �ڽ�Ŭ������ map���� ã�� �����´�.
		
		if(action == null) { //cmd���� �ܺο��� �Ѽ��Ͽ� �ٸ� ������ �Է����� ��
			action = map.get("M001"); // ����ȭ������ �����Ѵ�.
		}
		
		//������ action�� methodȣ��(Override�� �ڽ�Ŭ������ method�� ȣ��)
		action.execute(request, response);//�Ķ����ó��, ��ȿ������, ����������ü���, service��ü�� ���
		String url = action.moveURL();
		boolean isForward = action.isForward();
		
		move(request, response, url, isForward);
	}
	
	public void move(HttpServletRequest request, HttpServletResponse response, String url, boolean forwardFlag)
	throws ServletException, IOException {
		if(forwardFlag) { //forwardFlag�� �̵�
			RequestDispatcher rd = request.getRequestDispatcher(url);
			rd.forward(request, response);
		}else { //redirect�� �̵�
			response.sendRedirect(url);
		}
	}//move

}//class
