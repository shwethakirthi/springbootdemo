package com.cts.passengerservice.model;

public class Passenger
{
  String PNRNumber;
  String FirstName;
  String LastName;
  String PhoneNumber;
  
  public String getPNRNumber()
  {
    return this.PNRNumber;
  }
  
  public void setPNRNumber(String pNRNumber)
  {
    this.PNRNumber = pNRNumber;
  }
  
  public String getFirstName()
  {
    return this.FirstName;
  }
  
  public void setFirstName(String firstName)
  {
    this.FirstName = firstName;
  }
  
  public String getLastName()
  {
    return this.LastName;
  }
  
  public void setLastName(String lastName)
  {
    this.LastName = lastName;
  }
  
  public String getPhoneNumber()
  {
    return this.PhoneNumber;
  }
  
  public void setPhoneNumber(String phoneNumber)
  {
    this.PhoneNumber = phoneNumber;
  }
}
