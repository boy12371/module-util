package io.swagger.api;

import io.swagger.model.StringPdf;
import io.swagger.model.RespApi;
import io.swagger.model.RespDownload;

import io.swagger.annotations.*;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RequestPart;
import org.springframework.web.multipart.MultipartFile;

import java.util.List;


@javax.annotation.Generated(value = "class io.swagger.codegen.languages.SpringCodegen", date = "2016-10-25T13:59:36.016+08:00")

@Controller
public class Api102020101Controller implements Api102020101 {

    public ResponseEntity<RespDownload> addStringPdf(

@ApiParam(value = "字符生成的Pdf文档需要传的参数" ,required=true ) @RequestBody StringPdf body

) {
        // do some magic!
        return new ResponseEntity<RespDownload>(HttpStatus.OK);
    }

}
