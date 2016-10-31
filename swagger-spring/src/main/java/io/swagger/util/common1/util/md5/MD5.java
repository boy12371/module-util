package io.swagger.util.common1.util.md5;

import java.security.MessageDigest;

import org.apache.log4j.Logger;

/**
 * MD5 �ļ���
 * 
 * @author tianwl
 * @datetime 2010-8-17 ����05:11:29
 */
public class MD5 {
	private static Logger logger = Logger.getLogger(MD5.class);
	/**
	 * ���ַ����M��MD5����
	 * @author tianwl
	 * @param s
	 * @return
	 */
	public final static String getStringMD5(String s) {
		byte[] strTemp = s.getBytes();
		return MD5.getByteArrayMD5(strTemp);
	}
	/**
	 * ��byte�����M��MD5����
	 * @author tianwl
	 * @param source
	 * @return
	 */
	public final static String getByteArrayMD5(byte[] source) {
		char hexDigits[] = { '0', '1', '2', '3', '4', '5', '6', '7', '8', '9',
				'a', 'b', 'c', 'd', 'e', 'f' };
		try {
			// ʹ��MD5����MessageDigest����
			MessageDigest mdTemp = MessageDigest.getInstance("MD5");
			mdTemp.update(source);
			byte[] md = mdTemp.digest();
			int j = md.length;
			char str[] = new char[j * 2];
			int k = 0;
			for (int i = 0; i < j; i++) {
				byte b = md[i];
				// ��û����(int)b����˫�ֽڼ���
				str[k++] = hexDigits[b >> 4 & 0xf];
				str[k++] = hexDigits[b & 0xf];
			}
			return new String(str);
		} catch (Exception e) {
			logger.error(e,e);
			return null;
		}
	}
	/**
	 * �õ�ͼƬ��MD5��Ҳ�������ڶ�����Ŀ��MD5
	 * @author tianwl
	 * @param pic ͼƬ���ַ��� 
	 * @param url
	 * @return
	 */
	public static String getPictureMD5(String pic,String url){
		String md5 = "";
		StringBuffer sb = new StringBuffer(pic);
		sb.append(url);
		md5 = MD5.getStringMD5(new String(sb));
		return md5;
	}
	
	/**
	 * ��������Ķ����˵���resourceNameMD5
	 * @author tianwl
	 * @param name
	 * @param url
	 * @param channelType
	 * @param services ���û�д����� ���� ""
	 * @return
	 */
	public static String getMenuMD5(String name ,String url,String channelType ,String services){
		String md5 = "";
		StringBuffer sb = new StringBuffer(name);
		sb.append(url);
		sb.append(channelType);
		if(services != null && !services.equals("")){
			sb.append(services);
		}
		md5 = MD5.getStringMD5(new String(sb));
		return md5;
	}
	
	public static void main(String[] args) {
		System.out.println(MD5.getStringMD5("aaaaaaaaaaaaaaaaaaa"));
		byte[] source = "aaaaaaaaaaaaaaaaaaa".getBytes();
		System.out.println(MD5.getByteArrayMD5(source));
		logger.info(MD5.getPictureMD5("asdfasdfadf", "www.163.com"));
	}
}
