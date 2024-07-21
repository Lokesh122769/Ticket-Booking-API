package com.telusko.TicketBookingApp.service;

import com.telusko.TicketBookingApp.Model.Passenger;

public interface ITicketBookingService
{
    public Passenger registerPassengerDetails(Passenger passenger);
    
    public Passenger fetcPassesgerDetails(Integer id);
}
