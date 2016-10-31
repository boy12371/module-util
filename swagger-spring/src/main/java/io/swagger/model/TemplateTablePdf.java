package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.model.Filename;
import io.swagger.model.Table;
import io.swagger.model.Template;
import io.swagger.model.Title;




/**
 * TemplateTablePdf
 */
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.SpringCodegen", date = "2016-10-25T13:59:36.016+08:00")

public class TemplateTablePdf   {
  private Filename filename = null;

  private Title title = null;

  private Template template = null;

  private Table table = null;

  public TemplateTablePdf filename(Filename filename) {
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

  public TemplateTablePdf title(Title title) {
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

  public TemplateTablePdf template(Template template) {
    this.template = template;
    return this;
  }

   /**
   * Get template
   * @return template
  **/
  @ApiModelProperty(required = true, value = "")
  public Template getTemplate() {
    return template;
  }

  public void setTemplate(Template template) {
    this.template = template;
  }

  public TemplateTablePdf table(Table table) {
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
    TemplateTablePdf templateTablePdf = (TemplateTablePdf) o;
    return Objects.equals(this.filename, templateTablePdf.filename) &&
        Objects.equals(this.title, templateTablePdf.title) &&
        Objects.equals(this.template, templateTablePdf.template) &&
        Objects.equals(this.table, templateTablePdf.table);
  }

  @Override
  public int hashCode() {
    return Objects.hash(filename, title, template, table);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TemplateTablePdf {\n");
    
    sb.append("    filename: ").append(toIndentedString(filename)).append("\n");
    sb.append("    title: ").append(toIndentedString(title)).append("\n");
    sb.append("    template: ").append(toIndentedString(template)).append("\n");
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

