package com.dart.serviceclient.service;

import java.util.List;

import org.springframework.roo.addon.layers.service.RooService;

import com.dart.serviceclient.domain.UserAccount;

@RooService(domainTypes = { com.dart.serviceclient.domain.UserAccount.class })
public interface UserService {
	public boolean isAnEmail(String email);
	public String generatePassword();
	public boolean sendPassword(String email,String password);
	public List<UserAccount> findByUserName(String userName);
}
