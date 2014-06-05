package com.dart.serviceclient.domain;
import org.springframework.roo.addon.javabean.RooJavaBean;
import org.springframework.roo.addon.jpa.entity.RooJpaEntity;
import org.springframework.roo.addon.tostring.RooToString;
import javax.validation.constraints.NotNull;
import javax.persistence.ManyToOne;
import java.util.Date;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.roo.addon.json.RooJson;

@RooJavaBean
@RooToString
@RooJpaEntity
@RooJson
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
    private UserAccount receiveUser;

    /**
     */
    @Temporal(TemporalType.TIMESTAMP)
    @DateTimeFormat(pattern = "dd-MM-yyyy HH:mm")
    private Date dateOfPost;
}
