package com.telusko.TicketBookingApp.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.telusko.TicketBookingApp.Model.Passenger;


@Repository
public interface ITicketRepo extends JpaRepository<Passenger, Integer>
{

}
