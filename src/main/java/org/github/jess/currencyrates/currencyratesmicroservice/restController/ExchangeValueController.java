package org.github.jess.currencyrates.currencyratesmicroservice.restController;

import org.github.jess.currencyrates.currencyratesmicroservice.data.domains.ExchangeValue;
import org.github.jess.currencyrates.currencyratesmicroservice.service.ExchangeValueService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/currency-exchange")
public class ExchangeValueController {

    @Autowired
    private Environment environment;

    @Autowired
    private ExchangeValueService service;

    @GetMapping("/hello")
    public String printHello(){
        String hello = "hello world";
        return hello;
    }

    @GetMapping("/from/{from}/to/{to}")
    public ExchangeValue getExchangeValue(
            @PathVariable String from, @PathVariable String to){
        ExchangeValue value = service.findByToAndFro(from, to);

        value.setPort(Integer.parseInt(environment.getProperty("local.server.port")));
        // Get the port from environment and set it into the response bean.

        return value;
    }

}
