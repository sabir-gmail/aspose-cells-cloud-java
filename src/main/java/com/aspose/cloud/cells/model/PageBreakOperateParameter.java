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
import com.aspose.cloud.cells.model.OperateParameter;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * PageBreakOperateParameter
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2018-02-27T14:45:34.511+08:00")
public class PageBreakOperateParameter extends OperateParameter {
  @SerializedName("PageBreakType")
  private String pageBreakType = null;

  @SerializedName("Index")
  private Integer index = null;

  @SerializedName("Row")
  private Integer row = null;

  @SerializedName("Column")
  private Integer column = null;

  @SerializedName("StartIndex")
  private Integer startIndex = null;

  @SerializedName("EndIndex")
  private Integer endIndex = null;

  public PageBreakOperateParameter pageBreakType(String pageBreakType) {
    this.pageBreakType = pageBreakType;
    return this;
  }

   /**
   * Get pageBreakType
   * @return pageBreakType
  **/
  @ApiModelProperty(value = "")
  public String getPageBreakType() {
    return pageBreakType;
  }

  public void setPageBreakType(String pageBreakType) {
    this.pageBreakType = pageBreakType;
  }

  public PageBreakOperateParameter index(Integer index) {
    this.index = index;
    return this;
  }

   /**
   * Get index
   * @return index
  **/
  @ApiModelProperty(value = "")
  public Integer getIndex() {
    return index;
  }

  public void setIndex(Integer index) {
    this.index = index;
  }

  public PageBreakOperateParameter row(Integer row) {
    this.row = row;
    return this;
  }

   /**
   * Get row
   * @return row
  **/
  @ApiModelProperty(value = "")
  public Integer getRow() {
    return row;
  }

  public void setRow(Integer row) {
    this.row = row;
  }

  public PageBreakOperateParameter column(Integer column) {
    this.column = column;
    return this;
  }

   /**
   * Get column
   * @return column
  **/
  @ApiModelProperty(value = "")
  public Integer getColumn() {
    return column;
  }

  public void setColumn(Integer column) {
    this.column = column;
  }

  public PageBreakOperateParameter startIndex(Integer startIndex) {
    this.startIndex = startIndex;
    return this;
  }

   /**
   * Get startIndex
   * @return startIndex
  **/
  @ApiModelProperty(value = "")
  public Integer getStartIndex() {
    return startIndex;
  }

  public void setStartIndex(Integer startIndex) {
    this.startIndex = startIndex;
  }

  public PageBreakOperateParameter endIndex(Integer endIndex) {
    this.endIndex = endIndex;
    return this;
  }

   /**
   * Get endIndex
   * @return endIndex
  **/
  @ApiModelProperty(value = "")
  public Integer getEndIndex() {
    return endIndex;
  }

  public void setEndIndex(Integer endIndex) {
    this.endIndex = endIndex;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PageBreakOperateParameter pageBreakOperateParameter = (PageBreakOperateParameter) o;
    return Objects.equals(this.pageBreakType, pageBreakOperateParameter.pageBreakType) &&
        Objects.equals(this.index, pageBreakOperateParameter.index) &&
        Objects.equals(this.row, pageBreakOperateParameter.row) &&
        Objects.equals(this.column, pageBreakOperateParameter.column) &&
        Objects.equals(this.startIndex, pageBreakOperateParameter.startIndex) &&
        Objects.equals(this.endIndex, pageBreakOperateParameter.endIndex) &&
        super.equals(o);
  }

  @Override
  public int hashCode() {
    return Objects.hash(pageBreakType, index, row, column, startIndex, endIndex, super.hashCode());
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PageBreakOperateParameter {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
    sb.append("    pageBreakType: ").append(toIndentedString(pageBreakType)).append("\n");
    sb.append("    index: ").append(toIndentedString(index)).append("\n");
    sb.append("    row: ").append(toIndentedString(row)).append("\n");
    sb.append("    column: ").append(toIndentedString(column)).append("\n");
    sb.append("    startIndex: ").append(toIndentedString(startIndex)).append("\n");
    sb.append("    endIndex: ").append(toIndentedString(endIndex)).append("\n");
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

