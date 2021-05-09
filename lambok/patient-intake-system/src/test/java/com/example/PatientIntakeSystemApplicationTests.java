package com.example;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

import java.time.format.DateTimeFormatter;
import java.util.List;
import java.util.Locale;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class PatientIntakeSystemApplicationTests {

	@Test
	void allowEntryOfAnAppointment() {
		ClinicCalendar calendar = new ClinicCalendar();
		String t = "Unable to create date time from";
		calendar.addAppointment("Jim", "Weaver", "avery", "09/01/2018 2:00 pm");

		List<PatientAppointment> appointments = calendar.getAppointments();
		assertNotNull(appointments);
		assertEquals(1, appointments.size());
		PatientAppointment enteredAppt = appointments.get(0);
		assertEquals("Jim", enteredAppt.getPatientFirstName());
		assertEquals("Weaver", enteredAppt.getPatientLastName());
		assertEquals(Doctor.avery, enteredAppt.getDoctor());
		assertEquals("9/1/2018 02:00 PM", enteredAppt.getAppointmentDateTime()
				.format(DateTimeFormatter.ofPattern("M/d/yyyy hh:mm a", Locale.US)));
	}

}

//mvn sonar:sonar -Dsonar.projectKey=patient -Dsonar.host.url=http://localhost:9000 -Dsonar.login=81179f010f5944fadb02cb6c45ae32e0427dfb72