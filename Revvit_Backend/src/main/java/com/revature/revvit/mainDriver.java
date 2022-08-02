package com.revature.revvit;

import com.revature.revvit.example.ExampleConnection;
import com.revature.revvit.example.ExampleRepository;
import com.revature.revvit.example.ExampleService;
import lombok.AllArgsConstructor;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.stereotype.Component;
import reactor.core.publisher.Flux;

import javax.annotation.PostConstruct;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

@SpringBootApplication
public class mainDriver {
    public static void main(String[] args) {
        SpringApplication.run(mainDriver.class, args);
    }
}
/*@Component
@AllArgsConstructor
class DataLoader{
    private final ExampleRepository exampleRepository;

    @PostConstruct
    void loadData(){
        exampleRepository.deleteAll().thenMany(Flux.just(new ExampleConnection("Yeah text WOW", "This is a logical Partition"),
                                                new ExampleConnection("This is example text", "This is a logical Partition"))
                .flatMap(exampleRepository::save))
                .subscribe();
        System.out.println("Made it here");
                *//*.thenMany(exampleRepository.findAll())
                .subscribe(exampleConnection -> eList.add(exampleConnection)));*//*
    }
}*/
