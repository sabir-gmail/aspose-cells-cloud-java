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
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * ImportOption
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2018-03-05T15:44:26.749+08:00")

public class ImportOption {
  @SerializedName("DestinationWorksheet")
  private String destinationWorksheet = null;

  @SerializedName("IsInsert")
  private Boolean isInsert = null;

  @SerializedName("ImportDataType")
  private String importDataType = null;

  @SerializedName("Source")
  private FileSource source = null;

  public ImportOption destinationWorksheet(String destinationWorksheet) {
    this.destinationWorksheet = destinationWorksheet;
    return this;
  }

   /**
   * Get destinationWorksheet
   * @return destinationWorksheet
  **/
  @ApiModelProperty(value = "")
  public String getDestinationWorksheet() {
    return destinationWorksheet;
  }

  public void setDestinationWorksheet(String destinationWorksheet) {
    this.destinationWorksheet = destinationWorksheet;
  }

  public ImportOption isInsert(Boolean isInsert) {
    this.isInsert = isInsert;
    return this;
  }

   /**
   * Get isInsert
   * @return isInsert
  **/
  @ApiModelProperty(value = "")
  public Boolean isIsInsert() {
    return isInsert;
  }

  public void setIsInsert(Boolean isInsert) {
    this.isInsert = isInsert;
  }

  public ImportOption importDataType(String importDataType) {
    this.importDataType = importDataType;
    return this;
  }

   /**
   * Get importDataType
   * @return importDataType
  **/
  @ApiModelProperty(value = "")
  public String getImportDataType() {
    return importDataType;
  }

  public void setImportDataType(String importDataType) {
    this.importDataType = importDataType;
  }

  public ImportOption source(FileSource source) {
    this.source = source;
    return this;
  }

   /**
   * Get source
   * @return source
  **/
  @ApiModelProperty(value = "")
  public FileSource getSource() {
    return source;
  }

  public void setSource(FileSource source) {
    this.source = source;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ImportOption importOption = (ImportOption) o;
    return Objects.equals(this.destinationWorksheet, importOption.destinationWorksheet) &&
        Objects.equals(this.isInsert, importOption.isInsert) &&
        Objects.equals(this.importDataType, importOption.importDataType) &&
        Objects.equals(this.source, importOption.source);
  }

  @Override
  public int hashCode() {
    return Objects.hash(destinationWorksheet, isInsert, importDataType, source);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ImportOption {\n");
    
    sb.append("    destinationWorksheet: ").append(toIndentedString(destinationWorksheet)).append("\n");
    sb.append("    isInsert: ").append(toIndentedString(isInsert)).append("\n");
    sb.append("    importDataType: ").append(toIndentedString(importDataType)).append("\n");
    sb.append("    source: ").append(toIndentedString(source)).append("\n");
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

