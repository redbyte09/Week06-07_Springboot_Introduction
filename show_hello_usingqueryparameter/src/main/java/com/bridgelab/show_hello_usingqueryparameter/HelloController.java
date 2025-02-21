package com.bridgelab.show_hello_usingqueryparameter;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/hello")
public class HelloController {

    // Endpoint to return "Hello from BridgeLabz"
    @GetMapping
    public String sayHello() {
        return "Hello from BridgeLabz";
    }

    // Endpoint to return "Hello [name] from BridgeLabz"
    @GetMapping("/query")
    public String sayHelloWithName(@RequestParam(defaultValue = "Sakshi") String name) {
        return "Hello " + name + " from BridgeLabz";
    }
}
