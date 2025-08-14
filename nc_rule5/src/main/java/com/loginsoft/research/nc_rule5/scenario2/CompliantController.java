package com.loginsoft.research.nc_rule5.scenario2;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/compliant")
public class CompliantController {

    @GetMapping("/cast")
    public String safeCastParam(@RequestParam("input") String input) {
        System.out.println("[CompliantController] Received input: " + input);

        Object obj = transform(input);

        if (obj instanceof Integer val) {
            System.out.println("[CompliantController] Successfully casted to Integer: " + val);
            return "Processed value: " + val;
        } else {
            System.out.println("[CompliantController] Input is not an Integer");
            return "Invalid input type. Expected integer.";
        }
    }

    private Object transform(String raw) {
        try {
            System.out.println("[CompliantController] Trying to parse input to Integer...");
            return Integer.valueOf(raw);
        } catch (NumberFormatException ex) {
            System.err.println("[CompliantController] Not a valid Integer, storing as String");
            return raw;
        }
    }
}
