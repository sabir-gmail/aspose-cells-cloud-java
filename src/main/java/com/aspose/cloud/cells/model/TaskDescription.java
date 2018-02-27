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
import com.aspose.cloud.cells.model.TaskParameter;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * TaskDescription
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2018-02-27T14:45:34.511+08:00")
public class TaskDescription {
  @SerializedName("TaskType")
  private String taskType = null;

  @SerializedName("TaskParameter")
  private TaskParameter taskParameter = null;

  public TaskDescription taskType(String taskType) {
    this.taskType = taskType;
    return this;
  }

   /**
   * Get taskType
   * @return taskType
  **/
  @ApiModelProperty(value = "")
  public String getTaskType() {
    return taskType;
  }

  public void setTaskType(String taskType) {
    this.taskType = taskType;
  }

  public TaskDescription taskParameter(TaskParameter taskParameter) {
    this.taskParameter = taskParameter;
    return this;
  }

   /**
   * Get taskParameter
   * @return taskParameter
  **/
  @ApiModelProperty(value = "")
  public TaskParameter getTaskParameter() {
    return taskParameter;
  }

  public void setTaskParameter(TaskParameter taskParameter) {
    this.taskParameter = taskParameter;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TaskDescription taskDescription = (TaskDescription) o;
    return Objects.equals(this.taskType, taskDescription.taskType) &&
        Objects.equals(this.taskParameter, taskDescription.taskParameter);
  }

  @Override
  public int hashCode() {
    return Objects.hash(taskType, taskParameter);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TaskDescription {\n");
    
    sb.append("    taskType: ").append(toIndentedString(taskType)).append("\n");
    sb.append("    taskParameter: ").append(toIndentedString(taskParameter)).append("\n");
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

