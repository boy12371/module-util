package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;




/**
 * RespApisInfo
 */
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.SpringCodegen", date = "2016-10-25T13:59:36.016+08:00")

public class RespApisInfo   {
  private Long apisId = null;

  private String developer = null;

  private String devProgress = null;

  private String tester = null;

  private String testProgress = null;

  private String project = null;

  /**
   * 项目进度:计划立项开发测试上线暂停废弃
   */
  public enum StatusEnum {
    PLANNED("Planned"),
    
    APPROVED("Approved"),
    
    DEVELOPED("Developed"),
    
    TESTED("Tested"),
    
    RELEASED("Released"),
    
    PENDING("Pending"),
    
    DEPRECATED("Deprecated");

    private String value;

    StatusEnum(String value) {
      this.value = value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }
  }

  private StatusEnum status = null;

  public RespApisInfo apisId(Long apisId) {
    this.apisId = apisId;
    return this;
  }

   /**
   * Api的id
   * @return apisId
  **/
  @ApiModelProperty(example = "1010101", value = "Api的id")
  public Long getApisId() {
    return apisId;
  }

  public void setApisId(Long apisId) {
    this.apisId = apisId;
  }

  public RespApisInfo developer(String developer) {
    this.developer = developer;
    return this;
  }

   /**
   * 开发者的姓名
   * @return developer
  **/
  @ApiModelProperty(example = "richard", value = "开发者的姓名")
  public String getDeveloper() {
    return developer;
  }

  public void setDeveloper(String developer) {
    this.developer = developer;
  }

  public RespApisInfo devProgress(String devProgress) {
    this.devProgress = devProgress;
    return this;
  }

   /**
   * 开发进度
   * @return devProgress
  **/
  @ApiModelProperty(example = "10%", value = "开发进度")
  public String getDevProgress() {
    return devProgress;
  }

  public void setDevProgress(String devProgress) {
    this.devProgress = devProgress;
  }

  public RespApisInfo tester(String tester) {
    this.tester = tester;
    return this;
  }

   /**
   * 测试者的姓名
   * @return tester
  **/
  @ApiModelProperty(example = "richard", value = "测试者的姓名")
  public String getTester() {
    return tester;
  }

  public void setTester(String tester) {
    this.tester = tester;
  }

  public RespApisInfo testProgress(String testProgress) {
    this.testProgress = testProgress;
    return this;
  }

   /**
   * 测试进度
   * @return testProgress
  **/
  @ApiModelProperty(example = "0%", value = "测试进度")
  public String getTestProgress() {
    return testProgress;
  }

  public void setTestProgress(String testProgress) {
    this.testProgress = testProgress;
  }

  public RespApisInfo project(String project) {
    this.project = project;
    return this;
  }

   /**
   * 项目描述
   * @return project
  **/
  @ApiModelProperty(example = "该服务已废弃，请使用1010102接口", value = "项目描述")
  public String getProject() {
    return project;
  }

  public void setProject(String project) {
    this.project = project;
  }

  public RespApisInfo status(StatusEnum status) {
    this.status = status;
    return this;
  }

   /**
   * 项目进度:计划立项开发测试上线暂停废弃
   * @return status
  **/
  @ApiModelProperty(example = "Deprecated", value = "项目进度:计划立项开发测试上线暂停废弃")
  public StatusEnum getStatus() {
    return status;
  }

  public void setStatus(StatusEnum status) {
    this.status = status;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RespApisInfo respApisInfo = (RespApisInfo) o;
    return Objects.equals(this.apisId, respApisInfo.apisId) &&
        Objects.equals(this.developer, respApisInfo.developer) &&
        Objects.equals(this.devProgress, respApisInfo.devProgress) &&
        Objects.equals(this.tester, respApisInfo.tester) &&
        Objects.equals(this.testProgress, respApisInfo.testProgress) &&
        Objects.equals(this.project, respApisInfo.project) &&
        Objects.equals(this.status, respApisInfo.status);
  }

  @Override
  public int hashCode() {
    return Objects.hash(apisId, developer, devProgress, tester, testProgress, project, status);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RespApisInfo {\n");
    
    sb.append("    apisId: ").append(toIndentedString(apisId)).append("\n");
    sb.append("    developer: ").append(toIndentedString(developer)).append("\n");
    sb.append("    devProgress: ").append(toIndentedString(devProgress)).append("\n");
    sb.append("    tester: ").append(toIndentedString(tester)).append("\n");
    sb.append("    testProgress: ").append(toIndentedString(testProgress)).append("\n");
    sb.append("    project: ").append(toIndentedString(project)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
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

