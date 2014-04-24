package com.dart.serviceclient.web;

import javax.servlet.http.HttpServletRequest;
import javax.validation.Valid;

import com.dart.serviceclient.domain.UserAccount;
import com.dart.serviceclient.service.UserService;

import org.springframework.roo.addon.web.mvc.controller.scaffold.RooWebScaffold;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@RequestMapping("/useraccounts")
@Controller
@RooWebScaffold(path = "useraccounts", formBackingObject = UserAccount.class)
public class UserAccountController {
	
	@RequestMapping("/sign")
	public String selectPage(HttpServletRequest request, Model uiModel) {
	 uiModel.addAttribute("userAccount", new UserAccount());
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
	
	@RequestMapping("/creer")
	public String createUser(@Valid UserAccount useraccount,BindingResult bindingResult, HttpServletRequest request, Model uiModel) {
		 if(useraccount.getPassword()!=useraccount.getConfirmPassword()){
			 bindingResult.rejectValue("confirmPassword", "confPass", "The password are not the same !!");
	        }
		if (bindingResult.hasErrors()) {
			uiModel.addAttribute("userAccount", useraccount);
	        addDateTimeFormatPatterns(uiModel);
	       
//			uiModel.addAttribute("name", "Veuillez saisir sur le login !!");
			System.out.println("verif errors");
            return "signUp";
        }
	    userService.saveUserAccount(useraccount);
		uiModel.addAttribute("msg", "Utlisateur Crée avec succès");
		System.out.println("verif success de user");
		return "signUp";
	}
}
