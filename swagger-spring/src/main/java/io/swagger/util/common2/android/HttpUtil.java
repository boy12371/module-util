package io.swagger.util.common2.android;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.apache.http.HttpResponse;
import org.apache.http.client.entity.UrlEncodedFormEntity;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.impl.client.DefaultHttpClient;
import org.apache.http.message.BasicNameValuePair;
import org.apache.http.protocol.HTTP;
import org.apache.http.util.EntityUtils;

import android.content.Context;
import io.swagger.util.common1.util.newbean.NetUtils;

/**
 * 
 * =============================================================================
 * 
 * 描述：同步的网络操作
 * 
 * 作者： 陈伯胜
 * 
 * 邮件： 1240306775@qq.com
 * 
 * 日期： 2015-5-18下午2:17:02
 * 
 * =============================================================================
 */
public class HttpUtil {

	/**
	 * POST请求，根据URL和参数获取返回的json串
	 * 
	 * @param mContext
	 * @param url
	 * @param params
	 * @return
	 */
	public static String post(Context mContext, String url, Map<String, String> params) {
		if (NetUtils.isConnected(mContext)) {
			try {
				// 定义需要获取的内容来源地址
				HttpPost request = new HttpPost(url);
				// 根据内容来源地址创建一个Http请求

				List<BasicNameValuePair> paList = new ArrayList<BasicNameValuePair>();
				if (params != null && params.size() > 0) {

					for (String key : params.keySet()) {
						paList.add(new BasicNameValuePair(key, params.get(key)));
					}
				}

				// 添加必须的参数
				request.setEntity(new UrlEncodedFormEntity(paList, HTTP.UTF_8));
				// 设置参数的编码
				HttpResponse httpResponse = new DefaultHttpClient().execute(request);
				// 发送请求并获取反馈
				if (httpResponse.getStatusLine().getStatusCode() != 404) {
					String responseBody = EntityUtils.toString(httpResponse.getEntity());// 返回json格式字符串
					return responseBody;
				}
			} catch (Exception e) {
				e.printStackTrace();
				ToastUtils.showShort(mContext, "网络未连接或者服务器出错!");
			}
		} else {
			ToastUtils.showShort(mContext, "网络连接不可用，请稍后再试!");

		}
		return null;

	}

	public static String get(Context mContext, String url, Map<String, String> params) {
		return post(mContext, url, params);
	}

}
