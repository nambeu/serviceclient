package com.dart.serviceclient.web;
import com.dart.serviceclient.domain.QuestionToEntreprise;
import org.springframework.roo.addon.web.mvc.controller.scaffold.RooWebScaffold;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@RequestMapping("/questiontoentreprises")
@Controller
@RooWebScaffold(path = "questiontoentreprises", formBackingObject = QuestionToEntreprise.class)
public class QuestionsController {
}
