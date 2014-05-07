/**
 * 
 */
package com.dart.serviceclient.web;

import java.util.ArrayList;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.dart.serviceclient.domain.ResetPasswordBean;
import com.dart.serviceclient.domain.UserAccount;
import com.dart.serviceclient.service.UserServiceImpl;

/**
 * @author dassi
 *
 */

@Controller
@RequestMapping("/resetPassController")
public class ResetPassController {

	@Autowired
	UserServiceImpl userService;

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

		// //////////:::::test des binding errores
		// personalisés:::://////////////

		// if(resetPasswordBean.getUserName().isEmpty()){
		//
		// bindingResult = bindingResult + "dassi";
		// }
		//

		// ///////////////////////////

		// List<UserAccount> userAccounts =
		// useraccount.findByUserNameAndPassword(
		// resetPasswordBean.getUserName(),
		// resetPasswordBean.getPassword());
		// System.out.println("Results : " + userAccounts.toString());

		boolean testPassWd = userService.passWordDiff(
				resetPasswordBean.getPasswordOne(),
				resetPasswordBean.getPasswordTwo());

		
			ArrayList<UserAccount> myUsers;
			myUsers = (ArrayList<UserAccount>) userService
					.findAllUserAccounts();

			for (UserAccount user : myUsers) {

				String bestOrBadSet;
				if (user.getUserName().equals(resetPasswordBean.getUserName())
						&& user.getPassword().equals(
								resetPasswordBean.getPassword())) {

					user.setPassword(resetPasswordBean.getPasswordOne());
					user.setConfirmPassword(resetPasswordBean.getPasswordOne());

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

	@RequestMapping(value = "/newUser")
	public String NewUser(Model uiModel) {
		System.out.println(" un nouvel utilisateurs dans la base de données :");

		return "resetPassController/newUser";
	}

	@RequestMapping(value = "/ajaxTestOne")
	public String testAjaxOneShow(Model uiModel) {

		return "ajaxTest";
	}

	@RequestMapping(value = "/ajaxTest", method = RequestMethod.POST)
	public @ResponseBody String testAjaxOne(@RequestParam("user") String user,
			@RequestParam("pass") String pass, Model uiModel) {

		System.out.println(user);
		System.out.println(pass);

		String str = user + pass;

		return str;
	}

}
