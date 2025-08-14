package com.loginsoft.research.nc_rule6.scenario1;


/**
 * Non-compliant: Defines a method named finalize() but does not match Object.finalize().
 * This violates Sonar rule RSPEC-1175 but bypasses all 3 related CodeQL rules.
 */
public class NonCompliant_FinalizeViaReflection {
    public void finalize(int status) {
        System.out.println("[NonCompliant] finalize(int) — not an override");
    }

    public void trigger() {
        System.out.println("[NonCompliant] finalize(int) is defined but not invoked");
    }
}

