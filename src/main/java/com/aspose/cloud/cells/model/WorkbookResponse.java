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
import com.aspose.cloud.cells.model.SaaSposeResponse;
import com.aspose.cloud.cells.model.Workbook;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * WorkbookResponse
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2018-03-05T15:44:26.749+08:00")
public class WorkbookResponse extends SaaSposeResponse {
  @SerializedName("Workbook")
  private Workbook workbook = null;

  public WorkbookResponse workbook(Workbook workbook) {
    this.workbook = workbook;
    return this;
  }

   /**
   * Get workbook
   * @return workbook
  **/
  @ApiModelProperty(value = "")
  public Workbook getWorkbook() {
    return workbook;
  }

  public void setWorkbook(Workbook workbook) {
    this.workbook = workbook;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    WorkbookResponse workbookResponse = (WorkbookResponse) o;
    return Objects.equals(this.workbook, workbookResponse.workbook) &&
        super.equals(o);
  }

  @Override
  public int hashCode() {
    return Objects.hash(workbook, super.hashCode());
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class WorkbookResponse {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
    sb.append("    workbook: ").append(toIndentedString(workbook)).append("\n");
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

