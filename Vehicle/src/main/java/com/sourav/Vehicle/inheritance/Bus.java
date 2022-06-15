package com.sourav.Vehicle.inheritance;

import javax.persistence.Entity;

@Entity
public class Bus extends Vehicle {
	private String type;
	private int seatingCapcity;
	private String Source;
	private String Destination;
	
	public Bus(int id, String ttype, String color, String type, int seatingCapcity, String source, String destination) {
		super(id, ttype, color);
		this.type = type;
		this.seatingCapcity = seatingCapcity;
		Source = source;
		Destination = destination;
	}
	
	public Bus() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Bus(int id, String ttype, String color) {
		super(id, ttype, color);
		// TODO Auto-generated constructor stub
	}

	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public int getSeatingCapcity() {
		return seatingCapcity;
	}
	public void setSeatingCapcity(int seatingCapcity) {
		this.seatingCapcity = seatingCapcity;
	}
	public String getSource() {
		return Source;
	}
	public void setSource(String source) {
		Source = source;
	}
	public String getDestination() {
		return Destination;
	}
	public void setDestination(String destination) {
		Destination = destination;
	}
	@Override
	public String toString() {
		return "Bus [type=" + type + ", seatingCapcity=" + seatingCapcity + ", Source=" + Source + ", Destination="
				+ Destination + "]";
	}
	
}
