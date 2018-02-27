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
import com.aspose.cloud.cells.model.CellArea;
import com.aspose.cloud.cells.model.Link;
import com.aspose.cloud.cells.model.LinkElement;
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
 * Validation
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2018-02-27T14:45:34.511+08:00")
public class Validation {
  @SerializedName("link")
  private Link link = null;

  @SerializedName("AlertStyle")
  private String alertStyle = null;

  @SerializedName("AreaList")
  private List<CellArea> areaList = null;

  @SerializedName("ErrorMessage")
  private String errorMessage = null;

  @SerializedName("ErrorTitle")
  private String errorTitle = null;

  @SerializedName("Formula1")
  private String formula1 = null;

  @SerializedName("Formula2")
  private String formula2 = null;

  @SerializedName("IgnoreBlank")
  private Boolean ignoreBlank = null;

  @SerializedName("InCellDropDown")
  private Boolean inCellDropDown = null;

  @SerializedName("InputMessage")
  private String inputMessage = null;

  @SerializedName("InputTitle")
  private String inputTitle = null;

  @SerializedName("Operator")
  private String operator = null;

  @SerializedName("ShowError")
  private Boolean showError = null;

  @SerializedName("ShowInput")
  private Boolean showInput = null;

  @SerializedName("Type")
  private String type = null;

  @SerializedName("Value1")
  private String value1 = null;

  @SerializedName("Value2")
  private String value2 = null;

  public Validation link(Link link) {
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

  public Validation alertStyle(String alertStyle) {
    this.alertStyle = alertStyle;
    return this;
  }

   /**
   * Represents the validation alert style.Information,Stop,Warning             
   * @return alertStyle
  **/
  @ApiModelProperty(value = "Represents the validation alert style.Information,Stop,Warning             ")
  public String getAlertStyle() {
    return alertStyle;
  }

  public void setAlertStyle(String alertStyle) {
    this.alertStyle = alertStyle;
  }

  public Validation areaList(List<CellArea> areaList) {
    this.areaList = areaList;
    return this;
  }

  public Validation addAreaListItem(CellArea areaListItem) {
    if (this.areaList == null) {
      this.areaList = new ArrayList<CellArea>();
    }
    this.areaList.add(areaListItem);
    return this;
  }

   /**
   * Represents a collection of Aspose.Cells.CellArea which contains the data     validation settings.
   * @return areaList
  **/
  @ApiModelProperty(value = "Represents a collection of Aspose.Cells.CellArea which contains the data     validation settings.")
  public List<CellArea> getAreaList() {
    return areaList;
  }

  public void setAreaList(List<CellArea> areaList) {
    this.areaList = areaList;
  }

  public Validation errorMessage(String errorMessage) {
    this.errorMessage = errorMessage;
    return this;
  }

   /**
   * Represents the data validation error message.
   * @return errorMessage
  **/
  @ApiModelProperty(value = "Represents the data validation error message.")
  public String getErrorMessage() {
    return errorMessage;
  }

  public void setErrorMessage(String errorMessage) {
    this.errorMessage = errorMessage;
  }

  public Validation errorTitle(String errorTitle) {
    this.errorTitle = errorTitle;
    return this;
  }

   /**
   * Represents the title of the data-validation error dialog box.
   * @return errorTitle
  **/
  @ApiModelProperty(value = "Represents the title of the data-validation error dialog box.")
  public String getErrorTitle() {
    return errorTitle;
  }

  public void setErrorTitle(String errorTitle) {
    this.errorTitle = errorTitle;
  }

  public Validation formula1(String formula1) {
    this.formula1 = formula1;
    return this;
  }

   /**
   * Represents the value or expression associated with the data validation.
   * @return formula1
  **/
  @ApiModelProperty(value = "Represents the value or expression associated with the data validation.")
  public String getFormula1() {
    return formula1;
  }

  public void setFormula1(String formula1) {
    this.formula1 = formula1;
  }

  public Validation formula2(String formula2) {
    this.formula2 = formula2;
    return this;
  }

   /**
   * Represents the value or expression associated with the second part of the    data validation.             
   * @return formula2
  **/
  @ApiModelProperty(value = "Represents the value or expression associated with the second part of the    data validation.             ")
  public String getFormula2() {
    return formula2;
  }

  public void setFormula2(String formula2) {
    this.formula2 = formula2;
  }

  public Validation ignoreBlank(Boolean ignoreBlank) {
    this.ignoreBlank = ignoreBlank;
    return this;
  }

   /**
   * Indicates whether blank values are permitted by the range data validation.
   * @return ignoreBlank
  **/
  @ApiModelProperty(value = "Indicates whether blank values are permitted by the range data validation.")
  public Boolean isIgnoreBlank() {
    return ignoreBlank;
  }

  public void setIgnoreBlank(Boolean ignoreBlank) {
    this.ignoreBlank = ignoreBlank;
  }

  public Validation inCellDropDown(Boolean inCellDropDown) {
    this.inCellDropDown = inCellDropDown;
    return this;
  }

   /**
   * Indicates whether data validation displays a drop-down list that contains    acceptable values.
   * @return inCellDropDown
  **/
  @ApiModelProperty(value = "Indicates whether data validation displays a drop-down list that contains    acceptable values.")
  public Boolean isInCellDropDown() {
    return inCellDropDown;
  }

  public void setInCellDropDown(Boolean inCellDropDown) {
    this.inCellDropDown = inCellDropDown;
  }

  public Validation inputMessage(String inputMessage) {
    this.inputMessage = inputMessage;
    return this;
  }

   /**
   * Represents the data validation input message.
   * @return inputMessage
  **/
  @ApiModelProperty(value = "Represents the data validation input message.")
  public String getInputMessage() {
    return inputMessage;
  }

  public void setInputMessage(String inputMessage) {
    this.inputMessage = inputMessage;
  }

  public Validation inputTitle(String inputTitle) {
    this.inputTitle = inputTitle;
    return this;
  }

   /**
   * Represents the title of the data-validation input dialog box.
   * @return inputTitle
  **/
  @ApiModelProperty(value = "Represents the title of the data-validation input dialog box.")
  public String getInputTitle() {
    return inputTitle;
  }

  public void setInputTitle(String inputTitle) {
    this.inputTitle = inputTitle;
  }

  public Validation operator(String operator) {
    this.operator = operator;
    return this;
  }

   /**
   * Represents the operator for the data validation. Between,Equal,GreaterThan,GreaterOrEqual,LessThan,LessOrEqual,None,NotBetween,NotEqual
   * @return operator
  **/
  @ApiModelProperty(value = "Represents the operator for the data validation. Between,Equal,GreaterThan,GreaterOrEqual,LessThan,LessOrEqual,None,NotBetween,NotEqual")
  public String getOperator() {
    return operator;
  }

  public void setOperator(String operator) {
    this.operator = operator;
  }

  public Validation showError(Boolean showError) {
    this.showError = showError;
    return this;
  }

   /**
   * Indicates whether the data validation error message will be displayed whenever    the user enters invalid data.
   * @return showError
  **/
  @ApiModelProperty(value = "Indicates whether the data validation error message will be displayed whenever    the user enters invalid data.")
  public Boolean isShowError() {
    return showError;
  }

  public void setShowError(Boolean showError) {
    this.showError = showError;
  }

  public Validation showInput(Boolean showInput) {
    this.showInput = showInput;
    return this;
  }

   /**
   * Indicates whether the data validation input message will be displayed whenever    the user selects a cell in the data validation range.
   * @return showInput
  **/
  @ApiModelProperty(value = "Indicates whether the data validation input message will be displayed whenever    the user selects a cell in the data validation range.")
  public Boolean isShowInput() {
    return showInput;
  }

  public void setShowInput(Boolean showInput) {
    this.showInput = showInput;
  }

  public Validation type(String type) {
    this.type = type;
    return this;
  }

   /**
   * Represents the data validation type. AnyValue ,WholeNumber,Decimal,List,Date,Time,TextLength,Custom             
   * @return type
  **/
  @ApiModelProperty(value = "Represents the data validation type. AnyValue ,WholeNumber,Decimal,List,Date,Time,TextLength,Custom             ")
  public String getType() {
    return type;
  }

  public void setType(String type) {
    this.type = type;
  }

  public Validation value1(String value1) {
    this.value1 = value1;
    return this;
  }

   /**
   * Represents the first value associated with the data validation.
   * @return value1
  **/
  @ApiModelProperty(value = "Represents the first value associated with the data validation.")
  public String getValue1() {
    return value1;
  }

  public void setValue1(String value1) {
    this.value1 = value1;
  }

  public Validation value2(String value2) {
    this.value2 = value2;
    return this;
  }

   /**
   * Represents the first value associated with the data validation.             
   * @return value2
  **/
  @ApiModelProperty(value = "Represents the first value associated with the data validation.             ")
  public String getValue2() {
    return value2;
  }

  public void setValue2(String value2) {
    this.value2 = value2;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Validation validation = (Validation) o;
    return Objects.equals(this.link, validation.link) &&
        Objects.equals(this.alertStyle, validation.alertStyle) &&
        Objects.equals(this.areaList, validation.areaList) &&
        Objects.equals(this.errorMessage, validation.errorMessage) &&
        Objects.equals(this.errorTitle, validation.errorTitle) &&
        Objects.equals(this.formula1, validation.formula1) &&
        Objects.equals(this.formula2, validation.formula2) &&
        Objects.equals(this.ignoreBlank, validation.ignoreBlank) &&
        Objects.equals(this.inCellDropDown, validation.inCellDropDown) &&
        Objects.equals(this.inputMessage, validation.inputMessage) &&
        Objects.equals(this.inputTitle, validation.inputTitle) &&
        Objects.equals(this.operator, validation.operator) &&
        Objects.equals(this.showError, validation.showError) &&
        Objects.equals(this.showInput, validation.showInput) &&
        Objects.equals(this.type, validation.type) &&
        Objects.equals(this.value1, validation.value1) &&
        Objects.equals(this.value2, validation.value2);
  }

  @Override
  public int hashCode() {
    return Objects.hash(link, alertStyle, areaList, errorMessage, errorTitle, formula1, formula2, ignoreBlank, inCellDropDown, inputMessage, inputTitle, operator, showError, showInput, type, value1, value2);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Validation {\n");
    
    sb.append("    link: ").append(toIndentedString(link)).append("\n");
    sb.append("    alertStyle: ").append(toIndentedString(alertStyle)).append("\n");
    sb.append("    areaList: ").append(toIndentedString(areaList)).append("\n");
    sb.append("    errorMessage: ").append(toIndentedString(errorMessage)).append("\n");
    sb.append("    errorTitle: ").append(toIndentedString(errorTitle)).append("\n");
    sb.append("    formula1: ").append(toIndentedString(formula1)).append("\n");
    sb.append("    formula2: ").append(toIndentedString(formula2)).append("\n");
    sb.append("    ignoreBlank: ").append(toIndentedString(ignoreBlank)).append("\n");
    sb.append("    inCellDropDown: ").append(toIndentedString(inCellDropDown)).append("\n");
    sb.append("    inputMessage: ").append(toIndentedString(inputMessage)).append("\n");
    sb.append("    inputTitle: ").append(toIndentedString(inputTitle)).append("\n");
    sb.append("    operator: ").append(toIndentedString(operator)).append("\n");
    sb.append("    showError: ").append(toIndentedString(showError)).append("\n");
    sb.append("    showInput: ").append(toIndentedString(showInput)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    value1: ").append(toIndentedString(value1)).append("\n");
    sb.append("    value2: ").append(toIndentedString(value2)).append("\n");
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

