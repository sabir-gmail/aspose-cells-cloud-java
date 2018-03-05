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
 * MergedCells
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2018-03-05T15:44:26.749+08:00")
public class MergedCells {
  @SerializedName("link")
  private Link link = null;

  @SerializedName("Count")
  private Integer count = null;

  @SerializedName("MergedCellList")
  private List<LinkElement> mergedCellList = null;

  public MergedCells link(Link link) {
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

  public MergedCells count(Integer count) {
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

  public MergedCells mergedCellList(List<LinkElement> mergedCellList) {
    this.mergedCellList = mergedCellList;
    return this;
  }

  public MergedCells addMergedCellListItem(LinkElement mergedCellListItem) {
    if (this.mergedCellList == null) {
      this.mergedCellList = new ArrayList<LinkElement>();
    }
    this.mergedCellList.add(mergedCellListItem);
    return this;
  }

   /**
   * Get mergedCellList
   * @return mergedCellList
  **/
  @ApiModelProperty(value = "")
  public List<LinkElement> getMergedCellList() {
    return mergedCellList;
  }

  public void setMergedCellList(List<LinkElement> mergedCellList) {
    this.mergedCellList = mergedCellList;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    MergedCells mergedCells = (MergedCells) o;
    return Objects.equals(this.link, mergedCells.link) &&
        Objects.equals(this.count, mergedCells.count) &&
        Objects.equals(this.mergedCellList, mergedCells.mergedCellList);
  }

  @Override
  public int hashCode() {
    return Objects.hash(link, count, mergedCellList);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class MergedCells {\n");
    
    sb.append("    link: ").append(toIndentedString(link)).append("\n");
    sb.append("    count: ").append(toIndentedString(count)).append("\n");
    sb.append("    mergedCellList: ").append(toIndentedString(mergedCellList)).append("\n");
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

