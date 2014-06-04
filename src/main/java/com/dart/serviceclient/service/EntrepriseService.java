package com.dart.serviceclient.service;

import java.util.List;

import org.springframework.roo.addon.layers.service.RooService;

import com.dart.serviceclient.domain.EntrepriseAccount;

@RooService(domainTypes = { com.dart.serviceclient.domain.EntrepriseAccount.class })
public interface EntrepriseService {
	public List<EntrepriseAccount> findBySecteurActivite_libelle(String sectActiv);

}
