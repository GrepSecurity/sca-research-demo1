package com.loginsoft.research.nc_rule5.scenario3;

import java.util.ArrayList;
import java.util.List;

public class NonCompliantListCast {

    public void runScenario() {
        System.out.println("[NonCompliantListCast] Starting scenario...");

        List rawList = getRawList(); // rawList contains a String, but declared raw
        System.out.println("[NonCompliantListCast] Retrieved raw list: " + rawList);

        try {
            // Expecting Integer, but list actually contains String
            Integer number = (Integer) rawList.get(0);
            System.out.println("[NonCompliantListCast] Successfully casted to Integer: " + number);
        } catch (ClassCastException ex) {
            System.err.println("[NonCompliantListCast] ClassCastException: " + ex.getMessage());
        }

        System.out.println("[NonCompliantListCast] Scenario finished.\n");
    }

    @SuppressWarnings({"rawtypes", "unchecked"})
    private List getRawList() {
        List list = new ArrayList();
        list.add("not-a-number"); // Intentionally wrong type
        return list;
    }
}
