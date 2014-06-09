package com.dart.serviceclient.domain;

import java.util.Date;

import javax.persistence.ManyToOne;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.Max;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.roo.addon.javabean.RooJavaBean;
import org.springframework.roo.addon.jpa.entity.RooJpaEntity;
import org.springframework.roo.addon.tostring.RooToString;

@RooJavaBean
@RooToString
@RooJpaEntity
public class QuestionToEntreprise {

	/**
     */
	@NotNull
	private String title;

	/**
     */
	@NotNull
	private String content;

	/**
     */
	@ManyToOne
	private UserAccount postUser;

	/**
     */
	@ManyToOne
	private EntrepriseAccount receiveEntreprise;

	/**
     */
	// private boolean show;
	/**
     */
	@Temporal(TemporalType.TIMESTAMP)
	@DateTimeFormat(pattern = "dd-MM-yyyy HH:mm")
	private Date dateOfPost;
}
