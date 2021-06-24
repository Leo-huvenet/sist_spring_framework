package kr.co.sist.controller;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.CookieValue;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.SessionAttributes;
import org.springframework.web.bind.support.SessionStatus;

@Controller
@SessionAttributes( {"name","age"} ) //���ǿ� �Ҵ��� ���� n���� ��� �迭�� ���
public class SessionController {
	
	@RequestMapping(value = "/day0614/use_session_a.do", method = RequestMethod.GET)
	public String useSession(Model model) {
		
		model.addAttribute("name", "�ѻ��"); //request, session => ���� ��� ���������� ��밡��
		model.addAttribute("nick", "thumb"); //request => ���� forword�� �̵��� ���� ������������ ��밡��
		model.addAttribute("age", 20); //request, session => ���� ��� ���������� ��밡��
		
		return "day0614/use_session_a";
	}
	
	@RequestMapping(value = "/day0614/use_session_b.do", method = RequestMethod.GET)
	public String useSessionB(HttpSession session) {
		//Controller���� ������ ���� ���� ������ �Ű������� HttpSession�� �����Ѵ�.
		System.out.println("name = "+session.getAttribute("name") +", age = "+session.getAttribute("age") );
		return "day0614/use_session_b";
	}
	
	@RequestMapping(value = "/day0614/use_session_c.do", method = RequestMethod.GET)
	public String useSessionC(SessionStatus ss) {
		//���� ����� �Ϸ�Ǿ��ٸ�(�α׾ƿ� �� ��Ȳ)
		ss.setComplete();
		System.out.println("���ǻ���� ����Ǿ��°�? : "+ss.isComplete());	
		return "day0614/use_session_c";
	}
	
	@RequestMapping(value = "/day0615/set_cookie.do", method = RequestMethod.GET)
	public String addCookie(HttpServletResponse response) {
		//��Ű�� �ɴ� ���� ������ �ڵ�� ����.
		//1. ��Ű����(��Ű�� ���ڿ��� �ɾ�����, �������� ��Ű�� ���� �� �ִ�.)
		Cookie cookie = new Cookie("name", "���μ�");
		Cookie cookie2 = new Cookie("age", "25");
		//2. ��Ű�� �ı�ð� ����
		cookie.setMaxAge(60*2);
		cookie2.setMaxAge(60*2);
		//3. ��Ű�ɱ�
		response.addCookie(cookie);
		response.addCookie(cookie2);
		
		return "redirect:http://localhost/sist/index.html"; 
	}
	
	@RequestMapping(value = "/day0615/get_cookie.do", method = RequestMethod.GET)
	public String readCookie(@CookieValue(value = "name", defaultValue = "�͸�") String name, 
			@CookieValue(value = "age",required = true, defaultValue = "0")String age) {
		
		System.out.println("��Ű �б� �̸� : "+ name+ ", ���� : "+age);
		
		return "day0615/read_cookie";
	}
}
