package com.dart.serviceclient.security;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Date;
import java.util.List;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;
import org.springframework.util.Assert;

import com.dart.serviceclient.domain.UserAccount;
import com.dart.serviceclient.domain.UserRole;
import com.dart.serviceclient.service.UserService;

/**
 * @author bwa
 * 
 */
@Service("applicationServiceClient")
public class ServiceClientUserDetailService implements UserDetailsService {

	@Autowired
	private UserService userService;

	@Override
	public UserDetails loadUserByUsername(String arg0)
			throws UsernameNotFoundException {
		List<UserAccount> accounts = userService.findByUserName(arg0);
		if (accounts.isEmpty() || accounts.size() > 1) {
			throw new UsernameNotFoundException("Invalid username/password");
		}
		return loadTheUserTheByUserName(arg0);
	}

	User loadTheUserTheByUserName(String userName) {
		User user = null;
		Assert.notNull(userName, "The user name should not be null here");
		List<UserAccount> accounts = userService.findByUserName(userName);
		UserAccount userAccount = accounts.iterator().next();
		Collection<GrantedAuthority> authorities = new ArrayList<GrantedAuthority>();
		Set<UserRole> roles = userAccount.getRoles();
		for (UserRole userRole : roles) {
			authorities.add(new SimpleGrantedAuthority(userRole.toString()));
		}
		boolean accountNonExpired = new Date().before(userAccount.getAccountExpiration());
		boolean credentialNonExpired = new Date().before(userAccount.getCredentialExpiration());
		user = new User(userName, userAccount.getPassword(),
				!userAccount.isDisableLogin(), accountNonExpired,
				credentialNonExpired, !userAccount.isDisableLogin(),
				authorities);
		return user;
	}

}
