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
 * IconFilter
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2018-03-05T15:44:26.749+08:00")
public class IconFilter {
  @SerializedName("IconId")
  private Integer iconId = null;

  @SerializedName("IconSetType")
  private String iconSetType = null;

  public IconFilter iconId(Integer iconId) {
    this.iconId = iconId;
    return this;
  }

   /**
   * Get iconId
   * @return iconId
  **/
  @ApiModelProperty(required = true, value = "")
  public Integer getIconId() {
    return iconId;
  }

  public void setIconId(Integer iconId) {
    this.iconId = iconId;
  }

  public IconFilter iconSetType(String iconSetType) {
    this.iconSetType = iconSetType;
    return this;
  }

   /**
   * Get iconSetType
   * @return iconSetType
  **/
  @ApiModelProperty(value = "")
  public String getIconSetType() {
    return iconSetType;
  }

  public void setIconSetType(String iconSetType) {
    this.iconSetType = iconSetType;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    IconFilter iconFilter = (IconFilter) o;
    return Objects.equals(this.iconId, iconFilter.iconId) &&
        Objects.equals(this.iconSetType, iconFilter.iconSetType);
  }

  @Override
  public int hashCode() {
    return Objects.hash(iconId, iconSetType);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class IconFilter {\n");
    
    sb.append("    iconId: ").append(toIndentedString(iconId)).append("\n");
    sb.append("    iconSetType: ").append(toIndentedString(iconSetType)).append("\n");
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

