// WARNING: DO NOT EDIT THIS FILE. THIS FILE IS MANAGED BY SPRING ROO.
// You may push code into the target .java compilation unit if you wish to edit any member(s).

package com.dart.serviceclient.web;

import com.dart.serviceclient.domain.SecteurActivite;
import com.dart.serviceclient.service.SecteurActiviteService;
import com.dart.serviceclient.web.SecteurActiviteController;
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

privileged aspect SecteurActiviteController_Roo_Controller {
    
    @Autowired
    SecteurActiviteService SecteurActiviteController.secteurActiviteService;
    
    @RequestMapping(method = RequestMethod.POST, produces = "text/html")
    public String SecteurActiviteController.create(@Valid SecteurActivite secteurActivite, BindingResult bindingResult, Model uiModel, HttpServletRequest httpServletRequest) {
        if (bindingResult.hasErrors()) {
            populateEditForm(uiModel, secteurActivite);
            return "secteuractivites/create";
        }
        uiModel.asMap().clear();
        secteurActiviteService.saveSecteurActivite(secteurActivite);
        return "redirect:/secteuractivites/" + encodeUrlPathSegment(secteurActivite.getId().toString(), httpServletRequest);
    }
    
    @RequestMapping(params = "form", produces = "text/html")
    public String SecteurActiviteController.createForm(Model uiModel) {
        populateEditForm(uiModel, new SecteurActivite());
        return "secteuractivites/create";
    }
    
    @RequestMapping(value = "/{id}", produces = "text/html")
    public String SecteurActiviteController.show(@PathVariable("id") Long id, Model uiModel) {
        uiModel.addAttribute("secteuractivite", secteurActiviteService.findSecteurActivite(id));
        uiModel.addAttribute("itemId", id);
        return "secteuractivites/show";
    }
    
    @RequestMapping(produces = "text/html")
    public String SecteurActiviteController.list(@RequestParam(value = "page", required = false) Integer page, @RequestParam(value = "size", required = false) Integer size, Model uiModel) {
        if (page != null || size != null) {
            int sizeNo = size == null ? 10 : size.intValue();
            final int firstResult = page == null ? 0 : (page.intValue() - 1) * sizeNo;
            uiModel.addAttribute("secteuractivites", secteurActiviteService.findSecteurActiviteEntries(firstResult, sizeNo));
            float nrOfPages = (float) secteurActiviteService.countAllSecteurActivites() / sizeNo;
            uiModel.addAttribute("maxPages", (int) ((nrOfPages > (int) nrOfPages || nrOfPages == 0.0) ? nrOfPages + 1 : nrOfPages));
        } else {
            uiModel.addAttribute("secteuractivites", secteurActiviteService.findAllSecteurActivites());
        }
        return "secteuractivites/list";
    }
    
    @RequestMapping(method = RequestMethod.PUT, produces = "text/html")
    public String SecteurActiviteController.update(@Valid SecteurActivite secteurActivite, BindingResult bindingResult, Model uiModel, HttpServletRequest httpServletRequest) {
        if (bindingResult.hasErrors()) {
            populateEditForm(uiModel, secteurActivite);
            return "secteuractivites/update";
        }
        uiModel.asMap().clear();
        secteurActiviteService.updateSecteurActivite(secteurActivite);
        return "redirect:/secteuractivites/" + encodeUrlPathSegment(secteurActivite.getId().toString(), httpServletRequest);
    }
    
    @RequestMapping(value = "/{id}", params = "form", produces = "text/html")
    public String SecteurActiviteController.updateForm(@PathVariable("id") Long id, Model uiModel) {
        populateEditForm(uiModel, secteurActiviteService.findSecteurActivite(id));
        return "secteuractivites/update";
    }
    
    @RequestMapping(value = "/{id}", method = RequestMethod.DELETE, produces = "text/html")
    public String SecteurActiviteController.delete(@PathVariable("id") Long id, @RequestParam(value = "page", required = false) Integer page, @RequestParam(value = "size", required = false) Integer size, Model uiModel) {
        SecteurActivite secteurActivite = secteurActiviteService.findSecteurActivite(id);
        secteurActiviteService.deleteSecteurActivite(secteurActivite);
        uiModel.asMap().clear();
        uiModel.addAttribute("page", (page == null) ? "1" : page.toString());
        uiModel.addAttribute("size", (size == null) ? "10" : size.toString());
        return "redirect:/secteuractivites";
    }
    
    void SecteurActiviteController.populateEditForm(Model uiModel, SecteurActivite secteurActivite) {
        uiModel.addAttribute("secteurActivite", secteurActivite);
    }
    
    String SecteurActiviteController.encodeUrlPathSegment(String pathSegment, HttpServletRequest httpServletRequest) {
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
