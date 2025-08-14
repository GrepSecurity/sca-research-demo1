package com.loginsoft.research.nc_rule4.scenario1;

import org.springframework.web.client.RestTemplate;

public class NonCompliant1 {
    public void run() {
        System.out.println("[NonCompliant1] Invoked");
        RestTemplate restTemplate = new RestTemplate();
        //String url = "https://jsonplaceholder.typicode.com/posts/1";
        String response = restTemplate.getForObject(null, String.class); // 🚨 Will throw IllegalArgumentException
        System.out.println("[Non-Compliant1] Response received: " + response);
    }
}
