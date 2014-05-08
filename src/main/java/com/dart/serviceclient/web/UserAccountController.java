package com.dart.serviceclient.web;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.validation.Valid;

import org.springframework.roo.addon.web.mvc.controller.scaffold.RooWebScaffold;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.dart.serviceclient.domain.UserAccount;

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
	public String createUser(@Valid UserAccount useraccount,
			BindingResult bindingResult, HttpServletRequest request,
			Model uiModel) {
		if (!useraccount.getPassword().equals(useraccount.getConfirmPassword())) {
			bindingResult.rejectValue("confirmPassword", "confPass",
					"The password are not the same !!");
		}
		if (bindingResult.hasErrors()) {
			uiModel.addAttribute("userAccount", useraccount);
			addDateTimeFormatPatterns(uiModel);

			// uiModel.addAttribute("name", "Veuillez saisir sur le login !!");
			System.out.println("verif errors");
			return "signUp";
		}
		userService.saveUserAccount(useraccount);
		uiModel.addAttribute("msg", "The user " + useraccount.getUserName()
				+ " was successfully created");
		System.out.println("User was Created");
		return "signUp";
	}

	@RequestMapping("/users")
	public String listUsers(HttpServletRequest request, Model uiModel) {
		List<UserAccount> listUsersAccounts = userService.findAllUserAccounts();
		uiModel.addAttribute("listUsers", listUsersAccounts);
		// userService.findAllUserAccounts();
		return "users/list";
	}

	@RequestMapping("/enable")
	public String enableLogin1(@RequestParam("id") String id,
			HttpServletRequest request, Model uiModel) {
		UserAccount userAccount = userService.findUserAccount(new Long(id));
		userAccount.setDisableLogin(false);
		userService.updateUserAccount(userAccount);
		List<UserAccount> listUsersAccounts = userService.findAllUserAccounts();
		uiModel.addAttribute("listUsers", listUsersAccounts);
		return "users/list";
	}

	@RequestMapping("/disable")
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
	@RequestMapping("/enableDisable")
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
	public String deleteUser(@RequestParam("id") String id, HttpServletRequest request, Model uiModel){
		
		String[] t= new String[2];
		t= id.split("-");
		System.out.println("l'id kon a est: "+t[1]);
		UserAccount userAccount = userService.findUserAccount(new Long(t[1]));
		userService.deleteUserAccount(userAccount);
		List<UserAccount> listUseraccounts = userService.findAllUserAccounts();

		return "true";
	}

}