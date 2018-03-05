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
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * ThemeColor
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2018-03-05T15:44:26.749+08:00")
public class ThemeColor {
  @SerializedName("ColorType")
  private String colorType = null;

  @SerializedName("Tint")
  private Double tint = null;

  public ThemeColor colorType(String colorType) {
    this.colorType = colorType;
    return this;
  }

   /**
   * Get colorType
   * @return colorType
  **/
  @ApiModelProperty(value = "")
  public String getColorType() {
    return colorType;
  }

  public void setColorType(String colorType) {
    this.colorType = colorType;
  }

  public ThemeColor tint(Double tint) {
    this.tint = tint;
    return this;
  }

   /**
   * Get tint
   * @return tint
  **/
  @ApiModelProperty(value = "")
  public Double getTint() {
    return tint;
  }

  public void setTint(Double tint) {
    this.tint = tint;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ThemeColor themeColor = (ThemeColor) o;
    return Objects.equals(this.colorType, themeColor.colorType) &&
        Objects.equals(this.tint, themeColor.tint);
  }

  @Override
  public int hashCode() {
    return Objects.hash(colorType, tint);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ThemeColor {\n");
    
    sb.append("    colorType: ").append(toIndentedString(colorType)).append("\n");
    sb.append("    tint: ").append(toIndentedString(tint)).append("\n");
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

