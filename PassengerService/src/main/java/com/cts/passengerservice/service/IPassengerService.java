package com.cts.passengerservice.service;

import com.cts.passengerservice.model.Passenger;
import java.util.List;

public abstract interface IPassengerService
{
  public abstract List<Passenger> getPassengerDetails(String paramString);
  
  public abstract String updatePhoneNumber(List<Passenger> paramList);
}
