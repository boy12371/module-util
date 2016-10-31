package io.swagger.util.common2.http;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ExecutionException;

import org.apache.http.HttpResponse;
import org.apache.http.NameValuePair;
import org.apache.http.client.ClientProtocolException;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.client.utils.URLEncodedUtils;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.message.BasicNameValuePair;
import org.apache.http.util.EntityUtils;

/**
 * 说明：发送 http get请求
 * 
 */

public class HttpUtil {

	private static final String DEFAULT_CHARSET = "UTF-8";

	/**
	 * get请求
	 * 
	 * @param url
	 *            访问地址
	 * @param params
	 *            参数
	 * @return 字符串
	 * @throws IOException
	 * @throws ExecutionException
	 * @throws InterruptedException
	 */
	public static String get(String url, Map<String, String> params)
			throws IOException, ExecutionException, InterruptedException {

		// 组装参数
		List<NameValuePair> paramsList = new ArrayList<NameValuePair>();
		if (params != null && !params.isEmpty()) {
			Set<String> keys = params.keySet();
			for (String key : keys) {
				paramsList.add(new BasicNameValuePair(key, params.get(key)));
			}
		}

		// 组装url
		String apiUrl = url
				+ URLEncodedUtils.format(paramsList, DEFAULT_CHARSET);

		// System.out.println(apiUrl);

		/** 发送 http get请求 */
		HttpGet request = new HttpGet(apiUrl);
		String result = "";
		try {
			HttpResponse response = HttpClients.createDefault()
					.execute(request);
			if (response.getStatusLine().getStatusCode() == 200) {
				result = EntityUtils.toString(response.getEntity());
			}
		} catch (ClientProtocolException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}

		return result;
	}

	/**
	 * get请求
	 * 
	 * @param url
	 *            访问地址
	 * @return 字符串
	 * @throws IOException
	 * @throws ExecutionException
	 * @throws InterruptedException
	 */
	public static String get(String url) throws IOException,
			ExecutionException, InterruptedException {
		return get(url, null);
	}

}
