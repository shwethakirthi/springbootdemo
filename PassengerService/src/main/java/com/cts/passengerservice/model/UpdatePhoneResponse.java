package com.cts.passengerservice.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.cts.passengerservice.model.AdvisoryMessage;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * UpdatePhoneResponse
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2018-01-22T06:44:04.663Z")

public class UpdatePhoneResponse   {
  @JsonProperty("AdvisoryMessage")
  private AdvisoryMessage advisoryMessage = null;

  public UpdatePhoneResponse advisoryMessage(AdvisoryMessage advisoryMessage) {
    this.advisoryMessage = advisoryMessage;
    return this;
  }

   /**
   * Get advisoryMessage
   * @return advisoryMessage
  **/
  @ApiModelProperty(value = "")

  @Valid

  public AdvisoryMessage getAdvisoryMessage() {
    return advisoryMessage;
  }

  public void setAdvisoryMessage(AdvisoryMessage advisoryMessage) {
    this.advisoryMessage = advisoryMessage;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    UpdatePhoneResponse updatePhoneResponse = (UpdatePhoneResponse) o;
    return Objects.equals(this.advisoryMessage, updatePhoneResponse.advisoryMessage);
  }

  @Override
  public int hashCode() {
    return Objects.hash(advisoryMessage);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UpdatePhoneResponse {\n");
    
    sb.append("    advisoryMessage: ").append(toIndentedString(advisoryMessage)).append("\n");
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

