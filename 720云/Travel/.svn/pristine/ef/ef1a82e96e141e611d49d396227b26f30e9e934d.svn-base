package com.travel.c;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class ToPage {
	@RequestMapping(value="{pageName}")
	public ModelAndView toPage(@PathVariable("pageName") String pageName){
		ModelAndView mv = new ModelAndView();
		mv.setViewName(pageName);
		return mv;
	}
}
