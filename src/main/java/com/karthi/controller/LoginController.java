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
import com.karthi.service.LoginService;
import com.karthi.service.UserService;

@Controller
public class LoginController {
	
	@Autowired
	LoginService loginValidator;
	
	@Autowired
	UserService userService;
	
	@RequestMapping(value="/login",method = RequestMethod.GET)
	public ModelAndView setupForm(ModelMap model) 
	{
		PhoneBook phoneBook = new PhoneBook();
		model.addAttribute("employee", phoneBook);
		return new ModelAndView("login", "command", phoneBook);
	}

	@RequestMapping(value="/login",method = RequestMethod.POST)
	public ModelAndView submitForm(@ModelAttribute("phoneBook") PhoneBook phoneBook,
			BindingResult result, HttpServletRequest request, HttpServletResponse response, SessionStatus status) 
	{
		//Validation code
		ModelAndView mav = new ModelAndView("welcome", "command", phoneBook);;
		String name = request.getParameter("name");
		String password = request.getParameter("password");
		List<PhoneBook> users = userService.getUsers();
		mav.addObject("name", name);
		mav.addObject("phoneBooks", users);
		boolean isValidUser = loginValidator.validateUser(name, password);

		//Check validation errors
		if (!isValidUser) {
			return new ModelAndView("login", "command", phoneBook);
		}
		status.setComplete();
		return mav;
	}
}