package io.swagger.util.common2.string.simple;

/**
 * String instruments, judgment string is not null
 */
public class StringUtils {

	public static boolean isEmpty(String str) {
		if (str == null || str.length() == 0)
			return true;
		return false;
	}
}
