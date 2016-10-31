package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.model.TableText;




/**
 * Table
 */
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.SpringCodegen", date = "2016-10-25T13:59:36.016+08:00")

public class Table   {
  private String tableTitle = null;

  private TableText tableText = null;

  public Table tableTitle(String tableTitle) {
    this.tableTitle = tableTitle;
    return this;
  }

   /**
   * Get tableTitle
   * @return tableTitle
  **/
  @ApiModelProperty(example = "甲方授权信息\n汇付数据\n虹梅路1801号", value = "")
  public String getTableTitle() {
    return tableTitle;
  }

  public void setTableTitle(String tableTitle) {
    this.tableTitle = tableTitle;
  }

  public Table tableText(TableText tableText) {
    this.tableText = tableText;
    return this;
  }

   /**
   * Get tableText
   * @return tableText
  **/
  @ApiModelProperty(value = "")
  public TableText getTableText() {
    return tableText;
  }

  public void setTableText(TableText tableText) {
    this.tableText = tableText;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Table table = (Table) o;
    return Objects.equals(this.tableTitle, table.tableTitle) &&
        Objects.equals(this.tableText, table.tableText);
  }

  @Override
  public int hashCode() {
    return Objects.hash(tableTitle, tableText);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Table {\n");
    
    sb.append("    tableTitle: ").append(toIndentedString(tableTitle)).append("\n");
    sb.append("    tableText: ").append(toIndentedString(tableText)).append("\n");
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

