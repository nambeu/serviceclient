package com.dart.serviceclient.service;

import java.util.List;

import org.springframework.roo.addon.layers.service.RooService;
import org.springframework.stereotype.Service;

import com.dart.serviceclient.domain.QuestionToEntreprise;

@Service
@RooService(domainTypes = { com.dart.serviceclient.domain.QuestionToEntreprise.class })
public interface QuestionService {

	List<QuestionToEntreprise> findByTitle(String receiver);
	List<QuestionToEntreprise> findByReceiveUser_userName(String receiver2);

}
