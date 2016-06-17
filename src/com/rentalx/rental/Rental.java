package com.rentalx.rental;


import com.rentalx.account.Customer;
import com.rentalx.vehicle.Car;

import lombok.Data;

@Data
public class Rental {

	private Car car;
	private Customer customer;
	
}
