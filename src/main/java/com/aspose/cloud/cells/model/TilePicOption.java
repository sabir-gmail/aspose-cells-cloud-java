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
 * TilePicOption
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2018-03-05T15:44:26.749+08:00")
public class TilePicOption {
  @SerializedName("OffsetX")
  private Double offsetX = null;

  @SerializedName("OffsetY")
  private Double offsetY = null;

  @SerializedName("ScaleX")
  private Double scaleX = null;

  @SerializedName("ScaleY")
  private Double scaleY = null;

  @SerializedName("AlignmentType")
  private String alignmentType = null;

  @SerializedName("MirrorType")
  private String mirrorType = null;

  public TilePicOption offsetX(Double offsetX) {
    this.offsetX = offsetX;
    return this;
  }

   /**
   * Get offsetX
   * @return offsetX
  **/
  @ApiModelProperty(required = true, value = "")
  public Double getOffsetX() {
    return offsetX;
  }

  public void setOffsetX(Double offsetX) {
    this.offsetX = offsetX;
  }

  public TilePicOption offsetY(Double offsetY) {
    this.offsetY = offsetY;
    return this;
  }

   /**
   * Get offsetY
   * @return offsetY
  **/
  @ApiModelProperty(required = true, value = "")
  public Double getOffsetY() {
    return offsetY;
  }

  public void setOffsetY(Double offsetY) {
    this.offsetY = offsetY;
  }

  public TilePicOption scaleX(Double scaleX) {
    this.scaleX = scaleX;
    return this;
  }

   /**
   * Get scaleX
   * @return scaleX
  **/
  @ApiModelProperty(required = true, value = "")
  public Double getScaleX() {
    return scaleX;
  }

  public void setScaleX(Double scaleX) {
    this.scaleX = scaleX;
  }

  public TilePicOption scaleY(Double scaleY) {
    this.scaleY = scaleY;
    return this;
  }

   /**
   * Get scaleY
   * @return scaleY
  **/
  @ApiModelProperty(required = true, value = "")
  public Double getScaleY() {
    return scaleY;
  }

  public void setScaleY(Double scaleY) {
    this.scaleY = scaleY;
  }

  public TilePicOption alignmentType(String alignmentType) {
    this.alignmentType = alignmentType;
    return this;
  }

   /**
   * Get alignmentType
   * @return alignmentType
  **/
  @ApiModelProperty(value = "")
  public String getAlignmentType() {
    return alignmentType;
  }

  public void setAlignmentType(String alignmentType) {
    this.alignmentType = alignmentType;
  }

  public TilePicOption mirrorType(String mirrorType) {
    this.mirrorType = mirrorType;
    return this;
  }

   /**
   * Get mirrorType
   * @return mirrorType
  **/
  @ApiModelProperty(value = "")
  public String getMirrorType() {
    return mirrorType;
  }

  public void setMirrorType(String mirrorType) {
    this.mirrorType = mirrorType;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TilePicOption tilePicOption = (TilePicOption) o;
    return Objects.equals(this.offsetX, tilePicOption.offsetX) &&
        Objects.equals(this.offsetY, tilePicOption.offsetY) &&
        Objects.equals(this.scaleX, tilePicOption.scaleX) &&
        Objects.equals(this.scaleY, tilePicOption.scaleY) &&
        Objects.equals(this.alignmentType, tilePicOption.alignmentType) &&
        Objects.equals(this.mirrorType, tilePicOption.mirrorType);
  }

  @Override
  public int hashCode() {
    return Objects.hash(offsetX, offsetY, scaleX, scaleY, alignmentType, mirrorType);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TilePicOption {\n");
    
    sb.append("    offsetX: ").append(toIndentedString(offsetX)).append("\n");
    sb.append("    offsetY: ").append(toIndentedString(offsetY)).append("\n");
    sb.append("    scaleX: ").append(toIndentedString(scaleX)).append("\n");
    sb.append("    scaleY: ").append(toIndentedString(scaleY)).append("\n");
    sb.append("    alignmentType: ").append(toIndentedString(alignmentType)).append("\n");
    sb.append("    mirrorType: ").append(toIndentedString(mirrorType)).append("\n");
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

