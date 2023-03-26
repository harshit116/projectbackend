package com.flyaway.model;

public class Flight {
private String date;
private String source;
private String destination;
private int flight_id;
private String airline;
private int price;
private int person;
public int getFlight_id() {
	return flight_id;
}
public void setFlight_id(int flight_id) {
	this.flight_id = flight_id;
}
public String getAirline() {
	return airline;
}
public int getPerson() {
	return person;
}
public void setPerson(int person) {
	this.person = person;
}
public void setAirline(String airline) {
	this.airline = airline;
}
public int getPrice() {
	return price;
}
public void setPrice(int price) {
	this.price = price;
}

public String getDate() {
	return date;
}
public void setDate(String date) {
	this.date = date;
}
public String getSource() {
	return source;
}
public void setSource(String source) {
	this.source = source;
}
public String getDestination() {
	return destination;
}
public void setDestination(String destination) {
	this.destination = destination;
}

public Flight() {}
public Flight(int flightId, String date, String airline,int price,int person) {
	
	this.flight_id = flightId;
	this.date = date;
	this.airline = airline;
	this.price=price;
	this.person=person;
	
}

public Flight(int flightId,String source, String destination, String date, String airline,int price,String person) {
	
	this.flight_id = flightId;
	this.source=source;
	this.destination=destination;
	this.date = date;
	this.airline = airline;
	this.price=price;
	this.person=Integer.parseInt(person);
	
}
public Flight(int flightId,String source, String destination, String airline,int price) {
	
	this.flight_id = flightId;
	this.source=source;
	this.destination=destination;
	
	this.airline = airline;
	this.price=price;
	
	
}
}
