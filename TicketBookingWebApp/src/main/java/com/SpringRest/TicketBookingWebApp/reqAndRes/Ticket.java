package com.SpringRest.TicketBookingWebApp.reqAndRes;

public class Ticket
{
    private Integer ticketnumber;
    
    private String status;
    
    private Double ticketcost;
    
    private String name;
	
	private String departure;
	
	private String arrival;
	
	private String dateOfjourney;

	public Ticket() {
		super();
	}

	public Ticket(Integer ticketnumber, String status, Double ticketcost, String name, String departure, String arrival,
			String dateOfjourney) {
		super();
		this.ticketnumber = ticketnumber;
		this.status = status;
		this.ticketcost = ticketcost;
		this.name = name;
		this.departure = departure;
		this.arrival = arrival;
		this.dateOfjourney = dateOfjourney;
	}

	public Integer getTicketnumber() {
		return ticketnumber;
	}

	public void setTicketnumber(Integer ticketnumber) {
		this.ticketnumber = ticketnumber;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public Double getTicketcost() {
		return ticketcost;
	}

	public void setTicketcost(Double ticketcost) {
		this.ticketcost = ticketcost;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDeparture() {
		return departure;
	}

	public void setDeparture(String departure) {
		this.departure = departure;
	}

	public String getArrival() {
		return arrival;
	}

	public void setArrival(String arrival) {
		this.arrival = arrival;
	}

	public String getDateOfjourney() {
		return dateOfjourney;
	}

	public void setDateOfjourney(String dateOfjourney) {
		this.dateOfjourney = dateOfjourney;
	}

	@Override
	public String toString() {
		return "Ticket [ticketnumber=" + ticketnumber + ", status=" + status + ", ticketcost=" + ticketcost + ", name="
				+ name + ", departure=" + departure + ", arrival=" + arrival + ", dateOfjourney=" + dateOfjourney + "]";
	}
	
	
	
}
