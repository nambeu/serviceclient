package com.dart.serviceclient.web;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@RequestMapping({ "/signUp", "/sign"})
@Controller
public class SignUpController1 {
	
	@RequestMapping(method = RequestMethod.GET)
	public String selectPage(HttpServletRequest request, Model uiModel) {
		
		return "signUp";
	}
	
}
