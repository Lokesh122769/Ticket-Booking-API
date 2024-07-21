package com.telusko.TicketBookingApp.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.telusko.TicketBookingApp.Model.Passenger;
import com.telusko.TicketBookingApp.dao.ITicketRepo;



@Service
public class TicketBookingImpl implements ITicketBookingService
{

	@Autowired
	private ITicketRepo repo;
	
	
	@Override
	public Passenger registerPassengerDetails(Passenger passenger)
	{
		return repo.save(passenger);
	}

	@Override
	public Passenger fetcPassesgerDetails(Integer id)
	{
		return repo.findById(id).get();
	}

}
