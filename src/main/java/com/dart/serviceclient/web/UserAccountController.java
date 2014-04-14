package com.dart.serviceclient.web;

import com.dart.serviceclient.domain.UserAccount;
import org.springframework.roo.addon.web.mvc.controller.scaffold.RooWebScaffold;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@RequestMapping("/useraccounts")
@Controller
@RooWebScaffold(path = "useraccounts", formBackingObject = UserAccount.class)
public class UserAccountController {
}
