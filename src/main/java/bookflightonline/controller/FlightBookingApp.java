package bookflightonline.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.dto.FlightDto;
import com.flightservice.FlightService;


@Controller
public class FlightBookingApp {
	private FlightService flightservice;
	
	@RequestMapping(value = "index", method = RequestMethod.GET)
	public ModelAndView showpage() {
		System.out.println("I am inside the vehicle API");
		FlightDto f = flightservice.showDemoFlight();
		System.out.println(f.toString());

		ModelAndView mv = new ModelAndView("index");
		mv.addObject("flightObj", f);
		return mv;
	}
	@RequestMapping(value = "process-flight", method = RequestMethod.POST)
	public ModelAndView saveFlight(FlightDto index) {
		System.out.println(index.toString());

		ModelAndView mv = new ModelAndView("index");
		mv.addObject("flyObj", index);
		return mv;
	}
	public FlightService getFlightservice() {
		return flightservice;
	}
	public void setFlightservice(FlightService flightservice) {
		this.flightservice = flightservice;
	}
	
}


