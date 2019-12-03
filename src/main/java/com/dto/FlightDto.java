package com.dto;

public class FlightDto {
	private String To;
	private String From;

	public String getTo() {
		return To;
	}

	public void setTo(String to) {
		To = to;
	}

	public String getFrom() {
		return From;
	}

	public void setFrom(String from) {
		From = from;
	}

	@Override
	public String toString() {
		return "FlightDto [To=" + To + ", From=" + From + "]";
	}

}
