// WARNING: DO NOT EDIT THIS FILE. THIS FILE IS MANAGED BY SPRING ROO.
// You may push code into the target .java compilation unit if you wish to edit any member(s).

package com.dart.serviceclient.web;

import com.dart.serviceclient.domain.UserAccount;
import com.dart.serviceclient.domain.UserRole;
import com.dart.serviceclient.service.UserService;
import com.dart.serviceclient.web.UserAccountController;
import java.io.UnsupportedEncodingException;
import java.util.Arrays;
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

privileged aspect UserAccountController_Roo_Controller {
    
    @Autowired
    UserService UserAccountController.userService;
    
    @RequestMapping(method = RequestMethod.POST, produces = "text/html")
    public String UserAccountController.create(@Valid UserAccount userAccount, BindingResult bindingResult, Model uiModel, HttpServletRequest httpServletRequest) {
        if (bindingResult.hasErrors()) {
            populateEditForm(uiModel, userAccount);
            return "useraccounts/create";
        }
        uiModel.asMap().clear();
        userService.saveUserAccount(userAccount);
        return "redirect:/useraccounts/" + encodeUrlPathSegment(userAccount.getId().toString(), httpServletRequest);
    }
    
    @RequestMapping(params = "form", produces = "text/html")
    public String UserAccountController.createForm(Model uiModel) {
        populateEditForm(uiModel, new UserAccount());
        return "useraccounts/create";
    }
    
    @RequestMapping(value = "/{id}", produces = "text/html")
    public String UserAccountController.show(@PathVariable("id") Long id, Model uiModel) {
        addDateTimeFormatPatterns(uiModel);
        uiModel.addAttribute("useraccount", userService.findUserAccount(id));
        uiModel.addAttribute("itemId", id);
        return "useraccounts/show";
    }
    
    @RequestMapping(produces = "text/html")
    public String UserAccountController.list(@RequestParam(value = "page", required = false) Integer page, @RequestParam(value = "size", required = false) Integer size, Model uiModel) {
        if (page != null || size != null) {
            int sizeNo = size == null ? 10 : size.intValue();
            final int firstResult = page == null ? 0 : (page.intValue() - 1) * sizeNo;
            uiModel.addAttribute("useraccounts", userService.findUserAccountEntries(firstResult, sizeNo));
            float nrOfPages = (float) userService.countAllUserAccounts() / sizeNo;
            uiModel.addAttribute("maxPages", (int) ((nrOfPages > (int) nrOfPages || nrOfPages == 0.0) ? nrOfPages + 1 : nrOfPages));
        } else {
            uiModel.addAttribute("useraccounts", userService.findAllUserAccounts());
        }
        addDateTimeFormatPatterns(uiModel);
        return "useraccounts/list";
    }
    
    @RequestMapping(method = RequestMethod.PUT, produces = "text/html")
    public String UserAccountController.update(@Valid UserAccount userAccount, BindingResult bindingResult, Model uiModel, HttpServletRequest httpServletRequest) {
        if (bindingResult.hasErrors()) {
            populateEditForm(uiModel, userAccount);
            return "useraccounts/update";
        }
        uiModel.asMap().clear();
        userService.updateUserAccount(userAccount);
        return "redirect:/useraccounts/" + encodeUrlPathSegment(userAccount.getId().toString(), httpServletRequest);
    }
    
    @RequestMapping(value = "/{id}", params = "form", produces = "text/html")
    public String UserAccountController.updateForm(@PathVariable("id") Long id, Model uiModel) {
        populateEditForm(uiModel, userService.findUserAccount(id));
        return "useraccounts/update";
    }
    
    @RequestMapping(value = "/{id}", method = RequestMethod.DELETE, produces = "text/html")
    public String UserAccountController.delete(@PathVariable("id") Long id, @RequestParam(value = "page", required = false) Integer page, @RequestParam(value = "size", required = false) Integer size, Model uiModel) {
        UserAccount userAccount = userService.findUserAccount(id);
        userService.deleteUserAccount(userAccount);
        uiModel.asMap().clear();
        uiModel.addAttribute("page", (page == null) ? "1" : page.toString());
        uiModel.addAttribute("size", (size == null) ? "10" : size.toString());
        return "redirect:/useraccounts";
    }
    
    void UserAccountController.addDateTimeFormatPatterns(Model uiModel) {
        uiModel.addAttribute("userAccount_accountexpiration_date_format", "dd-MM-yyyy HH:mm");
        uiModel.addAttribute("userAccount_credentialexpiration_date_format", "dd-MM-yyyy HH:mm");
    }
    
    void UserAccountController.populateEditForm(Model uiModel, UserAccount userAccount) {
        uiModel.addAttribute("userAccount", userAccount);
        addDateTimeFormatPatterns(uiModel);
        uiModel.addAttribute("userroles", Arrays.asList(UserRole.values()));
    }
    
    String UserAccountController.encodeUrlPathSegment(String pathSegment, HttpServletRequest httpServletRequest) {
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
