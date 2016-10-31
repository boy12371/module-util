package com.huifu.module.web.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;

import com.huifu.module.web.api.Api102020101;
import com.huifu.module.web.model.RespDownload;
import com.huifu.module.web.model.StringPdf;

import io.swagger.annotations.ApiParam;

@javax.annotation.Generated(value = "class io.swagger.codegen.languages.SpringCodegen", date = "2016-10-25T02:13:04.643+08:00")

@Controller
public class Api102020101Controller implements Api102020101 {

	public ResponseEntity<RespDownload> addStringPdf(

			@ApiParam(value = "字符生成的Pdf文档需要传的参数", required = true) @RequestBody StringPdf body

	) {
		// do some magic!
		return new ResponseEntity<RespDownload>(HttpStatus.OK);
	}

}
