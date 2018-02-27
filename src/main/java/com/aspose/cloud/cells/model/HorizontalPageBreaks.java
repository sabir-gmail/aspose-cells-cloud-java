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
import com.aspose.cloud.cells.model.HorizontalPageBreak;
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
 * HorizontalPageBreaks
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2018-02-27T14:45:34.511+08:00")
public class HorizontalPageBreaks {
  @SerializedName("link")
  private Link link = null;

  @SerializedName("HorizontalPageBreakList")
  private List<HorizontalPageBreak> horizontalPageBreakList = null;

  public HorizontalPageBreaks link(Link link) {
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

  public HorizontalPageBreaks horizontalPageBreakList(List<HorizontalPageBreak> horizontalPageBreakList) {
    this.horizontalPageBreakList = horizontalPageBreakList;
    return this;
  }

  public HorizontalPageBreaks addHorizontalPageBreakListItem(HorizontalPageBreak horizontalPageBreakListItem) {
    if (this.horizontalPageBreakList == null) {
      this.horizontalPageBreakList = new ArrayList<HorizontalPageBreak>();
    }
    this.horizontalPageBreakList.add(horizontalPageBreakListItem);
    return this;
  }

   /**
   * Get horizontalPageBreakList
   * @return horizontalPageBreakList
  **/
  @ApiModelProperty(value = "")
  public List<HorizontalPageBreak> getHorizontalPageBreakList() {
    return horizontalPageBreakList;
  }

  public void setHorizontalPageBreakList(List<HorizontalPageBreak> horizontalPageBreakList) {
    this.horizontalPageBreakList = horizontalPageBreakList;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    HorizontalPageBreaks horizontalPageBreaks = (HorizontalPageBreaks) o;
    return Objects.equals(this.link, horizontalPageBreaks.link) &&
        Objects.equals(this.horizontalPageBreakList, horizontalPageBreaks.horizontalPageBreakList);
  }

  @Override
  public int hashCode() {
    return Objects.hash(link, horizontalPageBreakList);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class HorizontalPageBreaks {\n");
    
    sb.append("    link: ").append(toIndentedString(link)).append("\n");
    sb.append("    horizontalPageBreakList: ").append(toIndentedString(horizontalPageBreakList)).append("\n");
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

