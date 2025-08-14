package com.loginsoft.research.nc_rule4;

import org.springframework.boot.SpringApplication;

public class TestNcRule4Application {

	public static void main(String[] args) {
		SpringApplication.from(NcRule4Application::main).with(TestcontainersConfiguration.class).run(args);
	}

}
