package com.dart.serviceclient.domain;
import org.springframework.roo.addon.equals.RooEquals;
import org.springframework.roo.addon.javabean.RooJavaBean;
import org.springframework.roo.addon.serializable.RooSerializable;
import org.springframework.roo.addon.tostring.RooToString;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@RooJavaBean
@RooToString
@RooEquals
@RooSerializable
public class ResetPasswordOnline {

    /**
     */
    @NotNull
    @Size(min = 6, message = "Please password must be at least 6 characters")
    private String password;

    /**
     */
    @NotNull
    @Size(min = 6, message = "Please new password must be at least 6 characters")
    private String newPasswordOne;

    /**
     */
    @NotNull
    @Size(min = 6, message = "Please retype new password must be at least 6 characters")
    private String newPasswordTwo;
}
