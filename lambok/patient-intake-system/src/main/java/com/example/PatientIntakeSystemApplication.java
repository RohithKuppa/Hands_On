package com.example;

import java.time.format.DateTimeFormatter;
import java.util.Scanner;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class PatientIntakeSystemApplication {
	private static ClinicCalendar calendar;

	@ExcludeFromJacocoGeneratedReport
	public static void main(String[] args) throws Throwable {
		ApplicationContext ctx = SpringApplication.run(PatientIntakeSystemApplication.class, args);
		calendar = new ClinicCalendar();
		Scanner scanner = new Scanner(System.in);
		System.out.println("Welcome to the Patient Intake Computer System!\n\n");
		String lastOption = "";
		while (!lastOption.equalsIgnoreCase("x")) {
			lastOption = displayMenu(scanner);
		}
		System.out.println("\nExiting System...\n");
	}

	@ExcludeFromJacocoGeneratedReport
	private static String displayMenu(Scanner scanner) throws Throwable {
		System.out.println("Please select an option:");
		System.out.println("1. Enter a Patient Appointment");
		System.out.println("2. View All Appointments");
		System.out.println("X.  Exit System.");
		System.out.print("Option: ");
		String option = scanner.next();
		switch (option) {
		case "1":
			performPatientEntry(scanner);
			return option;
		case "2":
			performAllAppointments();
			return option;
		default:
			System.out.println("Invalid option, please re-enter.");
			return option;
		}
	}

	@ExcludeFromJacocoGeneratedReport
	private static void performPatientEntry(Scanner scanner) {
		scanner.nextLine();
		System.out.println("\n\nPlease Enter Appointment Info:");
		System.out.print("  Patient Last Name: ");
		String lastName = scanner.nextLine();
		System.out.print("  Patient First Name: ");
		String firstName = scanner.nextLine();
		System.out.print("  Appointment Date (M/d/yyyy h:m a): ");
		String when = scanner.nextLine();
		System.out.print("  Doctor Last Name: ");
		String doc = scanner.nextLine();
		try {
			calendar.addAppointment(firstName, lastName, doc, when);
		} catch (Throwable t) {
			System.out.println("Error!  " + t.getMessage());
			return;
		}
		System.out.println("Patient entered successfully.\n\n");
	}

	@ExcludeFromJacocoGeneratedReport
	private static void performAllAppointments() throws Throwable {
		System.out.println("\n\nAll Appointments in System:");
		for (PatientAppointment appointment : calendar.getAppointments()) {
			DateTimeFormatter formatter = DateTimeFormatter.ofPattern("M/d/yyyy hh:mm a");
			String apptTime = formatter.format(appointment.getAppointmentDateTime());
			System.out.println(String.format("%s:  %s, %s\t\tDoctor: %s", apptTime, appointment.getPatientLastName(),
					appointment.getPatientFirstName(), appointment.getDoctor().getName()));
		}
		System.out.println("\nPress any key to continue...");
		System.in.read();
		System.out.println("\n\n");
	}
}
