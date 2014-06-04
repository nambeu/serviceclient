/**
 * 
 */
package com.dart.serviceclient.security;

import java.io.IOException;
import java.util.Arrays;
import java.util.Date;

import javax.servlet.FilterChain;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.commons.lang3.time.DateUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.filter.OncePerRequestFilter;

import com.dart.serviceclient.domain.UserAccount;
import com.dart.serviceclient.domain.UserRole;
import com.dart.serviceclient.service.UserService;

/**
 * @author bwa
 *
 */
@Service("applicationInitFilter")
public class ApplicationInitFilter extends OncePerRequestFilter {

	private static final Logger LOGGER = LoggerFactory.getLogger(ApplicationInitFilter.class);
	@Autowired
	UserService userService;
	
	private boolean inited = false ;
	
	@Override
	protected void doFilterInternal(HttpServletRequest arg0,
			HttpServletResponse arg1, FilterChain arg2)
			throws ServletException, IOException {
		Long l= userService.countAllUserAccounts();
		if (l == 0){
		if(!inited){
			UserAccount userAccount = new UserAccount();
			userAccount.setUserName("admin");
			userAccount.setPassword("test123");
			userAccount.setCredentialExpiration(DateUtils.addYears(new Date(), 3));
			userAccount.setDisableLogin(false);
			userAccount.setEmail("admin@serviceclient.com");
			userAccount.setAccountLocked(false);
			userAccount.getRoles().addAll(Arrays.asList(UserRole.values()));
			userService.saveUserAccount(userAccount);
			inited = true;
			LOGGER.debug("Inited : "+userService.findByUserName(userAccount.getUserName()));
		}
		}
		LOGGER.debug("Inited !");
		arg2.doFilter(arg0, arg1);
	}

}
