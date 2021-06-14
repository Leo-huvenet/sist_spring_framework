package kr.co.sist.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

// 1. HandlerMapper�� �������� Ŭ������ component-scan�ϱ����� 
//@Controller annotation�� �����Ѵ�.
@Controller
public class HelloController { //public class Test extends HttpServlet{
	//2. URL�� ó���� �� �ִ� method�� �����ϰ� return view�� ���������� ��ȯ
	@RequestMapping(value = "/hello_mvc.do",method = RequestMethod.GET)
	 public String hello() { //protected void doGet(HttpServletRequest.HttpServletResponse)
		 
		 return "hello_mvc";
	 }//hello
}
