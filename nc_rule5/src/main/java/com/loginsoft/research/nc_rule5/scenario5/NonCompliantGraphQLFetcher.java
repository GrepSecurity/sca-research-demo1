package com.loginsoft.research.nc_rule5.scenario5;

import graphql.schema.DataFetcher;
import graphql.schema.DataFetchingEnvironment;
import org.mockito.Mockito;

public class NonCompliantGraphQLFetcher {

    public void runScenario() {
        System.out.println("[NonCompliantGraphQLFetcher] Starting scenario...");

        DataFetcher<Integer> fetcher = getAgeFetcher();

        // Use Mockito to create a valid mock
        DataFetchingEnvironment env = Mockito.mock(DataFetchingEnvironment.class);
        Mockito.when(env.getSource()).thenReturn("NotAUser"); // Will cause cast to fail

        try {
            Integer age = fetcher.get(env);
            System.out.println("[NonCompliantGraphQLFetcher] Fetched age: " + age);
        } catch (ClassCastException ex) {
            System.err.println("[NonCompliantGraphQLFetcher] ClassCastException: " + ex.getMessage());
        } catch (Exception e) {
            System.err.println("[NonCompliantGraphQLFetcher] Other Exception: " + e.getMessage());
        }

        System.out.println("[NonCompliantGraphQLFetcher] Scenario finished.\n");
    }

    public DataFetcher<Integer> getAgeFetcher() {
        return env -> {
            Object source = env.getSource();
            User user = (User) source; // Unsafe cast
            return user.getAge();
        };
    }

    static class User {
        private final int age = 42;
        public int getAge() { return age; }
    }
}
