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
 * VerticalPageBreak
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2018-08-14T14:34:14.243+08:00")
public class VerticalPageBreak {
  @SerializedName("Column")
  private Integer column = null;

  @SerializedName("StartRow")
  private Integer startRow = null;

  @SerializedName("EndRow")
  private Integer endRow = null;

  public VerticalPageBreak column(Integer column) {
    this.column = column;
    return this;
  }

   /**
   * Get column
   * @return column
  **/
  @ApiModelProperty(required = true, value = "")
  public Integer getColumn() {
    return column;
  }

  public void setColumn(Integer column) {
    this.column = column;
  }

  public VerticalPageBreak startRow(Integer startRow) {
    this.startRow = startRow;
    return this;
  }

   /**
   * Get startRow
   * @return startRow
  **/
  @ApiModelProperty(required = true, value = "")
  public Integer getStartRow() {
    return startRow;
  }

  public void setStartRow(Integer startRow) {
    this.startRow = startRow;
  }

  public VerticalPageBreak endRow(Integer endRow) {
    this.endRow = endRow;
    return this;
  }

   /**
   * Get endRow
   * @return endRow
  **/
  @ApiModelProperty(required = true, value = "")
  public Integer getEndRow() {
    return endRow;
  }

  public void setEndRow(Integer endRow) {
    this.endRow = endRow;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    VerticalPageBreak verticalPageBreak = (VerticalPageBreak) o;
    return Objects.equals(this.column, verticalPageBreak.column) &&
        Objects.equals(this.startRow, verticalPageBreak.startRow) &&
        Objects.equals(this.endRow, verticalPageBreak.endRow);
  }

  @Override
  public int hashCode() {
    return Objects.hash(column, startRow, endRow);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class VerticalPageBreak {\n");
    
    sb.append("    column: ").append(toIndentedString(column)).append("\n");
    sb.append("    startRow: ").append(toIndentedString(startRow)).append("\n");
    sb.append("    endRow: ").append(toIndentedString(endRow)).append("\n");
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

