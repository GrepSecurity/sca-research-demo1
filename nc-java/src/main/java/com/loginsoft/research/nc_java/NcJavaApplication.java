package com.loginsoft.research.nc_java;

import com.loginsoft.research.nc_java.threads.*;
import com.loginsoft.research.nc_java.threads.RunCalledInLoop;
import com.loginsoft.research.nc_java.threads.OverriddenRunCalledDirectly;
import com.loginsoft.research.nc_java.threads.obfuscated.Scenario7ReflectionBypass;
import com.loginsoft.research.nc_java.threads.scenario.ComplexWorkerScenario;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class NcJavaApplication implements CommandLineRunner {

	@Autowired
	private DirectRunExample directRunExample;

	@Autowired
	private HiddenRunCall hiddenRunCall;

	@Autowired
	private Scenario7ReflectionBypass scenario7ReflectionBypass;

	@Autowired
	private OverriddenRunCalledDirectly overriddenRunCalledDirectly;

	@Autowired
	private RunCalledInLoop runCalledInLoop;

	@Autowired
	private RunnableRunCalled runnableRunCalled;

	@Autowired
	private ComplexWorkerScenario complexWorkerScenario;

	public static void main(String[] args) {
		SpringApplication.run(NcJavaApplication.class, args);
	}

	@Override
	public void run(String... args) {
		System.out.println("========== NON-COMPLIANT THREAD.RUN() EXAMPLES ==========");
		System.out.println("========== Scenario -1 ==========");
		directRunExample.runExample();
		System.out.println("========== Scenario -2 ==========");

		overriddenRunCalledDirectly.runExample();
		System.out.println("========== Scenario -3 ==========");
		runCalledInLoop.runExample();
		System.out.println("========== Scenario -4 ==========");
		hiddenRunCall.runExample();
		System.out.println("========== Scenario -5 ==========");
		runnableRunCalled.runExample();
		System.out.println("========== Scenario -6 ==========");

		complexWorkerScenario.runExample();
		System.out.println("========== Scenario -7 ==========");

		scenario7ReflectionBypass.runExample();



		System.out.println("=========================================================");

	}
}
