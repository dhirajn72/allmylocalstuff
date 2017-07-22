package com.java.mail;

public class Test1 {

	public static void main(String[] args) {
		String to = "dhirajkumar.co.in@gmail.com";
		String sub = "Test mail from DK";
		String data = "<font color='red'> This is a message from Java APP</font>";
		MailService.sendMail(to, sub, data);
		System.out.println("mail sent");

	}

}
