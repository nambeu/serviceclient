package com.dart.serviceclient.service;
import com.dart.serviceclient.domain.UserAccount;
import java.util.List;

import org.springframework.roo.addon.layers.service.RooService;
import org.springframework.stereotype.Service;



@RooService(domainTypes = { com.dart.serviceclient.domain.UserAccount.class })
public interface UserService {

//	public void setIt(UserAccount userAccount, String str);

	public boolean isAnEmail(String email);
	public String generatePassword();
	public boolean sendPassword(String email,String password);
	public List<UserAccount> findByUserName(String userName);
	public List<UserAccount> findByEmail(String email);

}
