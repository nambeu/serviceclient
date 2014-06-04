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

import com.dart.serviceclient.domain.EntrepriseAccount;
import com.dart.serviceclient.domain.QuestionToEntreprise;
import com.dart.serviceclient.domain.SearchEntreprise;
import com.dart.serviceclient.domain.SecteurActivite;
import com.dart.serviceclient.security.Security;
import com.dart.serviceclient.service.EntrepriseService;
import com.dart.serviceclient.service.QuestionService;
import com.dart.serviceclient.service.SecteurActiviteService;

@RequestMapping("/questiontoentreprises")
@Controller
@RooWebScaffold(path = "questiontoentreprises", formBackingObject = QuestionToEntreprise.class)
public class QuestionsController {

	@Autowired
	Security security;

	@Autowired
	QuestionService questionService;

	@Autowired
	EntrepriseService entrepriseService;
	
	@Autowired
	SecteurActiviteService secteurActiviteService;

	@RequestMapping(value = "/createQuestion")
	public String showFormCreate(Model uiModel,
			@RequestParam(value = "entreprise") int idEntrep) {

		QuestionToEntreprise questionToEntreprise = new QuestionToEntreprise();
		uiModel.addAttribute("questionToEntreprise", questionToEntreprise);
		uiModel.addAttribute("identrep", idEntrep);
		return "questionsUsers";
	}

	@RequestMapping(value = "/postQuestion", method = RequestMethod.POST)
	public String postQuestion(Model uiModel,
			@Valid QuestionToEntreprise questionToEntreprise,
			BindingResult bindingResult,
			@RequestParam(value = "entreprise") long idEntrep) {

		if (bindingResult.hasErrors()) {
			return "questionsUsers";
		}

		questionToEntreprise.setPostUser(security.getUserAccount());
		EntrepriseAccount list = entrepriseService
				.findEntrepriseAccount((long) idEntrep);

		questionToEntreprise.setReceiveEntreprise(list);
		questionService.saveQuestionToEntreprise(questionToEntreprise);

		return "listQuestionsUser";
	}

	@RequestMapping(value = "/listQuestion", method = RequestMethod.GET)
	public String showQuestion(Model uiModel) {
		//
		List<QuestionToEntreprise> listToShow = questionService
				.findByPostUser_userName(security.getUserAccount()
						.getUserName());

	

		uiModel.addAttribute("listReceive", listToShow);

		return "listQuestionsUser";
	}
}
