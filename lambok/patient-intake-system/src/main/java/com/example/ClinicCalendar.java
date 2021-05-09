package com.example;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

public class ClinicCalendar {

	private List<PatientAppointment> appointments;

	public ClinicCalendar() {
		this.appointments = new ArrayList<>();
	}

	public void addAppointment(String patientFirstName, String patientLastName, String doctorKey, String dateTime) {
		Doctor doc = Doctor.valueOf(doctorKey.toLowerCase());
		LocalDateTime localDateTime;
		try {
			localDateTime = LocalDateTime.parse(dateTime.toUpperCase(),
					DateTimeFormatter.ofPattern("M/d/yyyy h:mm a", Locale.US));
		} catch (Throwable t) {
			throw new RuntimeException("Unable to create date time from");
		}
		PatientAppointment appointment = new PatientAppointment(patientFirstName, patientLastName, localDateTime, doc);
		appointments.add(appointment);
	}

	public List<PatientAppointment> getAppointments() {
		return this.appointments;
	}

}