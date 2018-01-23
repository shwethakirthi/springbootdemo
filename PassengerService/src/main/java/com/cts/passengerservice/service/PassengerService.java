package com.cts.passengerservice.service;

import com.cts.passengerservice.dao.IPassengerDAO;
import com.cts.passengerservice.model.Passenger;
import java.io.PrintStream;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PassengerService
  implements IPassengerService
{
  @Autowired
  private IPassengerDAO passengerDAO;
  
  public List<Passenger> getPassengerDetails(String PnrRecordLocator)
  {
    System.out.println("getPassengerDetails Service");
    
    return this.passengerDAO.getPassengerDetails(PnrRecordLocator);
  }
  
  public String updatePhoneNumber(List<Passenger> passengerlst)
  {
    String pnrNo = "";
    for (Passenger passenger : passengerlst)
    {
      pnrNo = passenger.getPNRNumber();
      this.passengerDAO.updatePhoneNumber(passenger);
    }
    String advisoryMessage = "Phone Number updated for " + pnrNo;
    return advisoryMessage;
  }
}
