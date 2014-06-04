package com.dart.serviceclient.domain;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import org.springframework.roo.addon.equals.RooEquals;
import org.springframework.roo.addon.javabean.RooJavaBean;
import org.springframework.roo.addon.serializable.RooSerializable;
import org.springframework.roo.addon.tostring.RooToString;

@RooJavaBean
@RooToString
@RooEquals
@RooSerializable
public class ResetPasswordBean {

	/**
     */
	@NotNull
	@Size(min = 5, message = "Please enter  at least 5 caracters")
	private String userName;

	/**
     */
	@NotNull
	@Size(min = 6, message = "Please password must be at least 6 characters")
	private String password;

	/**
     */
	@NotNull
	@Size(min = 6, message = "Please password must be at least 6 characters")
	private String passwordOne;

	/**
     */
	@NotNull
	@Size(min = 6, message = "Please password must be at least 6 characters")
	private String passwordTwo;
}
