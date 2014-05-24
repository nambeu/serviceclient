package com.dart.serviceclient.repository;
import com.dart.serviceclient.domain.QuestionToEntreprise;
import org.springframework.roo.addon.layers.repository.jpa.RooJpaRepository;

@RooJpaRepository(domainType = QuestionToEntreprise.class)
public interface QuestionRepository {
}
