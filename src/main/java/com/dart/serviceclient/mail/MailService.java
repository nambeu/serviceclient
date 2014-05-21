package com.dart.serviceclient.mail;
import org.springframework.stereotype.Service;

@Service
public interface MailService {
	
	public void sendMessage(String mailTo, String message);
}
