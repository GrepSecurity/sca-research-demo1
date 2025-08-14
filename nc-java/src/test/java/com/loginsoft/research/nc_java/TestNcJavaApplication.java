package com.loginsoft.research.nc_java;

import org.springframework.boot.SpringApplication;

public class TestNcJavaApplication {

	public static void main(String[] args) {
		SpringApplication.from(NcJavaApplication::main).with(TestcontainersConfiguration.class).run(args);
	}

}
