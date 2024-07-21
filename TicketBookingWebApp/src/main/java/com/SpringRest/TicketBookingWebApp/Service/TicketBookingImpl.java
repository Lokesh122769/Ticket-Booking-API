package com.SpringRest.TicketBookingWebApp.Service;

import java.net.URI;

import org.eclipse.jdt.internal.compiler.ast.Block;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.reactive.function.client.WebClient;

import com.SpringRest.TicketBookingWebApp.reqAndRes.Passenger;
import com.SpringRest.TicketBookingWebApp.reqAndRes.Ticket;


@Service
public class TicketBookingImpl implements IBookingTicketService
{

	private static final String POST_URI = "http://localhost:9292/api-bookticket/getTicketNumber";
	private static final String GET_URI = "http://localhost:9292/api-bookticket/getticket/{ticketnumber}";

	@Override
	public Ticket bookTicket(Passenger passenger)
	{
		//RestTemplate restApi=new RestTemplate();
		
		//ResponseEntity<Ticket> t=restApi.postForEntity(POST_URI, passenger, Ticket.class );
		
		
		Ticket ticket = WebClient.create().
		post().uri(POST_URI)
		.bodyValue(passenger)
		.retrieve()
		.bodyToMono(Ticket.class)
		.block();
		
		return ticket;
		
	}

	@Override
	public Ticket getFullTicket(Integer ticketNumber)
	{
		
		//RestTemplate rt=new RestTemplate();
		//Ticket re = rt.getForObject(GET_URI, Ticket.class,ticketNumber);
		
		Ticket te = WebClient.create()
		.get()
		.uri(GET_URI,ticketNumber)
		.retrieve()
		.bodyToMono(Ticket.class)
		.block();
		
		return te;
	}

}
