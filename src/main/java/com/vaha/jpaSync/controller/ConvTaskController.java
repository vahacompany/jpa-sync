package com.vaha.jpaSync.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.vaha.jpaSync.domain.ConvTask;
import com.vaha.jpaSync.service.ConvTaskServiceImpl;

@Controller
public class ConvTaskController {

	@Autowired
	ConvTaskServiceImpl convTaskService;

	@RequestMapping("/getTest")
	public ModelAndView getTest() {
		System.out.println("/getTest");
		ModelAndView mav = new ModelAndView("test");
		mav.addObject("result", "Hello World###");
		
		return mav;

	}

	@RequestMapping("/getConvTasks")
	public ModelAndView getConvTasks() {
		System.out.println("/getConvTasks");
		ModelAndView mav = new ModelAndView("convTask");

		List<ConvTask> convTaskList = convTaskService.getConvTasks();
		mav.addObject("size", convTaskList.size());

		if (convTaskList.size() == 0) {
			mav.addObject("size", "Error");
		}

		mav.addObject("data", convTaskList);

		return mav;
	}
}
