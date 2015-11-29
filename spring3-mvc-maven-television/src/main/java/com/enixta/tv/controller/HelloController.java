package com.enixta.tv.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.enixta.tv.dao.TelevisionDAO;
import com.enixta.tv.model.Television;

@Controller
public class HelloController {

	@Autowired
	private TelevisionDAO tvDAO;
	
	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String printWelcome(ModelMap model) {

		model.addAttribute("message", "Spring 3 MVC Hello gfsdgfdsgdf");
		return "home";

	}

		
	@RequestMapping(value = "/viewAll", method = RequestMethod.GET)
	public ModelAndView hello2() {

		ModelAndView model = new ModelAndView();
		model.setViewName("view");
		List<Television> list = tvDAO.list();
		
//		list.add("one");
//		list.add("two");
//		list.add("three");
		
		model.addObject("tv", list);

		return model;

	}
	

}