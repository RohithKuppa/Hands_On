package com.example;

import java.time.LocalDateTime;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
public class PatientAppointment {

	private String patientFirstName;
	private String patientLastName;
	private LocalDateTime appointmentDateTime;
	private Doctor doctor;

}