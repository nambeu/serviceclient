// WARNING: DO NOT EDIT THIS FILE. THIS FILE IS MANAGED BY SPRING ROO.
// You may push code into the target .java compilation unit if you wish to edit any member(s).

package com.dart.serviceclient.domain;

import com.dart.serviceclient.domain.UserAccount;
import java.util.Date;

privileged aspect UserAccount_Roo_JavaBean {
    
    public String UserAccount.getUserName() {
        return this.userName;
    }
    
    public void UserAccount.setUserName(String userName) {
        this.userName = userName;
    }
    
    public String UserAccount.getPassword() {
        return this.password;
    }
    
    public void UserAccount.setPassword(String password) {
        this.password = password;
    }
    
    public String UserAccount.getConfPassword() {
        return this.confPassword;
    }
    
    public void UserAccount.setConfPassword(String confPassword) {
        this.confPassword = confPassword;
    }
    
    public String UserAccount.getEmail() {
        return this.email;
    }
    
    public void UserAccount.setEmail(String email) {
        this.email = email;
    }
    
    public Date UserAccount.getAccountExpiration() {
        return this.accountExpiration;
    }
    
    public void UserAccount.setAccountExpiration(Date accountExpiration) {
        this.accountExpiration = accountExpiration;
    }
    
    public boolean UserAccount.isDisableLogin() {
        return this.disableLogin;
    }
    
    public void UserAccount.setDisableLogin(boolean disableLogin) {
        this.disableLogin = disableLogin;
    }
    
    public boolean UserAccount.isAccountLocked() {
        return this.accountLocked;
    }
    
    public void UserAccount.setAccountLocked(boolean accountLocked) {
        this.accountLocked = accountLocked;
    }
    
    public Date UserAccount.getCredentialExpiration() {
        return this.credentialExpiration;
    }
    
    public void UserAccount.setCredentialExpiration(Date credentialExpiration) {
        this.credentialExpiration = credentialExpiration;
    }
    
}
