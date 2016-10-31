package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.model.Filename;
import io.swagger.model.Table;
import io.swagger.model.Text;
import io.swagger.model.Title;




/**
 * StringTablePdf
 */
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.SpringCodegen", date = "2016-10-25T13:59:36.016+08:00")

public class StringTablePdf   {
  private Filename filename = null;

  private Title title = null;

  private Text text = null;

  private Table table = null;

  public StringTablePdf filename(Filename filename) {
    this.filename = filename;
    return this;
  }

   /**
   * Get filename
   * @return filename
  **/
  @ApiModelProperty(required = true, value = "")
  public Filename getFilename() {
    return filename;
  }

  public void setFilename(Filename filename) {
    this.filename = filename;
  }

  public StringTablePdf title(Title title) {
    this.title = title;
    return this;
  }

   /**
   * Get title
   * @return title
  **/
  @ApiModelProperty(required = true, value = "")
  public Title getTitle() {
    return title;
  }

  public void setTitle(Title title) {
    this.title = title;
  }

  public StringTablePdf text(Text text) {
    this.text = text;
    return this;
  }

   /**
   * Get text
   * @return text
  **/
  @ApiModelProperty(required = true, value = "")
  public Text getText() {
    return text;
  }

  public void setText(Text text) {
    this.text = text;
  }

  public StringTablePdf table(Table table) {
    this.table = table;
    return this;
  }

   /**
   * Get table
   * @return table
  **/
  @ApiModelProperty(required = true, value = "")
  public Table getTable() {
    return table;
  }

  public void setTable(Table table) {
    this.table = table;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    StringTablePdf stringTablePdf = (StringTablePdf) o;
    return Objects.equals(this.filename, stringTablePdf.filename) &&
        Objects.equals(this.title, stringTablePdf.title) &&
        Objects.equals(this.text, stringTablePdf.text) &&
        Objects.equals(this.table, stringTablePdf.table);
  }

  @Override
  public int hashCode() {
    return Objects.hash(filename, title, text, table);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class StringTablePdf {\n");
    
    sb.append("    filename: ").append(toIndentedString(filename)).append("\n");
    sb.append("    title: ").append(toIndentedString(title)).append("\n");
    sb.append("    text: ").append(toIndentedString(text)).append("\n");
    sb.append("    table: ").append(toIndentedString(table)).append("\n");
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

