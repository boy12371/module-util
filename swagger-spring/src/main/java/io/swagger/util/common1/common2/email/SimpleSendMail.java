package io.swagger.util.common1.common2.email;
import java.util.*;
import javax.mail.*;
import javax.mail.internet.*;

public class SimpleSendMail {
	public SimpleSendMail() {
	}

	public static void main(String[] args) {
		String host = "smtp.163.com";// ���Լ�������
		String to = "mchotdog_011@126.com";// Ҫ����˭
		String from = "mchotdog_011@163.com";// ����ʺ�
		String subject = "���Ͳ���";// ����
		String messageText = "http://ltchina.net";// ����
		boolean sessionDebug = false;
		Properties props = new Properties();
		props.put("mail.smtp.host", host);
		//props.put("mail.transport.protocol", "smtp");
		props.put("mail.smtp.auth", "true");
		// ϵͳ��Ҫ����Ϣ
		Session session = Session.getDefaultInstance(props, null);
		// һ�ζԻ���һ��session �����session Ҫ��ȥ�̶��ķ����ʼ���Ϣ
		session.setDebug(sessionDebug);
		try {
			MimeMessage meg = new MimeMessage(session);// ������Ϣʵ��
			meg.setFrom(new InternetAddress(from));// ָ��������
			InternetAddress[] address = { new InternetAddress(to) };// �����ռ��˵�ַ����
			meg.setRecipients(Message.RecipientType.TO, address);// ָ���ռ�������
			meg.setSubject(subject);// ָ������
			meg.setText(messageText);// ָ������
			meg.setSentDate(new Date());// ָ������ʱ��
			meg.saveChanges();// ������Ϣ
			Transport transport = session.getTransport("smtp");// �����������
			transport.connect("smtp.163.com", "mchotdog_011", "mchotdog");
			// ���ӵ����Լ�������
			transport.sendMessage(meg, meg.getAllRecipients());// ��ʼ����
			System.out.println("send   over");
		} catch (Exception ex) {
			System.out.println(ex.toString());
		}
	}
}