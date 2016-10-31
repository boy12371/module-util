package com.huifu.subuy.batch.util.common;

import java.io.UnsupportedEncodingException;

import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.spec.SecretKeySpec;

import org.apache.commons.codec.binary.Base64;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
/** 
 * @author andy.guo 
 * @version 1.0
 * create on 2016年3月12日 下午6:15:44 
 * 类说明: 
 */
public class _3DesUtil {
	private final static Logger logger = LoggerFactory.getLogger(_3DesUtil.class);
    //定义加密算法，有DES、DESede(即3DES)、Blowfish
    private static final String Algorithm = "DESede";        
    
    /**
     * 加密方法
     * @param src 源数据的字节数组
     * @return 
     */
    public static byte[] encryptMode(byte[] src, String key) {
        try {
             SecretKey deskey = new SecretKeySpec(build3DesKey(key), Algorithm);    //生成密钥
             Cipher c1 = Cipher.getInstance(Algorithm);    //实例化负责加密/解密的Cipher工具类
             c1.init(Cipher.ENCRYPT_MODE, deskey);    //初始化为加密模式
             return c1.doFinal(src);
         } catch (Exception ex) {
             logger.error(ex.getMessage(), ex);
         }
         return null;
     }
    
    /**
     * 加密方法
     * @param src 源数据的字节数组
     * @return 
     */
    public static String encryptMode(String src, String key) {
        byte[] encryptArr = encryptMode(src.getBytes(), key);
        
        return Base64.encodeBase64String(encryptArr);
     }
    
    
    /**
     * 解密函数
     * @param src 密文的字节数组
     * @return
     */
    public static byte[] decryptMode(byte[] src, String key) {      
        try {
            SecretKey deskey = new SecretKeySpec(build3DesKey(key), Algorithm);
            Cipher c1 = Cipher.getInstance(Algorithm);
            c1.init(Cipher.DECRYPT_MODE, deskey);    //初始化为解密模式
            return c1.doFinal(src);
        }  catch (Exception ex) {
            logger.error(ex.getMessage(), ex);
        }
        return null;
     }
    
    /**
     * 解密函数
     * @param src 密文的字节数组
     * @return
     */
    public static String decryptMode(String src, String key) {    
    	byte[] decryptArr = decryptMode(Base64.decodeBase64(src.getBytes()), key);
    	if (decryptArr == null){
    		return null;
    	}
    	return new String(decryptArr);
     }
    
    
    /*
     * 根据字符串生成密钥字节数组 
     * @param keyStr 密钥字符串
     * @return 
     * @throws UnsupportedEncodingException
     */
    public static byte[] build3DesKey(String keyStr) throws UnsupportedEncodingException{
        byte[] key = new byte[24];    //声明一个24位的字节数组，默认里面都是0
        byte[] temp = keyStr.getBytes("UTF-8");    //将字符串转成字节数组
        
        /*
         * 执行数组拷贝
         * System.arraycopy(源数组，从源数组哪里开始拷贝，目标数组，拷贝多少位)
         */
        if(key.length > temp.length){
            //如果temp不够24位，则拷贝temp数组整个长度的内容到key数组中
            System.arraycopy(temp, 0, key, 0, temp.length);
        }else{
            //如果temp大于24位，则拷贝temp数组24个长度的内容到key数组中
            System.arraycopy(temp, 0, key, 0, key.length);
        }
        return key;
    } 
}
