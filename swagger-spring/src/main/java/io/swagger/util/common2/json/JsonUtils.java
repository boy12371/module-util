package io.swagger.util.common2.json;

import java.util.List;

import com.google.gson.Gson;

import io.swagger.util.common1.util.newbean.OperateResult;

/**
 * 
 * 说明：json处理
 * 
 */
public class JsonUtils {

	private static Gson gson = new Gson();

	public static Gson getGson() {
		return gson;
	}

	/**
	 * 将 json 字符串封装成对象
	 * 
	 * @param obj
	 * @return
	 */
	public static Object jsonToObject(String json, Class<OperateResult> clazz) {
		return getGson().fromJson(json, clazz);

	}

	/**
	 * 返回一个对象的 json 字符串
	 * 
	 * @param obj
	 * @return
	 */
	public static String objectToJson(Object obj) {
		return getGson().toJson(obj);

	}

	/**
	 * 返回一个集合的 json 字符串
	 * 
	 * @param list
	 * @return
	 */
	public static String listToJson(List<?> list) {
		return getGson().toJson(list);

	}

	public static void main(String[] args) {
		String jsonStr = "{\"status\":\"success\"}";

		Object jsonToObject = jsonToObject(jsonStr, OperateResult.class);

		System.out.println(jsonToObject);
	}
}
