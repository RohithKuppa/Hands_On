package com.cognizant;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.util.ArrayList;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import com.cognizant.model.Flight;
import com.cognizant.model.Passenger;

//@SpringBootTest
class FlightManagementApplicationTests {

	Passenger vpassenger = new Passenger();
	Passenger passenger = new Passenger();
	Flight Eflight = new Flight();
	Flight Bflight = new Flight();

	@BeforeEach
	void setup() {

		vpassenger.setName("Test");
		vpassenger.setVip(true);
		passenger.setName("Test1");
		passenger.setVip(false);

		Eflight.setId(1);
		Eflight.setFlightType("economy");
		Eflight.setPassengers(new ArrayList<>());
		Bflight.setId(2);
		Bflight.setFlightType("business");

	}

	@Test
	void testAddVipPassengerToEconomyFlight() {
		vpassenger.setName("Test");
		vpassenger.setVip(true);
		passenger.setName("Test1");
		passenger.setVip(false);

		Eflight.setId(1);
		Eflight.setFlightType("economy");
		Eflight.setPassengers(new ArrayList<>());
		Bflight.setId(2);
		Bflight.setFlightType("business");
		try {
			assertTrue(Eflight.addpassenger(vpassenger));
		} catch (Exception e) {
			//
		}
	}

	@Test
	void testAddVippassengerToBusinessFlight() {
		vpassenger.setName("Test");
		vpassenger.setVip(true);
		passenger.setName("Test1");
		passenger.setVip(false);

		Eflight.setId(1);
		Eflight.setFlightType("economy");
		Eflight.setPassengers(new ArrayList<>());
		Bflight.setId(2);
		Bflight.setFlightType("business");
		try {
			assertTrue(Bflight.addpassenger(vpassenger));
		} catch (Exception e) {

		}
	}

	@Test
	void testAddnonviptoEconomyFlight() {
		vpassenger.setName("Test");
		vpassenger.setVip(true);
		passenger.setName("Test1");
		passenger.setVip(false);

		Eflight.setId(1);
		Eflight.setFlightType("economy");
		Eflight.setPassengers(new ArrayList<>());
		Bflight.setId(2);
		Bflight.setFlightType("business");
		try {
			assertTrue(Eflight.addpassenger(passenger));
		} catch (Exception e) {

		}
	}

	@Test
	void testAddnonviptoBusinessFlight() {
		vpassenger.setName("Test");
		vpassenger.setVip(true);
		passenger.setName("Test1");
		passenger.setVip(false);

		Eflight.setId(1);
		Eflight.setFlightType("economy");
		Eflight.setPassengers(new ArrayList<>());
		Bflight.setId(2);
		Bflight.setFlightType("business");
		try {
			assertTrue(Bflight.addpassenger(passenger));
		} catch (Exception e) {

		}
	}

	@Test
	void testRemoveVipPassengerFromEconomy() {
		vpassenger.setName("Test");
		vpassenger.setVip(true);
		passenger.setName("Test1");
		passenger.setVip(false);

		Eflight.setId(1);
		Eflight.setFlightType("economy");
		Eflight.setPassengers(new ArrayList<>());
		Bflight.setId(2);
		Bflight.setFlightType("business");
		try {
			assertTrue(Eflight.removePassenger(vpassenger));
		} catch (Exception e) {

		}
	}

	@Test
	void testRemoveVipPassengerFromBusiness() {
		vpassenger.setName("Test");
		vpassenger.setVip(true);
		passenger.setName("Test1");
		passenger.setVip(false);

		Eflight.setId(1);
		Eflight.setFlightType("economy");
		Eflight.setPassengers(new ArrayList<>());
		Bflight.setId(2);
		Bflight.setFlightType("business");
		try {
			assertTrue(Bflight.removePassenger(vpassenger));
		} catch (Exception e) {

		}
	}

	@Test
	void testRemovePassengerFromEconomy() {
		vpassenger.setName("Test");
		vpassenger.setVip(true);
		passenger.setName("Test1");
		passenger.setVip(false);

		Eflight.setId(1);
		Eflight.setFlightType("economy");
		Eflight.setPassengers(new ArrayList<>());
		Bflight.setId(2);
		Bflight.setFlightType("business");
		try {
			assertTrue(Eflight.removePassenger(passenger));
		} catch (Exception e) {

		}
	}

	@Test
	void testRemovePassengerFromBusiness() {
		vpassenger.setName("Test");
		vpassenger.setVip(true);
		passenger.setName("Test1");
		passenger.setVip(false);

		Eflight.setId(1);
		Eflight.setFlightType("economy");
		Eflight.setPassengers(new ArrayList<>());
		Bflight.setId(2);
		Bflight.setFlightType("business");
		try {
			assertTrue(Bflight.removePassenger(passenger));
		} catch (Exception e) {

		}
	}

	@Test
	void Testrandom() {
		assertNotNull(Eflight.toString());

		assertNotNull(passenger.toString());
		assertEquals(passenger.getName(), "Test1");
		FlightManagementApplication f = new FlightManagementApplication();

	}

}
