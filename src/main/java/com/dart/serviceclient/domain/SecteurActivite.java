package com.dart.serviceclient.domain;
import org.springframework.roo.addon.javabean.RooJavaBean;
import org.springframework.roo.addon.jpa.entity.RooJpaEntity;
import org.springframework.roo.addon.tostring.RooToString;
import javax.persistence.Column;
import javax.validation.constraints.NotNull;

@RooJavaBean
@RooToString
@RooJpaEntity
public class SecteurActivite {

    /**
     */
    @NotNull
    @Column(unique = true)
    private String libelle;

    /**
     */
    private String description;
}
