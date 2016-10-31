package io.swagger.util.common2.pinyin;

import java.util.HashMap;
import java.util.Map;

import io.swagger.util.common2.string.simple.StringUtils;

import net.sourceforge.pinyin4j.PinyinHelper;
import net.sourceforge.pinyin4j.format.HanyuPinyinCaseType;
import net.sourceforge.pinyin4j.format.HanyuPinyinOutputFormat;
import net.sourceforge.pinyin4j.format.HanyuPinyinToneType;
import net.sourceforge.pinyin4j.format.exception.BadHanyuPinyinOutputFormatCombination;


/**
 * 拼音工具类：获取汉字的中文拼音
 */
public class PinyinToolkit {

	/**
	 * 获取汉字串拼音首字母，英文字符不变
	 * 
	 * @param chinese
	 *            汉字串
	 * @return 汉语拼音首字母
	 */
	public static String cn2FirstSpell(String chinese) {
		StringBuffer pybf = new StringBuffer();
		char[] arr = chinese.toCharArray();
		HanyuPinyinOutputFormat defaultFormat = new HanyuPinyinOutputFormat();
		defaultFormat.setCaseType(HanyuPinyinCaseType.LOWERCASE);
		defaultFormat.setToneType(HanyuPinyinToneType.WITHOUT_TONE);
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] > 128) {
				try {
					String[] _t = PinyinHelper.toHanyuPinyinStringArray(arr[i],
							defaultFormat);
					if (_t != null) {
						pybf.append(_t[0].charAt(0));
					}
				} catch (BadHanyuPinyinOutputFormatCombination e) {
					return "";
				}
			} else {
				pybf.append(arr[i]);
			}
		}
		return pybf.toString().replaceAll("\\W", "").trim();
	}

	/**
	 * 获取汉字串拼音，英文字符不变
	 * 
	 * @param chinese
	 *            汉字串
	 * @return 汉语拼音
	 */
	public static String cn2Spell(String chinese) {
		if (chinese == null || chinese.equals("")) {
			return "";
		} else {
			StringBuffer pybf = new StringBuffer();
			char[] arr = chinese.toCharArray();
			HanyuPinyinOutputFormat defaultFormat = new HanyuPinyinOutputFormat();
			defaultFormat.setCaseType(HanyuPinyinCaseType.LOWERCASE);
			defaultFormat.setToneType(HanyuPinyinToneType.WITHOUT_TONE);
			for (int i = 0; i < arr.length; i++) {
				if (arr[i] > 128) {
					try {
						String[] str = PinyinHelper.toHanyuPinyinStringArray(
								arr[i], defaultFormat);
						if (str == null || str.length == 0) {
							break;
						}
						pybf.append(PinyinHelper.toHanyuPinyinStringArray(
								arr[i], defaultFormat)[0]);
					} catch (BadHanyuPinyinOutputFormatCombination e) {
						break;
					}
				} else {
					pybf.append(arr[i]);
				}
			}
			return pybf.toString();
		}
	}

	/**
	 * 获取字符串的首字母
	 * 
	 * @param str
	 * @return
	 */
	public static String getFirstLetter(String str) {

		Map<String, String> letters = new HashMap<String, String>();
		letters.put("A", "A");
		letters.put("B", "B");
		letters.put("C", "C");
		letters.put("D", "D");
		letters.put("E", "E");
		letters.put("F", "F");
		letters.put("G", "G");
		letters.put("H", "H");
		letters.put("I", "I");
		letters.put("J", "J");
		letters.put("K", "K");
		letters.put("L", "L");
		letters.put("M", "M");
		letters.put("N", "N");
		letters.put("O", "O");
		letters.put("P", "P");
		letters.put("Q", "Q");
		letters.put("R", "R");
		letters.put("S", "S");
		letters.put("T", "T");
		letters.put("U", "U");
		letters.put("V", "V");
		letters.put("W", "W");
		letters.put("X", "X");
		letters.put("Y", "Y");
		letters.put("Z", "Z");

		if (!StringUtils.isEmpty(str)) {

			return letters
					.get(cn2FirstSpell(str).substring(0, 1).toUpperCase());

		}
		return null;

	}

	/**
	 * 测试程序
	 */
	public static void main(String[] args) {
		String cnStr = "*华人民共和国";
		System.out.println("汉字串首字母：" + cn2FirstSpell(cnStr));
		System.out.println("汉字串拼音：" + cn2Spell(cnStr));

		System.out.println(getFirstLetter(cnStr));

	}
}