package kr.co.sist.controller;

import java.util.Random;

import org.json.simple.JSONObject;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class AjaxController {
	
	
	/**
	 * 요청처리 URL과 응답되는 JSP의 이름이 같다면 JSP명을 반환하지 않아도 동일한 이름의
	 * JSP를 ViewResolver가 추적한다.
	 * @return
	 */
	@RequestMapping("/day0616/ajax_form.do")
	public String ajaxForm() {
		
		return "day0616/ajax_form"; //생략가능(요청처리 URL과 동일한 이름)
	}
	
	@RequestMapping("/day0616/use_jsp.do")
	public String useJsp(String name, Model model) {
		String[] msg = {"오지고","지리고","레릿고"};
		
		JSONObject json = new JSONObject();
		json.put("msg", name+" : "+msg[new Random().nextInt(msg.length)]);
		
		//생성된 JSONObject을 JSP로 전달하기 위해 Model에 추가
		model.addAttribute("res_msg", json.toJSONString());
		
		return "day0616/jsp_json";
	}
	
	//응답이 JSON으로 되어야한다면 JSP를 만들지 않고 JSONObject을 바로 출력 할 수 있다.
	@RequestMapping(value = "/day0616/use_jsp1.do", method = {RequestMethod.GET, RequestMethod.POST})
	@ResponseBody 
	public String useJsp1(String name) {
		String[] msg = {"오지고","지리고","레릿고"};
		
		JSONObject json = new JSONObject();
		json.put("msg", name+" : "+msg[new Random().nextInt(msg.length)]);
		
		//응답이 JSP가 되는것이 아니고, JSON이 응답된다.
		return json.toJSONString();
	}
}
