package com.dart.serviceclient.service;

import org.springframework.roo.addon.layers.service.RooService;

@RooService(domainTypes = { com.dart.serviceclient.domain.UserAccount.class })
public interface UserService {
	public boolean isAnEmail(String email);
	public String generatePassword();
	public boolean sendPassword(String email,String password);
}
