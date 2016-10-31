package io.swagger.util.common1.string;

import java.net.URLDecoder;
import java.io.UnsupportedEncodingException;

public class ArgumentDecoder {
	public static void main(String[] args) {
		for (String s : args) {
			try {
				System.out.println(URLDecoder.decode(s, "UTF-8"));
			} catch (UnsupportedEncodingException e) {
				e.printStackTrace();
			}
		}
	}
}
