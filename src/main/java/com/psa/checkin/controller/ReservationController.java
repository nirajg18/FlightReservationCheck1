package com.psa.checkin.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.psa.checkin.dto.Reservation;
import com.psa.checkin.dto.ReservationUpdateRequest;
import com.psa.checkin.integration.ReservationRestfulClient;

@Controller
public class ReservationController {
	
	@Autowired
	private ReservationRestfulClient restClient;
	
	@RequestMapping("/startCheckIn")
	public String startCheckIn() {
		return "startCheckIn";
	}
	
	@RequestMapping("/proceedCheckIn")
	public String proceedCheckIn(@RequestParam("id") Long id, ModelMap modelMap) {
		Reservation reservation = restClient.findReservation(id);
		modelMap.addAttribute("reservation", reservation);
		return "displayReservation";
	}
	
	@RequestMapping("/proceedToCheckIn")
	public String proceedToCheckIn(@RequestParam("id") Long id, @RequestParam("numberofBags") int numberofBags ) {
	    ReservationUpdateRequest request = new ReservationUpdateRequest();
		request.setId(id);
		request.setNumberofBags(numberofBags);
		request.setCheckInStatus(true);
		
        restClient.updateReservation(request);
		
		return "confirmReservation";
	}

}
