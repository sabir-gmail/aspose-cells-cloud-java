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
import com.aspose.cloud.cells.model.TaskParameter;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * SmartMarkerTaskParameter
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2018-03-05T15:44:26.749+08:00")
public class SmartMarkerTaskParameter extends TaskParameter {
  @SerializedName("SourceWorkbook")
  private FileSource sourceWorkbook = null;

  @SerializedName("DestinationWorkbook")
  private FileSource destinationWorkbook = null;

  @SerializedName("xmlFile")
  private FileSource xmlFile = null;

  public SmartMarkerTaskParameter sourceWorkbook(FileSource sourceWorkbook) {
    this.sourceWorkbook = sourceWorkbook;
    return this;
  }

   /**
   * Get sourceWorkbook
   * @return sourceWorkbook
  **/
  @ApiModelProperty(value = "")
  public FileSource getSourceWorkbook() {
    return sourceWorkbook;
  }

  public void setSourceWorkbook(FileSource sourceWorkbook) {
    this.sourceWorkbook = sourceWorkbook;
  }

  public SmartMarkerTaskParameter destinationWorkbook(FileSource destinationWorkbook) {
    this.destinationWorkbook = destinationWorkbook;
    return this;
  }

   /**
   * Get destinationWorkbook
   * @return destinationWorkbook
  **/
  @ApiModelProperty(value = "")
  public FileSource getDestinationWorkbook() {
    return destinationWorkbook;
  }

  public void setDestinationWorkbook(FileSource destinationWorkbook) {
    this.destinationWorkbook = destinationWorkbook;
  }

  public SmartMarkerTaskParameter xmlFile(FileSource xmlFile) {
    this.xmlFile = xmlFile;
    return this;
  }

   /**
   * Get xmlFile
   * @return xmlFile
  **/
  @ApiModelProperty(value = "")
  public FileSource getXmlFile() {
    return xmlFile;
  }

  public void setXmlFile(FileSource xmlFile) {
    this.xmlFile = xmlFile;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SmartMarkerTaskParameter smartMarkerTaskParameter = (SmartMarkerTaskParameter) o;
    return Objects.equals(this.sourceWorkbook, smartMarkerTaskParameter.sourceWorkbook) &&
        Objects.equals(this.destinationWorkbook, smartMarkerTaskParameter.destinationWorkbook) &&
        Objects.equals(this.xmlFile, smartMarkerTaskParameter.xmlFile) &&
        super.equals(o);
  }

  @Override
  public int hashCode() {
    return Objects.hash(sourceWorkbook, destinationWorkbook, xmlFile, super.hashCode());
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SmartMarkerTaskParameter {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
    sb.append("    sourceWorkbook: ").append(toIndentedString(sourceWorkbook)).append("\n");
    sb.append("    destinationWorkbook: ").append(toIndentedString(destinationWorkbook)).append("\n");
    sb.append("    xmlFile: ").append(toIndentedString(xmlFile)).append("\n");
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

