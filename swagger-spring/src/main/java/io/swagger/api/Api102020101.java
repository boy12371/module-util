package io.swagger.api;

import io.swagger.model.StringPdf;
import io.swagger.model.RespApi;
import io.swagger.model.RespDownload;

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

@Api(value = "102020101", description = "the 102020101 API")
public interface Api102020101 {

    @ApiOperation(value = "字符生成的pdf文档", notes = "功能描述： - 用于为Module平台下的所有客户端提供字符生成的Pdf文件服务。  业务流程说明：     1. 客户端发起字符生成的Pdf文件请求，传递参数信息；     2. 校验参数filename是否为空，如果是，则step3；如果否，则step4；     3. 返回错误码，错误描述：文件名错误；     4. 检验fileName是否符合文件名字符，如果是，则fileName设为参数值；如果否，则step3；     5. 校验参数title是否为空，如果是，则step6；如果否，则step7；     6. 返回错误码，错误描述：标题错误；     7. 检验title是否符合标题名字符，如果是，则title设为参数值；如果否，则step9；     8. 检验参数text是否为空，如果是，则step9，如果否，step10；     9. 返回错误码，错误描述：正文内容错误；     10. 检验text是否符合正文字符，如果是，则text参数值设为正文内容；如果否，则step12；     11. Pdf文档，如果创建成功，返回生成的Pdf文档编号，地址和创建时间；如果失败，返回错误码和错误信息，如：json格式不正确。 ", response = RespDownload.class, authorizations = {
        @Authorization(value = "BasicSecurity")
    }, tags={ "pdfUtil", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "操作成功", response = RespDownload.class),
        @ApiResponse(code = 504, message = "网络超时", response = RespDownload.class) })
    @RequestMapping(value = "/102020101",
        produces = { "application/json" }, 
        consumes = { "application/json" },
        method = RequestMethod.POST)
    ResponseEntity<RespDownload> addStringPdf(

@ApiParam(value = "字符生成的Pdf文档需要传的参数" ,required=true ) @RequestBody StringPdf body

);

}
