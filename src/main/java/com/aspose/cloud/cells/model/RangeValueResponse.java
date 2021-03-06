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
import com.aspose.cloud.cells.model.Cell;
import com.aspose.cloud.cells.model.SaaSposeResponse;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * RangeValueResponse
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2018-08-14T14:34:14.243+08:00")
public class RangeValueResponse extends SaaSposeResponse {
  @SerializedName("CellsList")
  private List<Cell> cellsList = null;

  public RangeValueResponse cellsList(List<Cell> cellsList) {
    this.cellsList = cellsList;
    return this;
  }

  public RangeValueResponse addCellsListItem(Cell cellsListItem) {
    if (this.cellsList == null) {
      this.cellsList = new ArrayList<Cell>();
    }
    this.cellsList.add(cellsListItem);
    return this;
  }

   /**
   * Get cellsList
   * @return cellsList
  **/
  @ApiModelProperty(value = "")
  public List<Cell> getCellsList() {
    return cellsList;
  }

  public void setCellsList(List<Cell> cellsList) {
    this.cellsList = cellsList;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RangeValueResponse rangeValueResponse = (RangeValueResponse) o;
    return Objects.equals(this.cellsList, rangeValueResponse.cellsList) &&
        super.equals(o);
  }

  @Override
  public int hashCode() {
    return Objects.hash(cellsList, super.hashCode());
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RangeValueResponse {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
    sb.append("    cellsList: ").append(toIndentedString(cellsList)).append("\n");
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

