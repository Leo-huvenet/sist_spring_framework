package kr.co.sist.controller;

import static org.springframework.web.bind.annotation.RequestMethod.GET;

import java.util.Arrays;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import kr.co.sist.vo.ParamVO;


@Controller
public class ParamController {
	
	@RequestMapping(value = "/use_request.do", method = GET)
	public String requestForm() {
		return "use_request_form";
	}//requestForm
	
	@RequestMapping(value = "/request_process.do", method = GET)
	public String requestProcess(HttpServletRequest request, Model model) {
		//HttpServletRequest를 사용하여 web parameter 값 받기
		String name = request.getParameter("name");
		String age = request.getParameter("age");
		String[] lang = request.getParameterValues("lang");
		
		System.out.println(name + " / "+age+" / "+ Arrays.toString(lang));
		model.addAttribute("lang",lang); //request.setAttribute와 동일
		
		return "request_process";
	}//requestProcess
	
	/**
	 * 요청이 있을 때 폼을 제공하는 처리
	 * @return
	 */
	@RequestMapping(value = "/use_single_param.do", method = GET)
	public String singleParamForm() {
		return "single_param_form";
	}
	
	/**
	 * 단일형(int, String,,,)인 경우 해당 데이터형을 사용하여 parameter명만 맞춰주면
	 * 	web parameter가 해당 형으로 형변환되어 입력된다.
	 * @param nick
	 * @param age
	 * @return
	 */
	@RequestMapping(value = "/single_param_process.do", method = GET)
	public String singleParamProcess(String nick, int age) {
		
		System.out.println("닉네임 : "+nick+", 나이 : "+age);
		
		return "single_param_process"; 
	}
	
	@RequestMapping(value = "/day0611/use_vo.do", method = GET)
	public String voForm() {
		
		
		return "day0611/vo_form"; 
	}
	
	@RequestMapping(value = "/day0611/vo_process.do", method = GET)
	public String voProcess(ParamVO pVO, Model model) {
		System.out.println(pVO);
		
		model.addAttribute("movie", pVO.getMovie());
		
		return "day0611/vo_process"; 
	}
}
