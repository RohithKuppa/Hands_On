package com.cognizant.model;

import java.util.List;

import com.cognizant.exception.InvalidFlightIOperationException;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import lombok.extern.slf4j.Slf4j;

@Slf4j
@Getter
@Setter
@ToString
public class Flight {
	private int id;
	private String flightType;
	private List<Passenger> passengers;

	public boolean addpassenger(Passenger passenger) throws InvalidFlightIOperationException {

		if (flightType.equalsIgnoreCase("economy")) {
			passengers.add(passenger);
			return true;
		} else {
			if (passenger.isVip()) {
				passengers.add(passenger);
				return true;
			} else {
				throw new InvalidFlightIOperationException("Cannot add");
			}
		}

	}

	public boolean removePassenger(Passenger passenger) throws InvalidFlightIOperationException {
		if (passenger.isVip()) {
			log.error("Cannot remove passenger");
			throw new InvalidFlightIOperationException("Invalid Operation");
		} else {
			passengers.remove(passenger);
			return true;
		}

	}

}
