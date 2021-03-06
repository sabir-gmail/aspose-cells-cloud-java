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
 * Shapes
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2018-08-14T14:34:14.243+08:00")
public class Shapes {
  @SerializedName("link")
  private Link link = null;

  @SerializedName("ShapeList")
  private List<LinkElement> shapeList = null;

  public Shapes link(Link link) {
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

  public Shapes shapeList(List<LinkElement> shapeList) {
    this.shapeList = shapeList;
    return this;
  }

  public Shapes addShapeListItem(LinkElement shapeListItem) {
    if (this.shapeList == null) {
      this.shapeList = new ArrayList<LinkElement>();
    }
    this.shapeList.add(shapeListItem);
    return this;
  }

   /**
   * Get shapeList
   * @return shapeList
  **/
  @ApiModelProperty(value = "")
  public List<LinkElement> getShapeList() {
    return shapeList;
  }

  public void setShapeList(List<LinkElement> shapeList) {
    this.shapeList = shapeList;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Shapes shapes = (Shapes) o;
    return Objects.equals(this.link, shapes.link) &&
        Objects.equals(this.shapeList, shapes.shapeList);
  }

  @Override
  public int hashCode() {
    return Objects.hash(link, shapeList);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Shapes {\n");
    
    sb.append("    link: ").append(toIndentedString(link)).append("\n");
    sb.append("    shapeList: ").append(toIndentedString(shapeList)).append("\n");
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

