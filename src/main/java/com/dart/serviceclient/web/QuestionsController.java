package com.dart.serviceclient.web;

import javax.validation.Valid;

import org.springframework.roo.addon.web.mvc.controller.scaffold.RooWebScaffold;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.dart.serviceclient.domain.QuestionToEntreprise;

@RequestMapping("/questiontoentreprises")
@Controller
@RooWebScaffold(path = "questiontoentreprises", formBackingObject = QuestionToEntreprise.class)
public class QuestionsController {

	@RequestMapping(value = "/createQuestion")
	public String showFormCreate(Model uiModel) {

		QuestionToEntreprise questionToEntreprise = new QuestionToEntreprise();
		uiModel.addAttribute("questionToEntreprise", questionToEntreprise);
		return "questionsUsers";
	}

	@RequestMapping(value = "/postQuestion", method = RequestMethod.POST)
	public String postQuestion(Model uiModel,
			@Valid QuestionToEntreprise questionToEntreprise, BindingResult bindingResult) {
		
		if(bindingResult.hasErrors()){
			return "questionsUsers";
		}

		return "listQuestionsUser";
	}

}
