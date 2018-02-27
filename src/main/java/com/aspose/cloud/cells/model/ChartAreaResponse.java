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
import com.aspose.cloud.cells.model.ChartArea;
import com.aspose.cloud.cells.model.SaaSposeResponse;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * ChartAreaResponse
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2018-02-27T14:45:34.511+08:00")
public class ChartAreaResponse extends SaaSposeResponse {
  @SerializedName("ChartArea")
  private ChartArea chartArea = null;

  public ChartAreaResponse chartArea(ChartArea chartArea) {
    this.chartArea = chartArea;
    return this;
  }

   /**
   * Get chartArea
   * @return chartArea
  **/
  @ApiModelProperty(value = "")
  public ChartArea getChartArea() {
    return chartArea;
  }

  public void setChartArea(ChartArea chartArea) {
    this.chartArea = chartArea;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ChartAreaResponse chartAreaResponse = (ChartAreaResponse) o;
    return Objects.equals(this.chartArea, chartAreaResponse.chartArea) &&
        super.equals(o);
  }

  @Override
  public int hashCode() {
    return Objects.hash(chartArea, super.hashCode());
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ChartAreaResponse {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
    sb.append("    chartArea: ").append(toIndentedString(chartArea)).append("\n");
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

