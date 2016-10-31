package io.swagger.api;

import io.swagger.model.RespApisInfo;

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
public class ApisIdApiController implements ApisIdApi {

    public ResponseEntity<RespApisInfo> getApiById(
@ApiParam(value = "需要查询api信息的id",required=true ) @PathVariable("apisId") Long apisId


) {
        // do some magic!
        return new ResponseEntity<RespApisInfo>(HttpStatus.OK);
    }

}
