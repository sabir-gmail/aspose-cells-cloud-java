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
import com.aspose.cloud.cells.model.AutoFilter;
import com.aspose.cloud.cells.model.Link;
import com.aspose.cloud.cells.model.LinkElement;
import com.aspose.cloud.cells.model.ListColumn;
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
 * ListObject
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2018-08-14T14:34:14.243+08:00")
public class ListObject {
  @SerializedName("link")
  private Link link = null;

  @SerializedName("ShowTotals")
  private Boolean showTotals = null;

  @SerializedName("TableStyleType")
  private String tableStyleType = null;

  @SerializedName("DisplayName")
  private String displayName = null;

  @SerializedName("ShowHeaderRow")
  private Boolean showHeaderRow = null;

  @SerializedName("StartColumn")
  private Integer startColumn = null;

  @SerializedName("ShowTableStyleLastColumn")
  private Boolean showTableStyleLastColumn = null;

  @SerializedName("ShowTableStyleColumnStripes")
  private Boolean showTableStyleColumnStripes = null;

  @SerializedName("ShowTableStyleFirstColumn")
  private Boolean showTableStyleFirstColumn = null;

  @SerializedName("StartRow")
  private Integer startRow = null;

  @SerializedName("AutoFilter")
  private AutoFilter autoFilter = null;

  @SerializedName("ShowTableStyleRowStripes")
  private Boolean showTableStyleRowStripes = null;

  @SerializedName("EndColumn")
  private Integer endColumn = null;

  @SerializedName("TableStyleName")
  private String tableStyleName = null;

  @SerializedName("ListColumns")
  private List<ListColumn> listColumns = null;

  @SerializedName("EndRow")
  private Integer endRow = null;

  public ListObject link(Link link) {
    this.link = link;
    return this;
  }

   /**
   * Get link
   * @return link
  **/
  @ApiModelProperty(value = "")
  public Link getLink() {
    return link;
  }

  public void setLink(Link link) {
    this.link = link;
  }

  public ListObject showTotals(Boolean showTotals) {
    this.showTotals = showTotals;
    return this;
  }

   /**
   * Gets and sets whether this ListObject show total row.
   * @return showTotals
  **/
  @ApiModelProperty(value = "Gets and sets whether this ListObject show total row.")
  public Boolean isShowTotals() {
    return showTotals;
  }

  public void setShowTotals(Boolean showTotals) {
    this.showTotals = showTotals;
  }

  public ListObject tableStyleType(String tableStyleType) {
    this.tableStyleType = tableStyleType;
    return this;
  }

   /**
   * Gets and the built-in table style.
   * @return tableStyleType
  **/
  @ApiModelProperty(value = "Gets and the built-in table style.")
  public String getTableStyleType() {
    return tableStyleType;
  }

  public void setTableStyleType(String tableStyleType) {
    this.tableStyleType = tableStyleType;
  }

  public ListObject displayName(String displayName) {
    this.displayName = displayName;
    return this;
  }

   /**
   * Gets and sets the display name.Gets the data range of the ListObject.
   * @return displayName
  **/
  @ApiModelProperty(value = "Gets and sets the display name.Gets the data range of the ListObject.")
  public String getDisplayName() {
    return displayName;
  }

  public void setDisplayName(String displayName) {
    this.displayName = displayName;
  }

  public ListObject showHeaderRow(Boolean showHeaderRow) {
    this.showHeaderRow = showHeaderRow;
    return this;
  }

   /**
   * Gets and sets whether this ListObject show header row.             
   * @return showHeaderRow
  **/
  @ApiModelProperty(value = "Gets and sets whether this ListObject show header row.             ")
  public Boolean isShowHeaderRow() {
    return showHeaderRow;
  }

  public void setShowHeaderRow(Boolean showHeaderRow) {
    this.showHeaderRow = showHeaderRow;
  }

  public ListObject startColumn(Integer startColumn) {
    this.startColumn = startColumn;
    return this;
  }

   /**
   * Gets the start column of the range.
   * @return startColumn
  **/
  @ApiModelProperty(value = "Gets the start column of the range.")
  public Integer getStartColumn() {
    return startColumn;
  }

  public void setStartColumn(Integer startColumn) {
    this.startColumn = startColumn;
  }

  public ListObject showTableStyleLastColumn(Boolean showTableStyleLastColumn) {
    this.showTableStyleLastColumn = showTableStyleLastColumn;
    return this;
  }

   /**
   * Indicates whether the last column in the table should have the style applied.
   * @return showTableStyleLastColumn
  **/
  @ApiModelProperty(value = "Indicates whether the last column in the table should have the style applied.")
  public Boolean isShowTableStyleLastColumn() {
    return showTableStyleLastColumn;
  }

  public void setShowTableStyleLastColumn(Boolean showTableStyleLastColumn) {
    this.showTableStyleLastColumn = showTableStyleLastColumn;
  }

  public ListObject showTableStyleColumnStripes(Boolean showTableStyleColumnStripes) {
    this.showTableStyleColumnStripes = showTableStyleColumnStripes;
    return this;
  }

   /**
   * Indicates whether column stripe formatting is applied.
   * @return showTableStyleColumnStripes
  **/
  @ApiModelProperty(value = "Indicates whether column stripe formatting is applied.")
  public Boolean isShowTableStyleColumnStripes() {
    return showTableStyleColumnStripes;
  }

  public void setShowTableStyleColumnStripes(Boolean showTableStyleColumnStripes) {
    this.showTableStyleColumnStripes = showTableStyleColumnStripes;
  }

  public ListObject showTableStyleFirstColumn(Boolean showTableStyleFirstColumn) {
    this.showTableStyleFirstColumn = showTableStyleFirstColumn;
    return this;
  }

   /**
   * Inidicates whether the first column in the table should have the style applied.
   * @return showTableStyleFirstColumn
  **/
  @ApiModelProperty(value = "Inidicates whether the first column in the table should have the style applied.")
  public Boolean isShowTableStyleFirstColumn() {
    return showTableStyleFirstColumn;
  }

  public void setShowTableStyleFirstColumn(Boolean showTableStyleFirstColumn) {
    this.showTableStyleFirstColumn = showTableStyleFirstColumn;
  }

  public ListObject startRow(Integer startRow) {
    this.startRow = startRow;
    return this;
  }

   /**
   * Gets the start row of the range.
   * @return startRow
  **/
  @ApiModelProperty(value = "Gets the start row of the range.")
  public Integer getStartRow() {
    return startRow;
  }

  public void setStartRow(Integer startRow) {
    this.startRow = startRow;
  }

  public ListObject autoFilter(AutoFilter autoFilter) {
    this.autoFilter = autoFilter;
    return this;
  }

   /**
   * Gets auto filter.             
   * @return autoFilter
  **/
  @ApiModelProperty(value = "Gets auto filter.             ")
  public AutoFilter getAutoFilter() {
    return autoFilter;
  }

  public void setAutoFilter(AutoFilter autoFilter) {
    this.autoFilter = autoFilter;
  }

  public ListObject showTableStyleRowStripes(Boolean showTableStyleRowStripes) {
    this.showTableStyleRowStripes = showTableStyleRowStripes;
    return this;
  }

   /**
   * Indicates whether row stripe formatting is applied.
   * @return showTableStyleRowStripes
  **/
  @ApiModelProperty(value = "Indicates whether row stripe formatting is applied.")
  public Boolean isShowTableStyleRowStripes() {
    return showTableStyleRowStripes;
  }

  public void setShowTableStyleRowStripes(Boolean showTableStyleRowStripes) {
    this.showTableStyleRowStripes = showTableStyleRowStripes;
  }

  public ListObject endColumn(Integer endColumn) {
    this.endColumn = endColumn;
    return this;
  }

   /**
   * Gets the end column of the range.
   * @return endColumn
  **/
  @ApiModelProperty(value = "Gets the end column of the range.")
  public Integer getEndColumn() {
    return endColumn;
  }

  public void setEndColumn(Integer endColumn) {
    this.endColumn = endColumn;
  }

  public ListObject tableStyleName(String tableStyleName) {
    this.tableStyleName = tableStyleName;
    return this;
  }

   /**
   * Gets and sets the table style name.
   * @return tableStyleName
  **/
  @ApiModelProperty(value = "Gets and sets the table style name.")
  public String getTableStyleName() {
    return tableStyleName;
  }

  public void setTableStyleName(String tableStyleName) {
    this.tableStyleName = tableStyleName;
  }

  public ListObject listColumns(List<ListColumn> listColumns) {
    this.listColumns = listColumns;
    return this;
  }

  public ListObject addListColumnsItem(ListColumn listColumnsItem) {
    if (this.listColumns == null) {
      this.listColumns = new ArrayList<ListColumn>();
    }
    this.listColumns.add(listColumnsItem);
    return this;
  }

   /**
   * Gets ListColumns of the ListObject.
   * @return listColumns
  **/
  @ApiModelProperty(value = "Gets ListColumns of the ListObject.")
  public List<ListColumn> getListColumns() {
    return listColumns;
  }

  public void setListColumns(List<ListColumn> listColumns) {
    this.listColumns = listColumns;
  }

  public ListObject endRow(Integer endRow) {
    this.endRow = endRow;
    return this;
  }

   /**
   * Gets the end row of the range.
   * @return endRow
  **/
  @ApiModelProperty(value = "Gets the end row of the range.")
  public Integer getEndRow() {
    return endRow;
  }

  public void setEndRow(Integer endRow) {
    this.endRow = endRow;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ListObject listObject = (ListObject) o;
    return Objects.equals(this.link, listObject.link) &&
        Objects.equals(this.showTotals, listObject.showTotals) &&
        Objects.equals(this.tableStyleType, listObject.tableStyleType) &&
        Objects.equals(this.displayName, listObject.displayName) &&
        Objects.equals(this.showHeaderRow, listObject.showHeaderRow) &&
        Objects.equals(this.startColumn, listObject.startColumn) &&
        Objects.equals(this.showTableStyleLastColumn, listObject.showTableStyleLastColumn) &&
        Objects.equals(this.showTableStyleColumnStripes, listObject.showTableStyleColumnStripes) &&
        Objects.equals(this.showTableStyleFirstColumn, listObject.showTableStyleFirstColumn) &&
        Objects.equals(this.startRow, listObject.startRow) &&
        Objects.equals(this.autoFilter, listObject.autoFilter) &&
        Objects.equals(this.showTableStyleRowStripes, listObject.showTableStyleRowStripes) &&
        Objects.equals(this.endColumn, listObject.endColumn) &&
        Objects.equals(this.tableStyleName, listObject.tableStyleName) &&
        Objects.equals(this.listColumns, listObject.listColumns) &&
        Objects.equals(this.endRow, listObject.endRow);
  }

  @Override
  public int hashCode() {
    return Objects.hash(link, showTotals, tableStyleType, displayName, showHeaderRow, startColumn, showTableStyleLastColumn, showTableStyleColumnStripes, showTableStyleFirstColumn, startRow, autoFilter, showTableStyleRowStripes, endColumn, tableStyleName, listColumns, endRow);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ListObject {\n");
    
    sb.append("    link: ").append(toIndentedString(link)).append("\n");
    sb.append("    showTotals: ").append(toIndentedString(showTotals)).append("\n");
    sb.append("    tableStyleType: ").append(toIndentedString(tableStyleType)).append("\n");
    sb.append("    displayName: ").append(toIndentedString(displayName)).append("\n");
    sb.append("    showHeaderRow: ").append(toIndentedString(showHeaderRow)).append("\n");
    sb.append("    startColumn: ").append(toIndentedString(startColumn)).append("\n");
    sb.append("    showTableStyleLastColumn: ").append(toIndentedString(showTableStyleLastColumn)).append("\n");
    sb.append("    showTableStyleColumnStripes: ").append(toIndentedString(showTableStyleColumnStripes)).append("\n");
    sb.append("    showTableStyleFirstColumn: ").append(toIndentedString(showTableStyleFirstColumn)).append("\n");
    sb.append("    startRow: ").append(toIndentedString(startRow)).append("\n");
    sb.append("    autoFilter: ").append(toIndentedString(autoFilter)).append("\n");
    sb.append("    showTableStyleRowStripes: ").append(toIndentedString(showTableStyleRowStripes)).append("\n");
    sb.append("    endColumn: ").append(toIndentedString(endColumn)).append("\n");
    sb.append("    tableStyleName: ").append(toIndentedString(tableStyleName)).append("\n");
    sb.append("    listColumns: ").append(toIndentedString(listColumns)).append("\n");
    sb.append("    endRow: ").append(toIndentedString(endRow)).append("\n");
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

