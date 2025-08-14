package com.loginsoft.research.nc_rule5.scenario5;

import graphql.schema.DataFetcher;
import graphql.schema.DataFetchingEnvironment;
import org.mockito.Mockito;

public class CompliantGraphQLFetcher {

    public void runScenario() {
        System.out.println("[CompliantGraphQLFetcher] Starting scenario...");

        DataFetcher<Integer> fetcher = getAgeFetcher();

        DataFetchingEnvironment env = Mockito.mock(DataFetchingEnvironment.class);
        Mockito.when(env.getSource()).thenReturn("NotAUser");

        try {
            Integer age = fetcher.get(env);
            System.out.println("[CompliantGraphQLFetcher] Fetched age: " + age);
        } catch (Exception e) {
            System.err.println("[CompliantGraphQLFetcher] Exception: " + e.getMessage());
        }

        System.out.println("[CompliantGraphQLFetcher] Scenario finished.\n");
    }

    public DataFetcher<Integer> getAgeFetcher() {
        return env -> {
            Object source = env.getSource();
            if (source instanceof User user) {
                return user.getAge();
            } else {
                System.out.println("[CompliantGraphQLFetcher] Invalid source type: " + source);
                return 0;
            }
        };
    }

    static class User {
        private final int age = 42;
        public int getAge() { return age; }
    }
}
