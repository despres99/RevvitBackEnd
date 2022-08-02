package com.revature.revvit.example;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Flux;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

@Slf4j
@Service
public class ExampleService {

    private final ExampleRepository exampleRepository;

    @Autowired
    public ExampleService(ExampleRepository exampleRepository) {
        this.exampleRepository = exampleRepository;
    }

    public Flux<ExampleConnection> hardCodedExample() {
        /*ExampleConnection ec = new ExampleConnection();
        ec.setId(UUID.randomUUID().toString());
        ec.setExampleText("This is an example");
        ec.setExampleLogicalPartition("This is the partition");
        exampleRepository.save(ec).subscribe();*/
        return exampleRepository.findAll();
    }
}
