package com.loginsoft.research.nc_rule5;

import com.loginsoft.research.nc_rule5.scenario1.CompliantShapeCasting;
import com.loginsoft.research.nc_rule5.scenario1.NonCompliantShapeCasting;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.event.ApplicationReadyEvent;
import org.springframework.context.event.EventListener;
import org.springframework.web.client.RestTemplate;
import com.loginsoft.research.nc_rule5.scenario3.NonCompliantListCast;
import com.loginsoft.research.nc_rule5.scenario3.CompliantListCast;
import com.loginsoft.research.nc_rule5.scenario4.NonCompliantThymeleafAccess;
import com.loginsoft.research.nc_rule5.scenario4.CompliantThymeleafAccess;
import com.loginsoft.research.nc_rule5.scenario5.*;

@SpringBootApplication
public class NcRule5Application {

	public static void main(String[] args) {
		SpringApplication.run(NcRule5Application.class, args);
	}

	@EventListener(ApplicationReadyEvent.class)
	public void runAfterStartup() {
		System.out.println("\n==== Running Rule 5 Scenarios ====\n");

		// Scenario 1: Polymorphic cast (non-array)
		new NonCompliantShapeCasting().runScenario();
		new CompliantShapeCasting().runScenario();

		// Scenario 2: Trigger controller endpoints via HTTP after server is ready
		try {
			RestTemplate restTemplate = new RestTemplate();

			System.out.println("[NcRule5Application] Sending request to /api/noncompliant/cast...");
			String response1 = restTemplate.getForObject(
					"http://localhost:8080/api/noncompliant/cast?input=hello", String.class);
			System.out.println("[NcRule5Application] Response (noncompliant): " + response1);

			System.out.println("[NcRule5Application] Sending request to /api/compliant/cast...");
			String response2 = restTemplate.getForObject(
					"http://localhost:8080/api/compliant/cast?input=123", String.class);
			System.out.println("[NcRule5Application] Response (compliant): " + response2);

		} catch (Exception ex) {
			System.err.println("[NcRule5Application] HTTP call failed: " + ex.getMessage());
		}
		new NonCompliantListCast().runScenario();
		new CompliantListCast().runScenario();

		new NonCompliantThymeleafAccess().runScenario();
		new CompliantThymeleafAccess().runScenario();

		new NonCompliantGraphQLFetcher().runScenario();
		new CompliantGraphQLFetcher().runScenario();
	}

}
