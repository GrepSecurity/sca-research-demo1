package com.loginsoft.research.nc_rule10.scenario1;

public abstract class MyService {

    public abstract String fetchUser();

    public abstract int computeScore();

    public void printInfo() {
        System.out.println("Inside MyService.printInfo()");
    }
}