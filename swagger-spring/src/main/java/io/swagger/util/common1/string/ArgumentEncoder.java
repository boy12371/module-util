package io.swagger.util.common1.string;

import java.net.URLEncoder;
import java.io.UnsupportedEncodingException;

public class ArgumentEncoder {
	public static void main(String[] args) {
		for (String s : args) {
			try {
				System.out.println(URLEncoder.encode(s, "UTF-8"));
			} catch (UnsupportedEncodingException e) {
				e.printStackTrace();
			}
		}
	}
}
