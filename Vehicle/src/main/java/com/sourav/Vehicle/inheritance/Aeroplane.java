package com.sourav.Vehicle.inheritance;

import javax.persistence.Entity;

@Entity
public class Aeroplane extends Vehicle {
 private String Company;
 private int seatingCapacity;
 private int Fare;

public Aeroplane(int id, String ttype, String color, String company, int seatingCapacity, int fare) {
	super(id, ttype, color);
	Company = company;
	this.seatingCapacity = seatingCapacity;
	Fare = fare;
}

public Aeroplane() {
	super();
	// TODO Auto-generated constructor stub
}

public Aeroplane(int id, String ttype, String color) {
	super(id, ttype, color);
	// TODO Auto-generated constructor stub
}

public String getCompany() {
	return Company;
}
public void setCompany(String company) {
	Company = company;
}
public int getSeatingCapacity() {
	return seatingCapacity;
}
public void setSeatingCapacity(int seatingCapacity) {
	this.seatingCapacity = seatingCapacity;
}
public int getFare() {
	return Fare;
}
public void setFare(int fare) {
	Fare = fare;
}
@Override
public String toString() {
	return "Aeroplane [Company=" + Company + ", seatingCapacity=" + seatingCapacity + ", Fare=" + Fare + "]";
}
 
}
