package com.SpringRest.TicketBookingWebApp.Controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.SpringRest.TicketBookingWebApp.Service.IBookingTicketService;
import com.SpringRest.TicketBookingWebApp.reqAndRes.Passenger;
import com.SpringRest.TicketBookingWebApp.reqAndRes.Ticket;

@Controller
public class TicketbookingController
{
	@Autowired 
    private  IBookingTicketService service;
	
	@PostMapping("/book-ticket")
	public String bookTicket( @ModelAttribute("passenger") Passenger passenger,Model model )
	{
		Ticket t1=service.bookTicket(passenger);
		model.addAttribute("ticketnumber", t1.getTicketnumber());
		
		
		return "ticketnumber";
	}
	
	@GetMapping("/getform")
	public String getForm( @ModelAttribute("passenger") Passenger passenger,Model model )
	{
		
		model.addAttribute("ticketnumber", new Passenger());
		
		return "form";
	}
	
	
	@GetMapping("/getfullticket/{id}")
	public String getForm(Model model ,@PathVariable("id") Integer id)
	{
		
		Ticket tf=service.getFullTicket(id);
		model.addAttribute("ticket", tf);
		System.out.println("Ticket Fetched Successfully");
		return "ticket";
	}
}
