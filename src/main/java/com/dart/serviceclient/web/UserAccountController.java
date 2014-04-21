package com.dart.serviceclient.web;

import javax.servlet.http.HttpServletRequest;

import com.dart.serviceclient.domain.UserAccount;
import org.springframework.roo.addon.web.mvc.controller.scaffold.RooWebScaffold;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@RequestMapping("/useraccounts")
@Controller
@RooWebScaffold(path = "useraccounts", formBackingObject = UserAccount.class)
public class UserAccountController {
	
	@RequestMapping("/sign")
	public String selectPage(HttpServletRequest request, Model uiModel) {
		
		return "signUp";
	}
	
	@RequestMapping("/about")
	public String selectAbout(HttpServletRequest request, Model uiModel) {
		
		return "about";
	}
	
	@RequestMapping("/contact")
	public String selectContact(HttpServletRequest request, Model uiModel) {
		
		return "contact";
	}
}
