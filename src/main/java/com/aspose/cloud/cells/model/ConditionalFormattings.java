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
import com.aspose.cloud.cells.model.ConditionalFormatting;
import com.aspose.cloud.cells.model.Link;
import com.aspose.cloud.cells.model.LinkElement;
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
 * ConditionalFormattings
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2018-02-27T14:45:34.511+08:00")
public class ConditionalFormattings {
  @SerializedName("link")
  private Link link = null;

  @SerializedName("Count")
  private Integer count = null;

  @SerializedName("ConditionalFormattingList")
  private List<ConditionalFormatting> conditionalFormattingList = null;

  public ConditionalFormattings link(Link link) {
    this.link = link;
    return this;
  }

   /**
   * Get link
   * @return link
  **/
  @ApiModelProperty(value = "")
  public Link getLink() {
    return link;
  }

  public void setLink(Link link) {
    this.link = link;
  }

  public ConditionalFormattings count(Integer count) {
    this.count = count;
    return this;
  }

   /**
   * Get count
   * @return count
  **/
  @ApiModelProperty(required = true, value = "")
  public Integer getCount() {
    return count;
  }

  public void setCount(Integer count) {
    this.count = count;
  }

  public ConditionalFormattings conditionalFormattingList(List<ConditionalFormatting> conditionalFormattingList) {
    this.conditionalFormattingList = conditionalFormattingList;
    return this;
  }

  public ConditionalFormattings addConditionalFormattingListItem(ConditionalFormatting conditionalFormattingListItem) {
    if (this.conditionalFormattingList == null) {
      this.conditionalFormattingList = new ArrayList<ConditionalFormatting>();
    }
    this.conditionalFormattingList.add(conditionalFormattingListItem);
    return this;
  }

   /**
   * Get conditionalFormattingList
   * @return conditionalFormattingList
  **/
  @ApiModelProperty(value = "")
  public List<ConditionalFormatting> getConditionalFormattingList() {
    return conditionalFormattingList;
  }

  public void setConditionalFormattingList(List<ConditionalFormatting> conditionalFormattingList) {
    this.conditionalFormattingList = conditionalFormattingList;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ConditionalFormattings conditionalFormattings = (ConditionalFormattings) o;
    return Objects.equals(this.link, conditionalFormattings.link) &&
        Objects.equals(this.count, conditionalFormattings.count) &&
        Objects.equals(this.conditionalFormattingList, conditionalFormattings.conditionalFormattingList);
  }

  @Override
  public int hashCode() {
    return Objects.hash(link, count, conditionalFormattingList);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ConditionalFormattings {\n");
    
    sb.append("    link: ").append(toIndentedString(link)).append("\n");
    sb.append("    count: ").append(toIndentedString(count)).append("\n");
    sb.append("    conditionalFormattingList: ").append(toIndentedString(conditionalFormattingList)).append("\n");
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

