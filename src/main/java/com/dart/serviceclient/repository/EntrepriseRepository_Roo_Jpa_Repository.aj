// WARNING: DO NOT EDIT THIS FILE. THIS FILE IS MANAGED BY SPRING ROO.
// You may push code into the target .java compilation unit if you wish to edit any member(s).

package com.dart.serviceclient.repository;

import com.dart.serviceclient.domain.EntrepriseAccount;
import com.dart.serviceclient.repository.EntrepriseRepository;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.stereotype.Repository;

privileged aspect EntrepriseRepository_Roo_Jpa_Repository {
    
    declare parents: EntrepriseRepository extends JpaRepository<EntrepriseAccount, Long>;
    
    declare parents: EntrepriseRepository extends JpaSpecificationExecutor<EntrepriseAccount>;
    
    declare @type: EntrepriseRepository: @Repository;
    
}