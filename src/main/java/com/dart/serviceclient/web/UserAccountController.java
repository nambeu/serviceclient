package com.dart.serviceclient.web;

import java.util.List;
import java.util.Set;

import javax.servlet.http.HttpServletRequest;
import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.roo.addon.web.mvc.controller.scaffold.RooWebScaffold;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.dart.serviceclient.domain.UserAccount;
import com.dart.serviceclient.domain.UserRole;
import com.dart.serviceclient.service.UserService;

@RequestMapping("/useraccounts")
@Controller
@RooWebScaffold(path = "useraccounts", formBackingObject = UserAccount.class)
public class UserAccountController {
	@Autowired
	UserService userService;

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
					"These password are not the same !!");
		}

		List<UserAccount> listUser = userService.findAllUserAccounts();
		for (UserAccount userList : listUser) {

			if (userAccount.getUserName().equals(userList.getUserName())) {
				bindingResult
						.rejectValue("userName", "userNexist",
								"this user name also exist in this web site, Please change it !!!");
				break;
			}
		}
		boolean testMail = userService.isAnEmail(userAccount.getEmail());
		if (testMail)
			bindingResult
					.rejectValue("email", "emailExixt",
							"this mail address also exist in this web site, Please change it !!!");

		if (bindingResult.hasErrors()) {
			uiModel.addAttribute("userAccount", userAccount);
			// addDateTimeFormatPatterns(uiModel);
			System.out.println("verif errors");
			return "signUp";
		}

		userAccount.getRoles().add(UserRole.USER);

		userService.saveUserAccount(userAccount);
		uiModel.addAttribute("msg", "The user " + userAccount.getUserName()
				+ " was successfully created");
		System.out.println("User was Created successfully  !!!");
		return "signUp";
	}

	@RequestMapping(value = "/users")
	public String listUsers(HttpServletRequest request, Model uiModel) {
		List<UserAccount> listUsersAccounts = userService.findAllUserAccounts();
		uiModel.addAttribute("listUsers", listUsersAccounts);
		// userService.findAllUserAccounts();
		return "users/list";
	}

	/* pour tester une requête avec ANGULARJS */
	@RequestMapping(value = "/usersAngular", method = RequestMethod.GET)
	public @ResponseBody List<UserAccount> listUsers2(
			HttpServletRequest request, Model uiModel) {

		System.out.println("::::: Entrer dans la requête avec angularJs :::::");
		System.out.println();

		List<UserAccount> listUsersAccounts = userService.findAllUserAccounts();
		// uiModel.addAttribute("listUsers", listUsersAccounts);
		// userService.findAllUserAccounts();

		System.out.println("::::: Sortie de la requête avec angularJs :::::");
		System.out.println();

		return listUsersAccounts;
	}

	/* pour tester une requête avec ANGULARJS */

	@RequestMapping(value = "/testAngular4")
	public String listUsersAngular1(HttpServletRequest request, Model uiModel) {
		return "angularRequest";
	}

	@RequestMapping(value = "/testAngular2")
	public @ResponseBody List<UserAccount> listUsersAngular2(
			HttpServletRequest request, Model uiModel) {
		List<UserAccount> listUsersAccounts = userService.findAllUserAccounts();
		// uiModel.addAttribute("listUsers", listUsersAccounts);
		// userService.findAllUserAccounts();
		return listUsersAccounts;
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
	public String deleteUser(@RequestParam("id") String id,
			HttpServletRequest request, Model uiModel) {

		String[] t = new String[2];
		// isUserInRole(ROLE_USER);
		t = id.split("-");
		System.out.println("l'id kon a est: " + t[1]);
		UserAccount userAccount = userService.findUserAccount(new Long(t[1]));
		List<UserAccount> listUseraccounts = userService.findAllUserAccounts();
		Set<UserRole> roles = userAccount.getRoles();

		for (UserRole userRole : roles) {
			if (userRole.equals("ADMIN"))
				System.out.println("you can not delet an admin");
			else
				userService.deleteUserAccount(userAccount);

		}

		return "true";
	}

}