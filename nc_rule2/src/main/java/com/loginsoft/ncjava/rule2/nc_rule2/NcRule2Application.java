package com.loginsoft.ncjava.rule2.nc_rule2;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.loginsoft.ncjava.rule2.nc_rule2.bypass.*;

public class NcRule2Application {
	public static void main(String[] args) {
		System.out.println("===== Starting Rule 2 Bypass Scenarios =====");
		executeTask();
		try {
			new MethodThrowBypass().execute();
		} catch (Exception e) {
			System.out.println("[MethodThrowBypass] Exception: " + e);
		}

		try {
			new LambdaThrowBypass().execute();
		} catch (Exception e) {
			System.out.println("[LambdaThrowBypass] Exception: " + e);
		}

		try {
			new FutureThrowBypass().execute();
			Thread.sleep(200); // wait for async
		} catch (Exception e) {
			System.out.println("[FutureThrowBypass] Exception: " + e);
		}

		try {
			new NestedThrowBypass().execute();
		} catch (Exception e) {
			System.out.println("[NestedThrowBypass] Exception: " + e);
		}

		try {
			new ReflectionThrowBypass().execute();
		} catch (Exception e) {
			System.out.println("[ReflectionThrowBypass] Exception: " + e);
		}

		System.out.println("===== Completed Rule 2 Bypass Scenarios =====");
	}

	public static void executeTask() {
		Thread thread = new Thread(() ->
				System.out.println("[TaskRunnerService] Task executed in thread: " + Thread.currentThread().getName())
		);
		thread.run();
	}
}
