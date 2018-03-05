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
 * HorizontalPageBreak
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2018-03-05T15:44:26.749+08:00")
public class HorizontalPageBreak {
  @SerializedName("Row")
  private Integer row = null;

  @SerializedName("EndColumn")
  private Integer endColumn = null;

  @SerializedName("StartColumn")
  private Integer startColumn = null;

  public HorizontalPageBreak row(Integer row) {
    this.row = row;
    return this;
  }

   /**
   * Get row
   * @return row
  **/
  @ApiModelProperty(required = true, value = "")
  public Integer getRow() {
    return row;
  }

  public void setRow(Integer row) {
    this.row = row;
  }

  public HorizontalPageBreak endColumn(Integer endColumn) {
    this.endColumn = endColumn;
    return this;
  }

   /**
   * Get endColumn
   * @return endColumn
  **/
  @ApiModelProperty(required = true, value = "")
  public Integer getEndColumn() {
    return endColumn;
  }

  public void setEndColumn(Integer endColumn) {
    this.endColumn = endColumn;
  }

  public HorizontalPageBreak startColumn(Integer startColumn) {
    this.startColumn = startColumn;
    return this;
  }

   /**
   * Get startColumn
   * @return startColumn
  **/
  @ApiModelProperty(required = true, value = "")
  public Integer getStartColumn() {
    return startColumn;
  }

  public void setStartColumn(Integer startColumn) {
    this.startColumn = startColumn;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    HorizontalPageBreak horizontalPageBreak = (HorizontalPageBreak) o;
    return Objects.equals(this.row, horizontalPageBreak.row) &&
        Objects.equals(this.endColumn, horizontalPageBreak.endColumn) &&
        Objects.equals(this.startColumn, horizontalPageBreak.startColumn);
  }

  @Override
  public int hashCode() {
    return Objects.hash(row, endColumn, startColumn);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class HorizontalPageBreak {\n");
    
    sb.append("    row: ").append(toIndentedString(row)).append("\n");
    sb.append("    endColumn: ").append(toIndentedString(endColumn)).append("\n");
    sb.append("    startColumn: ").append(toIndentedString(startColumn)).append("\n");
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

