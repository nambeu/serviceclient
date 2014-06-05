package com.dart.serviceclient.security;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContext;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.stereotype.Service;

import com.dart.serviceclient.domain.UserAccount;
import com.dart.serviceclient.service.UserService;

@Service("securityUtil")
public class SecurityUtil implements Security {

	@Autowired
	UserService userService;

	public  UserDetails getUserDetails() {
		SecurityContext context = SecurityContextHolder.getContext();
		if (context == null)
			return null;
		Authentication authentication = context.getAuthentication();
		if (authentication == null)
			return null;
		Object principal = authentication.getPrincipal();
		if (principal == null)
			return null;
		if (principal instanceof UserDetails) {
			return ((UserDetails) principal);
		} else {
			return null;
		}
	}

	public  String getUserName() {
		UserDetails userDetails = getUserDetails();
		if (userDetails != null)
			return userDetails.getUsername();
		return null;
	}

	public UserAccount getUserAccount() {
		UserDetails userDetails = getUserDetails();
		if (userDetails == null)
			return null;
		String username = userDetails.getUsername();
		List<UserAccount> resultList = userService.findByUserName(username);
		if (resultList != null && resultList.size() > 0) {

			return resultList.get(0);
		}
		return null;
	}	

}
