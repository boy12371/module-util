package io.swagger.api;

import io.swagger.model.RespApisInfo;

import io.swagger.annotations.*;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RequestPart;
import org.springframework.web.multipart.MultipartFile;

import java.util.List;

@javax.annotation.Generated(value = "class io.swagger.codegen.languages.SpringCodegen", date = "2016-10-25T13:59:36.016+08:00")

@Api(value = "{apisId}", description = "the {apisId} API")
public interface ApisIdApi {

    @ApiOperation(value = "Api接口完成进度查询", notes = "功能描述： - 用于为Module平台下的所有客户端提供Api接口完成进度查询服务。  业务流程说明：     1. 客户端发起Api接口完成进度查询请求，传递参数信息；     2. 检验参数apisId是否为空，如果是，则step3，如果否，step4；     3. 返回错误码，错误描述：没有该Api的信息；     4. 如果apisId值符合apisId校验值，则返回该api接口信息；如果否，则step3。 ", response = RespApisInfo.class, tags={ "info", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "操作成功", response = RespApisInfo.class),
        @ApiResponse(code = 400, message = "提供的ID无效", response = RespApisInfo.class),
        @ApiResponse(code = 404, message = "没有该Api的信息", response = RespApisInfo.class) })
    @RequestMapping(value = "/{apisId}",
        produces = { "application/json" }, 
        method = RequestMethod.GET)
    ResponseEntity<RespApisInfo> getApiById(
@ApiParam(value = "需要查询api信息的id",required=true ) @PathVariable("apisId") Long apisId


);

}
