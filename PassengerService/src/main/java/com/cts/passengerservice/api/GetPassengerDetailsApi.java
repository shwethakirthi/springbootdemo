package com.cts.passengerservice.api;

import com.cts.passengerservice.model.GetPassengerDetailsResponse;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import io.swagger.annotations.ApiResponses;
import javax.validation.constraints.NotNull;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Api(value="getPassengerDetails", description="the getPassengerDetails API")
public abstract interface GetPassengerDetailsApi
{
  @ApiOperation(value="Operation GetPassengerDetails", notes="", response=GetPassengerDetailsResponse.class, tags={"Passenger"})
  @ApiResponses({@io.swagger.annotations.ApiResponse(code=500, message="", response=com.cts.passengerservice.model.GetPassengerDetailsFault.class), @io.swagger.annotations.ApiResponse(code=200, message="", response=GetPassengerDetailsResponse.class)})
  @RequestMapping(value={"/getPassengerDetails"}, produces={"application/xml", "application/json"}, method={org.springframework.web.bind.annotation.RequestMethod.GET})
  public abstract ResponseEntity<GetPassengerDetailsResponse> getPassengerDetails(@NotNull @ApiParam(value="PnrNo", required=true) @RequestParam(value="PnrNo", required=true) String paramString);
}
