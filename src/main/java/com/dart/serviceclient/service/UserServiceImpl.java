package com.dart.serviceclient.service;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.PersistenceContext;
import javax.persistence.PersistenceUnit;

import org.springframework.stereotype.Service;
import org.springframework.util.Assert;

import com.dart.serviceclient.domain.UserAccount;
import com.dart.serviceclient.repository.UserRepository;

@Service
public class UserServiceImpl implements UserService {
	
	@PersistenceContext
	private EntityManager em;
	
	@PostConstruct
	public void postConstruct(){
		Assert.notNull(em, "Oups !! Entity manager est null");	
		System.out.println("My Entity manager : "+em.getMetamodel().getEntities());
		// pr afficher les types on place ds une variable et on parcours pr afficher 
		// le name avec getName car il sagit d'1 Set
	}

	@Override
	public boolean isAnEmail(String email) {
		boolean result = false;
		ArrayList<UserAccount> accounts = (ArrayList<UserAccount>) this
				.findAllUserAccounts();
		for (int i = 0; i < accounts.size(); i++) {
			if (accounts.get(i).getEmail().equals(email)) {
				result = true;
				break;
			}
		}
		return result;
	}

	@Override
	public String generatePassword() {
		return "this is the password";
	}

	@Override
	public boolean sendPassword(String email, String password) {
		return true;
	}

	public List<UserAccount> findByUserName(String userName) {
		return userRepository.findByUserName(userName);
	}
	
	public List<UserAccount> findByEmail(String email) {
		return userRepository.findByEmail(email);
	}

}
