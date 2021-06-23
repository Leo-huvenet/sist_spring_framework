package kr.co.sist.action;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * ��� ActionŬ�������� �ؾ� �� �ϵ��� ����� ����
 * �Ķ����ó��, ���������� ����������, ���������� ����, ��������, �������̵���ļ���
 * @author user
 *
 */
public interface Action {
	
	/**
	 * �Ķ������ ó��, ��ȿ������, ����������ü�� ���
	 * @param request
	 * @param respone
	 * @throws ServletException
	 * @throws IOException
	 */
	public void execute(HttpServletRequest request, HttpServletResponse respone)
		throws ServletException,IOException;
	
	/**
	 * �̵������ ����
	 * @return true - forward, false - redirect
	 */
	public boolean isForward();
	
	/**
	 * �̵��������� URL
	 * @return
	 */
	public String moveURL();
}
