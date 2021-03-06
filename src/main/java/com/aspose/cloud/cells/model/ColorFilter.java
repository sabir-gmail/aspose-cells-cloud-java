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
import com.aspose.cloud.cells.model.CellsColor;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * ColorFilter
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2018-08-14T14:34:14.243+08:00")
public class ColorFilter {
  @SerializedName("Color")
  private CellsColor color = null;

  @SerializedName("Pattern")
  private String pattern = null;

  @SerializedName("BackgroundColor")
  private CellsColor backgroundColor = null;

  @SerializedName("ForegroundColorColor")
  private CellsColor foregroundColorColor = null;

  @SerializedName("FilterByFillColor")
  private String filterByFillColor = null;

  public ColorFilter color(CellsColor color) {
    this.color = color;
    return this;
  }

   /**
   * Get color
   * @return color
  **/
  @ApiModelProperty(value = "")
  public CellsColor getColor() {
    return color;
  }

  public void setColor(CellsColor color) {
    this.color = color;
  }

  public ColorFilter pattern(String pattern) {
    this.pattern = pattern;
    return this;
  }

   /**
   * Get pattern
   * @return pattern
  **/
  @ApiModelProperty(value = "")
  public String getPattern() {
    return pattern;
  }

  public void setPattern(String pattern) {
    this.pattern = pattern;
  }

  public ColorFilter backgroundColor(CellsColor backgroundColor) {
    this.backgroundColor = backgroundColor;
    return this;
  }

   /**
   * Get backgroundColor
   * @return backgroundColor
  **/
  @ApiModelProperty(value = "")
  public CellsColor getBackgroundColor() {
    return backgroundColor;
  }

  public void setBackgroundColor(CellsColor backgroundColor) {
    this.backgroundColor = backgroundColor;
  }

  public ColorFilter foregroundColorColor(CellsColor foregroundColorColor) {
    this.foregroundColorColor = foregroundColorColor;
    return this;
  }

   /**
   * Get foregroundColorColor
   * @return foregroundColorColor
  **/
  @ApiModelProperty(value = "")
  public CellsColor getForegroundColorColor() {
    return foregroundColorColor;
  }

  public void setForegroundColorColor(CellsColor foregroundColorColor) {
    this.foregroundColorColor = foregroundColorColor;
  }

  public ColorFilter filterByFillColor(String filterByFillColor) {
    this.filterByFillColor = filterByFillColor;
    return this;
  }

   /**
   * Get filterByFillColor
   * @return filterByFillColor
  **/
  @ApiModelProperty(value = "")
  public String getFilterByFillColor() {
    return filterByFillColor;
  }

  public void setFilterByFillColor(String filterByFillColor) {
    this.filterByFillColor = filterByFillColor;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ColorFilter colorFilter = (ColorFilter) o;
    return Objects.equals(this.color, colorFilter.color) &&
        Objects.equals(this.pattern, colorFilter.pattern) &&
        Objects.equals(this.backgroundColor, colorFilter.backgroundColor) &&
        Objects.equals(this.foregroundColorColor, colorFilter.foregroundColorColor) &&
        Objects.equals(this.filterByFillColor, colorFilter.filterByFillColor);
  }

  @Override
  public int hashCode() {
    return Objects.hash(color, pattern, backgroundColor, foregroundColorColor, filterByFillColor);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ColorFilter {\n");
    
    sb.append("    color: ").append(toIndentedString(color)).append("\n");
    sb.append("    pattern: ").append(toIndentedString(pattern)).append("\n");
    sb.append("    backgroundColor: ").append(toIndentedString(backgroundColor)).append("\n");
    sb.append("    foregroundColorColor: ").append(toIndentedString(foregroundColorColor)).append("\n");
    sb.append("    filterByFillColor: ").append(toIndentedString(filterByFillColor)).append("\n");
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

