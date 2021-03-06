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
import com.aspose.cloud.cells.model.Range;
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
 * Ranges
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2018-08-14T14:34:14.243+08:00")
public class Ranges {
  @SerializedName("RangeList")
  private List<Range> rangeList = null;

  public Ranges rangeList(List<Range> rangeList) {
    this.rangeList = rangeList;
    return this;
  }

  public Ranges addRangeListItem(Range rangeListItem) {
    if (this.rangeList == null) {
      this.rangeList = new ArrayList<Range>();
    }
    this.rangeList.add(rangeListItem);
    return this;
  }

   /**
   * Get rangeList
   * @return rangeList
  **/
  @ApiModelProperty(value = "")
  public List<Range> getRangeList() {
    return rangeList;
  }

  public void setRangeList(List<Range> rangeList) {
    this.rangeList = rangeList;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Ranges ranges = (Ranges) o;
    return Objects.equals(this.rangeList, ranges.rangeList);
  }

  @Override
  public int hashCode() {
    return Objects.hash(rangeList);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Ranges {\n");
    
    sb.append("    rangeList: ").append(toIndentedString(rangeList)).append("\n");
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

