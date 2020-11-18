package modelBO;


import java.util.Properties;

import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.AddressException;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;

public class JavaEmail {

	Properties emailProperties;
	Session mailSession;
	MimeMessage emailMessage;

//	public static void main(String args[]) throws AddressException,
//			MessagingException {
//
//		JavaEmail javaEmail = new JavaEmail();
//
//		javaEmail.setMailServerProperties();
//		javaEmail.createEmailMessage();
//		javaEmail.sendEmail();
//	}
	

	public void setMailServerProperties() {

		String emailPort = "587";//gmail's smtp port

		emailProperties = System.getProperties();
		emailProperties.put("mail.smtp.port", emailPort);
		emailProperties.put("mail.smtp.auth", "true");
		emailProperties.put("mail.smtp.starttls.enable", "true");

	}

	public void createEmailMessage(String to, String sub, String con) throws AddressException,
			MessagingException {
		String[] toEmails = to.split(",");
		String emailSubject = sub;
		String emailBody = con;

		mailSession = Session.getDefaultInstance(emailProperties, null);
		emailMessage = new MimeMessage(mailSession);

		for (int i = 0; i < toEmails.length; i++) {
			emailMessage.addRecipient(Message.RecipientType.TO, new InternetAddress(toEmails[i]));
		}

		emailMessage.setSubject(emailSubject);
		emailMessage.setContent(emailBody, "text/html");//for a html email
		//emailMessage.setText(emailBody);// for a text email

	}

	public void sendEmail(String info, String pa) throws AddressException, MessagingException {

		String emailHost = "smtp.gmail.com";
		String fromUser = info;//just the id alone without @gmail.com
		String fromUserEmailPassword = pa;

		Transport transport = mailSession.getTransport("smtp");

		transport.connect(emailHost, fromUser, fromUserEmailPassword);
		transport.sendMessage(emailMessage, emailMessage.getAllRecipients());
		transport.close();
		System.out.println("Email sent successfully.");
	}


	public static Boolean Gmail(String info, String pa, String to, String sub, String con) {
		// TODO Auto-generated method stub
		try {
			JavaEmail javaEmail = new JavaEmail();

			javaEmail.setMailServerProperties();
			javaEmail.createEmailMessage(to,sub,con);
			javaEmail.sendEmail(info,pa);
			return true;
		}catch(Exception e) {
			e.printStackTrace();
			return false;
		}
	}

}
