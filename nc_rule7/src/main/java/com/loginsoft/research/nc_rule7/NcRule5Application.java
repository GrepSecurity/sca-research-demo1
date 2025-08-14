package com.loginsoft.research.nc_rule7;

import com.loginsoft.research.nc_rule7.scenario1.Scenario1;
import com.loginsoft.research.nc_rule7.scenario2.Scenario2;
import com.loginsoft.research.nc_rule7.scenario3.Scenario3;
import com.loginsoft.research.nc_rule7.scenario4.Scenario4;
import com.loginsoft.research.nc_rule7.scenario5.Scenario5;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class NcRule5Application {

	public static void main(String[] args) {
		SpringApplication.run(NcRule5Application.class, args);

		System.out.println("=== Running Scenario 1 (Non-Compliant) ===");
		new Scenario1().processUsers();

		System.out.println("=== Running Scenario 2 (Non-Compliant) ===");
		new Scenario2().processCommand("START");

		System.out.println("=== Running Scenario 3 (Non-Compliant) ===");
		new Scenario3().readFileAndProcess("src/main/resources/sample.txt");

		System.out.println("=== Running Scenario 4 (Non-Compliant) ===");
		new Scenario4().validateProduct("iPhone", "electronics", 1200.0, 20, true);

		System.out.println("=== Running Scenario 5 (Non-Compliant) ===");
		new Scenario5().runSimulation();

	}

}
