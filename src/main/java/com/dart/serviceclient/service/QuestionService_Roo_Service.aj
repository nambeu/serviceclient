// WARNING: DO NOT EDIT THIS FILE. THIS FILE IS MANAGED BY SPRING ROO.
// You may push code into the target .java compilation unit if you wish to edit any member(s).

package com.dart.serviceclient.service;

import com.dart.serviceclient.domain.QuestionToEntreprise;
import com.dart.serviceclient.service.QuestionService;
import java.util.List;

privileged aspect QuestionService_Roo_Service {
    
    public abstract long QuestionService.countAllQuestionToEntreprises();    
    public abstract void QuestionService.deleteQuestionToEntreprise(QuestionToEntreprise questionToEntreprise);    
    public abstract QuestionToEntreprise QuestionService.findQuestionToEntreprise(Long id);    
    public abstract List<QuestionToEntreprise> QuestionService.findAllQuestionToEntreprises();    
    public abstract List<QuestionToEntreprise> QuestionService.findQuestionToEntrepriseEntries(int firstResult, int maxResults);    
    public abstract void QuestionService.saveQuestionToEntreprise(QuestionToEntreprise questionToEntreprise);    
    public abstract QuestionToEntreprise QuestionService.updateQuestionToEntreprise(QuestionToEntreprise questionToEntreprise);    
}