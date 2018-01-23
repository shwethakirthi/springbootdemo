package com.cts.passengerservice.dao;

import com.cts.passengerservice.model.Passenger;
import java.io.PrintStream;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

@Repository
public class PassengerDAO
  implements IPassengerDAO
{
  @Autowired
  private JdbcTemplate jdbcTemplate;
  
  public void updatePhoneNumber(Passenger passenger)
  {
    String SQL = "update passengerdetails SET PhoneNumber = ?  where PNRNumber = ? and FirstName = ? and LastName =?";
    this.jdbcTemplate.update(SQL, new Object[] { passenger.getPhoneNumber(), passenger.getPNRNumber(), passenger.getFirstName(), passenger.getLastName() });
    System.out.println("Updated Record with PnrNumber = " + passenger.getPNRNumber());
  }
  
  public List<Passenger> getPassengerDetails(String pnrRecordLocator)
  {
    System.out.println("In DB getPassengerDetails");
    String sql = "SELECT FirstName,LastName,PhoneNumber, PNRNumber FROM passengerdetails WHERE PNRNumber = ?";
    List<Passenger> passengerList = this.jdbcTemplate.query(sql, new Object[] { pnrRecordLocator }, new PassengerRowMapper());
    for (Passenger pass : passengerList) {
      System.out.println("passenger FirstName " + pass.getFirstName());
    }
    return passengerList;
  }
}
