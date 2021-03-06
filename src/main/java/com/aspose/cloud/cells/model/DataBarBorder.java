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
 * DataBarBorder
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2018-08-14T14:34:14.243+08:00")
public class DataBarBorder {
  @SerializedName("Color")
  private Color color = null;

  @SerializedName("Type")
  private String type = null;

  public DataBarBorder color(Color color) {
    this.color = color;
    return this;
  }

   /**
   * Gets or sets the border&#39;s color of data bars specified by a conditional formatting rule.
   * @return color
  **/
  @ApiModelProperty(value = "Gets or sets the border's color of data bars specified by a conditional formatting rule.")
  public Color getColor() {
    return color;
  }

  public void setColor(Color color) {
    this.color = color;
  }

  public DataBarBorder type(String type) {
    this.type = type;
    return this;
  }

   /**
   * Gets or sets the border&#39;s type of data bars specified by a conditional formatting rule.
   * @return type
  **/
  @ApiModelProperty(value = "Gets or sets the border's type of data bars specified by a conditional formatting rule.")
  public String getType() {
    return type;
  }

  public void setType(String type) {
    this.type = type;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DataBarBorder dataBarBorder = (DataBarBorder) o;
    return Objects.equals(this.color, dataBarBorder.color) &&
        Objects.equals(this.type, dataBarBorder.type);
  }

  @Override
  public int hashCode() {
    return Objects.hash(color, type);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DataBarBorder {\n");
    
    sb.append("    color: ").append(toIndentedString(color)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
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

