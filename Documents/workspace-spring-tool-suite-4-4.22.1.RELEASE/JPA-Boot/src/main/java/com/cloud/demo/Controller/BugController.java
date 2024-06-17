package com.cloud.demo.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.cloud.demo.dao.BugRepo;
import com.cloud.demo.model.Bug;

@Controller
public class BugController
{
	@Autowired
	BugRepo repo;
	
	@RequestMapping("/")
	public String home()
	{
		return "home.jsp";
	}
	
	@RequestMapping("/addBug")
	public String addBug(Bug bug)
	{
		repo.save(bug);
		return "home.jsp";
	}
	
	@RequestMapping("/getBug")
	public ModelAndView getBug(@RequestParam int aid)
	{
		ModelAndView mv = new ModelAndView("showBug.jsp");
		Bug bug = repo.findById(aid).orElse(null);
		mv.addObject(bug);
		return mv;
	}
}
