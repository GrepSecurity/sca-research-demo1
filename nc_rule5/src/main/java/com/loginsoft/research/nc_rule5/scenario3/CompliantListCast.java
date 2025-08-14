package com.loginsoft.research.nc_rule5.scenario3;

import java.util.ArrayList;
import java.util.List;

public class CompliantListCast {

    public void runScenario() {
        System.out.println("[CompliantListCast] Starting scenario...");

        List<Object> list = getSafeList();
        System.out.println("[CompliantListCast] Retrieved list: " + list);

        Object element = list.get(0);
        if (element instanceof Integer number) {
            System.out.println("[CompliantListCast] Element is a valid Integer: " + number);
        } else {
            System.out.println("[CompliantListCast] Invalid type. Element is not an Integer: " + element);
        }

        System.out.println("[CompliantListCast] Scenario finished.\n");
    }

    private List<Object> getSafeList() {
        List<Object> list = new ArrayList<>();
        list.add("not-a-number"); // Intentionally incorrect for testing
        return list;
    }
}
