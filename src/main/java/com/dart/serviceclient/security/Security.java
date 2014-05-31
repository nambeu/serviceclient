package com.dart.serviceclient.security;

import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.stereotype.Service;
import com.dart.serviceclient.domain.UserAccount;

@Service
public interface Security {
	
	public UserDetails getUserDetails();
	
	public  String getUserName();
	
	public UserAccount getUserAccount();

}
