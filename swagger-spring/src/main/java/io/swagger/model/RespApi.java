package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;




/**
 * RespApi
 */
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.SpringCodegen", date = "2016-10-25T13:59:36.016+08:00")

public class RespApi   {
  private Integer code = null;

  /**
   * 返回码类型
   */
  public enum TypeEnum {
    ERROR("error"),
    
    WARN("warn"),
    
    INFO("info");

    private String value;

    TypeEnum(String value) {
      this.value = value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }
  }

  private TypeEnum type = null;

  private String message = null;

  public RespApi code(Integer code) {
    this.code = code;
    return this;
  }

   /**
   * 返回码
   * @return code
  **/
  @ApiModelProperty(example = "404", value = "返回码")
  public Integer getCode() {
    return code;
  }

  public void setCode(Integer code) {
    this.code = code;
  }

  public RespApi type(TypeEnum type) {
    this.type = type;
    return this;
  }

   /**
   * 返回码类型
   * @return type
  **/
  @ApiModelProperty(example = "error", value = "返回码类型")
  public TypeEnum getType() {
    return type;
  }

  public void setType(TypeEnum type) {
    this.type = type;
  }

  public RespApi message(String message) {
    this.message = message;
    return this;
  }

   /**
   * 返回码描述
   * @return message
  **/
  @ApiModelProperty(example = "找不到目标资源", value = "返回码描述")
  public String getMessage() {
    return message;
  }

  public void setMessage(String message) {
    this.message = message;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RespApi respApi = (RespApi) o;
    return Objects.equals(this.code, respApi.code) &&
        Objects.equals(this.type, respApi.type) &&
        Objects.equals(this.message, respApi.message);
  }

  @Override
  public int hashCode() {
    return Objects.hash(code, type, message);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RespApi {\n");
    
    sb.append("    code: ").append(toIndentedString(code)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    message: ").append(toIndentedString(message)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

