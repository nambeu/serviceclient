// WARNING: DO NOT EDIT THIS FILE. THIS FILE IS MANAGED BY SPRING ROO.
// You may push code into the target .java compilation unit if you wish to edit any member(s).

package com.dart.serviceclient.service;

import com.dart.serviceclient.domain.SecteurActivite;
import com.dart.serviceclient.service.SecteurActiviteService;
import java.util.List;

privileged aspect SecteurActiviteService_Roo_Service {
    
    public abstract long SecteurActiviteService.countAllSecteurActivites();    
    public abstract void SecteurActiviteService.deleteSecteurActivite(SecteurActivite secteurActivite);    
    public abstract SecteurActivite SecteurActiviteService.findSecteurActivite(Long id);    
    public abstract List<SecteurActivite> SecteurActiviteService.findAllSecteurActivites();    
    public abstract List<SecteurActivite> SecteurActiviteService.findSecteurActiviteEntries(int firstResult, int maxResults);    
    public abstract void SecteurActiviteService.saveSecteurActivite(SecteurActivite secteurActivite);    
    public abstract SecteurActivite SecteurActiviteService.updateSecteurActivite(SecteurActivite secteurActivite);    
}
