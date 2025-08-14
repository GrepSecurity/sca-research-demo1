package com.loginsoft.research.nc_rule9;

import com.loginsoft.research.nc_rule9.scenario1.CompliantScenario1;
import com.loginsoft.research.nc_rule9.scenario1.NonCompliantScenario1;
import com.loginsoft.research.nc_rule9.scenario2.CompliantScenario2;
import com.loginsoft.research.nc_rule9.scenario2.NonCompliantScenario2;
import com.loginsoft.research.nc_rule9.scenario3.CompliantScenario3;
import com.loginsoft.research.nc_rule9.scenario3.NonCompliantScenario3;
import com.loginsoft.research.nc_rule9.scenario4.NonCompliantScenario4;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class NcRule5Application {

	public static void main(String[] args) {
		SpringApplication.run(NcRule5Application.class, args);

		System.out.println("=== Running Scenario 1: Octal Literal Misinterpretation ===");
		NonCompliantScenario1.run();
		CompliantScenario1.run();
		System.out.println("=== Running Scenario 2: Octal Literal Misinterpretation ===");
		NonCompliantScenario2.run();
		CompliantScenario2.run();
		System.out.println("=== Running Scenario 3: Octal Literal Misinterpretation ===");
		NonCompliantScenario3.run();
		CompliantScenario3.run();
		System.out.println("=== Running Scenario 4: Octal Literal Misinterpretation ===");
		NonCompliantScenario4.run();

	}
}
