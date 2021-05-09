package com.cognizant;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class FlightManagementApplication {

	@ExcludeFromJacocoGeneratedReport
	public static void main(String[] args) {
		SpringApplication.run(FlightManagementApplication.class, args);
	}
//	mvn sonar:sonar -Dsonar.projectKey=flightManagement -Dsonar.host.url=http://localhost:9000 -Dsonar.login=14335a5a1591e72a570cdd45dae501bac6feb785
}
