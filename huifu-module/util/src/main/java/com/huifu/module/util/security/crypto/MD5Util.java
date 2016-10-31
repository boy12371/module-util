package com.huifu.subuy.batch.util.common;

import java.security.MessageDigest;
import java.security.SignatureException;

import com.huifu.saturn.signature.MD5Signature;
import com.huifu.subuy.batch.util.constant.Constants;

/**
 * 
 * <h1>MD5工具类</h1>
 * @author jiawei.wang
 * @version MD5Util.java, v1.0, 2015年5月29日 下午7:01:20 jiawei.wang
 */
public class MD5Util {

    private final static String[] hexDigits = {"0", "1", "2", "3", "4", "5", "6", "7",
                                               "8", "9", "a", "b", "c", "d", "e", "f"};
    /**
     * 
     * <h2>MD5验证</h2>
     * @param content 待验证字符串
     * @param salt 盐值
     * @param checkValue 比较值
     * @param charset 编码方式
     * @return true 验证通过，false 验证失败
     */
    public static boolean checkMd5(String content, String salt, String checkValue, String charset) {
        MD5Signature md5Signature = new MD5Signature();
        String signValue = null;
        try {
            signValue = md5Signature.sign(content, salt, Constants.UTF_8);           
        } catch (SignatureException e) {
            throw new RuntimeException(e);
        }
        if (signValue.equals(checkValue)) {
            return true;
        }
        return false;
    }
    
    /**
     * 
     * <h2>生成MD5值</h2>
     * @param content 待编码字符串
     * @param salt 盐值
     * @param charset 编码方式
     * @return MD5编码结果
     */
    public static String calcMd5Value(String content,String salt,String charset){
        MD5Signature md5Signature = new MD5Signature();
        String signValue = null;
        try {
            signValue = md5Signature.sign(content, salt, Constants.UTF_8);
        } catch (SignatureException e) {
            throw new RuntimeException(e);
        }
        return signValue;
    }
    /**
     * MD5编码
     * @param origin 原始字符串
     * @return 经过MD5加密之后的结果
     */
    public static String MD5Encode(String origin) {
        String resultString = null;
        try {
            resultString = origin;
            MessageDigest md = MessageDigest.getInstance("MD5");
            resultString = byteArrayToHexString(md.digest(resultString.getBytes()));
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
        return resultString;
    }
    /**
     * 转换字节数组为16进制字串
     * @param b 字节数组
     * @return 16进制字串
     */
    public static String byteArrayToHexString(byte[] b) {
        StringBuilder resultSb = new StringBuilder();
        for (byte aB : b) {
            resultSb.append(byteToHexString(aB));
        }
        return resultSb.toString();
    }
    /**
     * 转换byte到16进制
     * @param b 要转换的byte
     * @return 16进制格式
     */
    private static String byteToHexString(byte b) {
        int n = b;
        if (n < 0) {
            n = 256 + n;
        }
        int d1 = n / 16;
        int d2 = n % 16;
        return hexDigits[d1] + hexDigits[d2];
    }
}
