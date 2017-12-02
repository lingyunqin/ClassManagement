package com.xmu.j2ee.view;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.xmu.j2ee.entity.FlippedClass;
import com.xmu.j2ee.service.FlippedClassService;

/**
 * °à¼¶¿ØÖÆÆ÷
 * @author qinlingyun
 *
 */
@RestController
@RequestMapping("/class")
public class FlippedClassController {

@RequestMapping(value="/{classId}", method = RequestMethod.GET)
public String showClassInformation(@PathVariable("classId") long classId, Model model){
    FlippedClass flippedClass = FlippedClassService.findClassById(classId);
	model.addAttribute(flippedClass);
	return "class_info";
	}

	

}
