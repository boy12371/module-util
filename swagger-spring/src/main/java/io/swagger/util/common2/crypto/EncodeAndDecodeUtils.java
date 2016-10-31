package io.swagger.util.common2.crypto;

import java.io.UnsupportedEncodingException;
import java.net.URLDecoder;
import java.net.URLEncoder;

/**
 * 描述：编码和解码工具类
 */
public class EncodeAndDecodeUtils {

	/**
	 * 将iso-8859-1编码字符串转成utf8编码
	 * 
	 * @param oldString
	 * @return
	 */
	public static String getUTF8(String oldString) {
		String newString = null;
		try {
			newString = new String(oldString.getBytes("iso-8859-1"), "utf-8");
		} catch (UnsupportedEncodingException e1) {
			e1.printStackTrace();
		}
		return newString;
	}

	/**
	 * 将oldString的转成指定的编码
	 * 
	 * @param oldString
	 * @return
	 */
	public static String getNewString(String oldString, String newCharset,
			String oldCharset) {
		String newString = null;
		try {
			newString = new String(oldString.getBytes(oldCharset), newCharset);
		} catch (UnsupportedEncodingException e1) {
			e1.printStackTrace();
		}
		return newString;
	}

	/**
	 * URL编码(默认是utf8)
	 */
	@SuppressWarnings("deprecation")
	public static String myURLEncoder(String str) {
		return URLEncoder.encode(str);

	}

	/**
	 * 按指定的字符集编码
	 */
	public static String myURLEncoder(String str, String enc) {
		try {
			return URLEncoder.encode(str, enc);
		} catch (UnsupportedEncodingException e) {
			e.printStackTrace();
		}
		return str;

	}

	/**
	 * URL解码(默认是utf8)
	 */
	@SuppressWarnings("deprecation")
	public static String myURLDecoder(String str) {
		return URLDecoder.decode(str);

	}

	/**
	 * 按指定的字符集解码
	 */
	public static String myURLDecoder(String str, String enc) {
		try {
			return URLDecoder.decode(str, enc);
		} catch (UnsupportedEncodingException e) {
			e.printStackTrace();
		}
		return str;

	}

	/**
	 * 将字符串编码成 Unicode 形式的字符串
	 * 
	 * 例如：将"我们" 转化成 "\u6211\u4EEC"
	 * 
	 * @param str
	 * @return
	 */
	public static String characterToUnicode(String str) {

		if (str == null)
			return "";
		String hs = "";

		try {
			byte b[] = str.getBytes("UTF-16");
			// System.out.println(byte2hex(b));
			for (int n = 0; n < b.length; n++) {
				str = (java.lang.Integer.toHexString(b[n] & 0XFF));
				if (str.length() == 1)
					hs = hs + "0" + str;
				else
					hs = hs + str;
				if (n < b.length - 1)
					hs = hs + "";
			}
			// 去除第一个标记字符
			str = hs.toUpperCase().substring(4);
			// System.out.println(str);
			char[] chs = str.toCharArray();
			str = "";
			for (int i = 0; i < chs.length; i = i + 4) {
				str += "\\u" + chs[i] + chs[i + 1] + chs[i + 2] + chs[i + 3];
			}
			return str;
		} catch (Exception e) {
			System.out.print(e.getMessage());
		}
		return str;
	}

	/**
	 * 从 Unicode 形式的字符串转换成对应的编码的特殊字符串。 如 "\u6211" to "我".
	 * 
	 * @param in
	 *            Unicode编码的字符数组。
	 * @param off
	 *            转换的起始偏移量。
	 * @param len
	 *            转换的字符长度。
	 * @return 完成转换，返回编码前的特殊字符串。
	 */
	public static String fromEncodedUnicode(char[] in, int off, int len) {
		char aChar;
		char[] out = new char[len]; // 只短不长
		int outLen = 0;
		int end = off + len;

		while (off < end) {
			aChar = in[off++];
			if (aChar == '\\') {
				aChar = in[off++];
				if (aChar == 'u') {
					int value = 0;
					for (int i = 0; i < 4; i++) {
						aChar = in[off++];
						switch (aChar) {
						case '0':
						case '1':
						case '2':
						case '3':
						case '4':
						case '5':
						case '6':
						case '7':
						case '8':
						case '9':
							value = (value << 4) + aChar - '0';
							break;
						case 'a':
						case 'b':
						case 'c':
						case 'd':
						case 'e':
						case 'f':
							value = (value << 4) + 10 + aChar - 'a';
							break;
						case 'A':
						case 'B':
						case 'C':
						case 'D':
						case 'E':
						case 'F':
							value = (value << 4) + 10 + aChar - 'A';
							break;
						default:
							throw new IllegalArgumentException(
									"Malformed \\uxxxx encoding.");
						}
					}
					out[outLen++] = (char) value;
				} else {
					if (aChar == 't') {
						aChar = '\t';
					} else if (aChar == 'r') {
						aChar = '\r';
					} else if (aChar == 'n') {
						aChar = '\n';
					} else if (aChar == 'f') {
						aChar = '\f';
					}
					out[outLen++] = aChar;
				}
			} else {
				out[outLen++] = (char) aChar;
			}
		}
		return new String(out, 0, outLen);
	}

	public static void main(String[] args) {
		System.out.println(characterToUnicode("我们"));
		System.out.println(myURLEncoder("我们"));
		System.out.println(myURLDecoder(myURLEncoder("我们")));
		System.out.println(myURLDecoder("%E6%88%91%E4%BB%AC"));

	}
}
