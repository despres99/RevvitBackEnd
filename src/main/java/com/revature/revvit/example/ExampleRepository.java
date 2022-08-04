package com.revature.revvit.example;


import com.azure.spring.data.cosmos.repository.ReactiveCosmosRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface ExampleRepository extends ReactiveCosmosRepository<ExampleConnection,String> {
}
