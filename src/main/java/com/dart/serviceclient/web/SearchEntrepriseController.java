package com.dart.serviceclient.web;
import org.springframework.roo.addon.web.mvc.controller.scaffold.RooWebScaffold;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.dart.serviceclient.domain.SearchEntreprise;

@RequestMapping("/searchentreprises")
@Controller
@RooWebScaffold(path = "searchentreprises", formBackingObject = SearchEntreprise.class)
public class SearchEntrepriseController {
}
