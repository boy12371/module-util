package io.swagger.util.common2.random;

/**
 * =============================================================================
 * 
 * 描述：生成随机的短信验证码
 * 
 * 作者： 陈伯胜
 * 
 * 邮件： 1240306775@qq.com
 * 
 * 日期： 2015-4-26下午02:29:35
 * 
 * 版本： 1.0
 * 
 * =============================================================================
 */

public class CheckNumUtils {
	/**
	 * 创建指定数量的随机字符串
	 * 
	 * @param numberFlag
	 *            是否是数字
	 * @param length
	 * @return
	 */
	public static String createRandom(boolean numberFlag, int length) {
		String retStr = "";
		String strTable = numberFlag ? "1234567890"
				: "1234567890abcdefghijkmnpqrstuvwxyz";
		int len = strTable.length();
		boolean bDone = true;
		do {
			retStr = "";
			int count = 0;
			for (int i = 0; i < length; i++) {
				double dblR = Math.random() * len;
				int intR = (int) Math.floor(dblR);
				char c = strTable.charAt(intR);
				if (('0' <= c) && (c <= '9')) {
					count++;
				}
				retStr += strTable.charAt(intR);
			}
			if (count >= 2) {
				bDone = false;
			}
		} while (bDone);

		return retStr;
	}

	public static void main(String[] args) {
		System.out.println(createRandom(true, 6));
	}
}
