package com.dart.serviceclient.service;

import java.util.List;

import com.dart.serviceclient.domain.QuestionToEntreprise;

public class QuestionServiceImpl implements QuestionService {
	public List<QuestionToEntreprise> findByPostUser_userName(String userName) {

		return questionRepository.findByPostUser_userName(userName);
	}

}
