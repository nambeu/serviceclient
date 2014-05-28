package com.dart.serviceclient.repository;

import java.util.List;

import org.springframework.roo.addon.layers.repository.jpa.RooJpaRepository;
import org.springframework.stereotype.Service;

import com.dart.serviceclient.domain.QuestionToEntreprise;

@Service
@RooJpaRepository(domainType = QuestionToEntreprise.class)
public interface QuestionRepository {

	public List<QuestionToEntreprise> findByTitle(String receiver);
	public List<QuestionToEntreprise> findByReceiveUser_userName(String receiver2);

}
