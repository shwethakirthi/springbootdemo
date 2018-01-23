package com.cts.passengerservice.dao;

import com.cts.passengerservice.model.Passenger;
import java.sql.ResultSet;
import java.sql.SQLException;
import org.springframework.jdbc.core.RowMapper;

public class PassengerRowMapper
  implements RowMapper<Passenger>
{
  public Passenger mapRow(ResultSet row, int rownum)
    throws SQLException
  {
    Passenger passenger = new Passenger();
    passenger.setFirstName(row.getString("FirstName"));
    passenger.setLastName(row.getString("LastName"));
    passenger.setPhoneNumber(row.getString("PhoneNumber"));
    passenger.setPNRNumber(row.getString("PNRNumber"));
    
    return passenger;
  }
}
