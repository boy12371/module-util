package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;




/**
 * Template
 */
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.SpringCodegen", date = "2016-10-25T13:59:36.016+08:00")

public class Template   {
  private String username = null;

  private String certId = null;

  private String userAddress = null;

  private String userMobile = null;

  private String merName = null;

  public Template username(String username) {
    this.username = username;
    return this;
  }

   /**
   * Get username
   * @return username
  **/
  @ApiModelProperty(example = "chinapnr", value = "")
  public String getUsername() {
    return username;
  }

  public void setUsername(String username) {
    this.username = username;
  }

  public Template certId(String certId) {
    this.certId = certId;
    return this;
  }

   /**
   * Get certId
   * @return certId
  **/
  @ApiModelProperty(example = "320413198703290811", value = "")
  public String getCertId() {
    return certId;
  }

  public void setCertId(String certId) {
    this.certId = certId;
  }

  public Template userAddress(String userAddress) {
    this.userAddress = userAddress;
    return this;
  }

   /**
   * Get userAddress
   * @return userAddress
  **/
  @ApiModelProperty(example = "上海市徐汇区医学院路70号", value = "")
  public String getUserAddress() {
    return userAddress;
  }

  public void setUserAddress(String userAddress) {
    this.userAddress = userAddress;
  }

  public Template userMobile(String userMobile) {
    this.userMobile = userMobile;
    return this;
  }

   /**
   * Get userMobile
   * @return userMobile
  **/
  @ApiModelProperty(example = "13866668888", value = "")
  public String getUserMobile() {
    return userMobile;
  }

  public void setUserMobile(String userMobile) {
    this.userMobile = userMobile;
  }

  public Template merName(String merName) {
    this.merName = merName;
    return this;
  }

   /**
   * Get merName
   * @return merName
  **/
  @ApiModelProperty(example = "上海交通银行", value = "")
  public String getMerName() {
    return merName;
  }

  public void setMerName(String merName) {
    this.merName = merName;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Template template = (Template) o;
    return Objects.equals(this.username, template.username) &&
        Objects.equals(this.certId, template.certId) &&
        Objects.equals(this.userAddress, template.userAddress) &&
        Objects.equals(this.userMobile, template.userMobile) &&
        Objects.equals(this.merName, template.merName);
  }

  @Override
  public int hashCode() {
    return Objects.hash(username, certId, userAddress, userMobile, merName);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Template {\n");
    
    sb.append("    username: ").append(toIndentedString(username)).append("\n");
    sb.append("    certId: ").append(toIndentedString(certId)).append("\n");
    sb.append("    userAddress: ").append(toIndentedString(userAddress)).append("\n");
    sb.append("    userMobile: ").append(toIndentedString(userMobile)).append("\n");
    sb.append("    merName: ").append(toIndentedString(merName)).append("\n");
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

