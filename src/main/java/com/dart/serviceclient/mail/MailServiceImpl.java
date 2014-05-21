package com.dart.serviceclient.mail;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.MailSender;
import org.springframework.mail.SimpleMailMessage;

import com.dart.serviceclient.mail.MailService;

public class MailServiceImpl implements MailService {	
		
		@Autowired
		private transient MailSender mailTemplate;
//		E-mail Sender
		@Autowired
		private transient SimpleMailMessage mySimpleMail;
//		MailMessage	implementation class
		public void sendMessage(String mailTo, String message) {
		
		System.out.println("MailServiceImpl::sendMessage() called.");
		mySimpleMail.setTo(mailTo);
		mySimpleMail.setText(message);
		mailTemplate.send(mySimpleMail);
		
		}
}
