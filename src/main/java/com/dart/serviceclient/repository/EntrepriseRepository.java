package com.dart.serviceclient.repository;
import com.dart.serviceclient.domain.EntrepriseAccount;
import org.springframework.roo.addon.layers.repository.jpa.RooJpaRepository;

@RooJpaRepository(domainType = EntrepriseAccount.class)
public interface EntrepriseRepository {
}
