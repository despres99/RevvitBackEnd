package com.revature.revvit.auth.dtos.requests;

import lombok.*;

//Data is a lombok annotation that adds @ToString, @EqualsAndHashCode, @Getter on all fields, and @Setter on all non-final fields, and @RequiredArgsConstructor
@Data
@NoArgsConstructor
public class NewUserRequest {
    private String username;
    private String password;
    private final String role = "DEFAULT";
    private String email;
    private String bio;

}
