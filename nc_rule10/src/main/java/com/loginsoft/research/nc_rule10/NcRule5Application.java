package com.loginsoft.research.nc_rule10;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class NcRule5Application {

    public static void main(String[] args) {
        SpringApplication.run(NcRule5Application.class, args);

        com.loginsoft.research.nc_rule10.scenario1.compliant.CompliantRunner.run();
        com.loginsoft.research.nc_rule10.scenario1.noncompliant.NonCompliantRunner.run();

        com.loginsoft.research.nc_rule10.scenario2.compliant.CompliantRunner.run();
        com.loginsoft.research.nc_rule10.scenario2.noncompliant.NonCompliantRunner.run();

        com.loginsoft.research.nc_rule10.scenario3.compliant.CompliantRunner.run();
        com.loginsoft.research.nc_rule10.scenario3.noncompliant.NonCompliantRunner.run();

        com.loginsoft.research.nc_rule10.scenario4.compliant.CompliantRunner.run();
        com.loginsoft.research.nc_rule10.scenario4.noncompliant.NonCompliantRunner.run();

        com.loginsoft.research.nc_rule10.scenario5.compliant.CompliantRunner.run();
        com.loginsoft.research.nc_rule10.scenario5.noncompliant.NonCompliantRunner.run();
    }
}
