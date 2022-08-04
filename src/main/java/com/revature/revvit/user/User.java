package com.revature.revvit.user;

import com.azure.spring.data.cosmos.core.mapping.Container;
import lombok.Data;
import lombok.NoArgsConstructor;

@Container(containerName = "user_container")
@Data
@NoArgsConstructor
public class User {

    private String id;
    private String username;
    private String password;
    private String email;
    private String role;
    private String bio;
    private int age;
}
