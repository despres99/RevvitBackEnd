package com.revature.revvit.example;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import reactor.core.publisher.Flux;

@RestController
@RequestMapping("/example")
public class ExampleController {

    private final ExampleService exampleService;

    @Autowired
    public ExampleController(ExampleService exampleService) {
        this.exampleService = exampleService;
    }

    @CrossOrigin
    @ResponseStatus(HttpStatus.ACCEPTED)
    @GetMapping(value = "/test",produces = MediaType.APPLICATION_JSON_VALUE)
    public @ResponseBody Flux<ExampleConnection> getExample(){
        return exampleService.hardCodedExample();
    }
}
