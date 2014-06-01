// WARNING: DO NOT EDIT THIS FILE. THIS FILE IS MANAGED BY SPRING ROO.
// You may push code into the target .java compilation unit if you wish to edit any member(s).

package com.dart.serviceclient.web;

import com.dart.serviceclient.domain.QuestionToEntreprise;
import com.dart.serviceclient.service.EntrepriseService;
import com.dart.serviceclient.service.QuestionService;
import com.dart.serviceclient.service.UserService;
import com.dart.serviceclient.web.QuestionsController;
import java.io.UnsupportedEncodingException;
import javax.servlet.http.HttpServletRequest;
import javax.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.util.UriUtils;
import org.springframework.web.util.WebUtils;

privileged aspect QuestionsController_Roo_Controller {
    
    @Autowired
    QuestionService QuestionsController.questionService;
    
    @Autowired
    EntrepriseService QuestionsController.entrepriseService;
    
    @Autowired
    UserService QuestionsController.userService;
    
    @RequestMapping(method = RequestMethod.POST, produces = "text/html")
    public String QuestionsController.create(@Valid QuestionToEntreprise questionToEntreprise, BindingResult bindingResult, Model uiModel, HttpServletRequest httpServletRequest) {
        if (bindingResult.hasErrors()) {
            populateEditForm(uiModel, questionToEntreprise);
            return "questiontoentreprises/create";
        }
        uiModel.asMap().clear();
        questionService.saveQuestionToEntreprise(questionToEntreprise);
        return "redirect:/questiontoentreprises/" + encodeUrlPathSegment(questionToEntreprise.getId().toString(), httpServletRequest);
    }
    
    @RequestMapping(params = "form", produces = "text/html")
    public String QuestionsController.createForm(Model uiModel) {
        populateEditForm(uiModel, new QuestionToEntreprise());
        return "questiontoentreprises/create";
    }
    
    @RequestMapping(value = "/{id}", produces = "text/html")
    public String QuestionsController.show(@PathVariable("id") Long id, Model uiModel) {
        addDateTimeFormatPatterns(uiModel);
        uiModel.addAttribute("questiontoentreprise", questionService.findQuestionToEntreprise(id));
        uiModel.addAttribute("itemId", id);
        return "questiontoentreprises/show";
    }
    
    @RequestMapping(produces = "text/html")
    public String QuestionsController.list(@RequestParam(value = "page", required = false) Integer page, @RequestParam(value = "size", required = false) Integer size, Model uiModel) {
        if (page != null || size != null) {
            int sizeNo = size == null ? 10 : size.intValue();
            final int firstResult = page == null ? 0 : (page.intValue() - 1) * sizeNo;
            uiModel.addAttribute("questiontoentreprises", questionService.findQuestionToEntrepriseEntries(firstResult, sizeNo));
            float nrOfPages = (float) questionService.countAllQuestionToEntreprises() / sizeNo;
            uiModel.addAttribute("maxPages", (int) ((nrOfPages > (int) nrOfPages || nrOfPages == 0.0) ? nrOfPages + 1 : nrOfPages));
        } else {
            uiModel.addAttribute("questiontoentreprises", questionService.findAllQuestionToEntreprises());
        }
        addDateTimeFormatPatterns(uiModel);
        return "questiontoentreprises/list";
    }
    
    @RequestMapping(method = RequestMethod.PUT, produces = "text/html")
    public String QuestionsController.update(@Valid QuestionToEntreprise questionToEntreprise, BindingResult bindingResult, Model uiModel, HttpServletRequest httpServletRequest) {
        if (bindingResult.hasErrors()) {
            populateEditForm(uiModel, questionToEntreprise);
            return "questiontoentreprises/update";
        }
        uiModel.asMap().clear();
        questionService.updateQuestionToEntreprise(questionToEntreprise);
        return "redirect:/questiontoentreprises/" + encodeUrlPathSegment(questionToEntreprise.getId().toString(), httpServletRequest);
    }
    
    @RequestMapping(value = "/{id}", params = "form", produces = "text/html")
    public String QuestionsController.updateForm(@PathVariable("id") Long id, Model uiModel) {
        populateEditForm(uiModel, questionService.findQuestionToEntreprise(id));
        return "questiontoentreprises/update";
    }
    
    @RequestMapping(value = "/{id}", method = RequestMethod.DELETE, produces = "text/html")
    public String QuestionsController.delete(@PathVariable("id") Long id, @RequestParam(value = "page", required = false) Integer page, @RequestParam(value = "size", required = false) Integer size, Model uiModel) {
        QuestionToEntreprise questionToEntreprise = questionService.findQuestionToEntreprise(id);
        questionService.deleteQuestionToEntreprise(questionToEntreprise);
        uiModel.asMap().clear();
        uiModel.addAttribute("page", (page == null) ? "1" : page.toString());
        uiModel.addAttribute("size", (size == null) ? "10" : size.toString());
        return "redirect:/questiontoentreprises";
    }
    
    void QuestionsController.addDateTimeFormatPatterns(Model uiModel) {
        uiModel.addAttribute("questionToEntreprise_dateofpost_date_format", "dd-MM-yyyy HH:mm");
    }
    
    void QuestionsController.populateEditForm(Model uiModel, QuestionToEntreprise questionToEntreprise) {
        uiModel.addAttribute("questionToEntreprise", questionToEntreprise);
        addDateTimeFormatPatterns(uiModel);
        uiModel.addAttribute("entrepriseaccounts", entrepriseService.findAllEntrepriseAccounts());
        uiModel.addAttribute("useraccounts", userService.findAllUserAccounts());
    }
    
    String QuestionsController.encodeUrlPathSegment(String pathSegment, HttpServletRequest httpServletRequest) {
        String enc = httpServletRequest.getCharacterEncoding();
        if (enc == null) {
            enc = WebUtils.DEFAULT_CHARACTER_ENCODING;
        }
        try {
            pathSegment = UriUtils.encodePathSegment(pathSegment, enc);
        } catch (UnsupportedEncodingException uee) {}
        return pathSegment;
    }
    
}
