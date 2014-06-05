package com.dart.serviceclient.web;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.dart.serviceclient.mail.MailService;

@RequestMapping({ "/", "/index", "/home" })
@Controller
public class HomeController {	
	
	@RequestMapping(method = RequestMethod.GET)
	public String selectPage(HttpServletRequest request, Model uiModel) {
		
		return "indexHome";
	}
	
}
