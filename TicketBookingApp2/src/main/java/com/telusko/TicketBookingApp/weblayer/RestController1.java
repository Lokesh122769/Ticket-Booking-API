package com.telusko.TicketBookingApp.weblayer;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.telusko.TicketBookingApp.Model.Passenger;
import com.telusko.TicketBookingApp.Model.Ticket;
import com.telusko.TicketBookingApp.service.ITicketBookingService;

@RestController
@RequestMapping("/api-bookticket")
public class RestController1
{
    @Autowired
	private ITicketBookingService service;
	
    @PostMapping("/getTicketNumber")
    public ResponseEntity<Ticket> registerPassenger(@RequestBody Passenger passenger)
    {
    	Passenger p1=service.registerPassengerDetails(passenger);
    	Ticket t1=new Ticket();
    	t1.setTicketnumber(p1.getId());
    	return new ResponseEntity<Ticket>(t1, HttpStatus.OK);
    }
    
    
    @GetMapping("/getticket/{ticketnumber}")
    public ResponseEntity<Ticket> getFullTicket(@PathVariable("ticketnumber") Integer id)
    {
    	Ticket t1=new Ticket();
    	Passenger pass1=service.fetcPassesgerDetails(id);
    	t1.setStatus("Ticket Confirmed");
    	t1.setTicketcost(799.9);
    	t1.setName(pass1.getName());
    	t1.setDeparture(pass1.getDeparture());
    	t1.setArrival(pass1.getArrival());
    	t1.setDateOfjourney(pass1.getdateOfjourney());
    	t1.setTicketnumber(pass1.getId());
    	
    	return new ResponseEntity<Ticket>(t1,HttpStatus.OK);
    }
    
}
