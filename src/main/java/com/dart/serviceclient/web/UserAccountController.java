package com.dart.serviceclient.web;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.validation.Valid;

import org.springframework.roo.addon.web.mvc.controller.scaffold.RooWebScaffold;
import org.springframework.security.access.annotation.Secured;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.dart.serviceclient.domain.UserAccount;
import com.dart.serviceclient.domain.UserRole;

@RequestMapping("/useraccounts")
@Controller
@RooWebScaffold(path = "useraccounts", formBackingObject = UserAccount.class)
public class UserAccountController {

	@RequestMapping(value = "/sign")
	public String selectPage(HttpServletRequest request, Model uiModel) {
		uiModel.addAttribute("userAccount", new UserAccount());
		return "signUp";
	}

	@RequestMapping(value = "/about")
	public String selectAbout(HttpServletRequest request, Model uiModel) {
		
		return "about";
	}

	@RequestMapping(value = "/contact")
	public String selectContact(HttpServletRequest request, Model uiModel) {

		return "contact";
	}

	@RequestMapping(value = "/creer")
	public String createUser(@Valid UserAccount userAccount,
			BindingResult bindingResult, HttpServletRequest request,
			Model uiModel) {

		// not clean declaration of object : useraccount
		// add rol USER for every user created

		if (!userAccount.getPassword().equals(userAccount.getConfirmPassword())) {
			bindingResult.rejectValue("confirmPassword", "confPass",
					"The password are not the same !!");
		}
		if (bindingResult.hasErrors()) {
			uiModel.addAttribute("userAccount", userAccount);
			addDateTimeFormatPatterns(uiModel);
			System.out.println("verif errors");
			return "signUp";
		}
		
		userAccount.getRoles().add(UserRole.USER);
		
		userService.saveUserAccount(userAccount);
		uiModel.addAttribute("msg", "The user " + userAccount.getUserName()
				+ " was successfully created");
		System.out.println("User was Created");
		return "signUp";
	}

	@RequestMapping(value = "/users")
	public String listUsers(HttpServletRequest request, Model uiModel) {
		List<UserAccount> listUsersAccounts = userService.findAllUserAccounts();
		uiModel.addAttribute("listUsers", listUsersAccounts);
		// userService.findAllUserAccounts();
		return "users/list";
	}

	@RequestMapping(value = "/enable")
	public String enableLogin1(@RequestParam("id") String id,
			HttpServletRequest request, Model uiModel) {
		UserAccount userAccount = userService.findUserAccount(new Long(id));
		userAccount.setDisableLogin(false);
		userService.updateUserAccount(userAccount);
		List<UserAccount> listUsersAccounts = userService.findAllUserAccounts();
		uiModel.addAttribute("listUsers", listUsersAccounts);
		return "users/list";
	}

	@RequestMapping(value = "/disable")
	public String disableLogin1(@RequestParam("id") String id,
			HttpServletRequest request, Model uiModel) {
		UserAccount userAccount = userService.findUserAccount(new Long(id));
		userAccount.setDisableLogin(true);
		userService.updateUserAccount(userAccount);
		List<UserAccount> listUsersAccounts = userService.findAllUserAccounts();
		uiModel.addAttribute("listUsers", listUsersAccounts);
		return "users/list";
	}

	@ResponseBody
	@RequestMapping(value = "/enableDisable")
	public String enableLogin(@RequestParam("id") String id,
			HttpServletRequest request, Model uiModel) {
		UserAccount userAccount = userService.findUserAccount(new Long(id));
		String value;
		if (userAccount.isDisableLogin()) {
			userAccount.setDisableLogin(false);
			// userAccount.setAccountLocked(true);
			value = "Enable";
		} else {
			userAccount.setDisableLogin(true);
			value = "Disable";
		}

		userService.updateUserAccount(userAccount);
		return value;
	}

	/*
	 * @ResponseBody
	 * 
	 * @RequestMapping("/disable") public String
	 * disableLogin(@RequestParam("id") String id, HttpServletRequest request,
	 * Model uiModel) { UserAccount userAccount =
	 * userService.findUserAccount(new Long(id));
	 * userAccount.setDisableLogin(true);
	 * userService.updateUserAccount(userAccount); //List<UserAccount>
	 * listUsersAccounts=userService.findAllUserAccounts();
	 * //uiModel.addAttribute("listUsers", listUsersAccounts); return "Enable";
	 * }
	 */

	//
	// @RequestMapping(value = "/newUser")
	// public String NewUser(Model uiModel) {
	// System.out.println(" un nouvel utilisateurs dans la base de données :");
	//
	// return "resetPassController/newUser";
	// }

	@ResponseBody
	@RequestMapping("/delete")
	@Secured("ROLE_USER")
	public String deleteUser(@RequestParam("id") String id,
			HttpServletRequest request, Model uiModel) {

		String[] t = new String[2];
//		isUserInRole(ROLE_USER);
		t = id.split("-");
		System.out.println("l'id kon a est: " + t[1]);
		UserAccount userAccount = userService.findUserAccount(new Long(t[1]));
		userService.deleteUserAccount(userAccount);
		List<UserAccount> listUseraccounts = userService.findAllUserAccounts();

		return "true";
	}

}