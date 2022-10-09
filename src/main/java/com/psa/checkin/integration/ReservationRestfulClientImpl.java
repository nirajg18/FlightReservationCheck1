package com.psa.checkin.integration;

import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

import com.psa.checkin.dto.Reservation;
import com.psa.checkin.dto.ReservationUpdateRequest;


@Component
public class ReservationRestfulClientImpl implements ReservationRestfulClient {

	@Override
	public Reservation findReservation(Long id) {
		
		RestTemplate restTemplate = new RestTemplate();
		Reservation reservation = restTemplate.getForObject("http://localhost:8080/new_flights/reservation/"+id, Reservation.class);
		
		return reservation;
	}
	
	public Reservation updateReservation(ReservationUpdateRequest request) {
		RestTemplate restTemplate = new RestTemplate();
		Reservation reservation = restTemplate.postForObject("http://localhost:8080/new_flights/reservation", request, Reservation.class);
		return reservation;
	}

}
