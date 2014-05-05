package com.dart.serviceclient.service;

import java.util.List;

import com.dart.serviceclient.domain.UserAccount;


public class UserServiceImpl implements UserService {
	@Override
	public List<UserAccount> findByUserName(String userName){
		return userRepository.findByUserName(userName);
	}
}
