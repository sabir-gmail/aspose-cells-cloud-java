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
import com.aspose.cloud.cells.model.CellValue;
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
 * ImportBatchDataOption
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2018-08-14T14:34:14.243+08:00")
public class ImportBatchDataOption extends ImportOption {
  @SerializedName("BatchData")
  private List<CellValue> batchData = null;

  public ImportBatchDataOption batchData(List<CellValue> batchData) {
    this.batchData = batchData;
    return this;
  }

  public ImportBatchDataOption addBatchDataItem(CellValue batchDataItem) {
    if (this.batchData == null) {
      this.batchData = new ArrayList<CellValue>();
    }
    this.batchData.add(batchDataItem);
    return this;
  }

   /**
   * Get batchData
   * @return batchData
  **/
  @ApiModelProperty(value = "")
  public List<CellValue> getBatchData() {
    return batchData;
  }

  public void setBatchData(List<CellValue> batchData) {
    this.batchData = batchData;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ImportBatchDataOption importBatchDataOption = (ImportBatchDataOption) o;
    return Objects.equals(this.batchData, importBatchDataOption.batchData) &&
        super.equals(o);
  }

  @Override
  public int hashCode() {
    return Objects.hash(batchData, super.hashCode());
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ImportBatchDataOption {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
    sb.append("    batchData: ").append(toIndentedString(batchData)).append("\n");
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

