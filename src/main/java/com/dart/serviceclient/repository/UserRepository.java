package com.dart.serviceclient.repository;

import com.dart.serviceclient.domain.UserAccount;
import org.springframework.roo.addon.layers.repository.jpa.RooJpaRepository;

@RooJpaRepository(domainType = UserAccount.class)
public interface UserRepository {
}
