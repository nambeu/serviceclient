package com.dart.serviceclient.web;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.roo.addon.web.mvc.controller.scaffold.RooWebScaffold;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.dart.serviceclient.domain.QuestionToEntreprise;
import com.dart.serviceclient.security.Security;
import com.dart.serviceclient.service.QuestionService;

@RequestMapping("/questiontoentreprises")
@Controller
@RooWebScaffold(path = "questiontoentreprises", formBackingObject = QuestionToEntreprise.class)
public class QuestionsController {

	@Autowired
	Security security;

	@Autowired
	QuestionService questionService;

	@RequestMapping(value = "/createQuestion")
	public String showFormCreate(Model uiModel) {

		QuestionToEntreprise questionToEntreprise = new QuestionToEntreprise();
		uiModel.addAttribute("questionToEntreprise", questionToEntreprise);
		return "questionsUsers";
	}

	@RequestMapping(value = "/postQuestion", method = RequestMethod.POST)
	public String postQuestion(Model uiModel,
			@Valid QuestionToEntreprise questionToEntreprise,
			BindingResult bindingResult) {

		if (bindingResult.hasErrors()) {
			return "questionsUsers";
		}

		questionToEntreprise.setPostUser(security.getUserAccount());
		questionToEntreprise.setReceiveUser(security.getUserAccount());

		questionService.saveQuestionToEntreprise(questionToEntreprise);

		return "listQuestionsUser";
	}

	@RequestMapping(value = "/listQuestion", method = RequestMethod.GET)
	public String showQuestion(Model uiModel,
			@RequestParam(value = "receive") String receiver) {
//
//		List<QuestionToEntreprise> listToShow = questionService
//				.findByTitle(receiver);
		
		List<QuestionToEntreprise> listToShow = questionService.findByReceiveUser_userName(receiver);

		uiModel.addAttribute("listReceive", listToShow);
		
		return "listQuestionsUser";
	}
}
