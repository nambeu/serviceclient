package com.dart.serviceclient.web;
import javax.servlet.http.HttpServletRequest;
import javax.validation.Valid;

import com.dart.serviceclient.domain.EntrepriseAccount;
import com.dart.serviceclient.domain.UserAccount;
import com.dart.serviceclient.domain.UserRole;
import com.dart.serviceclient.security.Security;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpRequest;
import org.springframework.roo.addon.web.mvc.controller.scaffold.RooWebScaffold;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.RequestMapping;

@RequestMapping("/entrepriseaccounts")
@Controller
@RooWebScaffold(path = "entrepriseaccounts", formBackingObject = EntrepriseAccount.class)
public class EntrepriseAccountController {

	@Autowired
    Security security;
	
    @RequestMapping(value = "/creerEntreprise")
    public String createEntreprise(HttpServletRequest request, Model uiModel) {
        
    	
    	
    	uiModel.addAttribute("entrepriseAccount",new EntrepriseAccount());
    	
    	return "createEntreprise";
        
    }
    
    @RequestMapping(value = "/saveEntreprise")
    public String saveEntreprise(EntrepriseAccount entreprise,HttpRequest request,BindingResult binding, Model uiModel){
    	
    	// ecrire la methode de création
    	UserAccount user = security.getUserAccount();
    	entreprise.setUserCreator(user);
    	return "";
    }
}
