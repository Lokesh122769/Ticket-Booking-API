package com.SpringRest.TicketBookingWebApp.Service;

import com.SpringRest.TicketBookingWebApp.reqAndRes.Passenger;
import com.SpringRest.TicketBookingWebApp.reqAndRes.Ticket;

public interface IBookingTicketService
{

	public Ticket bookTicket(Passenger passenger);
	
	public Ticket getFullTicket(Integer ticketNumber);
	
	
}
