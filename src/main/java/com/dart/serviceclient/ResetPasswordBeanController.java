package com.dart.serviceclient;
import com.dart.serviceclient.domain.ResetPasswordBean;
import org.springframework.roo.addon.web.mvc.controller.json.RooWebJson;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@RooWebJson(jsonObject = ResetPasswordBean.class)
@Controller
@RequestMapping("/resetpasswordbeans")
public class ResetPasswordBeanController {
}
