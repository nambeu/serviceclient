package com.dart.serviceclient.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.dart.serviceclient.domain.UserAccount;
@Service
public class UserServiceImpl implements UserService {


	@Override
	public boolean passWordDiff(String passOne, String passTwo) {
		boolean testPass = true;

		if (passOne.equals(passTwo))
			testPass = true;
		else
			testPass = false;

		return testPass;
	}

	@Override
	public boolean isAnEmail(String email){
		boolean result=false;
		ArrayList<UserAccount> accounts=(ArrayList<UserAccount>)this.findAllUserAccounts();
		for(int i=0;i<accounts.size();i++){
			if(accounts.get(i).getEmail().equals(email)){
				result=true;
				break;
			}
		}
		return result;
	}
	@Override
	public String generatePassword(){
		return "this is the password";
	}
	@Override
	public boolean sendPassword(String email,String password){
		return true;
	}
	public List<UserAccount> findByUserName(String userName){
		return userRepository.findByUserName(userName);
	}

}
