package com.revature.revvit.usercontent;

import com.azure.spring.data.cosmos.repository.ReactiveCosmosRepository;
import reactor.core.publisher.Flux;

public interface UserContentRepository extends ReactiveCosmosRepository<UserContentModel,String> {
    //Flux<UserContentModel> findBy
}
