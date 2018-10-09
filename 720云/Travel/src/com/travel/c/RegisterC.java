package com.travel.c;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpRequest;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.travel.pojo.User;
import com.travel.service.RegisterService;


@Controller
public class RegisterC {
	@Autowired
	RegisterService rs;
	
	@RequestMapping("/register.do")
	public ModelAndView queryCategorys(User user){
		ModelAndView mv = new ModelAndView();
		System.out.println("进入了注册页面");
		System.out.println(user.getPassword());
		Integer save = rs.save(user);
		mv.setViewName("travel");
		return mv;
	}
	@RequestMapping("/login.do")
	public ModelAndView login(HttpServletRequest request,User user){
		ModelAndView mv = new ModelAndView();
		System.out.println("进入了登录页面");
		
			System.out.println("账户正确");
				request.getSession().setAttribute("state","true");
	
		mv.setViewName("travel");
		return mv;
	}
	@RequestMapping("/loginout.do")
	public ModelAndView loginout(HttpServletRequest request,User user){
		ModelAndView mv = new ModelAndView();
		System.out.println("退出登录");
				request.getSession().removeAttribute("state");
		mv.setViewName("travel");
		return mv;
	}
}
