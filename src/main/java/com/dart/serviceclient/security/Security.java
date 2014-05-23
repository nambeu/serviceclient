package com.dart.serviceclient.security;

import org.springframework.security.core.userdetails.UserDetails;

import com.dart.serviceclient.domain.UserAccount;

public interface Security {
	
	public UserDetails getUserDetails();
	
	public  String getUserName();
	
	public UserAccount getUserAccount();

}
