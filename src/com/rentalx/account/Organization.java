package com.rentalx.account;

import java.util.List;

import com.rentalx.rental.Rental;
import com.rentalx.vehicle.Car;

import lombok.Data;

@Data
public class Organization {
	
	private String companyName;
	private List<Rental> rentalList;
	private List<Car> carList;
	private List<Supplier> supplierList; 
	
}
