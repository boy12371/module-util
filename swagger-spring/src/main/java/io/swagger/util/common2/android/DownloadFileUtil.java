package io.swagger.util.common2.android;

import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.URL;

import android.os.Environment;

/**
 * 下载文件工具类
 * 
 * @param path
 *            url
 * @return
 */
public class DownloadFileUtil {
	
	/**
	 * 根据路径获取字节数据
	 * @param path
	 * @return
	 * @throws Exception
	 */
	public static byte[] getFile(String path) throws Exception {
		URL url = new URL(path);
		// 获得基于http协议的连接对象
		HttpURLConnection httpURLConnection = (HttpURLConnection) url
				.openConnection();
		// 设置连接请求延时时间，如果超过5秒，则认为连接失败
		httpURLConnection.setConnectTimeout(5000);
		// 设置请求方式
		httpURLConnection.setRequestMethod("GET");
		// 说明响应成功
		if (httpURLConnection.getResponseCode() == 200) {
			// 获得输入流
			InputStream inputStream = httpURLConnection.getInputStream();
			// 字节数组输出流（内存）：用于先保存读到的数据
			ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
			byte[] buffer = new byte[1024];
			int len = 0;
			while ((len = inputStream.read(buffer)) != -1) {
				byteArrayOutputStream.write(buffer, 0, len);
			}
			inputStream.close();
			// 将内存中的数据（即读到的图片数据）返回
			return byteArrayOutputStream.toByteArray();

		}
		return null;
	}

	/**
	 * 将下载的文件保存到SdCard
	 * 
	 * @param data
	 */
	public static String saveToSdcard(byte[] data, String imageName) {

		// 保存文件的文件夹
		String dirPath = Environment.getExternalStorageDirectory()
				+ "/MM/images";

		File dir = new File(dirPath);
		if (!dir.exists()) {
			dir.mkdirs();
		}

		File file = new File(dirPath, imageName);
		FileOutputStream fileOutputStream;
		try {
			fileOutputStream = new FileOutputStream(file);
			fileOutputStream.write(data);
			fileOutputStream.close();

		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		
		return file.getAbsolutePath();
	}

}
