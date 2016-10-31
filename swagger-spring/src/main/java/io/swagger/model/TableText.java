package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;




/**
 * TableText
 */
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.SpringCodegen", date = "2016-10-25T13:59:36.016+08:00")

public class TableText   {
  private String username = null;

  private String cardNo = null;

  private String bankName = null;

  private String merName = null;

  public TableText username(String username) {
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

  public TableText cardNo(String cardNo) {
    this.cardNo = cardNo;
    return this;
  }

   /**
   * Get cardNo
   * @return cardNo
  **/
  @ApiModelProperty(example = "5888888888888888", value = "")
  public String getCardNo() {
    return cardNo;
  }

  public void setCardNo(String cardNo) {
    this.cardNo = cardNo;
  }

  public TableText bankName(String bankName) {
    this.bankName = bankName;
    return this;
  }

   /**
   * Get bankName
   * @return bankName
  **/
  @ApiModelProperty(example = "上海招商银行", value = "")
  public String getBankName() {
    return bankName;
  }

  public void setBankName(String bankName) {
    this.bankName = bankName;
  }

  public TableText merName(String merName) {
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
    TableText tableText = (TableText) o;
    return Objects.equals(this.username, tableText.username) &&
        Objects.equals(this.cardNo, tableText.cardNo) &&
        Objects.equals(this.bankName, tableText.bankName) &&
        Objects.equals(this.merName, tableText.merName);
  }

  @Override
  public int hashCode() {
    return Objects.hash(username, cardNo, bankName, merName);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TableText {\n");
    
    sb.append("    username: ").append(toIndentedString(username)).append("\n");
    sb.append("    cardNo: ").append(toIndentedString(cardNo)).append("\n");
    sb.append("    bankName: ").append(toIndentedString(bankName)).append("\n");
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

