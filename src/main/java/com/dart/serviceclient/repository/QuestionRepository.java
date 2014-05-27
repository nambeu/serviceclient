package com.dart.serviceclient.repository;

import java.util.List;

import org.springframework.roo.addon.layers.repository.jpa.RooJpaRepository;
import org.springframework.stereotype.Service;

import com.dart.serviceclient.domain.QuestionToEntreprise;
import com.dart.serviceclient.service.QuestionService;

@Service
@RooJpaRepository(domainType = QuestionToEntreprise.class)
public interface QuestionRepository {

	public List<QuestionToEntreprise> findByTitle(String receiver);

}
