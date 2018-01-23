package com.cts.passengerservice.dao;

import com.cts.passengerservice.model.Passenger;
import java.util.List;

public abstract interface IPassengerDAO
{
  public abstract void updatePhoneNumber(Passenger paramPassenger);
  
  public abstract List<Passenger> getPassengerDetails(String paramString);
}
