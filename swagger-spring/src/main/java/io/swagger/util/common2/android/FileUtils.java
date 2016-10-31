package io.swagger.util.common2.android;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.commons.lang3.StringUtils;

import android.graphics.Bitmap;
import android.os.Environment;
import android.util.Log;

/**
 * 
 * =============================================================================
 * 
 * 描述：文件工具类
 * 
 * 作者： 陈伯胜
 * 
 * 邮件： 1240306775@qq.com
 * 
 * 日期： 2015-4-9下午3:08:34
 * 
 * =============================================================================
 */
public class FileUtils {

	public static String SDPATH = Environment.getExternalStorageDirectory()
			+ "/YiZhiYuan/";

	public static String SDPATH1 = Environment.getExternalStorageDirectory()
			+ "/myimages/";

	public static String saveBitmap(Bitmap bm, String picName) {
		Log.e("", "保存图片");
		try {
			if (!isFileExist("")) {
				File tempf = createSDDir("");
			}
			File f = new File(SDPATH, picName);
			if (f.exists()) {
				f.delete();
			}
			FileOutputStream out = new FileOutputStream(f);
			bm.compress(Bitmap.CompressFormat.JPEG, 90, out);
			out.flush();
			out.close();
			Log.e("", "已经保存");

			return f.getAbsolutePath();

		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		return "";
	}

	public static String saveBitmap(Bitmap bm) {
		Log.e("", "保存图片");
		try {
			if (!isFileExist("")) {
				File tempf = createSDDir("");
			}
			File f = new File(SDPATH, System.currentTimeMillis() + ".jpeg");
			if (f.exists()) {
				f.delete();
			}
			FileOutputStream out = new FileOutputStream(f);
			bm.compress(Bitmap.CompressFormat.JPEG, 90, out);
			out.flush();
			out.close();
			Log.e("", "已经保存");

			return f.getAbsolutePath();

		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		return "";
	}

	/**
	 * 从路径获取文件名
	 * 
	 * @param pathandname
	 * @return
	 */
	public static String getFileName(String pathandname) {

		if (!StringUtils.isEmpty(pathandname)) {
			int start = pathandname.lastIndexOf("/") + 1;
			int end = pathandname.length();
			return pathandname.substring(start, end);

		}
		return "";

	}

	public static File createSDDir(String dirName) throws IOException {
		File dir = new File(SDPATH + dirName);
		if (Environment.getExternalStorageState().equals(
				Environment.MEDIA_MOUNTED)) {

			System.out.println("createSDDir:" + dir.getAbsolutePath());
			System.out.println("createSDDir:" + dir.mkdir());
		}
		return dir;
	}

	public static boolean isFileExist(String fileName) {
		File file = new File(SDPATH + fileName);
		return file.exists();
	}

	public static void delFile(String fileName) {
		File file = new File(SDPATH + fileName);
		if (file.isFile()) {
			file.delete();
		}
		file.exists();
	}

	public static void deleteDir() {
		File dir = new File(SDPATH);

		if (dir.exists()) {
			dir.delete();// 删除目录本身
		}
	}

	public static void deleteDir(String path) {
		File dir = new File(path);
		// if (dir == null || !dir.exists() || !dir.isDirectory())
		// return;
		//
		// for (File file : dir.listFiles()) {
		// if (file.isFile())
		// file.delete(); // 删除所有文件
		// else if (file.isDirectory())
		// deleteDir(path); // 递规的方式删除文件夹
		// }
		
		if (dir.exists()) {
			
			dir.delete();// 删除目录本身
		}
	}

	public static boolean fileIsExists(String path) {
		try {
			File f = new File(path);
			if (!f.exists()) {
				return false;
			}
		} catch (Exception e) {

			return false;
		}
		return true;
	}

}
