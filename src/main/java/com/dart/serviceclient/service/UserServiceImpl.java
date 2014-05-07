package com.dart.serviceclient.service;


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

//	@Override
//	public void setIt(UserAccount userAccount, String str) {
//		
//		userAccount.setPassword(str);	
//		userAccount.setConfirmPassword(str);
//		
//		System.out.println("verry kool thing : orleando ");
//
//	}
}
