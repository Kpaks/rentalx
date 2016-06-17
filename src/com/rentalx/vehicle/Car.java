package com.rentalx.vehicle;
import java.util.List;
import lombok.Data;

@Data
public class Car {

	private List<Traffic> trafficList;
	private List<Maintance> maintanceList;
	private List<CarDocument> carDocumentList;
	
}
