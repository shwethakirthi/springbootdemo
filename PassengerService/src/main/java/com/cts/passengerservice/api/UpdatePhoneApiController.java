package com.cts.passengerservice.api;

import com.cts.passengerservice.model.AdvisoryMessage;
import com.cts.passengerservice.model.Passenger;
import com.cts.passengerservice.model.PassengerInfo;
import com.cts.passengerservice.model.PassengerInfoInner;
import com.cts.passengerservice.model.RecordLocatorInfo;
import com.cts.passengerservice.model.UpdatePhoneRequest;
import com.cts.passengerservice.model.UpdatePhoneResponse;
import com.cts.passengerservice.service.IPassengerService;
import io.swagger.annotations.ApiParam;
import java.io.PrintStream;
import java.util.ArrayList;
import java.util.List;
import javax.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;

@Controller
public class UpdatePhoneApiController
  implements UpdatePhoneApi
{
  @Autowired
  IPassengerService passengerService;
  
  public ResponseEntity<UpdatePhoneResponse> updatePhone(@ApiParam(value="", required=true) @Valid @RequestBody UpdatePhoneRequest updateReq)
  {
    System.out.println("In Update" + updateReq.getRecordLocatorInfo().getPnrNo());
    
    String pnrNo = updateReq.getRecordLocatorInfo().getPnrNo();
    PassengerInfo passInfoList = updateReq.getPassengerInfo();
    List<Passenger> passengerList = null;
    if (passInfoList.size() > 0)
    {
      passengerList = new ArrayList();
      for (PassengerInfoInner passengerInner : passInfoList)
      {
        Passenger passenger = new Passenger();
        passenger.setFirstName(passengerInner.getFirstName());
        passenger.setLastName(passengerInner.getLastName());
        passenger.setPhoneNumber(passengerInner.getPhoneNumber());
        passenger.setPNRNumber(pnrNo);
        passengerList.add(passenger);
      }
    }
    String advisorymessage = this.passengerService.updatePhoneNumber(passengerList);
    UpdatePhoneResponse resp = new UpdatePhoneResponse();
    AdvisoryMessage advisoryMessage = new AdvisoryMessage();
    advisoryMessage.setFreeformText(advisorymessage);
    resp.setAdvisoryMessage(advisoryMessage);
    
    return new ResponseEntity(resp, HttpStatus.OK);
  }
}
