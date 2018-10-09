package com.travel.c;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.travel.pojo.Travel;
import com.travel.service.TravelService;

@Controller
public class TravelC {
	@Autowired
	private TravelService service;
	@RequestMapping("/queryTravel.do")
	public ModelAndView queryTravel(String name) {
		 ModelAndView mv = new ModelAndView();
		 Travel travel = service.queryTravel(name);
		 mv.addObject("travel", travel);
		 mv.setViewName("result");
		 return mv;
	}
	@RequestMapping("/queryByLike.do")
	public ModelAndView queryByLike(String name) {
		ModelAndView mv = new ModelAndView();
		List<Travel> travel = service.queryByLike(name);
		mv.addObject("travel", travel);
		mv.setViewName("result");
		return mv;
	}
	
}
