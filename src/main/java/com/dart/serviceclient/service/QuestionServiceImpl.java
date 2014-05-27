package com.dart.serviceclient.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.dart.serviceclient.domain.QuestionToEntreprise;
import com.dart.serviceclient.repository.QuestionRepository;

public class QuestionServiceImpl implements QuestionService {
	
	@Autowired
	QuestionRepository questionRepository;
	
	
	@Override
	public List<QuestionToEntreprise> findByTitle(String receiver) {
		return questionRepository.findByTitle(receiver);
	}
}
