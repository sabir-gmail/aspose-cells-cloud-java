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
 * ConditionalFormattingValue
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2018-03-05T15:44:26.749+08:00")
public class ConditionalFormattingValue {
  @SerializedName("IsGTE")
  private Boolean isGTE = null;

  @SerializedName("Type")
  private String type = null;

  public ConditionalFormattingValue isGTE(Boolean isGTE) {
    this.isGTE = isGTE;
    return this;
  }

   /**
   * Get or set the Greater Than Or Equal flag. Use only for icon sets, determines    whether this threshold value uses the greater than or equal to operator.    &#39;false&#39; indicates &#39;greater than&#39; is used instead of &#39;greater than or equal    to&#39;.  Default value is true.             
   * @return isGTE
  **/
  @ApiModelProperty(value = "Get or set the Greater Than Or Equal flag. Use only for icon sets, determines    whether this threshold value uses the greater than or equal to operator.    'false' indicates 'greater than' is used instead of 'greater than or equal    to'.  Default value is true.             ")
  public Boolean isIsGTE() {
    return isGTE;
  }

  public void setIsGTE(Boolean isGTE) {
    this.isGTE = isGTE;
  }

  public ConditionalFormattingValue type(String type) {
    this.type = type;
    return this;
  }

   /**
   * Get or set the type of this conditional formatting value object.  Setting      the type to FormatConditionValueType.Min or FormatConditionValueType.Max      will auto set \&quot;Value\&quot; to null.  
   * @return type
  **/
  @ApiModelProperty(value = "Get or set the type of this conditional formatting value object.  Setting      the type to FormatConditionValueType.Min or FormatConditionValueType.Max      will auto set \"Value\" to null.  ")
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
    ConditionalFormattingValue conditionalFormattingValue = (ConditionalFormattingValue) o;
    return Objects.equals(this.isGTE, conditionalFormattingValue.isGTE) &&
        Objects.equals(this.type, conditionalFormattingValue.type);
  }

  @Override
  public int hashCode() {
    return Objects.hash(isGTE, type);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ConditionalFormattingValue {\n");
    
    sb.append("    isGTE: ").append(toIndentedString(isGTE)).append("\n");
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

