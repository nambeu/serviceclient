package com.dart.serviceclient.domain;
import org.springframework.roo.addon.javabean.RooJavaBean;
import org.springframework.roo.addon.jpa.activerecord.RooJpaActiveRecord;
import org.springframework.roo.addon.tostring.RooToString;

import javax.persistence.Column;
import javax.persistence.ManyToOne;
import javax.validation.constraints.NotNull;

@RooJavaBean
@RooToString
@RooJpaActiveRecord
public class EntrepriseAccount {

    /**
     */
	@NotNull
    @Column(unique = true)
    private String raisonSocial;

    /**
     */
    @NotNull
    private String registreDeCormmerce;

    /**
     */
    private String logo;
    
    @NotNull
    @ManyToOne
    private UserAccount userCreator;
    
    @ManyToOne
    private SecteurActivite secteurActivite;
}
