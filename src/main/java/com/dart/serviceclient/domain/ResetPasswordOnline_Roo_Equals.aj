// WARNING: DO NOT EDIT THIS FILE. THIS FILE IS MANAGED BY SPRING ROO.
// You may push code into the target .java compilation unit if you wish to edit any member(s).

package com.dart.serviceclient.domain;

import com.dart.serviceclient.domain.ResetPasswordOnline;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;

privileged aspect ResetPasswordOnline_Roo_Equals {
    
    public boolean ResetPasswordOnline.equals(Object obj) {
        if (!(obj instanceof ResetPasswordOnline)) {
            return false;
        }
        if (this == obj) {
            return true;
        }
        ResetPasswordOnline rhs = (ResetPasswordOnline) obj;
        return new EqualsBuilder().append(newPasswordOne, rhs.newPasswordOne).append(newPasswordTwo, rhs.newPasswordTwo).append(password, rhs.password).isEquals();
    }
    
    public int ResetPasswordOnline.hashCode() {
        return new HashCodeBuilder().append(newPasswordOne).append(newPasswordTwo).append(password).toHashCode();
    }
    
}
