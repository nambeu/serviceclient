package com.dart.serviceclient.domain;
import java.util.Date;
import java.util.HashSet;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.ElementCollection;
import javax.persistence.FetchType;
import javax.persistence.PostPersist;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

import org.apache.commons.codec.digest.DigestUtils;
import org.apache.commons.lang3.time.DateUtils;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.roo.addon.javabean.RooJavaBean;
import org.springframework.roo.addon.jpa.entity.RooJpaEntity;
import org.springframework.roo.addon.tostring.RooToString;
import org.springframework.util.Assert;

import com.dart.serviceclient.service.UserService;

@RooJavaBean
@RooToString
@RooJpaEntity
public class UserAccount {

<<<<<<< HEAD
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

    /**
     */
    @ElementCollection(fetch=FetchType.EAGER)
    private Set<UserRole> roles = new HashSet<UserRole>();
    
    @PostPersist
    private void postPersist(){
    	this.accountExpiration = this.accountExpiration == null ? DateUtils.addYears(new Date(), 10) : this.accountExpiration;
    	this.credentialExpiration = this.credentialExpiration == null ? DateUtils.addYears(new Date(), 10) : this.credentialExpiration ;
    	this.password = encryptPassword(this.password);
    }

	private String encryptPassword(String pwd) {
		Assert.notNull(pwd, "Null password");
		return DigestUtils.sha256Hex(pwd);
	}


}
