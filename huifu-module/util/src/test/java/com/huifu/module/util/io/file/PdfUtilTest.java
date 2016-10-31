package com.huifu.module.util.io.file;

import java.util.HashMap;
import java.util.Map;

import org.junit.Ignore;
import org.junit.Test;

import com.alibaba.fastjson.JSON;
import com.huifu.module.util.format.files.PdfUtil;

@Ignore
public class PdfUtilTest {

	@SuppressWarnings("static-access")
	@Test
	public void testPdfCreater() {
		for (int i = 0; i < 1; i++) {
			createPdf();
			// 等待1s
			try {
				Thread.currentThread().sleep(1000);
			} catch (InterruptedException ie) {
				ie.printStackTrace();
			}
		}
		System.out.println("测试pdf文件创建");
	}

	private void createPdf() {
		Map<String, String> tableContentMap = new HashMap<String, String>();
		tableContentMap.put("userName", "用户名XXX");
		tableContentMap.put("cardNo", "银行卡号XXX");
		tableContentMap.put("bankName", "银行名称XXX");
		tableContentMap.put("merName", "商户名XXX");
		String tableContentJson = JSON.toJSONString(tableContentMap);
		Map<String, String> tableMap = new HashMap<String, String>();
		tableMap.put("tableTitle", "表格标题XXX");
		tableMap.put("tableContent", tableContentJson);
		String tableJson = JSON.toJSONString(tableMap);
		Map<String, String> templateMap = new HashMap<String, String>();
		templateMap.put("userName", "用户名XXX");
		templateMap.put("certId", "身份证XXX");
		templateMap.put("userAddress", "用户地址XXX");
		templateMap.put("userMobile", "用户手机XXX");
		templateMap.put("merName", "商户名XXX");
		String templateJson = JSON.toJSONString(templateMap);
		Map<String, String> map = new HashMap<String, String>();
		map.put("fileName", "HelloWorld");
		map.put("title", "代扣服务协议XXX");
		// map.put("content", "甲方信息XXX");
		map.put("template", templateJson);
		map.put("table", tableJson);
		String json = JSON.toJSONString(map);
		System.out.println("请求的参数为：" + json);
//		PdfUtil.genePdfFile(json);
	}
}
