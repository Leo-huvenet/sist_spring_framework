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
	 * ��ûó�� URL�� ����Ǵ� JSP�� �̸��� ���ٸ� JSP���� ��ȯ���� �ʾƵ� ������ �̸���
	 * JSP�� ViewResolver�� �����Ѵ�.
	 * @return
	 */
	@RequestMapping("/day0616/ajax_form.do")
	public String ajaxForm() {
		
		return "day0616/ajax_form"; //��������(��ûó�� URL�� ������ �̸�)
	}
	
	@RequestMapping("/day0616/use_jsp.do")
	public String useJsp(String name, Model model) {
		String[] msg = {"������","������","������"};
		
		JSONObject json = new JSONObject();
		json.put("msg", name+" : "+msg[new Random().nextInt(msg.length)]);
		
		//������ JSONObject�� JSP�� �����ϱ� ���� Model�� �߰�
		model.addAttribute("res_msg", json.toJSONString());
		
		return "day0616/jsp_json";
	}
	
	//������ JSON���� �Ǿ���Ѵٸ� JSP�� ������ �ʰ� JSONObject�� �ٷ� ��� �� �� �ִ�.
	@RequestMapping(value = "/day0616/use_jsp1.do", method = {RequestMethod.GET, RequestMethod.POST})
	@ResponseBody 
	public String useJsp1(String name) {
		String[] msg = {"������","������","������"};
		
		JSONObject json = new JSONObject();
		json.put("msg", name+" : "+msg[new Random().nextInt(msg.length)]);
		
		//������ JSP�� �Ǵ°��� �ƴϰ�, JSON�� ����ȴ�.
		return json.toJSONString();
	}
}
