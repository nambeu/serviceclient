package com.dart.serviceclient.service;

import java.util.List;

import com.dart.serviceclient.domain.EntrepriseAccount;

public class EntrepriseServiceImpl implements EntrepriseService {
	public List<EntrepriseAccount> findBySecteurActivite_libelle(String sectActiv) {
		return entrepriseRepository.findBySecteurActivite_libelle(sectActiv);

	}

}
