package io.swagger.util.common1.network;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.Writer;

import org.apache.commons.io.output.FileWriterWithEncoding;

import io.swagger.util.common1.network.MyUtil;
import com.huifu.volans.client.Volans;
import com.huifu.volans.client.file.FileInfo;

/**
 * 存储Client文件上传和下载
 * 
 * @author renfu.chen
 *
 */
public class VolansUtil {
	
	
	public static Volans volans = null;
	public static String charset = "UTF-8";
	
	/**
	 * 静态块初始化Volans
	 */
	static{
		try {
			volans = Volans.getVolans(MyUtil.getProperty(BatchConstant.VOLANS_CONFIG, BatchConstant.FSS_VOLANS_FSS_APP_KEY, ""), 
								MyUtil.getProperty(BatchConstant.VOLANS_CONFIG, BatchConstant.FSS_VOLANS_FSS_APP_SECURE, ""));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	private VolansUtil(){
		
	}
	
	/**
	 * 上传文件,返回存储文件FileId
	 */
    public static String upload(File file) throws Exception {
        	
        FileInfo uploadInfo = volans.upload(file);

        return uploadInfo.getRowKey();
    }

    
    /**
     * 文件上传方
	 * 自定义文件ID,适用于多系统间共享文件数据情况,双方协商文件ID生成规则
	 * 注:服务器中存在此文件ID时,抛文件已存在异常
	 */
    public static String upload(File file, String fileId) throws Exception {
    	
        FileInfo uploadInfo = volans.upload(file, fileId);
        
        return uploadInfo.getRowKey();
    }
    
    /**
     * 下载文件,下载时如不传应用ID,默认是下载本应用上传的文件
     */
    public static void download(String fileId, String path) throws Exception {
        
        FileOutputStream fos = null;
        try {
            FileInfo downloadInfo = volans.download(fileId);
            byte[] content = downloadInfo.getContent();
            String name = downloadInfo.getRowKey();
            //保存文件
            File file = new File(path + name);
            fos = new FileOutputStream(file);
            fos.write(content, 0, content.length);
            fos.flush();
        } catch (Exception e) {
        	throw e;
        } finally {
            if (fos != null) {
                fos.close();
            }
        }
    }
    
    /**
    * 文件下载方
    * 注:下载非本应用上传的文件时,需要对方应用的appKey参数
    */
    public static void download(String appKey, String fileId, String path) throws Exception {
    
	    FileOutputStream fos = null;
	    try {
	    	FileInfo downloadInfo = volans.download(appKey,fileId);
	        byte[] content = downloadInfo.getContent();
	        String name = downloadInfo.getRowKey();
	        //保存文件
	        File file = new File(path + name);
	        fos = new FileOutputStream(file);
	        fos.write(content, 0, content.length);
	        fos.flush();
	    } catch (Exception e) {
	    	throw e;
	    } finally {
	        if (fos != null) {
	            fos.close();
	        }
	    }
    }
    
    /**
     * 删除文件
     */
    public static void delete(String fileId) throws Exception {
	    volans.delete(fileId);
    }
    
    /**
     * 写文件
     * @param writerStr
     * @param file
     * @throws IOException
     */
    public static Writer fileWriter(String writerStr,File file) throws IOException{
		//类实例化父类对象
		Writer out = null ;	// 准备好一个输出的对象
		try {
			out = new FileWriterWithEncoding(file,charset,true);// 通过对象多态性，进行实例化
			
		} catch (IOException e) {
			throw e;
		}
		return out;
	}
    
    /**
     * 读取文件
     * @param file
     * @param charset
     * @return
     * @throws Exception 
     */
    public static BufferedReader fileReader(File file,String charset) throws Exception{
    	BufferedReader br = null;
		try { 
    		InputStreamReader read = new InputStreamReader(new FileInputStream( 
    		file), charset); 
    		br  = new BufferedReader(read); 
		}catch (Exception e) {
			throw e;
		}
		return br;
    }
}
