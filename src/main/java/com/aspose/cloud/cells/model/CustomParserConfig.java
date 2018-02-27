/*
 * Web API Swagger specification
 * No description provided (generated by Swagger Codegen https://github.com/swagger-api/swagger-codegen)
 *
 * OpenAPI spec version: 1.0
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package com.aspose.cloud.cells.model;

import java.util.Objects;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * CustomParserConfig
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2018-02-27T14:45:34.511+08:00")
public class CustomParserConfig {
  @SerializedName("ColumnIndex")
  private Integer columnIndex = null;

  @SerializedName("ParseMethod")
  private String parseMethod = null;

  @SerializedName("CustomStyle")
  private String customStyle = null;

  public CustomParserConfig columnIndex(Integer columnIndex) {
    this.columnIndex = columnIndex;
    return this;
  }

   /**
   * Get columnIndex
   * @return columnIndex
  **/
  @ApiModelProperty(value = "")
  public Integer getColumnIndex() {
    return columnIndex;
  }

  public void setColumnIndex(Integer columnIndex) {
    this.columnIndex = columnIndex;
  }

  public CustomParserConfig parseMethod(String parseMethod) {
    this.parseMethod = parseMethod;
    return this;
  }

   /**
   * Get parseMethod
   * @return parseMethod
  **/
  @ApiModelProperty(value = "")
  public String getParseMethod() {
    return parseMethod;
  }

  public void setParseMethod(String parseMethod) {
    this.parseMethod = parseMethod;
  }

  public CustomParserConfig customStyle(String customStyle) {
    this.customStyle = customStyle;
    return this;
  }

   /**
   * Get customStyle
   * @return customStyle
  **/
  @ApiModelProperty(value = "")
  public String getCustomStyle() {
    return customStyle;
  }

  public void setCustomStyle(String customStyle) {
    this.customStyle = customStyle;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CustomParserConfig customParserConfig = (CustomParserConfig) o;
    return Objects.equals(this.columnIndex, customParserConfig.columnIndex) &&
        Objects.equals(this.parseMethod, customParserConfig.parseMethod) &&
        Objects.equals(this.customStyle, customParserConfig.customStyle);
  }

  @Override
  public int hashCode() {
    return Objects.hash(columnIndex, parseMethod, customStyle);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CustomParserConfig {\n");
    
    sb.append("    columnIndex: ").append(toIndentedString(columnIndex)).append("\n");
    sb.append("    parseMethod: ").append(toIndentedString(parseMethod)).append("\n");
    sb.append("    customStyle: ").append(toIndentedString(customStyle)).append("\n");
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
