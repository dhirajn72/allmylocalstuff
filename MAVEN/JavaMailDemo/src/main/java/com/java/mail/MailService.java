package com.java.mail;

import java.util.Date;
import java.util.Properties;

import javax.mail.Authenticator;
import javax.mail.Message;
import javax.mail.PasswordAuthentication;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;

public class MailService {
	private static String UNAME = "dhirajkr.info@gmail.com";
	private static String PASSWORD = "DhirajSingh90";

	public static void sendMail(String to, String sub, String data) {
		try {
			Message msg = getMessageForMail();
			msg.setSubject(sub);
			msg.setFrom(new InternetAddress(UNAME, "ACI WorldWide"));
			msg.setRecipient(Message.RecipientType.TO, new InternetAddress(to));
			msg.setRecipient(Message.RecipientType.BCC, new InternetAddress(
					"dhirajn72@gmail.com"));
			msg.setSentDate(new Date());
			msg.setContent(data, "text/html");
			Transport.send(msg);
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	private static Message getMessageForMail() {
		Authenticator auth = new MyPasswordAuthenticator();
		Properties p = new Properties();
		p.put("mail.smtp.host", "smtp.gmail.com");
		p.put("mail.smtp.socketFactory.port", "465");
		p.put("mail.smtp.socketFactory.class", "javax.net.ssl.SSLSocketFactory");
		p.put("mail.smtp.auth", "true");
		p.put("mail.smtp.port", "465");
		Session sess = Session.getInstance(p, auth);
		Message msg = new MimeMessage(sess);
		return msg;
	}

	static class MyPasswordAuthenticator extends Authenticator {
		protected PasswordAuthentication getPasswordAuthentication() {
			System.out.println("--getPasswordAuthentication() called--");
			return new PasswordAuthentication(UNAME, PASSWORD);
		}
	}

}
