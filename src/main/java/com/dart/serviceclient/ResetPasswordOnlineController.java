package com.dart.serviceclient;
import com.dart.serviceclient.domain.ResetPasswordOnline;
import org.springframework.roo.addon.web.mvc.controller.json.RooWebJson;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@RooWebJson(jsonObject = ResetPasswordOnline.class)
@Controller
@RequestMapping("/resetpasswordonlines")
public class ResetPasswordOnlineController {
}
