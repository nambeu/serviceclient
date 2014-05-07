package com.dart.serviceclient.domain;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.roo.addon.javabean.RooJavaBean;
import org.springframework.roo.addon.jpa.entity.RooJpaEntity;
import org.springframework.roo.addon.tostring.RooToString;

import com.dart.serviceclient.service.UserService;

@RooJavaBean
@RooToString
@RooJpaEntity
public class UserAccount {

	@Column(unique = true)
	@NotNull
	@Size(min = 5, message = "Please enter  at least 5 caracters")
	private String userName;

	@NotNull
	@Size(min = 6, message = "Please your password must be at least 6 characters")
	private String password;

	private String confirmPassword;

	@NotNull
	@Pattern(regexp = "[A-Za-z0-9._%+-]+@[A-Za-z0-9.-]+\\.[A-Za-z]{2,4}", message = "Please enter your e-mail address !!")
	private String email;

	@Temporal(TemporalType.TIMESTAMP)
	@DateTimeFormat(pattern = "dd-MM-yyyy HH:mm")
	private Date accountExpiration;

	private boolean disableLogin;

	private boolean accountLocked;

	@Temporal(TemporalType.TIMESTAMP)
	@DateTimeFormat(pattern = "dd-MM-yyyy HH:mm")
	private Date credentialExpiration;

}
