/**
 * 
 */
package com.dart.serviceclient.web;

import org.slf4j.Logger;

import com.dart.serviceclient.service.UserService;
import com.dart.serviceclient.service.UserServiceImpl;

import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * @author dimitri
 *
 */
@Controller
@RequestMapping("/passwordrecovering")
public class PasswordRecoveringController {
	@Autowired
	UserService anUserServiceAccount;
	private static final Logger LOGGER = LoggerFactory.getLogger(PasswordRecoveringController.class);
	@RequestMapping(value="/showemailpage")
	public String showEmailPage(Model uiModel) {
		LOGGER.info("Here we go ");
		return "passwordrecovering/testPage";
	}
	
	@RequestMapping(value="/postemail",method=RequestMethod.POST)
	public String receiveEmail(@RequestParam("email") String email,Model uiModel){
		//LOGGER.debug("The email : "+email);
		if(!(anUserServiceAccount.isAnEmail(email))){
			return "passwordrecovering/nothingEmail";
		}
		anUserServiceAccount.sendPassword(email, anUserServiceAccount.generatePassword());
		return "passwordrecovering/confirmPassword";
	}
}
