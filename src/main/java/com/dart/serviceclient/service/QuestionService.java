package com.dart.serviceclient.service;

import java.util.List;

import org.springframework.roo.addon.layers.service.RooService;

import com.dart.serviceclient.domain.QuestionToEntreprise;

@RooService(domainTypes = { com.dart.serviceclient.domain.QuestionToEntreprise.class })
public interface QuestionService {
	public List<QuestionToEntreprise> findByPostUser_userName(String userName);
}
