package com.dart.serviceclient.repository;

import java.util.List;

import org.springframework.roo.addon.layers.repository.jpa.RooJpaRepository;

import com.dart.serviceclient.domain.UserAccount;

@RooJpaRepository(domainType = UserAccount.class)
public interface UserRepository {
	public List<UserAccount> findByUserName(String userName);
}
