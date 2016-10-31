package io.swagger.util.common2.android;

import android.app.Activity;
import android.content.Context;
import android.widget.Toast;

/**
 * 
 * =============================================================================
 * 
 * 描述：Toast 统一管理类
 * 
 * 作者： 陈伯胜
 * 
 * 邮件： 1240306775@qq.com
 * 
 * 日期： 2015-4-9下午2:46:46
 * 
 * =============================================================================
 */
public class ToastUtils {

	private ToastUtils() {
		/* cannot be instantiated */
		throw new UnsupportedOperationException("cannot be instantiated");
	}

	public static boolean isShow = true;

	/**
	 * 短时间显示Toast(在UI线程)
	 * 
	 * @param context
	 * @param message
	 */
	public static void showShortOnUiThread(final Activity context,
			final CharSequence message) {
		if (isShow)
			context.runOnUiThread(new Runnable() {

				@Override
				public void run() {

					Toast.makeText(context, message, Toast.LENGTH_SHORT).show();
				}
			});

	}

	/**
	 * 短时间显示Toast
	 * 
	 * @param context
	 * @param message
	 */
	public static void showShort(Context context, CharSequence message) {
		if (isShow)
			Toast.makeText(context, message, Toast.LENGTH_SHORT).show();
	}

	/**
	 * 短时间显示Toast
	 * 
	 * @param context
	 * @param message
	 */
	public static void showShort(Context context, int message) {
		if (isShow)
			Toast.makeText(context, message, Toast.LENGTH_SHORT).show();
	}

	/**
	 * 长时间显示Toast
	 * 
	 * @param context
	 * @param message
	 */
	public static void showLong(Context context, CharSequence message) {
		if (isShow)

			Toast.makeText(context, message, Toast.LENGTH_LONG).show();
	}

	/**
	 * 长时间显示Toast(在UI线程)
	 * 
	 * @param context
	 * @param message
	 */
	public static void showLongOnUiThread(final Activity context,
			final CharSequence message) {
		if (isShow)
			context.runOnUiThread(new Runnable() {

				@Override
				public void run() {

					Toast.makeText(context, message, Toast.LENGTH_LONG).show();
				}
			});

	}

	/**
	 * 长时间显示Toast
	 * 
	 * @param context
	 * @param message
	 */
	public static void showLong(Context context, int message) {
		if (isShow)
			Toast.makeText(context, message, Toast.LENGTH_LONG).show();
	}

	/**
	 * 自定义显示Toast时间
	 * 
	 * @param context
	 * @param message
	 * @param duration
	 *            毫秒
	 */
	public static void show(Context context, CharSequence message, int duration) {
		if (isShow)
			Toast.makeText(context, message, duration).show();
	}

	/**
	 * 自定义显示Toast时间
	 * 
	 * @param context
	 * @param message
	 * @param duration
	 *            毫秒
	 */
	public static void show(Context context, int message, int duration) {
		if (isShow)
			Toast.makeText(context, message, duration).show();
	}

}