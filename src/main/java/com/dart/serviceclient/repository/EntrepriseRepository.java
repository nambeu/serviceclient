package com.dart.serviceclient.repository;

import java.util.List;

import org.springframework.roo.addon.layers.repository.jpa.RooJpaRepository;

import com.dart.serviceclient.domain.EntrepriseAccount;

@RooJpaRepository(domainType = EntrepriseAccount.class)
public interface EntrepriseRepository {

	public List<EntrepriseAccount> findBySecteurActivite_libelle(
			String sectActiv);
}
