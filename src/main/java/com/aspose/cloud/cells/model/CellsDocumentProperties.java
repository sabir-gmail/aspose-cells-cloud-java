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
import com.aspose.cloud.cells.model.CellsDocumentProperty;
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
 * CellsDocumentProperties
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2018-02-27T14:45:34.511+08:00")
public class CellsDocumentProperties {
  @SerializedName("link")
  private Link link = null;

  @SerializedName("DocumentPropertyList")
  private List<CellsDocumentProperty> documentPropertyList = null;

  public CellsDocumentProperties link(Link link) {
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

  public CellsDocumentProperties documentPropertyList(List<CellsDocumentProperty> documentPropertyList) {
    this.documentPropertyList = documentPropertyList;
    return this;
  }

  public CellsDocumentProperties addDocumentPropertyListItem(CellsDocumentProperty documentPropertyListItem) {
    if (this.documentPropertyList == null) {
      this.documentPropertyList = new ArrayList<CellsDocumentProperty>();
    }
    this.documentPropertyList.add(documentPropertyListItem);
    return this;
  }

   /**
   * Get documentPropertyList
   * @return documentPropertyList
  **/
  @ApiModelProperty(value = "")
  public List<CellsDocumentProperty> getDocumentPropertyList() {
    return documentPropertyList;
  }

  public void setDocumentPropertyList(List<CellsDocumentProperty> documentPropertyList) {
    this.documentPropertyList = documentPropertyList;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CellsDocumentProperties cellsDocumentProperties = (CellsDocumentProperties) o;
    return Objects.equals(this.link, cellsDocumentProperties.link) &&
        Objects.equals(this.documentPropertyList, cellsDocumentProperties.documentPropertyList);
  }

  @Override
  public int hashCode() {
    return Objects.hash(link, documentPropertyList);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CellsDocumentProperties {\n");
    
    sb.append("    link: ").append(toIndentedString(link)).append("\n");
    sb.append("    documentPropertyList: ").append(toIndentedString(documentPropertyList)).append("\n");
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

