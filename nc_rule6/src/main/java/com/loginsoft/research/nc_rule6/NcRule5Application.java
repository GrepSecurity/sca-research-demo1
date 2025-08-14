package com.loginsoft.research.nc_rule6;


import com.loginsoft.research.nc_rule6.scenario4.NonCompliant_FinalizeViaReflection;
import com.loginsoft.research.nc_rule6.scenario2.*;
import com.loginsoft.research.nc_rule6.scenario3.*;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.event.ApplicationReadyEvent;
import org.springframework.context.event.EventListener;

@SpringBootApplication
public class NcRule5Application {

	public static void main(String[] args) {
		SpringApplication.run(NcRule5Application.class, args);


	}
	@EventListener(ApplicationReadyEvent.class)
	public void triggerScenarios() {


		System.out.println("\nRunning Scenario 2:");
		new NonCompliant_PrivateFinalizeMethod().trigger();

		System.out.println("\nRunning Scenario 3:");
		new NonCompliant_EmptyFinalizeWithNoise().trigger();

		System.out.println("\nRunning Scenario 4:");
		new NonCompliant_FinalizeViaReflection().trigger();
	}

}
