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
import com.aspose.cloud.cells.model.Border;
import com.aspose.cloud.cells.model.Color;
import com.aspose.cloud.cells.model.Font;
import com.aspose.cloud.cells.model.Link;
import com.aspose.cloud.cells.model.LinkElement;
import com.aspose.cloud.cells.model.ThemeColor;
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
 * Style
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2018-02-27T14:45:34.511+08:00")
public class Style {
  @SerializedName("link")
  private Link link = null;

  @SerializedName("Font")
  private Font font = null;

  @SerializedName("Name")
  private String name = null;

  @SerializedName("CultureCustom")
  private String cultureCustom = null;

  @SerializedName("Custom")
  private String custom = null;

  @SerializedName("BackgroundColor")
  private Color backgroundColor = null;

  @SerializedName("ForegroundColor")
  private Color foregroundColor = null;

  @SerializedName("IsFormulaHidden")
  private Boolean isFormulaHidden = null;

  @SerializedName("IsDateTime")
  private Boolean isDateTime = null;

  @SerializedName("IsTextWrapped")
  private Boolean isTextWrapped = null;

  @SerializedName("IsGradient")
  private Boolean isGradient = null;

  @SerializedName("IsLocked")
  private Boolean isLocked = null;

  @SerializedName("IsPercent")
  private Boolean isPercent = null;

  @SerializedName("ShrinkToFit")
  private Boolean shrinkToFit = null;

  @SerializedName("IndentLevel")
  private Integer indentLevel = null;

  @SerializedName("Number")
  private Integer number = null;

  @SerializedName("RotationAngle")
  private Integer rotationAngle = null;

  @SerializedName("Pattern")
  private String pattern = null;

  @SerializedName("TextDirection")
  private String textDirection = null;

  @SerializedName("VerticalAlignment")
  private String verticalAlignment = null;

  @SerializedName("HorizontalAlignment")
  private String horizontalAlignment = null;

  @SerializedName("BorderCollection")
  private List<Border> borderCollection = null;

  @SerializedName("BackgroundThemeColor")
  private ThemeColor backgroundThemeColor = null;

  @SerializedName("ForegroundThemeColor")
  private ThemeColor foregroundThemeColor = null;

  public Style link(Link link) {
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

  public Style font(Font font) {
    this.font = font;
    return this;
  }

   /**
   * Get font
   * @return font
  **/
  @ApiModelProperty(value = "")
  public Font getFont() {
    return font;
  }

  public void setFont(Font font) {
    this.font = font;
  }

  public Style name(String name) {
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

  public Style cultureCustom(String cultureCustom) {
    this.cultureCustom = cultureCustom;
    return this;
  }

   /**
   * Get cultureCustom
   * @return cultureCustom
  **/
  @ApiModelProperty(value = "")
  public String getCultureCustom() {
    return cultureCustom;
  }

  public void setCultureCustom(String cultureCustom) {
    this.cultureCustom = cultureCustom;
  }

  public Style custom(String custom) {
    this.custom = custom;
    return this;
  }

   /**
   * Get custom
   * @return custom
  **/
  @ApiModelProperty(value = "")
  public String getCustom() {
    return custom;
  }

  public void setCustom(String custom) {
    this.custom = custom;
  }

  public Style backgroundColor(Color backgroundColor) {
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

  public Style foregroundColor(Color foregroundColor) {
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

  public Style isFormulaHidden(Boolean isFormulaHidden) {
    this.isFormulaHidden = isFormulaHidden;
    return this;
  }

   /**
   * Get isFormulaHidden
   * @return isFormulaHidden
  **/
  @ApiModelProperty(value = "")
  public Boolean isIsFormulaHidden() {
    return isFormulaHidden;
  }

  public void setIsFormulaHidden(Boolean isFormulaHidden) {
    this.isFormulaHidden = isFormulaHidden;
  }

  public Style isDateTime(Boolean isDateTime) {
    this.isDateTime = isDateTime;
    return this;
  }

   /**
   * Get isDateTime
   * @return isDateTime
  **/
  @ApiModelProperty(value = "")
  public Boolean isIsDateTime() {
    return isDateTime;
  }

  public void setIsDateTime(Boolean isDateTime) {
    this.isDateTime = isDateTime;
  }

  public Style isTextWrapped(Boolean isTextWrapped) {
    this.isTextWrapped = isTextWrapped;
    return this;
  }

   /**
   * Get isTextWrapped
   * @return isTextWrapped
  **/
  @ApiModelProperty(value = "")
  public Boolean isIsTextWrapped() {
    return isTextWrapped;
  }

  public void setIsTextWrapped(Boolean isTextWrapped) {
    this.isTextWrapped = isTextWrapped;
  }

  public Style isGradient(Boolean isGradient) {
    this.isGradient = isGradient;
    return this;
  }

   /**
   * Get isGradient
   * @return isGradient
  **/
  @ApiModelProperty(value = "")
  public Boolean isIsGradient() {
    return isGradient;
  }

  public void setIsGradient(Boolean isGradient) {
    this.isGradient = isGradient;
  }

  public Style isLocked(Boolean isLocked) {
    this.isLocked = isLocked;
    return this;
  }

   /**
   * Get isLocked
   * @return isLocked
  **/
  @ApiModelProperty(value = "")
  public Boolean isIsLocked() {
    return isLocked;
  }

  public void setIsLocked(Boolean isLocked) {
    this.isLocked = isLocked;
  }

  public Style isPercent(Boolean isPercent) {
    this.isPercent = isPercent;
    return this;
  }

   /**
   * Get isPercent
   * @return isPercent
  **/
  @ApiModelProperty(value = "")
  public Boolean isIsPercent() {
    return isPercent;
  }

  public void setIsPercent(Boolean isPercent) {
    this.isPercent = isPercent;
  }

  public Style shrinkToFit(Boolean shrinkToFit) {
    this.shrinkToFit = shrinkToFit;
    return this;
  }

   /**
   * Get shrinkToFit
   * @return shrinkToFit
  **/
  @ApiModelProperty(value = "")
  public Boolean isShrinkToFit() {
    return shrinkToFit;
  }

  public void setShrinkToFit(Boolean shrinkToFit) {
    this.shrinkToFit = shrinkToFit;
  }

  public Style indentLevel(Integer indentLevel) {
    this.indentLevel = indentLevel;
    return this;
  }

   /**
   * Get indentLevel
   * @return indentLevel
  **/
  @ApiModelProperty(value = "")
  public Integer getIndentLevel() {
    return indentLevel;
  }

  public void setIndentLevel(Integer indentLevel) {
    this.indentLevel = indentLevel;
  }

  public Style number(Integer number) {
    this.number = number;
    return this;
  }

   /**
   * Get number
   * @return number
  **/
  @ApiModelProperty(value = "")
  public Integer getNumber() {
    return number;
  }

  public void setNumber(Integer number) {
    this.number = number;
  }

  public Style rotationAngle(Integer rotationAngle) {
    this.rotationAngle = rotationAngle;
    return this;
  }

   /**
   * Get rotationAngle
   * @return rotationAngle
  **/
  @ApiModelProperty(value = "")
  public Integer getRotationAngle() {
    return rotationAngle;
  }

  public void setRotationAngle(Integer rotationAngle) {
    this.rotationAngle = rotationAngle;
  }

  public Style pattern(String pattern) {
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

  public Style textDirection(String textDirection) {
    this.textDirection = textDirection;
    return this;
  }

   /**
   * Get textDirection
   * @return textDirection
  **/
  @ApiModelProperty(value = "")
  public String getTextDirection() {
    return textDirection;
  }

  public void setTextDirection(String textDirection) {
    this.textDirection = textDirection;
  }

  public Style verticalAlignment(String verticalAlignment) {
    this.verticalAlignment = verticalAlignment;
    return this;
  }

   /**
   * Get verticalAlignment
   * @return verticalAlignment
  **/
  @ApiModelProperty(value = "")
  public String getVerticalAlignment() {
    return verticalAlignment;
  }

  public void setVerticalAlignment(String verticalAlignment) {
    this.verticalAlignment = verticalAlignment;
  }

  public Style horizontalAlignment(String horizontalAlignment) {
    this.horizontalAlignment = horizontalAlignment;
    return this;
  }

   /**
   * Get horizontalAlignment
   * @return horizontalAlignment
  **/
  @ApiModelProperty(value = "")
  public String getHorizontalAlignment() {
    return horizontalAlignment;
  }

  public void setHorizontalAlignment(String horizontalAlignment) {
    this.horizontalAlignment = horizontalAlignment;
  }

  public Style borderCollection(List<Border> borderCollection) {
    this.borderCollection = borderCollection;
    return this;
  }

  public Style addBorderCollectionItem(Border borderCollectionItem) {
    if (this.borderCollection == null) {
      this.borderCollection = new ArrayList<Border>();
    }
    this.borderCollection.add(borderCollectionItem);
    return this;
  }

   /**
   * Get borderCollection
   * @return borderCollection
  **/
  @ApiModelProperty(value = "")
  public List<Border> getBorderCollection() {
    return borderCollection;
  }

  public void setBorderCollection(List<Border> borderCollection) {
    this.borderCollection = borderCollection;
  }

  public Style backgroundThemeColor(ThemeColor backgroundThemeColor) {
    this.backgroundThemeColor = backgroundThemeColor;
    return this;
  }

   /**
   * Get backgroundThemeColor
   * @return backgroundThemeColor
  **/
  @ApiModelProperty(value = "")
  public ThemeColor getBackgroundThemeColor() {
    return backgroundThemeColor;
  }

  public void setBackgroundThemeColor(ThemeColor backgroundThemeColor) {
    this.backgroundThemeColor = backgroundThemeColor;
  }

  public Style foregroundThemeColor(ThemeColor foregroundThemeColor) {
    this.foregroundThemeColor = foregroundThemeColor;
    return this;
  }

   /**
   * Get foregroundThemeColor
   * @return foregroundThemeColor
  **/
  @ApiModelProperty(value = "")
  public ThemeColor getForegroundThemeColor() {
    return foregroundThemeColor;
  }

  public void setForegroundThemeColor(ThemeColor foregroundThemeColor) {
    this.foregroundThemeColor = foregroundThemeColor;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Style style = (Style) o;
    return Objects.equals(this.link, style.link) &&
        Objects.equals(this.font, style.font) &&
        Objects.equals(this.name, style.name) &&
        Objects.equals(this.cultureCustom, style.cultureCustom) &&
        Objects.equals(this.custom, style.custom) &&
        Objects.equals(this.backgroundColor, style.backgroundColor) &&
        Objects.equals(this.foregroundColor, style.foregroundColor) &&
        Objects.equals(this.isFormulaHidden, style.isFormulaHidden) &&
        Objects.equals(this.isDateTime, style.isDateTime) &&
        Objects.equals(this.isTextWrapped, style.isTextWrapped) &&
        Objects.equals(this.isGradient, style.isGradient) &&
        Objects.equals(this.isLocked, style.isLocked) &&
        Objects.equals(this.isPercent, style.isPercent) &&
        Objects.equals(this.shrinkToFit, style.shrinkToFit) &&
        Objects.equals(this.indentLevel, style.indentLevel) &&
        Objects.equals(this.number, style.number) &&
        Objects.equals(this.rotationAngle, style.rotationAngle) &&
        Objects.equals(this.pattern, style.pattern) &&
        Objects.equals(this.textDirection, style.textDirection) &&
        Objects.equals(this.verticalAlignment, style.verticalAlignment) &&
        Objects.equals(this.horizontalAlignment, style.horizontalAlignment) &&
        Objects.equals(this.borderCollection, style.borderCollection) &&
        Objects.equals(this.backgroundThemeColor, style.backgroundThemeColor) &&
        Objects.equals(this.foregroundThemeColor, style.foregroundThemeColor);
  }

  @Override
  public int hashCode() {
    return Objects.hash(link, font, name, cultureCustom, custom, backgroundColor, foregroundColor, isFormulaHidden, isDateTime, isTextWrapped, isGradient, isLocked, isPercent, shrinkToFit, indentLevel, number, rotationAngle, pattern, textDirection, verticalAlignment, horizontalAlignment, borderCollection, backgroundThemeColor, foregroundThemeColor);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Style {\n");
    
    sb.append("    link: ").append(toIndentedString(link)).append("\n");
    sb.append("    font: ").append(toIndentedString(font)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    cultureCustom: ").append(toIndentedString(cultureCustom)).append("\n");
    sb.append("    custom: ").append(toIndentedString(custom)).append("\n");
    sb.append("    backgroundColor: ").append(toIndentedString(backgroundColor)).append("\n");
    sb.append("    foregroundColor: ").append(toIndentedString(foregroundColor)).append("\n");
    sb.append("    isFormulaHidden: ").append(toIndentedString(isFormulaHidden)).append("\n");
    sb.append("    isDateTime: ").append(toIndentedString(isDateTime)).append("\n");
    sb.append("    isTextWrapped: ").append(toIndentedString(isTextWrapped)).append("\n");
    sb.append("    isGradient: ").append(toIndentedString(isGradient)).append("\n");
    sb.append("    isLocked: ").append(toIndentedString(isLocked)).append("\n");
    sb.append("    isPercent: ").append(toIndentedString(isPercent)).append("\n");
    sb.append("    shrinkToFit: ").append(toIndentedString(shrinkToFit)).append("\n");
    sb.append("    indentLevel: ").append(toIndentedString(indentLevel)).append("\n");
    sb.append("    number: ").append(toIndentedString(number)).append("\n");
    sb.append("    rotationAngle: ").append(toIndentedString(rotationAngle)).append("\n");
    sb.append("    pattern: ").append(toIndentedString(pattern)).append("\n");
    sb.append("    textDirection: ").append(toIndentedString(textDirection)).append("\n");
    sb.append("    verticalAlignment: ").append(toIndentedString(verticalAlignment)).append("\n");
    sb.append("    horizontalAlignment: ").append(toIndentedString(horizontalAlignment)).append("\n");
    sb.append("    borderCollection: ").append(toIndentedString(borderCollection)).append("\n");
    sb.append("    backgroundThemeColor: ").append(toIndentedString(backgroundThemeColor)).append("\n");
    sb.append("    foregroundThemeColor: ").append(toIndentedString(foregroundThemeColor)).append("\n");
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
