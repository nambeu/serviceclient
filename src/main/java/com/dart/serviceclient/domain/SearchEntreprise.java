package com.dart.serviceclient.domain;

import javax.persistence.ManyToOne;
import javax.validation.constraints.NotNull;

import org.springframework.roo.addon.equals.RooEquals;
import org.springframework.roo.addon.javabean.RooJavaBean;
import org.springframework.roo.addon.serializable.RooSerializable;
import org.springframework.roo.addon.tostring.RooToString;

@RooJavaBean
@RooToString
@RooEquals
@RooSerializable
public class SearchEntreprise {

	/**
     */
	@NotNull
	private String searchValue;

	/**
     */
	@NotNull
	@ManyToOne
	private SecteurActivite secteurActivite;
}
