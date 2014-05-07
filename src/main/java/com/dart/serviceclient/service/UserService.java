package com.dart.serviceclient.service;

import org.springframework.roo.addon.layers.service.RooService;
import org.springframework.stereotype.Service;

@Service
@RooService(domainTypes = { com.dart.serviceclient.domain.UserAccount.class })
public interface UserService {

	public boolean passWordDiff(String passOne, String passTwo);

//	public void setIt(UserAccount userAccount, String str);

}
