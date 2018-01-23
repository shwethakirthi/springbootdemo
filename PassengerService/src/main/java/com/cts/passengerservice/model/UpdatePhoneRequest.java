package com.cts.passengerservice.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.cts.passengerservice.model.PassengerInfo;
import com.cts.passengerservice.model.RecordLocatorInfo;
import com.cts.passengerservice.model.RequestInfo;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * UpdatePhoneRequest
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2018-01-22T06:44:04.663Z")

public class UpdatePhoneRequest   {
  @JsonProperty("RequestInfo")
  private RequestInfo requestInfo = null;

  @JsonProperty("PassengerInfo")
  private PassengerInfo passengerInfo = null;

  @JsonProperty("RecordLocatorInfo")
  private RecordLocatorInfo recordLocatorInfo = null;

  public UpdatePhoneRequest requestInfo(RequestInfo requestInfo) {
    this.requestInfo = requestInfo;
    return this;
  }

   /**
   * Get requestInfo
   * @return requestInfo
  **/
  @ApiModelProperty(value = "")

  @Valid

  public RequestInfo getRequestInfo() {
    return requestInfo;
  }

  public void setRequestInfo(RequestInfo requestInfo) {
    this.requestInfo = requestInfo;
  }

  public UpdatePhoneRequest passengerInfo(PassengerInfo passengerInfo) {
    this.passengerInfo = passengerInfo;
    return this;
  }

   /**
   * Get passengerInfo
   * @return passengerInfo
  **/
  @ApiModelProperty(required = true, value = "")
  @NotNull

  @Valid

  public PassengerInfo getPassengerInfo() {
    return passengerInfo;
  }

  public void setPassengerInfo(PassengerInfo passengerInfo) {
    this.passengerInfo = passengerInfo;
  }

  public UpdatePhoneRequest recordLocatorInfo(RecordLocatorInfo recordLocatorInfo) {
    this.recordLocatorInfo = recordLocatorInfo;
    return this;
  }

   /**
   * Get recordLocatorInfo
   * @return recordLocatorInfo
  **/
  @ApiModelProperty(value = "")

  @Valid

  public RecordLocatorInfo getRecordLocatorInfo() {
    return recordLocatorInfo;
  }

  public void setRecordLocatorInfo(RecordLocatorInfo recordLocatorInfo) {
    this.recordLocatorInfo = recordLocatorInfo;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    UpdatePhoneRequest updatePhoneRequest = (UpdatePhoneRequest) o;
    return Objects.equals(this.requestInfo, updatePhoneRequest.requestInfo) &&
        Objects.equals(this.passengerInfo, updatePhoneRequest.passengerInfo) &&
        Objects.equals(this.recordLocatorInfo, updatePhoneRequest.recordLocatorInfo);
  }

  @Override
  public int hashCode() {
    return Objects.hash(requestInfo, passengerInfo, recordLocatorInfo);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UpdatePhoneRequest {\n");
    
    sb.append("    requestInfo: ").append(toIndentedString(requestInfo)).append("\n");
    sb.append("    passengerInfo: ").append(toIndentedString(passengerInfo)).append("\n");
    sb.append("    recordLocatorInfo: ").append(toIndentedString(recordLocatorInfo)).append("\n");
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

