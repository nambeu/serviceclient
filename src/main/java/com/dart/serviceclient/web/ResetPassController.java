/**
 * 
 */
package com.dart.serviceclient.web;

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

		if (bindingResult.hasErrors()) {
			return "changePass";
		}
		String pass = DigestUtils.sha256Hex(resetPasswordBean.getPassword());

		boolean testPassWd = userService.passWordDiff(
				resetPasswordBean.getPasswordOne(),
				resetPasswordBean.getPasswordTwo());

		ArrayList<UserAccount> myUsers;
		myUsers = (ArrayList<UserAccount>) userService.findAllUserAccounts();

		for (UserAccount user : myUsers) {

			String bestOrBadSet;

			if (user.getUserName().equals(resetPasswordBean.getUserName())
					&& user.getPassword().equals(pass)) {
				String newPass = DigestUtils.sha256Hex(resetPasswordBean
						.getPasswordOne());

				user.setPassword(newPass);
				user.setConfirmPassword(newPass);

				userService.updateUserAccount(user);

				bestOrBadSet = " You have set your pass word successffully";

			} else
				bestOrBadSet = " You are not a user of this website, so this service is not available for you !!!!!!";
			uiModel.addAttribute("bestSet", bestOrBadSet);
		}

		if (testPassWd) {

		} else {
			String bestTwoPass = " the two new pass word are not same, please refill then form correctly !!!!!! ";
			uiModel.addAttribute("bestTwoPass", bestTwoPass);
		}

		return "changePass";
	}

}
