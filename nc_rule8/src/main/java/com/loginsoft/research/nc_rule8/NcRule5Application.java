package com.loginsoft.research.nc_rule8;

import com.loginsoft.research.nc_rule8.scenario1.CompliantScenario1;
import com.loginsoft.research.nc_rule8.scenario1.NonCompliantScenario1;
import com.loginsoft.research.nc_rule8.scenario2.CompliantScenario2;
import com.loginsoft.research.nc_rule8.scenario2.NonCompliantScenario2;
import com.loginsoft.research.nc_rule8.scenario3.CompliantScenario3;
import com.loginsoft.research.nc_rule8.scenario3.NonCompliantScenario3;
import com.loginsoft.research.nc_rule8.scenario4.CompliantScenario4;
import com.loginsoft.research.nc_rule8.scenario4.NonCompliantScenario4;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class NcRule5Application implements CommandLineRunner {

	@Autowired
	private CompliantScenario1 compliantScenario1;

	@Autowired
	private CompliantScenario2 compliantScenario2;

	@Autowired
	private NonCompliantScenario1 nonCompliantScenario1;

	@Autowired
	private NonCompliantScenario2 nonCompliantScenario2;


	@Autowired
	private CompliantScenario3 compliantScenario3;

	@Autowired
	private NonCompliantScenario3 nonCompliantScenario3;

	@Autowired
	private CompliantScenario4 compliantScenario4;

	@Autowired
	private NonCompliantScenario4 nonCompliantScenario4;

	public static void main(String[] args) {
		SpringApplication.run(NcRule5Application.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		System.out.println("=== Running Non-Compliant Scenario 1 ===");
		nonCompliantScenario1.execute();

		System.out.println("=== Running Compliant Scenario 1 ===");
		compliantScenario1.execute();


		System.out.println("=== Running Non-Compliant Scenario 2 ===");
		nonCompliantScenario2.execute();

		System.out.println("=== Running Compliant Scenario 2 ===");
		compliantScenario2.execute();

		System.out.println("=== Running Non-Compliant Scenario 3 ===");
		nonCompliantScenario3.execute();

		System.out.println("=== Running Compliant Scenario 3 ===");
		compliantScenario3.execute();

		System.out.println("=== Running Non-Compliant Scenario 4 ===");
		nonCompliantScenario4.execute();

		System.out.println("=== Running Compliant Scenario 4 ===");
		compliantScenario4.execute();

	}
}
