package com.loginsoft.research.nc_rule5.scenario2;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/noncompliant")
public class NonCompliantController {

    @GetMapping("/cast")
    public String castParam(@RequestParam("input") String input) {
        System.out.println("[NonCompliantController] Received input: " + input);

        Object obj = transform(input); // simulate preprocessing, casting from String
        try {
            Integer val = (Integer) obj; // Unsafe cast
            System.out.println("[NonCompliantController] Successfully casted to Integer: " + val);
            return "Processed value: " + val;
        } catch (ClassCastException ex) {
            System.err.println("[NonCompliantController] ClassCastException: " + ex.getMessage());
            return "Invalid cast: " + ex.getMessage();
        }
    }

    private Object transform(String raw) {
        // Could do logic here, like parsing based on context, config, etc.
        System.out.println("[NonCompliantController] Transforming input to Object");
        return raw; // Always returns String here, but declared as Object
    }
}
