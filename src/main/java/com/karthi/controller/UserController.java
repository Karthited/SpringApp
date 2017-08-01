package com.karthi.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.support.SessionStatus;
import org.springframework.web.servlet.ModelAndView;

import com.karthi.bean.PhoneBook;
import com.karthi.service.UserService;

@Controller
public class UserController {
	
	@Autowired
	UserService userService;
	
	@RequestMapping(value="/addUser",method = RequestMethod.GET)
	public ModelAndView setupForm(ModelMap model) 
	{
		PhoneBook phoneBook = new PhoneBook();
		model.addAttribute("phoneBook", phoneBook);
		return new ModelAndView("welcome", "command", phoneBook);
	}
	
	@RequestMapping(value="/addUser",method = RequestMethod.POST)
	public ModelAndView submitForm(@ModelAttribute("employee") PhoneBook phoneBook,
			BindingResult result, HttpServletRequest request, HttpServletResponse response, SessionStatus status) 
	{
		//Validation code
		ModelAndView mav = new ModelAndView("welcome", "command", phoneBook);;
		boolean addUser = userService.addUser(phoneBook);
		List<PhoneBook> users = userService.getUsers();
		mav.addObject("phoneBooks", users);

		//Check validation errors
		if (!addUser) {
			return new ModelAndView("login", "command", phoneBook);
		}
		mav.addObject("message", "Added Successfully");
		status.setComplete();
		return mav;
	}
}
