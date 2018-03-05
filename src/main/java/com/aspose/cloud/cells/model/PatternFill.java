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
 * PatternFill
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2018-03-05T15:44:26.749+08:00")
public class PatternFill {
  @SerializedName("Pattern")
  private String pattern = null;

  @SerializedName("BackgroundCellsColor")
  private CellsColor backgroundCellsColor = null;

  @SerializedName("ForegroundCellsColor")
  private CellsColor foregroundCellsColor = null;

  @SerializedName("ForegroundColor")
  private Color foregroundColor = null;

  @SerializedName("BackgroundColor")
  private Color backgroundColor = null;

  @SerializedName("BackTransparency")
  private Double backTransparency = null;

  @SerializedName("ForeTransparency")
  private Double foreTransparency = null;

  public PatternFill pattern(String pattern) {
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

  public PatternFill backgroundCellsColor(CellsColor backgroundCellsColor) {
    this.backgroundCellsColor = backgroundCellsColor;
    return this;
  }

   /**
   * Get backgroundCellsColor
   * @return backgroundCellsColor
  **/
  @ApiModelProperty(value = "")
  public CellsColor getBackgroundCellsColor() {
    return backgroundCellsColor;
  }

  public void setBackgroundCellsColor(CellsColor backgroundCellsColor) {
    this.backgroundCellsColor = backgroundCellsColor;
  }

  public PatternFill foregroundCellsColor(CellsColor foregroundCellsColor) {
    this.foregroundCellsColor = foregroundCellsColor;
    return this;
  }

   /**
   * Get foregroundCellsColor
   * @return foregroundCellsColor
  **/
  @ApiModelProperty(value = "")
  public CellsColor getForegroundCellsColor() {
    return foregroundCellsColor;
  }

  public void setForegroundCellsColor(CellsColor foregroundCellsColor) {
    this.foregroundCellsColor = foregroundCellsColor;
  }

  public PatternFill foregroundColor(Color foregroundColor) {
    this.foregroundColor = foregroundColor;
    return this;
  }

   /**
   * Get foregroundColor
   * @return foregroundColor
  **/
  @ApiModelProperty(value = "")
  public Color getForegroundColor() {
    return foregroundColor;
  }

  public void setForegroundColor(Color foregroundColor) {
    this.foregroundColor = foregroundColor;
  }

  public PatternFill backgroundColor(Color backgroundColor) {
    this.backgroundColor = backgroundColor;
    return this;
  }

   /**
   * Get backgroundColor
   * @return backgroundColor
  **/
  @ApiModelProperty(value = "")
  public Color getBackgroundColor() {
    return backgroundColor;
  }

  public void setBackgroundColor(Color backgroundColor) {
    this.backgroundColor = backgroundColor;
  }

  public PatternFill backTransparency(Double backTransparency) {
    this.backTransparency = backTransparency;
    return this;
  }

   /**
   * Get backTransparency
   * @return backTransparency
  **/
  @ApiModelProperty(value = "")
  public Double getBackTransparency() {
    return backTransparency;
  }

  public void setBackTransparency(Double backTransparency) {
    this.backTransparency = backTransparency;
  }

  public PatternFill foreTransparency(Double foreTransparency) {
    this.foreTransparency = foreTransparency;
    return this;
  }

   /**
   * Get foreTransparency
   * @return foreTransparency
  **/
  @ApiModelProperty(value = "")
  public Double getForeTransparency() {
    return foreTransparency;
  }

  public void setForeTransparency(Double foreTransparency) {
    this.foreTransparency = foreTransparency;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PatternFill patternFill = (PatternFill) o;
    return Objects.equals(this.pattern, patternFill.pattern) &&
        Objects.equals(this.backgroundCellsColor, patternFill.backgroundCellsColor) &&
        Objects.equals(this.foregroundCellsColor, patternFill.foregroundCellsColor) &&
        Objects.equals(this.foregroundColor, patternFill.foregroundColor) &&
        Objects.equals(this.backgroundColor, patternFill.backgroundColor) &&
        Objects.equals(this.backTransparency, patternFill.backTransparency) &&
        Objects.equals(this.foreTransparency, patternFill.foreTransparency);
  }

  @Override
  public int hashCode() {
    return Objects.hash(pattern, backgroundCellsColor, foregroundCellsColor, foregroundColor, backgroundColor, backTransparency, foreTransparency);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PatternFill {\n");
    
    sb.append("    pattern: ").append(toIndentedString(pattern)).append("\n");
    sb.append("    backgroundCellsColor: ").append(toIndentedString(backgroundCellsColor)).append("\n");
    sb.append("    foregroundCellsColor: ").append(toIndentedString(foregroundCellsColor)).append("\n");
    sb.append("    foregroundColor: ").append(toIndentedString(foregroundColor)).append("\n");
    sb.append("    backgroundColor: ").append(toIndentedString(backgroundColor)).append("\n");
    sb.append("    backTransparency: ").append(toIndentedString(backTransparency)).append("\n");
    sb.append("    foreTransparency: ").append(toIndentedString(foreTransparency)).append("\n");
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

