package com.loginsoft.research.nc_rule4;

import com.loginsoft.research.nc_rule4.scenario1.Compliant1;
import com.loginsoft.research.nc_rule4.scenario1.NonCompliant1;
import com.loginsoft.research.nc_rule4.scenario2.NonCompliant2;
import com.loginsoft.research.nc_rule4.scenario2.Compliant2;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import com.loginsoft.research.nc_rule4.scenario3.Compliant3;
import com.loginsoft.research.nc_rule4.scenario3.NonCompliant3;
import com.loginsoft.research.nc_rule4.scenario4.Compliant4;
import com.loginsoft.research.nc_rule4.scenario4.NonCompliant4;
import com.loginsoft.research.nc_rule4.scenario5.Compliant5;
import com.loginsoft.research.nc_rule4.scenario5.NonCompliant5;
import reactor.blockhound.BlockHound;

import com.loginsoft.research.nc_rule4.scenario6.Compliant6;
import com.loginsoft.research.nc_rule4.scenario6.NonCompliant6;

import java.io.IOException;


@SpringBootApplication
public class NcRule4Application {
	public static void main(String[] args) {
//		BlockHound.install();
		SpringApplication.run(NcRule4Application.class, args);
		System.out.println("=== Running Scenario 1: Method misuse ===");

		try {
			new NonCompliant1().run();
		} catch (Exception ex) {
			System.out.println("[NonCompliant1] Exception caught: " + ex.getClass().getSimpleName() + " - " + ex.getMessage());
		}

		new Compliant1().run();

		System.out.println("=== Running Scenario 2: Optional.of(null) misuse ===");

		try {
			new NonCompliant2().run();
		} catch (Exception e) {
			System.out.println("[NonCompliant2] Exception caught: " + e.getClass().getSimpleName() + " - " + e.getMessage());
		}

		new Compliant2().run();

		System.out.println("=== Running Scenario 3: Thread.start() misuse ===");

		try {
			new NonCompliant3().run();
		} catch (Exception e) {
			System.out.println("[NonCompliant3] Exception caught: " + e.getClass().getSimpleName() + " - " + e.getMessage());
		}

		new Compliant3().run();

		System.out.println("=== Running Scenario 4: Stream reuse ===");

		try {
			new NonCompliant4().run();
		} catch (Exception e) {
			System.out.println("[NonCompliant4] Exception caught: " + e.getClass().getSimpleName() + " - " + e.getMessage());
		}

		new Compliant4().run();

		System.out.println("=== Running Scenario 5: Mono.block() in reactive flow ===");

		try {
			new NonCompliant5().run();
		} catch (Exception e) {
			System.out.println("[NonCompliant5] Exception caught: " + e.getClass().getSimpleName() + " - " + e.getMessage());
		}

		new Compliant5().run();

		System.out.println("=== Running Scenario 6: IllegalArgumentException + IllegalStateException ===");

        try {
            new NonCompliant6().run();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        new Compliant6().run();


	}
}
