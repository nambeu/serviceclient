package com.dart.serviceclient.web;
import java.awt.image.ImagingOpException;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpRequest;
import org.springframework.roo.addon.web.mvc.controller.scaffold.RooWebScaffold;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;

import com.dart.serviceclient.domain.EntrepriseAccount;
import com.dart.serviceclient.domain.SecteurActivite;
import com.dart.serviceclient.domain.UserAccount;
import com.dart.serviceclient.security.Security;
import com.dart.serviceclient.service.EntrepriseService;
import com.dart.serviceclient.service.SecteurActiviteService;


@RequestMapping("/entrepriseaccounts")
@Controller
@RooWebScaffold(path = "entrepriseaccounts", formBackingObject = EntrepriseAccount.class)
public class EntrepriseAccountController {

	@Autowired
    Security security;
	
	
		
    @RequestMapping(value = "/creerEntreprise")
    public String createEntreprise(HttpServletRequest request, Model uiModel) {
    	 
    	List<SecteurActivite> listSectors = secteurActiviteService.findAllSecteurActivites();
    	
    	uiModel.addAttribute("secteurActivites",listSectors);
    	uiModel.addAttribute("entrepriseAccount",new EntrepriseAccount());
    	return "createEntreprise";
        
    }
    
    @RequestMapping(value = "/saveEntreprise", method=RequestMethod.POST)
    public String saveEntreprise(@Valid EntrepriseAccount entreprise,
    		BindingResult binding, Model uiModel,HttpServletRequest request){
    	
    	// ecrire la methode de création
    	System.out.println("erreur lors de la creation de l'entreprise");
    	
    	UserAccount user = security.getUserAccount();
    	System.out.println(user);
    	if (binding.hasErrors()){
    		System.out.println("erreur lors de la creation de l'entreprise");
    		uiModel.addAttribute("entrepriseAccount",entreprise );
    		return "createEntreprise";
    	}
    	if( entreprise.getRaisonSocial()!= null && !entreprise.getRaisonSocial().isEmpty()){
    		if(entreprise.getRegistreDeCormmerce() != null && !entreprise.getRegistreDeCormmerce().isEmpty()){
    			if (entreprise.getSecteurActivite() != null){
    	
    				System.out.println("aucune erreur");
    		    	entreprise.setUserCreator(user);
    		    	entrepriseService.saveEntrepriseAccount(entreprise);
    		    	uiModel.addAttribute("msg", "entreprise creee avec succès");
    		    	
    			}
    		}
    	}else uiModel.addAttribute("msg", "erreur lors de la creation de l'entite");
    	
    	return "createEntreprise";
    	
    	
    	/*try {
    		if (!logo.isEmpty()){
    			validateImage(logo);
    			saveImage(entreprise.getId()+".jpg",logo);
    			entreprise.setUserCreator(user);
    	    	entrepriseService.saveEntrepriseAccount(entreprise);
    		} 
    		}catch (ImagingOpException e) {
				// TODO: handle exception
    			binding.reject(e.getMessage());
    			return "createEntreprise";
			}*/
    	
    	//return "";
    }
}