package com.gyojincompany.study131;

import java.text.DateFormat;
import java.util.Date;
import java.util.Locale;

import javax.servlet.http.HttpServletRequest;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * Handles requests for the application home page.
 */
@Controller
public class HomeController {
	
	
	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String home() {
		
		
		return "login";
	}
	
	@RequestMapping(value = "/checkId")
	public String checkId(@RequestParam("id") String id, @RequestParam("pw") String pw, Model model) {
		
//		String id = request.getParameter("id");
//		String pw = request.getParameter("pw");
		
		model.addAttribute("id", id);
		model.addAttribute("pw", pw);
		
		return "checkId";
	}
	
	@RequestMapping(value = "/join", method = RequestMethod.GET)
	public String join() {
		
		
		return "join";
	}
	
//	@RequestMapping(value = "/joinOk")
//	public String joinOk(HttpServletRequest request, Model model) {
//		
//		String mid = request.getParameter("id");
//		String mpw = request.getParameter("pw");
//		String mname = request.getParameter("name");
//		String memail = request.getParameter("email");
//		
//		MemberDto member = new MemberDto(mid, mpw, mname, memail);
//		
//		model.addAttribute("memberInfo", member);
////		model.addAttribute("pw", mpw);
////		model.addAttribute("name", mname);
////		model.addAttribute("email", memail);
//		
//		return "joinOk";
//	}
	
	@RequestMapping(value = "/joinOk") 
	public String joinOk(MemberDto memberDto) {//객체이름이 DTO 클래스의 이름과 동일해야함
		
		return "joinOk";
	}
	
	@RequestMapping(value = "/height/{memberHT}")
	public String memberHeight(@PathVariable String memberHT, Model model) {
		
		model.addAttribute("memberHT", memberHT);
		
		return "memberHeight";
	}
	
}
