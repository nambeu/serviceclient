package com.dart.serviceclient.repository;
import java.util.List;

import org.springframework.roo.addon.layers.repository.jpa.RooJpaRepository;

import com.dart.serviceclient.domain.QuestionToEntreprise;

@RooJpaRepository(domainType = QuestionToEntreprise.class)
public interface QuestionRepository {
	
	public List<QuestionToEntreprise> findByPostUser_userName(String userName);
}
