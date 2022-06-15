package com.sourav.Vehicle.inheritance;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.Table;

@Entity
@Table(name="VEHICLEDATA")  
@Inheritance(strategy=InheritanceType.SINGLE_TABLE)  
//@Inheritance(strategy=InheritanceType.JOINED)  
//@Inheritance(strategy=InheritanceType.TABLE_PER_CLASS)  

public class Vehicle implements Serializable {
	@Id 
	@Column(name="VehicleID")
		private int id;
		private String ttype;
		private String color;
		public Vehicle(int id, String ttype, String color) {
			super();
			this.id = id;
			this.ttype = ttype;
			this.color = color;
		}
		public Vehicle() {
			super();
			// TODO Auto-generated constructor stub
		}
		public int getId() {
			return id;
		}
		public void setId(int id) {
			this.id = id;
		}
		public String getTtype() {
			return ttype;
		}
		public void setTtype(String ttype) {
			this.ttype = ttype;
		}
		public String getColor() {
			return color;
		}
		public void setColor(String color) {
			this.color = color;
		}
		@Override
		public String toString() {
			return "Vehicle [id=" + id + ", ttype=" + ttype + ", color=" + color + "]";
		}

}
