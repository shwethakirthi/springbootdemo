package com.cts.passengerservice.api;

import com.cts.passengerservice.model.GetPassengerDetailsResponse;
import com.cts.passengerservice.model.Passenger;
import com.cts.passengerservice.model.PassengerInfo;
import com.cts.passengerservice.model.PassengerInfoInner;
import com.cts.passengerservice.service.IPassengerService;
import io.swagger.annotations.ApiParam;
import java.util.List;
import javax.validation.constraints.NotNull;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class GetPassengerDetailsApiController
  implements GetPassengerDetailsApi
{
  @Autowired
  IPassengerService passengerService;
  
  public ResponseEntity<GetPassengerDetailsResponse> getPassengerDetails(@NotNull @ApiParam(value="PnrNo", required=true) @RequestParam(value="PnrNo", required=true) String pnrNo)
  {
    System.out.println("PNR: " + pnrNo);
    
    List<Passenger> passengerList = this.passengerService.getPassengerDetails(pnrNo);
    
    GetPassengerDetailsResponse resp = new GetPassengerDetailsResponse();
    PassengerInfo passengerInfo = new PassengerInfo();
    for (Passenger pass : passengerList)
    {
      PassengerInfoInner passenger = new PassengerInfoInner();
      passenger.setFirstName(pass.getFirstName());
      passenger.setLastName(pass.getLastName());
      passenger.setPhoneNumber(pass.getPhoneNumber());
      passengerInfo.add(passenger);
    }
    resp.setPassengerInfo(passengerInfo);
    
    return new ResponseEntity(resp, HttpStatus.OK);
  }
}
