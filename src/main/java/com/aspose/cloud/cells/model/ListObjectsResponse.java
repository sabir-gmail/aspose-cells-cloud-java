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
import com.aspose.cloud.cells.model.ListObjects;
import com.aspose.cloud.cells.model.SaaSposeResponse;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * ListObjectsResponse
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2018-08-14T14:34:14.243+08:00")
public class ListObjectsResponse extends SaaSposeResponse {
  @SerializedName("ListObjects")
  private ListObjects listObjects = null;

  public ListObjectsResponse listObjects(ListObjects listObjects) {
    this.listObjects = listObjects;
    return this;
  }

   /**
   * Get listObjects
   * @return listObjects
  **/
  @ApiModelProperty(value = "")
  public ListObjects getListObjects() {
    return listObjects;
  }

  public void setListObjects(ListObjects listObjects) {
    this.listObjects = listObjects;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ListObjectsResponse listObjectsResponse = (ListObjectsResponse) o;
    return Objects.equals(this.listObjects, listObjectsResponse.listObjects) &&
        super.equals(o);
  }

  @Override
  public int hashCode() {
    return Objects.hash(listObjects, super.hashCode());
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ListObjectsResponse {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
    sb.append("    listObjects: ").append(toIndentedString(listObjects)).append("\n");
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

