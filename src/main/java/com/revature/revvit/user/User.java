package com.revature.revvit.user;

import com.azure.spring.data.cosmos.core.mapping.Container;
import com.azure.spring.data.cosmos.core.mapping.GeneratedValue;
import com.revature.revvit.usercontent.UserContentModel;
import lombok.*;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.data.annotation.Id;

import javax.validation.constraints.*;
import java.util.List;

@Container(containerName = "user")
@Data
@NoArgsConstructor
@RequiredArgsConstructor
@AllArgsConstructor
public class User {
    @Id @GeneratedValue private String id;
    @NonNull private String username;
    @NonNull @Size(min = 8) private String password;

    @NonNull @Email private String email;
    @Value("DEFAULT") private String role;
    @Min(13) private int age;
    private String bio;
    private List<UserContentModel> posts;
}
