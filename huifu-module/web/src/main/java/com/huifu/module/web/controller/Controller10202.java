package com.huifu.module.web.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

/**
 * Controller模板
 */
@Controller
@RequestMapping("/")
public class Controller10202 {
	private static final Logger logger = LoggerFactory.getLogger(Controller10202.class);

	@RequestMapping(value = "/1020201", method = RequestMethod.GET)
	public Object index(ModelAndView mov, HttpServletRequest httpRequest, HttpServletResponse httpResponse) {
		String responsejson = null;
//		Map<String, String> map = new HashMap<String, String>();
//		try {
//			httpRequest.setCharacterEncoding("UTF-8");
//		} catch (UnsupportedEncodingException ue) {
//			map.put("resCode", "202");
//			map.put("resDesc", "字符编码不支持");
//			responsejson = JSON.toJSONString(map);
//			mov.addObject("json", responsejson);
//			logger.info("[返回的的参数为]:" + responsejson);
//			mov.setViewName("/10202/1020201");
//			return mov;
//		}
//		String requestJson = httpRequest.getParameter("jsondata");
//		logger.info("[请求的参数为]:" + requestJson);
//		String json = null;
//		if (StringUtils.isBlank(requestJson)) {
//			map.put("resCode", "203");
//			map.put("resDesc", "参数不能为空");
//		} else {
//			json = String.valueOf(PdfUtil.genPdfFile(requestJson));
//			map.put("resCode", "000");
//			map.put("resDesc", "成功");
//			map.put("content", json);
//		}
//		responsejson = JSON.toJSONString(map);
//		mov.addObject("json", responsejson);
//		logger.info("[返回的的参数为]:" + responsejson);
		mov.setViewName("/index");
		return mov;
	}
}
