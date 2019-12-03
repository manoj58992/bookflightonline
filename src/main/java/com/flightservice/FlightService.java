package com.flightservice;

import com.dto.FlightDto;

public class FlightService {
	public FlightDto showDemoFlight() {
		FlightDto f = new FlightDto();
		f.setFrom("Virginia");
		f.setTo("Georgia");
		return f;

	}
}
