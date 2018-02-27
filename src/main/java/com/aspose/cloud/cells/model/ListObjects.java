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
 * ListObjects
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2018-02-27T14:45:34.511+08:00")
public class ListObjects {
  @SerializedName("link")
  private Link link = null;

  @SerializedName("ListObjectList")
  private List<LinkElement> listObjectList = null;

  public ListObjects link(Link link) {
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

  public ListObjects listObjectList(List<LinkElement> listObjectList) {
    this.listObjectList = listObjectList;
    return this;
  }

  public ListObjects addListObjectListItem(LinkElement listObjectListItem) {
    if (this.listObjectList == null) {
      this.listObjectList = new ArrayList<LinkElement>();
    }
    this.listObjectList.add(listObjectListItem);
    return this;
  }

   /**
   * Get listObjectList
   * @return listObjectList
  **/
  @ApiModelProperty(value = "")
  public List<LinkElement> getListObjectList() {
    return listObjectList;
  }

  public void setListObjectList(List<LinkElement> listObjectList) {
    this.listObjectList = listObjectList;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ListObjects listObjects = (ListObjects) o;
    return Objects.equals(this.link, listObjects.link) &&
        Objects.equals(this.listObjectList, listObjects.listObjectList);
  }

  @Override
  public int hashCode() {
    return Objects.hash(link, listObjectList);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ListObjects {\n");
    
    sb.append("    link: ").append(toIndentedString(link)).append("\n");
    sb.append("    listObjectList: ").append(toIndentedString(listObjectList)).append("\n");
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
