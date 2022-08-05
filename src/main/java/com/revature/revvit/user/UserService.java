package com.revature.revvit.user;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Flux;

@Service
@AllArgsConstructor
public class UserService {
    private final UserRepository userRepo;

    //TODO: Validation for user data

    public void create(User u) {
        userRepo.save(u).subscribe();
    }

    public void update(User u) {
        userRepo.save(u).subscribe();
    }

    public Flux<User> getAllUsers() {
        return userRepo.findAll();
    }
}
