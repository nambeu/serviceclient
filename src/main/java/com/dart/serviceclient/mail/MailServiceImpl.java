package com.dart.serviceclient.mail;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.MailSender;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.stereotype.Component;

import com.dart.serviceclient.mail.MailService;

@Component //on peut oci mettre @Service @Component
public class MailServiceImpl implements MailService {	
		
		@Autowired
		private MailSender mailTemplate;
//		E-mail Sender
		@Autowired
		private SimpleMailMessage mySimpleMail;
//		MailMessage	implementation class
		public void sendMessage(String mailTo, String message) {
		
		System.out.println("MailServiceImpl::sendMessage() called.");
		mySimpleMail.setTo(mailTo);
		mySimpleMail.setText(message);
		mailTemplate.send(mySimpleMail);
		
		}
}
