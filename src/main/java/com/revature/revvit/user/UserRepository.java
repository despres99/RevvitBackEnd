package com.revature.revvit.user;

import com.azure.spring.data.cosmos.repository.ReactiveCosmosRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends ReactiveCosmosRepository<User,String> {
}
