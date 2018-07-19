package kr.or.connect.mvcexam.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import kr.or.connect.mvcexam.dto.User;

@Controller

public class UserController {
	@RequestMapping(path="/userform", method=RequestMethod.GET)
	
	public String userform(){
		return "userForm";
	}
	
	//이해 잘해야하는게 html에서 form action으로 보낸 곳을 여기서 매핑시켜야해 
	// userForm.jsp에서 action="regist"로 보냈으니 여기서 /regist로 받아야해
	@RequestMapping(path="/regist", method=RequestMethod.POST)
	public String regist(@ModelAttribute User user){
		System.out.println("사용자가 입력한 user정보입니다");
		System.out.println(user);
		return "regist";
	}
	
}
