package com.xmu.j2ee.view;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

public class SeminarController {
	
	@RestController
	@RequestMapping("/class")
	public class ClassController{
		@RequestMapping(value="/{classId}", method = RequestMethod.GET)
		public String showClassInformation(@PathVariable("classId") long classId, Model model){
			Classes classes = classServide.findClassById(classId);
			model.addAttribute(classes);
			return "class_info";
		}
	}

}
