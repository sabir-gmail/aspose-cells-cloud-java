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
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * Font
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2018-03-05T15:44:26.749+08:00")
public class Font {
  @SerializedName("Color")
  private Color color = null;

  @SerializedName("DoubleSize")
  private Double doubleSize = null;

  @SerializedName("IsBold")
  private Boolean isBold = null;

  @SerializedName("IsItalic")
  private Boolean isItalic = null;

  @SerializedName("IsStrikeout")
  private Boolean isStrikeout = null;

  @SerializedName("IsSubscript")
  private Boolean isSubscript = null;

  @SerializedName("IsSuperscript")
  private Boolean isSuperscript = null;

  @SerializedName("Name")
  private String name = null;

  @SerializedName("Size")
  private Integer size = null;

  @SerializedName("Underline")
  private String underline = null;

  public Font color(Color color) {
    this.color = color;
    return this;
  }

   /**
   * Get color
   * @return color
  **/
  @ApiModelProperty(value = "")
  public Color getColor() {
    return color;
  }

  public void setColor(Color color) {
    this.color = color;
  }

  public Font doubleSize(Double doubleSize) {
    this.doubleSize = doubleSize;
    return this;
  }

   /**
   * Get doubleSize
   * @return doubleSize
  **/
  @ApiModelProperty(value = "")
  public Double getDoubleSize() {
    return doubleSize;
  }

  public void setDoubleSize(Double doubleSize) {
    this.doubleSize = doubleSize;
  }

  public Font isBold(Boolean isBold) {
    this.isBold = isBold;
    return this;
  }

   /**
   * Get isBold
   * @return isBold
  **/
  @ApiModelProperty(value = "")
  public Boolean isIsBold() {
    return isBold;
  }

  public void setIsBold(Boolean isBold) {
    this.isBold = isBold;
  }

  public Font isItalic(Boolean isItalic) {
    this.isItalic = isItalic;
    return this;
  }

   /**
   * Get isItalic
   * @return isItalic
  **/
  @ApiModelProperty(value = "")
  public Boolean isIsItalic() {
    return isItalic;
  }

  public void setIsItalic(Boolean isItalic) {
    this.isItalic = isItalic;
  }

  public Font isStrikeout(Boolean isStrikeout) {
    this.isStrikeout = isStrikeout;
    return this;
  }

   /**
   * Get isStrikeout
   * @return isStrikeout
  **/
  @ApiModelProperty(value = "")
  public Boolean isIsStrikeout() {
    return isStrikeout;
  }

  public void setIsStrikeout(Boolean isStrikeout) {
    this.isStrikeout = isStrikeout;
  }

  public Font isSubscript(Boolean isSubscript) {
    this.isSubscript = isSubscript;
    return this;
  }

   /**
   * Get isSubscript
   * @return isSubscript
  **/
  @ApiModelProperty(value = "")
  public Boolean isIsSubscript() {
    return isSubscript;
  }

  public void setIsSubscript(Boolean isSubscript) {
    this.isSubscript = isSubscript;
  }

  public Font isSuperscript(Boolean isSuperscript) {
    this.isSuperscript = isSuperscript;
    return this;
  }

   /**
   * Get isSuperscript
   * @return isSuperscript
  **/
  @ApiModelProperty(value = "")
  public Boolean isIsSuperscript() {
    return isSuperscript;
  }

  public void setIsSuperscript(Boolean isSuperscript) {
    this.isSuperscript = isSuperscript;
  }

  public Font name(String name) {
    this.name = name;
    return this;
  }

   /**
   * Get name
   * @return name
  **/
  @ApiModelProperty(value = "")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public Font size(Integer size) {
    this.size = size;
    return this;
  }

   /**
   * Get size
   * @return size
  **/
  @ApiModelProperty(value = "")
  public Integer getSize() {
    return size;
  }

  public void setSize(Integer size) {
    this.size = size;
  }

  public Font underline(String underline) {
    this.underline = underline;
    return this;
  }

   /**
   * Get underline
   * @return underline
  **/
  @ApiModelProperty(value = "")
  public String getUnderline() {
    return underline;
  }

  public void setUnderline(String underline) {
    this.underline = underline;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Font font = (Font) o;
    return Objects.equals(this.color, font.color) &&
        Objects.equals(this.doubleSize, font.doubleSize) &&
        Objects.equals(this.isBold, font.isBold) &&
        Objects.equals(this.isItalic, font.isItalic) &&
        Objects.equals(this.isStrikeout, font.isStrikeout) &&
        Objects.equals(this.isSubscript, font.isSubscript) &&
        Objects.equals(this.isSuperscript, font.isSuperscript) &&
        Objects.equals(this.name, font.name) &&
        Objects.equals(this.size, font.size) &&
        Objects.equals(this.underline, font.underline);
  }

  @Override
  public int hashCode() {
    return Objects.hash(color, doubleSize, isBold, isItalic, isStrikeout, isSubscript, isSuperscript, name, size, underline);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Font {\n");
    
    sb.append("    color: ").append(toIndentedString(color)).append("\n");
    sb.append("    doubleSize: ").append(toIndentedString(doubleSize)).append("\n");
    sb.append("    isBold: ").append(toIndentedString(isBold)).append("\n");
    sb.append("    isItalic: ").append(toIndentedString(isItalic)).append("\n");
    sb.append("    isStrikeout: ").append(toIndentedString(isStrikeout)).append("\n");
    sb.append("    isSubscript: ").append(toIndentedString(isSubscript)).append("\n");
    sb.append("    isSuperscript: ").append(toIndentedString(isSuperscript)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    size: ").append(toIndentedString(size)).append("\n");
    sb.append("    underline: ").append(toIndentedString(underline)).append("\n");
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

