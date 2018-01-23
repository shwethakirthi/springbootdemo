package com.cts.passengerservice.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.cts.passengerservice.model.PassengerInfo;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * GetPassengerDetailsResponse
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2018-01-22T06:44:04.663Z")

public class GetPassengerDetailsResponse   {
  @JsonProperty("PassengerInfo")
  private PassengerInfo passengerInfo = null;

  public GetPassengerDetailsResponse passengerInfo(PassengerInfo passengerInfo) {
    this.passengerInfo = passengerInfo;
    return this;
  }

   /**
   * Get passengerInfo
   * @return passengerInfo
  **/
  @ApiModelProperty(value = "")

  @Valid

  public PassengerInfo getPassengerInfo() {
    return passengerInfo;
  }

  public void setPassengerInfo(PassengerInfo passengerInfo) {
    this.passengerInfo = passengerInfo;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GetPassengerDetailsResponse getPassengerDetailsResponse = (GetPassengerDetailsResponse) o;
    return Objects.equals(this.passengerInfo, getPassengerDetailsResponse.passengerInfo);
  }

  @Override
  public int hashCode() {
    return Objects.hash(passengerInfo);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GetPassengerDetailsResponse {\n");
    
    sb.append("    passengerInfo: ").append(toIndentedString(passengerInfo)).append("\n");
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

