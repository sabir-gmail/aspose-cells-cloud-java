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
 * Columns
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2018-08-14T14:34:14.243+08:00")
public class Columns {
  @SerializedName("link")
  private Link link = null;

  @SerializedName("ColumnsCount")
  private Integer columnsCount = null;

  @SerializedName("MaxColumn")
  private Integer maxColumn = null;

  @SerializedName("ColumnsList")
  private List<LinkElement> columnsList = null;

  public Columns link(Link link) {
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

  public Columns columnsCount(Integer columnsCount) {
    this.columnsCount = columnsCount;
    return this;
  }

   /**
   * Get columnsCount
   * @return columnsCount
  **/
  @ApiModelProperty(required = true, value = "")
  public Integer getColumnsCount() {
    return columnsCount;
  }

  public void setColumnsCount(Integer columnsCount) {
    this.columnsCount = columnsCount;
  }

  public Columns maxColumn(Integer maxColumn) {
    this.maxColumn = maxColumn;
    return this;
  }

   /**
   * Get maxColumn
   * @return maxColumn
  **/
  @ApiModelProperty(required = true, value = "")
  public Integer getMaxColumn() {
    return maxColumn;
  }

  public void setMaxColumn(Integer maxColumn) {
    this.maxColumn = maxColumn;
  }

  public Columns columnsList(List<LinkElement> columnsList) {
    this.columnsList = columnsList;
    return this;
  }

  public Columns addColumnsListItem(LinkElement columnsListItem) {
    if (this.columnsList == null) {
      this.columnsList = new ArrayList<LinkElement>();
    }
    this.columnsList.add(columnsListItem);
    return this;
  }

   /**
   * Get columnsList
   * @return columnsList
  **/
  @ApiModelProperty(value = "")
  public List<LinkElement> getColumnsList() {
    return columnsList;
  }

  public void setColumnsList(List<LinkElement> columnsList) {
    this.columnsList = columnsList;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Columns columns = (Columns) o;
    return Objects.equals(this.link, columns.link) &&
        Objects.equals(this.columnsCount, columns.columnsCount) &&
        Objects.equals(this.maxColumn, columns.maxColumn) &&
        Objects.equals(this.columnsList, columns.columnsList);
  }

  @Override
  public int hashCode() {
    return Objects.hash(link, columnsCount, maxColumn, columnsList);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Columns {\n");
    
    sb.append("    link: ").append(toIndentedString(link)).append("\n");
    sb.append("    columnsCount: ").append(toIndentedString(columnsCount)).append("\n");
    sb.append("    maxColumn: ").append(toIndentedString(maxColumn)).append("\n");
    sb.append("    columnsList: ").append(toIndentedString(columnsList)).append("\n");
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

