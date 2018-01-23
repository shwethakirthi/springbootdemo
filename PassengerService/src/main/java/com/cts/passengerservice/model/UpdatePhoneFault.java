package com.cts.passengerservice.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.cts.passengerservice.model.UpdatePhoneFaultDetail;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * UpdatePhoneFault
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2018-01-22T06:44:04.663Z")

public class UpdatePhoneFault   {
  @JsonProperty("faultcode")
  private String faultcode = null;

  @JsonProperty("faultstring")
  private String faultstring = null;

  @JsonProperty("faultactor")
  private String faultactor = null;

  @JsonProperty("detail")
  private UpdatePhoneFaultDetail detail = null;

  public UpdatePhoneFault faultcode(String faultcode) {
    this.faultcode = faultcode;
    return this;
  }

   /**
   * Get faultcode
   * @return faultcode
  **/
  @ApiModelProperty(value = "")


  public String getFaultcode() {
    return faultcode;
  }

  public void setFaultcode(String faultcode) {
    this.faultcode = faultcode;
  }

  public UpdatePhoneFault faultstring(String faultstring) {
    this.faultstring = faultstring;
    return this;
  }

   /**
   * Get faultstring
   * @return faultstring
  **/
  @ApiModelProperty(value = "")


  public String getFaultstring() {
    return faultstring;
  }

  public void setFaultstring(String faultstring) {
    this.faultstring = faultstring;
  }

  public UpdatePhoneFault faultactor(String faultactor) {
    this.faultactor = faultactor;
    return this;
  }

   /**
   * Get faultactor
   * @return faultactor
  **/
  @ApiModelProperty(value = "")


  public String getFaultactor() {
    return faultactor;
  }

  public void setFaultactor(String faultactor) {
    this.faultactor = faultactor;
  }

  public UpdatePhoneFault detail(UpdatePhoneFaultDetail detail) {
    this.detail = detail;
    return this;
  }

   /**
   * Get detail
   * @return detail
  **/
  @ApiModelProperty(value = "")

  @Valid

  public UpdatePhoneFaultDetail getDetail() {
    return detail;
  }

  public void setDetail(UpdatePhoneFaultDetail detail) {
    this.detail = detail;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    UpdatePhoneFault updatePhoneFault = (UpdatePhoneFault) o;
    return Objects.equals(this.faultcode, updatePhoneFault.faultcode) &&
        Objects.equals(this.faultstring, updatePhoneFault.faultstring) &&
        Objects.equals(this.faultactor, updatePhoneFault.faultactor) &&
        Objects.equals(this.detail, updatePhoneFault.detail);
  }

  @Override
  public int hashCode() {
    return Objects.hash(faultcode, faultstring, faultactor, detail);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UpdatePhoneFault {\n");
    
    sb.append("    faultcode: ").append(toIndentedString(faultcode)).append("\n");
    sb.append("    faultstring: ").append(toIndentedString(faultstring)).append("\n");
    sb.append("    faultactor: ").append(toIndentedString(faultactor)).append("\n");
    sb.append("    detail: ").append(toIndentedString(detail)).append("\n");
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

