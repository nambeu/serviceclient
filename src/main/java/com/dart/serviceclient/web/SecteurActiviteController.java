package com.dart.serviceclient.web;
import com.dart.serviceclient.domain.SecteurActivite;
import org.springframework.roo.addon.web.mvc.controller.scaffold.RooWebScaffold;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@RequestMapping("/secteuractivites")
@Controller
@RooWebScaffold(path = "secteuractivites", formBackingObject = SecteurActivite.class)
public class SecteurActiviteController {
}
