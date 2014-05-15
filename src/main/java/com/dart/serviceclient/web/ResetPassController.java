/**
 * 
 */
package com.dart.serviceclient.web;

import java.util.List;
import java.util.ArrayList;

import javax.validation.Valid;

import org.apache.commons.codec.digest.DigestUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.dart.serviceclient.domain.ResetPasswordBean;
import com.dart.serviceclient.domain.UserAccount;
import com.dart.serviceclient.service.UserService;

/**
 * @author dassi
 *
 */

@Controller
@RequestMapping("/resetPassController")
public class ResetPassController {

	@Autowired
	UserService userService;

	@RequestMapping(value = "/resetpasswd1")
	public String passWd(Model uiModel) {
		ResetPasswordBean resetPasswordBean = new ResetPasswordBean();
		uiModel.addAttribute("resetPasswordBean", resetPasswordBean);
		return "changePass";
	}

	@RequestMapping(value = "/resetpasswd2", method = RequestMethod.GET)
	public String resetPassWd(@Valid ResetPasswordBean resetPasswordBean,
			BindingResult bindingResult, Model uiModel) {
		
		String pass = DigestUtils.sha256Hex(resetPasswordBean.getPassword());
		
		if (!resetPasswordBean.getPasswordOne().equals(resetPasswordBean.getPasswordTwo())) {
			bindingResult.rejectValue("passwordTwo", "conftwo",
					"The two new pass word are not same, please refill then form correctly !!!!!!");
		}


		boolean testPassWd = userService.passWordDiff(
				resetPasswordBean.getPasswordOne(),
				resetPasswordBean.getPasswordTwo());

		String bestOrBadSet;
//		String bestTwoPass=;


		List<UserAccount> myUsers = (ArrayList<UserAccount>) userService.findAllUserAccounts();

		if(testPassWd){
		for (UserAccount user : myUsers) {

			if (user.getUserName().equals(resetPasswordBean.getUserName()) && user.getPassword().equals(pass)) {
				String newPass = DigestUtils.sha256Hex(resetPasswordBean.getPasswordOne());

				user.setPassword(newPass);
				user.setConfirmPassword(newPass);

				userService.updateUserAccount(user);

				bestOrBadSet = " You have set your pass word successffully";
				uiModel.addAttribute("bestSet", bestOrBadSet);

			} else {
				bindingResult.rejectValue("password", "pas",
						"Your login and password are not correct !!!!");
			}
		}
		}
		if (bindingResult.hasErrors()) {
			return "changePass";
		}
		
		return "changePass";
	}

}
