package com.loginsoft.research.nc_rule4.scenario1;

import org.springframework.web.client.RestTemplate;

public class Compliant1 {
    public void run() {
        System.out.println("[Compliant1] Invoked");
        RestTemplate restTemplate = new RestTemplate();
        String url = "https://jsonplaceholder.typicode.com/posts/1";
        String response = restTemplate.getForObject(url, String.class);
        System.out.println("[Compliant1] Response received: " + response);
    }
}
