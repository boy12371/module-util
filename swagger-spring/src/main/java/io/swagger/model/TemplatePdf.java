package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.model.Filename;
import io.swagger.model.Template;
import io.swagger.model.Title;




/**
 * TemplatePdf
 */
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.SpringCodegen", date = "2016-10-25T13:59:36.016+08:00")

public class TemplatePdf   {
  private Filename filename = null;

  private Title title = null;

  private Template template = null;

  public TemplatePdf filename(Filename filename) {
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

  public TemplatePdf title(Title title) {
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

  public TemplatePdf template(Template template) {
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


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TemplatePdf templatePdf = (TemplatePdf) o;
    return Objects.equals(this.filename, templatePdf.filename) &&
        Objects.equals(this.title, templatePdf.title) &&
        Objects.equals(this.template, templatePdf.template);
  }

  @Override
  public int hashCode() {
    return Objects.hash(filename, title, template);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TemplatePdf {\n");
    
    sb.append("    filename: ").append(toIndentedString(filename)).append("\n");
    sb.append("    title: ").append(toIndentedString(title)).append("\n");
    sb.append("    template: ").append(toIndentedString(template)).append("\n");
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

