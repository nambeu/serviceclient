package com.dart.serviceclient.domain;
import java.awt.image.ImagingOpException;

import org.springframework.roo.addon.javabean.RooJavaBean;
import org.springframework.roo.addon.jpa.activerecord.RooJpaActiveRecord;
import org.springframework.roo.addon.tostring.RooToString;
import org.springframework.web.multipart.MultipartFile;

import javax.persistence.Column;
import javax.persistence.ManyToOne;
import javax.validation.constraints.NotNull;

@RooJavaBean
@RooToString
@RooJpaActiveRecord
public class EntrepriseAccount {

    /**
     */
	@NotNull(message= "entrez le nom de l'entreprise")
    @Column(unique = true)
    private String raisonSocial;

    /**
     */
    @NotNull(message= "entrez le registre de commerce")
    private String registreDeCormmerce;

    /**
     */
    private String logo;
    
    
    @ManyToOne
    private UserAccount UserCreator;
    
    @ManyToOne
    private SecteurActivite secteurActivite;
    
    public void validateImage(MultipartFile image){
    	if(!image.getContentType().equals("image/jpeg")){
    		throw new ImagingOpException("Only JPG images accepted");
    	}
    }
}
