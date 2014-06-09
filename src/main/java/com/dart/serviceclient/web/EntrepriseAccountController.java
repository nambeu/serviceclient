package com.dart.serviceclient.web;

import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.roo.addon.web.mvc.controller.scaffold.RooWebScaffold;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.dart.serviceclient.domain.EntrepriseAccount;
import com.dart.serviceclient.domain.SearchEntreprise;
import com.dart.serviceclient.domain.SecteurActivite;
import com.dart.serviceclient.domain.UserAccount;
import com.dart.serviceclient.security.Security;

@RequestMapping("/entrepriseaccounts")
@Controller
@RooWebScaffold(path = "entrepriseaccounts", formBackingObject = EntrepriseAccount.class)
public class EntrepriseAccountController {

	@Autowired
	Security security;

	@RequestMapping(value = "/creerEntreprise")
	public String createEntreprise(HttpServletRequest request, Model uiModel) {

		List<SecteurActivite> listSectors = secteurActiviteService
				.findAllSecteurActivites();

		uiModel.addAttribute("secteurActivites", listSectors);
		uiModel.addAttribute("entrepriseAccount", new EntrepriseAccount());
		return "createEntreprise";

	}

	@RequestMapping(value = "/saveEntreprise", method = RequestMethod.POST)
	public String saveEntreprise(@Valid EntrepriseAccount entreprise,
			BindingResult binding, Model uiModel, HttpServletRequest request) {

		// ecrire la methode de création
		System.out.println("erreur lors de la creation de l'entreprise");

		UserAccount user = security.getUserAccount();
		System.out.println(user);
		if (binding.hasErrors()) {
			System.out.println("erreur lors de la creation de l'entreprise");
			uiModel.addAttribute("entrepriseAccount", entreprise);
			return "createEntreprise";
		}
		if (entreprise.getRaisonSocial() != null
				&& !entreprise.getRaisonSocial().isEmpty()) {
			if (entreprise.getRegistreDeCormmerce() != null
					&& !entreprise.getRegistreDeCormmerce().isEmpty()) {
				if (entreprise.getSecteurActivite() != null) {

					System.out.println("aucune erreur");
					entreprise.setUserCreator(user);
					entrepriseService.saveEntrepriseAccount(entreprise);
					uiModel.addAttribute("msg", "entreprise creee avec succès");

				}
			}
		} else
			uiModel.addAttribute("msg",
					"erreur lors de la creation de l'entite");

		return "createEntreprise";

		/*
		 * try { if (!logo.isEmpty()){ validateImage(logo);
		 * saveImage(entreprise.getId()+".jpg",logo);
		 * entreprise.setUserCreator(user);
		 * entrepriseService.saveEntrepriseAccount(entreprise); } }catch
		 * (ImagingOpException e) { // TODO: handle exception
		 * binding.reject(e.getMessage()); return "createEntreprise"; }
		 */

		// return "";
	}

	@RequestMapping(value = "/listEntreprise")
	public String listEntreprise(Model uiModel) {

		List<EntrepriseAccount> listEntrep = entrepriseService
				.findAllEntrepriseAccounts();

		List<SecteurActivite> listSectors = secteurActiviteService
				.findAllSecteurActivites();

		uiModel.addAttribute("secteurActivites", listSectors);
		uiModel.addAttribute("searchEntreprise", new SearchEntreprise());

		uiModel.addAttribute("listEntrep", listEntrep);
		return "listEntreprise";
	}

	@RequestMapping(value = "/listOneEntreprise")
	public String listOneEntreprise(Model uiModel,
			@RequestParam(value = "idEntreprise") int id) {

		EntrepriseAccount oneEntreprise = entrepriseService
				.findEntrepriseAccount((long) id);

		List<SecteurActivite> listSectors = secteurActiviteService
				.findAllSecteurActivites();

		uiModel.addAttribute("secteurActivites", listSectors);
		uiModel.addAttribute("searchEntreprise", new SearchEntreprise());

		uiModel.addAttribute("oneEntreprise", oneEntreprise);
		return "listOneEntreprise";
	}

	@RequestMapping(value = "/searchEntreprise")
	public String searchEntreprise(@Valid SearchEntreprise searchEntreprise,
			Model uiModel, HttpServletRequest HttpServletRequest) {

		List<EntrepriseAccount> list = entrepriseService
				.findBySecteurActivite_libelle(searchEntreprise
						.getSecteurActivite().getLibelle());

		List<EntrepriseAccount> listToShow = new ArrayList<EntrepriseAccount>();
		String[] strToSearch = searchEntreprise.getSearchValue().split(" ");

		for (EntrepriseAccount entrepriseAccount : list) {

			for (int i = 0; i < strToSearch.length; i++) {
				if (entrepriseAccount.getRaisonSocial().indexOf(strToSearch[i]) != -1) {

					if (!listToShow.contains(entrepriseAccount)) {
						listToShow.add(entrepriseAccount);
					}
				}
			}
		}

		uiModel.addAttribute("listSearch", listToShow);

		return "listEntreprise";
	}
}