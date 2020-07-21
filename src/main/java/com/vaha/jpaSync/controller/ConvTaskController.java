package com.vaha.jpaSync.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

@RestController
public class ConvTaskController {

//	@Autowired
//	ConvTaskServiceImpl service;
	
	@RequestMapping("/convTaskList/taskId=86L")
	public ModelAndView getConvTasks()
	{
		ModelAndView mav = new ModelAndView("index");
		mav.addObject("result","Hello World###");
		return mav;
		
//		ConvTaskService service =  new ConvTaskServiceImpl();
//		
//		ResponseDTO<List<ConvTask>> response = new ResponseDTO<>();
//
//		List<ConvTask> convTaskList = service.getConvTaskList();
//
//		if (convTaskList.size() == 0)
//		{
//			response.setCheck(false);
//		}
//
//		response.setResponse(convTaskList);
//
//		return response;
	}
}
