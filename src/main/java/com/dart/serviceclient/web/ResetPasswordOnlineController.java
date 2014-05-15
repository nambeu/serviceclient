/**
 * 
 */
package com.dart.serviceclient.web;

import javax.validation.Valid;

import org.apache.commons.codec.digest.DigestUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.dart.serviceclient.domain.ResetPasswordOnline;
import com.dart.serviceclient.domain.UserAccount;
import com.dart.serviceclient.security.Security;
import com.dart.serviceclient.service.UserService;

/**
 * @author louis
 *
 */

@Controller
@RequestMapping("/resetPassOnline")
public class ResetPasswordOnlineController {

	@Autowired
	UserService userService;
	@Autowired
	Security security;

	@RequestMapping(value = "/callChangePassOnline")
	public String callPage(Model uiModel) {
		ResetPasswordOnline resetPassOnline = new ResetPasswordOnline();
		uiModel.addAttribute("resetPasswordOnline", resetPassOnline);
		return "changePassOnline";
	}

	@RequestMapping(value = "/changePassOnline", method = RequestMethod.POST)
	public String resetPassWd(@Valid ResetPasswordOnline resetPassOnline, BindingResult bindingResult, Model uiModel) {
		
		String pass = DigestUtils.sha256Hex(resetPassOnline.getPassword());
		
		UserAccount userDB = security.getUserAccount();
		
		String passDB = userDB.getPassword();
//		System.out.println("\nConecter en BD : "+userDB.getUserName());
//		System.out.println("Pass en BD : "+passDB+"\n");
		
		if (!passDB.equals(pass)) {
			bindingResult.rejectValue("password", "mypass","The password you enter is not correct, please refill then form correctly !!! !!!");
		}
		if (!resetPassOnline.getNewPasswordOne().equals(resetPassOnline.getNewPasswordTwo())) {
			bindingResult.rejectValue("newPasswordTwo", "conftwo","The two new pass word are not same, please refill then form correctly !!!");
		}

		if (bindingResult.hasErrors()) {
			uiModel.addAttribute("resetPasswordOnline", resetPassOnline);
			uiModel.addAttribute("sucess", "Oups!! Error to your password ");
			return "changePassOnline";
		}else{
		
		String newPass = DigestUtils.sha256Hex(resetPassOnline.getNewPasswordOne());

		userDB.setPassword(newPass);
		userDB.setConfirmPassword(newPass);

		userService.updateUserAccount(userDB);

		uiModel.addAttribute("sucess", "You have set your password successffully");
		
		}
		return "changePassOnline";
	}

}
