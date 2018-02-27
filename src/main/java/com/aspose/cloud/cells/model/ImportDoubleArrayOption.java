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
import com.aspose.cloud.cells.model.FileSource;
import com.aspose.cloud.cells.model.ImportOption;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * ImportDoubleArrayOption
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2018-02-27T14:45:34.511+08:00")
public class ImportDoubleArrayOption extends ImportOption {
  @SerializedName("FirstRow")
  private Integer firstRow = null;

  @SerializedName("FirstColumn")
  private Integer firstColumn = null;

  @SerializedName("IsVertical")
  private Boolean isVertical = null;

  @SerializedName("Data")
  private List<Double> data = null;

  public ImportDoubleArrayOption firstRow(Integer firstRow) {
    this.firstRow = firstRow;
    return this;
  }

   /**
   * Get firstRow
   * @return firstRow
  **/
  @ApiModelProperty(value = "")
  public Integer getFirstRow() {
    return firstRow;
  }

  public void setFirstRow(Integer firstRow) {
    this.firstRow = firstRow;
  }

  public ImportDoubleArrayOption firstColumn(Integer firstColumn) {
    this.firstColumn = firstColumn;
    return this;
  }

   /**
   * Get firstColumn
   * @return firstColumn
  **/
  @ApiModelProperty(value = "")
  public Integer getFirstColumn() {
    return firstColumn;
  }

  public void setFirstColumn(Integer firstColumn) {
    this.firstColumn = firstColumn;
  }

  public ImportDoubleArrayOption isVertical(Boolean isVertical) {
    this.isVertical = isVertical;
    return this;
  }

   /**
   * Get isVertical
   * @return isVertical
  **/
  @ApiModelProperty(value = "")
  public Boolean isIsVertical() {
    return isVertical;
  }

  public void setIsVertical(Boolean isVertical) {
    this.isVertical = isVertical;
  }

  public ImportDoubleArrayOption data(List<Double> data) {
    this.data = data;
    return this;
  }

  public ImportDoubleArrayOption addDataItem(Double dataItem) {
    if (this.data == null) {
      this.data = new ArrayList<Double>();
    }
    this.data.add(dataItem);
    return this;
  }

   /**
   * Get data
   * @return data
  **/
  @ApiModelProperty(value = "")
  public List<Double> getData() {
    return data;
  }

  public void setData(List<Double> data) {
    this.data = data;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ImportDoubleArrayOption importDoubleArrayOption = (ImportDoubleArrayOption) o;
    return Objects.equals(this.firstRow, importDoubleArrayOption.firstRow) &&
        Objects.equals(this.firstColumn, importDoubleArrayOption.firstColumn) &&
        Objects.equals(this.isVertical, importDoubleArrayOption.isVertical) &&
        Objects.equals(this.data, importDoubleArrayOption.data) &&
        super.equals(o);
  }

  @Override
  public int hashCode() {
    return Objects.hash(firstRow, firstColumn, isVertical, data, super.hashCode());
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ImportDoubleArrayOption {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
    sb.append("    firstRow: ").append(toIndentedString(firstRow)).append("\n");
    sb.append("    firstColumn: ").append(toIndentedString(firstColumn)).append("\n");
    sb.append("    isVertical: ").append(toIndentedString(isVertical)).append("\n");
    sb.append("    data: ").append(toIndentedString(data)).append("\n");
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

