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
import com.aspose.cloud.cells.model.Color;
import com.aspose.cloud.cells.model.Range;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * RangeSetOutlineBorderRequest
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2018-02-27T14:45:34.511+08:00")
public class RangeSetOutlineBorderRequest {
  @SerializedName("Range")
  private Range range = null;

  @SerializedName("borderEdge")
  private String borderEdge = null;

  @SerializedName("borderStyle")
  private String borderStyle = null;

  @SerializedName("borderColor")
  private Color borderColor = null;

  public RangeSetOutlineBorderRequest range(Range range) {
    this.range = range;
    return this;
  }

   /**
   * Get range
   * @return range
  **/
  @ApiModelProperty(value = "")
  public Range getRange() {
    return range;
  }

  public void setRange(Range range) {
    this.range = range;
  }

  public RangeSetOutlineBorderRequest borderEdge(String borderEdge) {
    this.borderEdge = borderEdge;
    return this;
  }

   /**
   * Get borderEdge
   * @return borderEdge
  **/
  @ApiModelProperty(value = "")
  public String getBorderEdge() {
    return borderEdge;
  }

  public void setBorderEdge(String borderEdge) {
    this.borderEdge = borderEdge;
  }

  public RangeSetOutlineBorderRequest borderStyle(String borderStyle) {
    this.borderStyle = borderStyle;
    return this;
  }

   /**
   * Get borderStyle
   * @return borderStyle
  **/
  @ApiModelProperty(value = "")
  public String getBorderStyle() {
    return borderStyle;
  }

  public void setBorderStyle(String borderStyle) {
    this.borderStyle = borderStyle;
  }

  public RangeSetOutlineBorderRequest borderColor(Color borderColor) {
    this.borderColor = borderColor;
    return this;
  }

   /**
   * Get borderColor
   * @return borderColor
  **/
  @ApiModelProperty(value = "")
  public Color getBorderColor() {
    return borderColor;
  }

  public void setBorderColor(Color borderColor) {
    this.borderColor = borderColor;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RangeSetOutlineBorderRequest rangeSetOutlineBorderRequest = (RangeSetOutlineBorderRequest) o;
    return Objects.equals(this.range, rangeSetOutlineBorderRequest.range) &&
        Objects.equals(this.borderEdge, rangeSetOutlineBorderRequest.borderEdge) &&
        Objects.equals(this.borderStyle, rangeSetOutlineBorderRequest.borderStyle) &&
        Objects.equals(this.borderColor, rangeSetOutlineBorderRequest.borderColor);
  }

  @Override
  public int hashCode() {
    return Objects.hash(range, borderEdge, borderStyle, borderColor);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RangeSetOutlineBorderRequest {\n");
    
    sb.append("    range: ").append(toIndentedString(range)).append("\n");
    sb.append("    borderEdge: ").append(toIndentedString(borderEdge)).append("\n");
    sb.append("    borderStyle: ").append(toIndentedString(borderStyle)).append("\n");
    sb.append("    borderColor: ").append(toIndentedString(borderColor)).append("\n");
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

